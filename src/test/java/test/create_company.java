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

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class create_company {
    FirefoxDriver wd;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver" ,"/Users/patrickprestley/Downloads/chromedriver");

        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void createcompany() {
        wd.get("http://app.influitiveqa.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.xpath("//div[@id='header']/div/ul[2]/li/a/b")).click();
        wd.findElement(By.linkText("Settings")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();
        wd.findElement(By.linkText("Companies")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a Company")).click();
        wd.findElement(By.id("company_name")).click();
        wd.findElement(By.id("company_name")).click();
        wd.findElement(By.id("company_name")).clear();
        wd.findElement(By.id("company_name")).sendKeys("oct24");
        wd.findElement(By.id("company_subdomain")).click();
        wd.findElement(By.id("company_subdomain")).clear();
        wd.findElement(By.id("company_subdomain")).sendKeys("oct24");
        wd.findElement(By.linkText("Evangelist")).click();
        wd.findElement(By.linkText("Evangelist")).click();
        wd.findElement(By.id("company_administrator_email")).click();
        wd.findElement(By.id("company_administrator_email")).clear();
        wd.findElement(By.id("company_administrator_email")).sendKeys("samanthatester99@yahoo.com");
        wd.findElement(By.id("company_administrator_name")).click();
        wd.findElement(By.id("company_administrator_name")).clear();
        wd.findElement(By.id("company_administrator_name")).sendKeys("Samantha Tester");
        wd.findElement(By.linkText("Red")).click();
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li[3]/div")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(30000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.get("http://oct24test.influitiveqa.com/");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Influitive Admin")).click();
        wd.findElement(By.linkText("Settings")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//ul[@id='accordion']/li[3]/h4")).click();
        wd.findElement(By.linkText("Welcome Email")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("email_preferences_preferences_deliver_welcome_email")).click();
        wd.findElement(By.linkText("Invitations")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Challenge Digest")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("company_preference_email_digest_send")).click();
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.linkText("Challenge Email")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Notifications")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("company_preference_deliver_notifications")).click();
        wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();
        wd.findElement(By.linkText("Enabled Features")).click();
        wd.findElement(By.id("toggles_blog_stage")).click();
        wd.findElement(By.id("toggles_disqus_auth")).click();
        wd.findElement(By.id("toggles_app_exchange")).click();
        wd.findElement(By.id("toggles_private_leaderboards")).click();
        wd.findElement(By.id("toggles_check_in")).click();
        wd.findElement(By.id("toggles_show_future_stages")).click();
        wd.findElement(By.name("commit")).click();
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

