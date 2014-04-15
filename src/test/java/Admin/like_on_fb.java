package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class like_on_fb extends BaseClass{
    
    @Test
    public void like_on_fb() {
        wd.get("http://april14.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
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

        //Add like on FB challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Start With Blank Challenge")).click();
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        wd.findElement(By.name("name")).sendKeys("Like Us");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Facebook");
        wd.findElement(By.className("select2-match")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("headline")).click();
        wd.findElement(By.name("headline")).clear();
        wd.findElement(By.name("headline")).sendKeys("Like Us");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).click();
        wd.findElement(By.name("description")).clear();
        wd.findElement(By.name("description")).sendKeys("Like us on facebook!  Complete this challenge.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//img[@alt='Facebook_like_page']")).click();
        wd.findElement(By.name("params.facebook_page_url")).click();
        wd.findElement(By.name("params.facebook_page_url")).clear();
        wd.findElement(By.name("params.facebook_page_url")).sendKeys("www.facebook.com/pepsi");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("notification_message")).click();
        wd.findElement(By.name("notification_message")).clear();
        wd.findElement(By.name("notification_message")).sendKeys("Thanks for the like!");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("ui-id-2")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
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
