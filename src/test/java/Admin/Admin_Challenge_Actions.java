package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by patrickprestley on 2014-07-02.
 */
public class Admin_Challenge_Actions extends AdminBase{

    public void edit_challenge(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select edit from dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[1]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save challenge

        wd.findElement(By.xpath("//*[@id=\"challenge-creator\"]/div[1]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void notify_advocates(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select notify advocates from dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[2]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }
    @Test
    public void preview_challenge(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select preview from dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[3]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Close preview

        wd.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/button")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void clone_challenge(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select clone from dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[4]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save clone

        wd.findElement(By.xpath("//*[@id=\"challenge-creator\"]/div[1]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void save_as_template(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select save as template from dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[5]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add template title

        wd.findElement(By.xpath("//*[@id=\"template_attributes.title\"]")).sendKeys("Challenge Temp");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on template categories

        wd.findElement(By.xpath("//*[@id=\"s2id_autogen6\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select category from dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter template description

        wd.findElement(By.xpath("//*[@id=\"template_attributes.description\"]")).sendKeys("This is a challenge description");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save template

        wd.findElement(By.xpath("//*[@id=\"challenge-creator\"]/div[2]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void publishing_options(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select challenge dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/a/img")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select publishing options from dropdown

        wd.findElement(By.xpath("//*[@id=\"challenge-102\"]/div[2]/div/ul/li[7]/a\n")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select publish from modal

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
