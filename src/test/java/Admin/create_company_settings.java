package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class create_company_settings extends BaseClass{

    @Test
    public void createcompanysettings(){

        wd.get("http://sanitymar17.influitives.com/");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.className("remove")).size() != 0;

        if (exists)
        {
            wd.findElement(By.className("remove")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul[1]/li/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//ul[@id='accordion']/li[3]/h4")).click();
        wd.findElement(By.linkText("Welcome Email")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("settings_builder_preferences_deliver_welcome_email")).click();
        wd.findElement(By.name("commit")).click();
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
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.xpath("//ul[@id='accordion']/li[5]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#collapse-me4 > li > a")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("provider_setting_options_user_name")).click();
        wd.findElement(By.id("provider_setting_options_user_name")).clear();
        wd.findElement(By.id("provider_setting_options_user_name")).sendKeys("patrick@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("provider_setting_options_password")).click();
        wd.findElement(By.id("provider_setting_options_password")).clear();
        wd.findElement(By.id("provider_setting_options_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("provider_setting_options_token")).click();
        wd.findElement(By.id("provider_setting_options_token")).clear();
        wd.findElement(By.id("provider_setting_options_token")).sendKeys("BQbPYIxOnWTk9KgGSObictiY");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();
        wd.findElement(By.linkText("Influitive Labs")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}