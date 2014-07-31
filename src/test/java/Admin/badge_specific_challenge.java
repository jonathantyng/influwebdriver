package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class badge_specific_challenge extends BaseClass{

    @Test
    public void createbadges() {

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

        //Add new badge

        wd.findElement(By.id("add_badge")).click();

        //Enter badge name and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("badge_name")));
        wd.findElement(By.id("badge_name")).sendKeys("Social Cookie");
        wd.findElement(By.id("badge_description")).sendKeys("This is a social cookie badge! It is awarded to advocates who have completed 2 social media challenges.");

        //Select badge icon

        wd.findElement(By.id("icon_1")).click();

        //Set badge visibility rules - Completed social media challenge twice

        wd.findElement(By.id("link-rules")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("badge_settings_rule_type_completed_specific_challenge")));
        wd.findElement(By.id("badge_settings_rule_type_completed_specific_challenge")).click();
        wd.findElement(By.id("badge_settings_rule_type_completed_challenge")).click();
        wd.findElement(By.cssSelector("#s2id_badge_settings_challenge_type_code > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#select2-drop > div > input")));
        wd.findElement(By.cssSelector("#select2-drop > div > input")).sendKeys("Social Media");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("badge_settings_challenge_times")).click();
        wd.findElement(By.id("badge_settings_challenge_times")).clear();
        wd.findElement(By.id("badge_settings_challenge_times")).sendKeys("2");

        //Save badge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("create_badge_button")));
        wd.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @After
    public void tearDown() {
        wd.quit();
    }
}