package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class badge_points_reached extends BaseClass{

    @Test
    public void createpointbadge() {
        //wd.get("http://may14.influitiveqa.com/users/sign_in");

        //Log in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to levels and badges settings page

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul[1]/li/a")).click();
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

        //Add a new badge

        wd.findElement(By.id("add_badge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter badge name and description

        wd.findElement(By.id("badge_name")).sendKeys("The Ringer");
        wd.findElement(By.id("badge_description")).sendKeys("This is ringer badge! It is awarded to advocates who have accumulate 1000 points!");

        //Select badge icon

        wd.findElement(By.id("icon_20")).click();

        //Set badge visibility rules - Has earned 1000 points

        wd.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        wd.findElement(By.id("badge_settings_points_value")).click();
        wd.findElement(By.id("badge_settings_points_value")).clear();
        wd.findElement(By.id("badge_settings_points_value")).sendKeys("1000");

        //Save badge

        wd.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}