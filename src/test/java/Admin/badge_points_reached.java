package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class badge_points_reached extends BaseClass{

    @Test
    public void createpointbadge() {
        wd.get("https://sanityjan7.influitives.com/users/sign_in");
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
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_name")).click();
        wd.findElement(By.id("badge_name")).clear();
        wd.findElement(By.id("badge_name")).sendKeys("The Ringer");
        wd.findElement(By.id("badge_description")).click();
        wd.findElement(By.id("badge_description")).clear();
        wd.findElement(By.id("badge_description")).sendKeys("This is ringer badge! It is awarded to advocates who have accumulate 1000 points!");
        wd.findElement(By.id("icon_20")).click();
        wd.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        wd.findElement(By.id("badge_settings_points_value")).click();
        wd.findElement(By.id("badge_settings_points_value")).clear();
        wd.findElement(By.id("badge_settings_points_value")).sendKeys("1000");
        wd.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}