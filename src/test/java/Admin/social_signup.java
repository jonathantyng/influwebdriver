package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

public class social_signup extends BaseClass{
    
    @Test
    public void email_password_signup() {

        //Enter join code

        wd.findElement(By.xpath("//*[@id=\"logged-out-form-container\"]/div[1]/section[4]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"group_token\"]")).sendKeys("Test");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Next")).click();

        //Enter user information

        wd.findElement(By.id("registration_user_email")).sendKeys("advocatebob7+test45@gmail.com");
        wd.findElement(By.id("registration_contact_name")).sendKeys("Bob Advocate");
        wd.findElement(By.id("registration_user_password")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.name("commit")).click();

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

        //Enter join code

        wd.findElement(By.xpath("//*[@id=\"logged-out-form-container\"]/div[1]/section[4]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"group_token\"]")).sendKeys("Test");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.linkText("Next")).click();


        //Enter user information

        wd.findElement(By.cssSelector("img[alt=\"Linkedin\"]")).click();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).sendKeys("pelican.pete123@gmail.com");
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).sendKeys("macbook18");
        wd.findElement(By.name("authorize")).click();
        wd.findElement(By.name("commit")).click();

        //Check for errors
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void facebook_signup(){

        //Enter join code

        wd.findElement(By.xpath("//*[@id=\"logged-out-form-container\"]/div[1]/section[4]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"group_token\"]")).sendKeys("Test");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Next")).click();


        //Enter user information

        wd.findElement(By.cssSelector("img[alt=\"Facebook\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

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
    

    }

