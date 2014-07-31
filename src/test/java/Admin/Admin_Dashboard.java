package Admin;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin_Dashboard extends AdminBase {

    @Test
    public void add_a_system_goal() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Click 'Add a Goal'

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"admin-goals\"]/header/div/a")));
        wd.findElement(By.xpath("//*[@id=\"admin-goals\"]/header/div/a")).click();
        wd.findElement(By.xpath("//*[@id=\"admin-goals\"]/header-bar/div/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Expand dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("s2id_admin_goal_id")));
        wd.findElement(By.id("s2id_admin_goal_id")).click();

        //Select goal from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#select2-drop > ul > li:nth-child(2) > div")));
        wd.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(2) > div")).click();

        //Enter goal per month amount

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("admin_goal_settings_times")));
        wd.findElement(By.id("admin_goal_settings_times")).click();
        wd.findElement(By.id("admin_goal_settings_times")).clear();
        wd.findElement(By.id("admin_goal_settings_times")).sendKeys("5");

        //Save goal

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Make sure successful gritter message is shown

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Goal successfully updated!"));


    }


    @Test
    public void edit_existing_goal(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //click goal edit gear wheel

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > a > img")));
        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > a > img")).click();

        //Select edit from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > ul > li:nth-child(1) > a")));
        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > ul > li:nth-child(1) > a")).click();

        //Edit number per month

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("admin_goal_settings_times")));
        wd.findElement(By.id("admin_goal_settings_times")).sendKeys("5");

        //Re-save goal

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try {Thread.sleep(4000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Make sure successful gritter message is shown

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Goal successfully updated!"));

    }
    @Test
    public void delete_system_goal() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //click goal edit gear wheel

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > a > img")));
        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > a > img")).click();

        //Remove goal

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > ul > li:nth-child(2) > a")));
        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > ul > li:nth-child(2) > a")).click();

        //

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = wd.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }

        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Make sure successful gritter message is shown

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Goal successfully deleted!"));

    }

    @Test
    public void admin_challenge_action_center(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Click on challenge confirmation action center link

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div[1]/a/button")));
        wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div[1]/a/button")).click();

        //Switch to rewards tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"inboxes\"]/li[2]/a")));
        wd.findElement(By.xpath("//*[@id=\"inboxes\"]/li[2]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void admin_reward_action_center(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Click on rewards confirmation action center link

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div[2]/a/button")));
        wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div[2]/a/button")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Switch to challenge tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"inboxes\"]/li[1]/a")));
        wd.findElement(By.xpath("//*[@id=\"inboxes\"]/li[1]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}


    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}