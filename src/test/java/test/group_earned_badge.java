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

public class group_earned_badge extends BaseClass{

    @Test
    public void group_badge () {
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
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("Groups")).click();

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

        //Add Test Group

        wd.findElement(By.linkText("Add a group")).click();
        wd.findElement(By.id("group_name")).click();
        wd.findElement(By.id("group_name")).click();
        wd.findElement(By.id("group_name")).clear();
        wd.findElement(By.id("group_name")).sendKeys("Chocolate Chips");
        wd.findElement(By.id("group_description")).click();
        wd.findElement(By.id("group_description")).clear();
        wd.findElement(By.id("group_description")).sendKeys("This is a group for people who have earned the social cookie.");
        wd.findElement(By.id("link-membership rules")).click();
        wd.findElement(By.linkText("Add new criteria...")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_group_search_criteria_attributes_0_field_name > a.select2-choice > span")).click();
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Badges");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li/ul/li/div/span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_group_search_criteria_attributes_0_value > a.select2-choice")).click();
        wd.findElement(By.cssSelector("#select2-drop > div.select2-search > input.select2-input.select2-focused")).sendKeys("Social Cookie");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("save-button")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}