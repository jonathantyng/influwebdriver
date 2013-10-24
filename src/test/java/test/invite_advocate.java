package test;

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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class invite_advocate {
    ChromeDriver wd;
    
    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver" ,"/Users/patrickprestley/Downloads/chromedriver");

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void invite_advocate() {

        wd.get("http://oct23.influitiveqa.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Tutorial dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Invite nominees

        wd.findElement(By.linkText("Invite Nominees")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a new Nominee")).click();
        wd.findElement(By.id("contact_email")).click();
        wd.findElement(By.id("contact_email")).clear();
        wd.findElement(By.id("contact_email")).sendKeys("joe.prospect5@gmail.com");
        wd.findElement(By.id("contact_name")).click();
        wd.findElement(By.id("contact_name")).clear();
        wd.findElement(By.id("contact_name")).sendKeys("Joe Prospect");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("send-invite")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Invite Nominees")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a new Nominee")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("contact_email")).click();
        wd.findElement(By.id("contact_email")).clear();
        wd.findElement(By.id("contact_email")).sendKeys("fredprospect@yahoo.ca");
        wd.findElement(By.id("contact_name")).click();
        wd.findElement(By.id("contact_name")).clear();
        wd.findElement(By.id("contact_name")).sendKeys("Fred Prospect");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("send-invite")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Invite Nominees")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a new Nominee")).click();
        wd.findElement(By.id("contact_email")).click();
        wd.findElement(By.id("contact_email")).clear();
        wd.findElement(By.id("contact_email")).sendKeys("mikerandom23@yahoo.com");
        wd.findElement(By.id("contact_name")).click();
        wd.findElement(By.id("contact_name")).clear();
        wd.findElement(By.id("contact_name")).sendKeys("Mike Random");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("send-invite")).click();
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
