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

public class create_rewards extends BaseClass{

    @Test
    public void create_rewards() {
        wd.get("http://oct29.influitives.com/users/sign_in");
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
            System.out.println("Tutorial dismissed");
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
        wd.findElement(By.id("visibility_setting_membership_group")).click();
        wd.findElement(By.cssSelector("#s2id_visibility_setting_group_ids > ul.select2-choices")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Test Group");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).clear();
        wd.findElement(By.id("reward_name")).sendKeys("T-Shirt");
        wd.findElement(By.id("reward_description")).click();
        wd.findElement(By.id("reward_description")).clear();
        wd.findElement(By.id("reward_description")).sendKeys("What a great T-Shirt!");
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Swag");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("reward_in_catalog")).click();
        wd.findElement(By.id("reward_points")).click();
        wd.findElement(By.id("reward_points")).clear();
        wd.findElement(By.id("reward_points")).sendKeys("5");
        wd.findElement(By.linkText("+ Add A Question")).click();
        wd.findElement(By.name("subject")).click();
        wd.findElement(By.name("subject")).clear();
        wd.findElement(By.name("subject")).sendKeys("What size do you wear??");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Not Published")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("visibility_setting_membership_group")).click();
        wd.findElement(By.cssSelector("#s2id_visibility_setting_group_ids > ul.select2-choices")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Sanity Group");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).clear();
        wd.findElement(By.id("reward_name")).sendKeys("Duffel Bag");
        wd.findElement(By.id("reward_description")).click();
        wd.findElement(By.id("reward_description")).clear();
        wd.findElement(By.id("reward_description")).sendKeys("This is a great Duffel Bag!");
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Swag");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("awardable")).click();
        wd.findElement(By.cssSelector("#s2id_reward_settings_challenge_id > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Follow on Twitter");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("reward_settings_challenge_times")).click();
        wd.findElement(By.id("reward_settings_challenge_times")).clear();
        wd.findElement(By.id("reward_settings_challenge_times")).sendKeys("3");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Not Published")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).clear();
        wd.findElement(By.id("reward_name")).sendKeys("Cape");
        wd.findElement(By.id("reward_description")).click();
        wd.findElement(By.id("reward_description")).clear();
        wd.findElement(By.id("reward_description")).sendKeys("This is a great Cape!");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Swag");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("awardable")).click();
        wd.findElement(By.cssSelector("#s2id_reward_settings_challenge_id > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Join a LinkedIn Group");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("reward_settings_challenge_times")).click();
        wd.findElement(By.id("reward_settings_challenge_times")).clear();
        wd.findElement(By.id("reward_settings_challenge_times")).sendKeys("3");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Not Published")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).clear();
        wd.findElement(By.id("reward_name")).sendKeys("Printfection Perk");
        wd.findElement(By.id("reward_description")).click();
        wd.findElement(By.id("reward_description")).clear();
        wd.findElement(By.id("reward_description")).sendKeys("This is a perk from printfection");
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Swag");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("awardable")).click();
        wd.findElement(By.id("reward_settings_rule_type_none")).click();
        wd.findElement(By.id("link-fulfillment")).click();
        wd.findElement(By.id("reward_kind_redemptionlink")).click();
        wd.findElement(By.id("reward_redemption_links")).click();
        wd.findElement(By.id("reward_redemption_links")).clear();
        wd.findElement(By.id("reward_redemption_links")).sendKeys("http://www.pepsi.com");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Not Published")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.linkText("Influitive Admin")).click();
        wd.findElement(By.linkText("Sign out")).click();
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
