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
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class create_company extends BaseClass{

    @Test
    public void createcompany() {


        wd.get("http://app.influitives.com/users/sign_in");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.className("remove")).size() != 0;

        if (exists)
        {
            wd.findElement(By.className("remove")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        wd.findElement(By.xpath("//div[@id='header']/div/ul[2]/li/a/b")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();
        wd.findElement(By.linkText("Companies")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a Company")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("company_name")).click();
        wd.findElement(By.id("company_name")).click();
        wd.findElement(By.id("company_name")).clear();
        wd.findElement(By.id("company_name")).sendKeys("sanitynov11");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("company_subdomain")).click();
        wd.findElement(By.id("company_subdomain")).clear();
        wd.findElement(By.id("company_subdomain")).sendKeys("sanitynov11");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.linkText("Evangelist")).click();
        //try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.linkText("Evangelist")).click();
        wd.findElement(By.id("company_administrator_email")).click();
        wd.findElement(By.id("company_administrator_email")).clear();
        wd.findElement(By.id("company_administrator_email")).sendKeys("samanthatester99@yahoo.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("company_administrator_name")).click();
        wd.findElement(By.id("company_administrator_name")).clear();
        wd.findElement(By.id("company_administrator_name")).sendKeys("Samantha Tester");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("blue")).click();
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li[3]/div")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(30000l); } catch (Exception e) { throw new RuntimeException(e); }

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

