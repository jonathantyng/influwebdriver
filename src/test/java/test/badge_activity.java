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

public class badge_activity extends BaseClass{

    @Test
    public void createactivitybadge() {
        wd.get("http://oct30.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.xpath("//div[@id='header']/div/ul[2]/li/a/b")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//ul[@id='accordion']/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Levels & Badges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Continue creating badges

        wd.findElement(By.id("add_badge")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_name")).click();
        wd.findElement(By.id("badge_name")).clear();
        wd.findElement(By.id("badge_name")).sendKeys("Yet Another Badge");
        wd.findElement(By.id("badge_description")).click();
        wd.findElement(By.id("badge_description")).clear();
        wd.findElement(By.id("badge_description")).sendKeys("This is a yet another badge! It is awarded to advocates who have joined the hub.");
        wd.findElement(By.id("icon_8")).click();
        wd.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_settings_rule_type_event_logged")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //fix
        wd.findElement(By.linkText("Any Type")).click();
        new Actions(wd).clickAndHold(wd.findElement(By.cssSelector("#s2id_badge_settings_event_type_code > a.select2-choice > span.select2-chosen"))).build().perform();
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Advocate Joined");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("badge_settings_event_times")).click();
        wd.findElement(By.id("badge_settings_event_times")).clear();
        wd.findElement(By.id("badge_settings_event_times")).sendKeys("1");
        wd.findElement(By.id("create_badge_button")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}