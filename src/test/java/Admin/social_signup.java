package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class social_signup extends BaseClass{
    
    @Test
    public void email_password_signup() {

        wd.get("http://may15.influitiveqa.com/join/Test");
        wd.findElement(By.id("registration_user_email")).click();
        wd.findElement(By.id("registration_user_email")).clear();
        wd.findElement(By.id("registration_user_email")).sendKeys("advocatebob7+test45@gmail.com");
        wd.findElement(By.id("registration_contact_name")).click();
        wd.findElement(By.id("registration_contact_name")).clear();
        wd.findElement(By.id("registration_contact_name")).sendKeys("Bob Advocate");
        wd.findElement(By.id("registration_user_password")).click();
        wd.findElement(By.id("registration_user_password")).clear();
        wd.findElement(By.id("registration_user_password")).sendKeys("macbook18");
        //wd.findElement(By.name("commit")).click();

        //Check for errors
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

        @Test
        public void linkedin_singup (){

        wd.get("http://may15.influitiveqa.com/join/sanity");
        wd.findElement(By.cssSelector("img[alt=\"Linkedin\"]")).click();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).click();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).clear();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).sendKeys("pelican.pete123@gmail.com");
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).click();
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).clear();
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).sendKeys("macbook18");
        wd.findElement(By.name("authorize")).click();
        //wd.findElement(By.name("commit")).click();

        //Check for errors
            Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

            try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void facebook_signup(){
        wd.get("http://may15.influitiveqa.com/join/sanity");
        wd.findElement(By.cssSelector("img[alt=\"Facebook\"]")).click();
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys("advocate_john@yahoo.com");
        wd.findElement(By.id("pass")).click();
        wd.findElement(By.id("pass")).clear();
        wd.findElement(By.id("pass")).sendKeys("macbook18");
        wd.findElement(By.id("u_0_1")).click();
        //wd.findElement(By.name("commit")).click();

        //Check for errors
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

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
