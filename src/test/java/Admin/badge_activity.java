package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

public class badge_activity extends BaseClass{

    @Test
    public void createactivitybadge() {
        //wd.get("http://may14.influitiveqa.com/users/sign_in");

        //Log in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to level and badges settings

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
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter Badge name and description

        wd.findElement(By.id("badge_name")).sendKeys("Yet Another Badge");
        wd.findElement(By.id("badge_description")).sendKeys("This is a yet another badge! It is awarded to advocates who have joined the hub.");

        //Select badge icon

        wd.findElement(By.id("icon_8")).click();

        //Set badge rules - Any type of challenge once

        wd.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_settings_rule_type_event_logged")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Any Type")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div")).click();
        wd.findElement(By.id("badge_settings_event_times")).sendKeys("1");

        //Save badge

        wd.findElement(By.id("create_badge_button")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}