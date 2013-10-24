package test;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class join_linkedin_group {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver" ,"/Users/patrickprestley/Downloads/chromedriver");

        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void join_linkedin_group() {
        wd.get("http://oct24.influitiveqa.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Tutorial dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Add join linkedin group challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Start With Blank Challenge")).click();
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        wd.findElement(By.name("name")).sendKeys("Join a linkedin group");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("LinkedIn");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.name("headline")).click();
        wd.findElement(By.name("headline")).clear();
        wd.findElement(By.name("headline")).sendKeys("Join a linkedin group");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).click();
        wd.findElement(By.name("description")).clear();
        wd.findElement(By.name("description")).sendKeys("Join a linkedin group is amazing. Complete this challenge.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        wd.findElement(By.xpath("//img[@alt='Linkedin_group_join']")).click();
        wd.findElement(By.name("entered_url")).click();
        wd.findElement(By.name("entered_url")).clear();
        wd.findElement(By.name("entered_url")).sendKeys("http://www.linkedin.com/groups/Javascript-121615?trk=myg_ugrp_ovr");
        wd.findElement(By.cssSelector("button.load-preview.right")).click();
        wd.findElement(By.name("entered_url")).click();
        wd.findElement(By.name("entered_url")).clear();
        wd.findElement(By.name("entered_url")).sendKeys();
        wd.findElement(By.id("ui-id-2")).click();
        wd.findElement(By.xpath("(//input[@name='commit'])[2]")).click();
        try { Thread.sleep(4000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wd.findElement(By.name("commit")).click();
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
