package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class badge_points_reached extends BaseClass{

    @Test
    public void createpointbadge() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //wd.get("http://may14.influitiveqa.com/users/sign_in");

        //Log in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to level and badges settings

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='accordion']/li[2]/h4")));
        wd.findElement(By.xpath("//ul[@id='accordion']/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Levels & Badges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add_badge")));
            System.out.println("Tutorial not encountered");
        }

        //Add a new badge

        wd.findElement(By.id("add_badge")).click();

        //Enter badge name and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("badge_name")));
        wd.findElement(By.id("badge_name")).sendKeys("The Ringer");
        wd.findElement(By.id("badge_description")).sendKeys("This is ringer badge! It is awarded to advocates who have accumulate 1000 points!");

        //Select badge icon

        wd.findElement(By.id("icon_20")).click();

        //Set badge visibility rules - Has earned 1000 points

        wd.findElement(By.id("link-rules")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("badge_settings_rule_type_points_reached")));
        wd.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        wd.findElement(By.id("badge_settings_points_value")).click();
        wd.findElement(By.id("badge_settings_points_value")).clear();
        wd.findElement(By.id("badge_settings_points_value")).sendKeys("1000");

        //Save badge

        wd.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}