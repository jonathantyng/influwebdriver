package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Sauce {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("version", "10");
        capabilities.setCapability("platform", Platform.WINDOWS);
        this.driver = new RemoteWebDriver(
                new URL("http://influitive_dev:b372fec3-0552-4fb6-98bb-a027d82958b9@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void webDriver() throws Exception {
        driver.get("http://oct21.influitiveqa.com/corporate/settings/levels");
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        driver.findElement(By.id("sign-in-button")).click();
        //driver.findElement(By.xpath("//div[@id='header']/div/ul[2]/li/a/b")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //driver.findElement(By.linkText("Settings")).click();
        //driver.findElement(By.xpath("//ul[@id='accordion']/li[2]/h4")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //driver.findElement(By.linkText("Levels & Badges")).click();
        driver.findElement(By.linkText("No Thanks")).click();
        try { Thread.sleep(4000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("add_badge")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_name")).click();
        driver.findElement(By.id("badge_name")).clear();
        driver.findElement(By.id("badge_name")).sendKeys("Social Cookie");
        driver.findElement(By.id("badge_description")).click();
        driver.findElement(By.id("badge_description")).clear();
        driver.findElement(By.id("badge_description")).sendKeys("This is a social cookie badge! It is awarded to advocates who have completed 2 social media challenges.");
        driver.findElement(By.id("icon_1")).click();
        driver.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_settings_rule_type_completed_specific_challenge")).click();
        driver.findElement(By.id("badge_settings_rule_type_completed_challenge")).click();
        driver.findElement(By.cssSelector("#s2id_badge_settings_challenge_type_code > a.select2-choice > span")).click();
        driver.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Social Media");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.className("select2-match")).click();
        driver.findElement(By.id("badge_settings_challenge_times")).click();
        driver.findElement(By.id("badge_settings_challenge_times")).clear();
        driver.findElement(By.id("badge_settings_challenge_times")).sendKeys("2");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.className("close")).click();
        driver.findElement(By.id("add_badge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_name")).click();
        driver.findElement(By.id("badge_name")).clear();
        driver.findElement(By.id("badge_name")).sendKeys("The Ringer");
        driver.findElement(By.id("badge_description")).click();
        driver.findElement(By.id("badge_description")).clear();
        driver.findElement(By.id("badge_description")).sendKeys("This is ringer badge! It is awarded to advocates who have accumulate 1000 points!");
        driver.findElement(By.id("icon_20")).click();
        driver.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        driver.findElement(By.id("badge_settings_points_value")).click();
        driver.findElement(By.id("badge_settings_points_value")).clear();
        driver.findElement(By.id("badge_settings_points_value")).sendKeys("1000");
        driver.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.className("close")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //driver.findElement(By.id("add_badge")).click();
        //try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //driver.findElement(By.id("badge_name")).click();
        //driver.findElement(By.id("badge_name")).clear();
        //driver.findElement(By.id("badge_name")).sendKeys("Yet Another Badge");
        //driver.findElement(By.id("badge_description")).click();
        //driver.findElement(By.id("badge_description")).clear();
        //driver.findElement(By.id("badge_description")).sendKeys("This is a yet another badge! It is awarded to advocates who have joined the hub.");
        //driver.findElement(By.id("icon_8")).click();
        //driver.findElement(By.id("link-rules")).click();
        //try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //driver.findElement(By.id("badge_settings_rule_type_event_logged")).click();
        //try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //fix
        //driver.findElement(By.linkText("Any Type")).click();
        //new Actions(driver).clickAndHold(driver.findElement(By.cssSelector("#s2id_badge_settings_event_type_code > a.select2-choice > span.select2-chosen"))).build().perform();
        //driver.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Advocate Joined");
        //driver.findElement(By.className("select2-match")).click();
        //driver.findElement(By.id("badge_settings_event_times")).click();
        //driver.findElement(By.id("badge_settings_event_times")).clear();
        //driver.findElement(By.id("badge_settings_event_times")).sendKeys("1");
        //driver.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("add_badge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_name")).click();
        driver.findElement(By.id("badge_name")).clear();
        driver.findElement(By.id("badge_name")).sendKeys("The Best Badge");
        driver.findElement(By.id("badge_description")).click();
        driver.findElement(By.id("badge_description")).clear();
        driver.findElement(By.id("badge_description")).sendKeys("This is the best badge! It is awarded to advocates who accumulated 1500 points.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("icon_6")).click();
        driver.findElement(By.id("link-rules")).click();
        driver.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        driver.findElement(By.id("badge_settings_points_value")).click();
        driver.findElement(By.id("badge_settings_points_value")).clear();
        driver.findElement(By.id("badge_settings_points_value")).sendKeys("1500");
        driver.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.className("close")).click();
        driver.findElement(By.id("add_badge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_name")).click();
        driver.findElement(By.id("badge_name")).clear();
        driver.findElement(By.id("badge_name")).sendKeys("The Best Badge 2");
        driver.findElement(By.id("badge_description")).click();
        driver.findElement(By.id("badge_description")).clear();
        driver.findElement(By.id("badge_description")).sendKeys("This is the best badge! It is awarded to advocates who accumulated 1500 points.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("icon_6")).click();
        driver.findElement(By.id("link-rules")).click();
        driver.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        driver.findElement(By.id("badge_settings_points_value")).click();
        driver.findElement(By.id("badge_settings_points_value")).clear();
        driver.findElement(By.id("badge_settings_points_value")).sendKeys("2000");
        driver.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.className("close")).click();
        driver.findElement(By.id("add_badge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_name")).click();
        driver.findElement(By.id("badge_name")).clear();
        driver.findElement(By.id("badge_name")).sendKeys("The Best Badge 4");
        driver.findElement(By.id("badge_description")).click();
        driver.findElement(By.id("badge_description")).clear();
        driver.findElement(By.id("badge_description")).sendKeys("This is the best badge! It is awarded to advocates who accumulated 1500 points.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("icon_6")).click();
        driver.findElement(By.id("link-rules")).click();
        driver.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        driver.findElement(By.id("badge_settings_points_value")).click();
        driver.findElement(By.id("badge_settings_points_value")).clear();
        driver.findElement(By.id("badge_settings_points_value")).sendKeys("3000");
        driver.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.className("close")).click();
        driver.findElement(By.id("add_badge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_name")).click();
        driver.findElement(By.id("badge_name")).clear();
        driver.findElement(By.id("badge_name")).sendKeys("The Best Badge 5");
        driver.findElement(By.id("badge_description")).click();
        driver.findElement(By.id("badge_description")).clear();
        driver.findElement(By.id("badge_description")).sendKeys("This is the best badge! It is awarded to advocates who accumulated 1500 points.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("icon_6")).click();
        driver.findElement(By.id("link-rules")).click();
        driver.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        driver.findElement(By.id("badge_settings_points_value")).click();
        driver.findElement(By.id("badge_settings_points_value")).clear();
        driver.findElement(By.id("badge_settings_points_value")).sendKeys("4000");
        driver.findElement(By.id("create_badge_button")).click();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}