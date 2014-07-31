package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by patrickprestley on 2014-07-02.
 */
public class Admin_Challenge_Actions extends AdminBase{

    public void edit_challenge(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")));
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();

        //Select edit from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[1]/a")));
        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[1]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-creator\"]/div[1]/div[2]/input")));
        wd.findElement(By.xpath("//*[@id=\"challenge-creator\"]/div[1]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void notify_advocates(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")));
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();

        //Select notify advocates from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[2]/a")));
        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[2]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }
    @Test
    public void preview_challenge(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")));
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();

        //Select preview from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[3]/a")));
        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[3]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Close preview

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"modal\"]/div[1]/button")));
        wd.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/button")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void clone_challenge(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")));
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();

        //Select clone from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[4]/a")));
        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[4]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Save clone

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-creator\"]/div[1]/div[2]/input")));
        wd.findElement(By.xpath("//*[@id=\"challenge-creator\"]/div[1]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void save_as_template(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")));
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();

        //Select save as template from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[5]/a")));
        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[5]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Add template title

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"template_attributes.title\"]")));
        wd.findElement(By.xpath("//*[@id=\"template_attributes.title\"]")).sendKeys("Challenge Temp");

        //Click on template categories

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s2id_autogen6\"]")));
        wd.findElement(By.xpath("//*[@id=\"s2id_autogen6\"]")).click();

        //Select category from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]")));
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]")).click();

        //Enter template description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"template_attributes.description\"]")));
        wd.findElement(By.xpath("//*[@id=\"template_attributes.description\"]")).sendKeys("This is a challenge description");

        //Save template

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-creator\"]/div[2]/div[2]/input")));
        wd.findElement(By.xpath("//*[@id=\"challenge-creator\"]/div[2]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void publishing_options(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")));
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();

        //Select publishing options from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[7]/a\n")));
        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[7]/a\n")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select publish from modal

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"visibility_setting_publish\"]")));
        wd.findElement(By.xpath("//*[@id=\"visibility_setting_publish\"]")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
