package interaction;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class alice_reset extends BaseClassTwo{

    @Test
    public void appexchangechallenge() {

        //Sign into app and access challenge screen

        wd.get("http://may31.influitiveqa.com/users/sign_in");
        wd.findElement(By.linkText("Forgot Password?")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Cancel")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Forgot Password?")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("(//input[@id='user_email'])[2]")).click();
        wd.findElement(By.xpath("(//input[@id='user_email'])[2]")).clear();
        wd.findElement(By.xpath("(//input[@id='user_email'])[2]")).sendKeys("alice.advocate@gmail.com");
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

        wd.findElement(By.id(":3h")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("img.ajT")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Click here to change your password")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //wd.switchTo().window(wd.getWindowHandles().toArray()[0]);

        //try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //new Actions(wd).sendKeys(wd.findElement(By.tagName("html")), Keys.CONTROL).sendKeys(wd.findElement(By.tagName("html")),Keys.NUMPAD2).build().perform();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password_confirmation")).click();
        wd.findElement(By.id("user_password_confirmation")).clear();
        wd.findElement(By.id("user_password_confirmation")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("commit")).click();

    }
}