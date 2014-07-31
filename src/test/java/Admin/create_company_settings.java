package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class create_company_settings extends BaseClass{

    @Test
    public void edit_and_save_company_settings(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Log in as super admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")));
            System.out.println("Tutorial not encountered");
        }

        //Click on the admin dropdown

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")).click();

        //Select settings from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Select email from settings menu

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='accordion']/li[3]/h4")));
        wd.findElement(By.xpath("//ul[@id='accordion']/li[3]/h4")).click();

        //Select welcome email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Welcome Email")));
        wd.findElement(By.linkText("Welcome Email")).click();

        //Enable welcome email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings_builder_preferences_deliver_welcome_email")));
        wd.findElement(By.id("settings_builder_preferences_deliver_welcome_email")).click();

        //Save welcome email settings

        wd.findElement(By.name("commit")).click();

        //Select invitations from email settings

        wd.findElement(By.linkText("Invitations")).click();

        //Click on challenge digest

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Challenge Digest")));
        wd.findElement(By.linkText("Challenge Digest")).click();

        //Enable challenge digest and save

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_preference_email_digest_send")));
        wd.findElement(By.id("company_preference_email_digest_send")).click();
        wd.findElement(By.name("commit")).click();

        //Select challenge email from email settings

        wd.findElement(By.linkText("Challenge Email")).click();

        //Select notifications from email settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Notifications")));
        wd.findElement(By.linkText("Notifications")).click();

        //Enable notifications and save

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_preference_deliver_notifications")));
        wd.findElement(By.id("company_preference_deliver_notifications")).click();
        wd.findElement(By.name("commit")).click();

        //Select SFDC settings

        wd.findElement(By.xpath("//ul[@id='accordion']/li[5]/h4")).click();

        //Select general settings

        //wd.findElement(By.cssSelector("#collapse-me4 > li > a")).click();
        //try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter SFDC credentials

        wd.findElement(By.id("provider_setting_options_user_name")).sendKeys("patrick@influitive.com");
        wd.findElement(By.id("provider_setting_options_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("provider_setting_options_token")).sendKeys("mFMn1Bj0GSx0QnHkRfG1pvKD4");

        //Save settings

        wd.findElement(By.name("commit")).click();

        //Select..

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='accordion']/li[4]/h4")));
        wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();

        //Select influitive labs

        wd.findElement(By.linkText("Influitive Labs")).click();

        //Turn on community

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toggles_community")));
        wd.findElement(By.id("toggles_community")).click();

        //Turn on zones

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toggles_zones")));
        wd.findElement(By.id("toggles_zones")).click();

        //Save settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}