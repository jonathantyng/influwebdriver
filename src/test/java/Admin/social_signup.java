package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class social_signup extends BaseClass{
    
    @Test
    public void email_password_signup() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        wd.get("http://princessland.influitiveqa.com/join/test");
        /*
        //Enter join code

        wd.findElement(By.xpath("//*[@id=\"logged-out-form-container\"]/div[1]/section[4]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"group_token\"]")).sendKeys("Test");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        */
        //Enter user information

        wd.findElement(By.id("registration_user_email")).sendKeys("advocatebob7+test45@gmail.com");
        wd.findElement(By.id("registration_contact_name")).sendKeys("Bob Advocate");
        wd.findElement(By.id("registration_user_password")).sendKeys("macbook18");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();

        //Check for errors
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }
        @Test
        public void linkedin_singup (){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        wd.get("http://princessland.influitiveqa.com/join/test");

            //Enter join code
        /*
        wd.findElement(By.xpath("//*[@id=\"logged-out-form-container\"]/div[1]/section[4]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"group_token\"]")).sendKeys("Test");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.name("commit")).click();
        */

        //Enter user information

        wd.findElement(By.cssSelector("img[alt=\"Linkedin\"]")).click();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).sendKeys("pelican.pete123@gmail.com");
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).sendKeys("macbook18");
        wd.findElement(By.name("authorize")).click();
        //wd.findElement(By.name("commit")).click();

        //Check for errors
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click Create Account

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_registration\"]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_registration\"]/input")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        }

    @Test
    public void facebook_signup(){

        WebDriverWait wait = new WebDriverWait(wd, 5);
        wd.get("http://princessland.influitiveqa.com/join/test");

        /*
        //Enter join code

        wd.findElement(By.xpath("//*[@id=\"logged-out-form-container\"]/div[1]/section[4]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"group_token\"]")).sendKeys("Test");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        */

        //Enter user information

        wd.findElement(By.cssSelector("img[alt=\"Facebook\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.id("email")).sendKeys("alice.advocate@gmail.com");
        wd.findElement(By.id("pass")).click();
        wd.findElement(By.id("pass")).clear();
        wd.findElement(By.id("pass")).sendKeys("macbook18");
        wd.findElement(By.id("u_0_1")).click();
        //wd.findElement(By.name("commit")).click();

        //Check for errors
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click Create Account

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_registration\"]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_registration\"]/input")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
    }
    /*
    @Test
    public void customdomain_email_password_signup() {

        wd.get("http://lindsay.codesharks.ca/join/sanity");
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
    public void customdomain_linkedin_singup (){

        wd.get("http://lindsay.codesharks.ca/join/sanity");


        //Enter user information

        wd.findElement(By.cssSelector("img[alt=\"Linkedin\"]")).click();
        wd.findElement(By.id("session_key-oauthAuthorizeForm")).sendKeys("pelican.pete123@gmail.com");
        wd.findElement(By.id("session_password-oauthAuthorizeForm")).sendKeys("macbook18");
        wd.findElement(By.name("authorize")).click();
        //wd.findElement(By.name("commit")).click();

        //Check for errors
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void customdomain_facebook_signup(){


        wd.get("http://lindsay.codesharks.ca/join/sanity");

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
    */

    @After
    public void tearDown() {
        wd.quit();
    }
    

    }

