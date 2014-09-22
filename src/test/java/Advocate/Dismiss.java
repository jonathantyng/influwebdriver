package Advocate;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by shannon on 2014-09-22.
 */


public class Dismiss extends Advocate {

    @Test
    public void Dismiss() {

        //Sign into app

        wd.get("https://princessland.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        wd.findElement(By.id("sign-in-button")).click();
        try {
            Thread.sleep(5000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //Dismiss Challenge from Dashboard

        wd.findElement(By.xpath("//*[@id=\"challenge-cards\"]/div[2]/div[1]/div[2]")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.cssSelector("#new_activity > div.perform.buttons > a")).click();
        wd.switchTo().alert().accept();

        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Un dismiss Same Challenge

        wd.findElement(By.xpath("//*[@id=\"Challenges\"]")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.id("dismissed-challenges-tab")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.cssSelector("#ui-id-5 > ul > li > a")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.cssSelector("#challenge_38 > div > div.challenge-details > div.challenge-activities > div > div:nth-child(3) > div.summary > a")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.cssSelector("#edit_activity_62 > div.perform.buttons > div > input")).click();

        wd.findElement(By.cssSelector("#edit_activity_62 > div.perform.buttons > div > input")).click();

        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

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
