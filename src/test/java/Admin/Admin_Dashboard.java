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

        wd.findElement(By.xpath("//*[@id=\"admin-goals\"]/header-bar/div/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Expand dropdown

        wd.findElement(By.id("s2id_admin_goal_id")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select goal from dropdown

        wd.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(2) > div")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter goal per month amount

        wd.findElement(By.id("admin_goal_settings_times")).click();
        wd.findElement(By.id("admin_goal_settings_times")).clear();
        wd.findElement(By.id("admin_goal_settings_times")).sendKeys("5");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Save goal

        wd.findElement(By.name("commit")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Make sure successful gritter message is shown

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Goal successfully updated!"));


    }


    @Test
    public void edit_existing_goal(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //click goal edit gear wheel

        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > a > img")).click();

        //Select edit from dropdown

        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > ul > li:nth-child(1) > a")).click();

        //Edit number per month

        wd.findElement(By.id("admin_goal_settings_times")).sendKeys("5");

        //Re-save goal

        wd.findElement(By.name("commit")).click();
        try {Thread.sleep(4000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Make sure successful gritter message is shown

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Goal successfully updated!"));

    }
    @Test
    public void delete_system_goal(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //click goal edit gear wheel

        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > a > img")).click();

        //Remove goal

        wd.findElement(By.cssSelector("#admin-goals > ul > li:nth-child(2) > div.goal-dropdown > div > div > ul > li:nth-child(2) > a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //

        try {
            WebDriverWait wait = new WebDriverWait(wd, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = wd.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }

        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Make sure successful gritter message is shown

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Goal successfully deleted!"));

    }
    /*
    @Test
    public void create_custom_goal_type(){

        //Navigate to hub

        wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Click 'Add a Goal'

        wd.findElement(By.linkText("+ Add a Goal!")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select custom goal toggle

        wd.findElement(By.linkText("define your own custom goal")).click();

        //Enter name of custom goal

        wd.findElement(By.id("admin_goal_name")).sendKeys("Custom Goal");

        //Select 'Completed a type of challenge' toggle

        wd.findElement(By.id("admin_goal_settings_rule_type_completed_challenge")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Expand dropdown

        wd.findElement(By.cssSelector("#s2id_admin_goal_settings_challenge_type_code > a > span.select2-chosen")).click();

        //Select option in dropdown

        wd.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(2) > div")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter goal per month



        //Save goal

        wd.findElement(By.name("commit")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }
    */

    @Test
    public void admin_challenge_action_center(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Click on challenge confirmation action center link

        wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div[1]/a/button")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Switch to rewards tab

        wd.findElement(By.xpath("//*[@id=\"inboxes\"]/li[2]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void admin_reward_action_center(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Click on rewards confirmation action center link

        wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div/div[2]/a/button")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Switch to challenge tab

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