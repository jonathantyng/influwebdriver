package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class social_signup extends BaseClass{
    
    @Test
    public void social_signup() {
        wd.get("http://advocatetest.influitiveqa.com/join/Test");
        wd.findElement(By.id("registration_user_email")).click();
        wd.findElement(By.id("registration_user_email")).clear();
        wd.findElement(By.id("registration_user_email")).sendKeys("advocatebob7+test45@gmail.com");
        wd.findElement(By.id("registration_contact_name")).click();
        wd.findElement(By.id("registration_contact_name")).clear();
        wd.findElement(By.id("registration_contact_name")).sendKeys("Bob Advocate");
        wd.findElement(By.id("registration_user_password")).click();
        wd.findElement(By.id("registration_user_password")).clear();
        wd.findElement(By.id("registration_user_password")).sendKeys("macbook18");
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("span")).click();
        wd.findElement(By.linkText("Sign out")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.get("http://advocatetest.influitiveqa.com/join/Sanity");
        wd.findElement(By.cssSelector("img[alt=\"Linkedin\"]")).click();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).click();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).clear();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).sendKeys("pelican.pete123@gmail.com");
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).click();
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).clear();
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).sendKeys("macbook18");
        wd.findElement(By.name("authorize")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("span")).click();
        wd.findElement(By.linkText("Sign out")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.get("http://advocatetest.influitiveqa.com/join/Sanity");
        wd.findElement(By.cssSelector("img[alt=\"Facebook\"]")).click();
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys("advocate_john@yahoo.com");
        wd.findElement(By.id("pass")).click();
        wd.findElement(By.id("pass")).clear();
        wd.findElement(By.id("pass")).sendKeys("macbook18");
        wd.findElement(By.id("u_0_1")).click();
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.cssSelector("span")).click();
        wd.findElement(By.linkText("Sign out")).click();
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
