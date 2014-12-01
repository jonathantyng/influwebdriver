package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Events2 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://princessland.influitiveqa.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitled2() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        driver.findElement(By.id("sign-in-button")).click();
        driver.findElement(By.linkText("Influitive Admin")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.linkText("Events")).click();
        driver.findElement(By.cssSelector("div.event-zone-settings")).click();
        driver.findElement(By.linkText("Add Event")).click();
        driver.findElement(By.id("zone_name")).clear();
        driver.findElement(By.id("zone_name")).sendKeys("Firefox Event");
        driver.findElement(By.id("zone_description")).clear();
        driver.findElement(By.id("zone_description")).sendKeys("Test event");
        driver.findElement(By.id("link-targeting")).click();
        driver.findElement(By.cssSelector("input.visible-to")).click();
        driver.findElement(By.cssSelector("#visible-to > div > div > label")).click();
        driver.findElement(By.cssSelector("input.visible-to")).click();
        driver.findElement(By.cssSelector("label.selected")).click();
        driver.findElement(By.cssSelector("input.visible-to")).click();
        driver.findElement(By.cssSelector("#visible-to > div > div > label")).click();
        driver.findElement(By.id("criteria_radio")).click();
        driver.findElement(By.cssSelector("label.selected")).click();
        driver.findElement(By.linkText("Group")).click();
        driver.findElement(By.cssSelector("li.select2-search-field")).click();
        driver.findElement(By.cssSelector("#exclude-conditions-list > div > footer > ul.menu-collection > li.menu-item > a.add-search-criteria")).click();
        driver.findElement(By.cssSelector("#s2id_autogen69 > ul.select2-choices > li.select2-search-field")).click();
        driver.findElement(By.id("save-button")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Not Published')])[4]")).click();
        driver.findElement(By.id("visibility_setting_publish")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}


