package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by patrickpriestley on 2014-05-02.
 */
public class Admin_Advocates_Tab extends AdminBase {

    @Test
    public void toggle_level_fiter(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Select Fan from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle Fan from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Advocate from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle Advocate from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Evangelist from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-Toggle Evangelist from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Rockstar from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle Rockstar from level filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void toggle_status_filter(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Select Engaged toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle Engaged from status filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select not engaged toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle not engaged status filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void toggle_nps_filter(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Select detractor toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle detractor filter

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Neutral toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle neutral toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Promoter toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle promoter toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select unknown toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Un-toggle unknown toggle

        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void search_for_advocates(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Enter text into advocate search field

        wd.findElement(By.id("search_search_for_term")).sendKeys("11111");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("No records found"));

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

