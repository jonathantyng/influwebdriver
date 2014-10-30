package alice_advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

public class alice_reset extends BaseClassTwo{

    @Test
    public void alicereset() {

        //Sign into app and access challenge screen

        wd.get("http://nov28.influitiveqa.com/users/sign_in");
        wd.findElement(By.linkText("Forgot Password?")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Cancel")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Forgot Password?")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("forgot_password_email")).click();
        wd.findElement(By.id("forgot_password_email")).clear();
        wd.findElement(By.id("forgot_password_email")).sendKeys("alice.advocate@gmail.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#new_user > input[name=\"commit\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Log into Alice Advocates gmail account

        wd.get("http://www.gmail.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("gmail-sign-in")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("Email")).click();
        wd.findElement(By.id("Email")).clear();
        wd.findElement(By.id("Email")).sendKeys("alice.advocate@gmail.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("Passwd")).click();
        wd.findElement(By.id("Passwd")).clear();
        wd.findElement(By.id("Passwd")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("signIn")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.id("no-button")).size() != 0;

        if (exists)
        {
            wd.findElement(By.id("no-button")).click();
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        }

        //Select reset password email from list of emails on gmail

        wd.findElement(By.id(":3d")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Expand the reset password email if it exists

        boolean doesexist = wd.findElements( By.cssSelector("img.ajT")).size() != 0;

        if (doesexist)
        {
            wd.findElement(By.cssSelector("img.ajT")).click();
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        }

        //Click to change password

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Click here to change your password")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Enter new password and commit

        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password_confirmation")).click();
        wd.findElement(By.id("user_password_confirmation")).clear();
        wd.findElement(By.id("user_password_confirmation")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //

        System.out.println("Page title is: " + wd.getCurrentUrl());



    }

    @After
    public void tearDown() {
        wd.quit();
    }
}


//        wd.findElement(By.partialLinkText("").toString()
