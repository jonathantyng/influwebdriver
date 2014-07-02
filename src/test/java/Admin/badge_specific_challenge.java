package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

public class badge_specific_challenge extends BaseClass{

    @Test
    public void createbadges() {
        //wd.get("http://may14.influitiveqa.com/users/sign_in");

        //Log in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to levels and badges settings page

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul[1]/li")).click();
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

        //Add new badge

        try { Thread.sleep(4000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("add_badge")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter badge name and description

        wd.findElement(By.id("badge_name")).sendKeys("Social Cookie");
        wd.findElement(By.id("badge_description")).sendKeys("This is a social cookie badge! It is awarded to advocates who have completed 2 social media challenges.");

        //Select badge icon

        wd.findElement(By.id("icon_1")).click();

        //Set badge visibility rules - Completed social media challenge twice

        wd.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_settings_rule_type_completed_specific_challenge")).click();
        wd.findElement(By.id("badge_settings_rule_type_completed_challenge")).click();
        wd.findElement(By.cssSelector("#s2id_badge_settings_challenge_type_code > a.select2-choice > span")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#select2-drop > div > input")).sendKeys("Social Media");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("badge_settings_challenge_times")).click();
        wd.findElement(By.id("badge_settings_challenge_times")).clear();
        wd.findElement(By.id("badge_settings_challenge_times")).sendKeys("2");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save badge

        wd.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}