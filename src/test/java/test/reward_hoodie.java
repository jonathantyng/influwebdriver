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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import test.BaseClass;

import static org.openqa.selenium.OutputType.*;

public class reward_hoodie extends BaseClass{

    @Test
    public void reward_hoodie() {
        wd.get("http://nov22.influitiveqa.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.id("Rewards")).click();

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

        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).clear();
        wd.findElement(By.id("reward_name")).sendKeys("Hoodie");
        wd.findElement(By.id("reward_description")).click();
        wd.findElement(By.id("reward_description")).clear();
        wd.findElement(By.id("reward_description")).sendKeys("This is a great hoodie!");
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Swag")).click();
        //wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("reward_in_catalog")).click();
        wd.findElement(By.id("reward_points")).click();
        wd.findElement(By.id("reward_points")).clear();
        wd.findElement(By.id("reward_points")).sendKeys("10");
        wd.findElement(By.linkText("+ Add A Question")).click();
        wd.findElement(By.name("subject")).click();
        wd.findElement(By.name("subject")).clear();
        wd.findElement(By.name("subject")).sendKeys("What size do you wear??");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Not Published")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("nov5_setting_membership_group")).click();
        wd.findElement(By.cssSelector("#s2id_nov5_setting_group_ids > ul.select2-choices")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Test Group");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.name("commit")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}