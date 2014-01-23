package admin_advocate;

import alice_advocate.BaseClassTwo;
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

public class adjust_points extends BaseClassThree{

    @Test
    public void adjustpoints() {

        //Sign into app and access challenge screen

        wd.get("http://advocatetest.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Advocate Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Search for alice advocate

        wd.findElement(By.id("search_search_for_term")).click();
        wd.findElement(By.id("search_search_for_term")).clear();
        wd.findElement(By.id("search_search_for_term")).sendKeys("Alice Advocate");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Alice from list

        wd.findElement(By.linkText("Alice Advocate")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("img[alt=\"Gear\"]")).click();
        wd.findElement(By.linkText("Adjust Points")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Adjust Points

        wd.findElement(By.id("event_points")).click();
        wd.findElement(By.id("event_points")).clear();
        wd.findElement(By.id("event_points")).sendKeys("1000");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Leave comment for alice

        wd.findElement(By.id("comment")).click();
        wd.findElement(By.id("comment")).clear();
        wd.findElement(By.id("comment")).sendKeys("Woah Crazy Crazy!");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Finish point adjustment

        wd.findElement(By.cssSelector("#new_event > input[name=\"commit\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @After
    public void tearDown() {
        wd.quit();
    }
}

