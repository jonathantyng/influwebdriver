package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by Shannon on 2014-09-19.
 */


public class Referrals extends Advocate {

    @Test
    public void submit_new_referral() {

        //Enter new contact information

        wd.findElement(By.xpath("//*[@id=\"activity_prospect_attributions_attributes_0_prospect_attributes_name\"]")).sendKeys("David Cross");
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        wd.findElement(By.xpath("//*[@id=\"activity_prospect_attributions_attributes_0_prospect_attributes_email\"]")).sendKeys("comedian@funnyinfluitive.com");
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        wd.findElement(By.xpath("//*[@id=\"activity_prospect_attributions_attributes_0_prospect_attributes_company\"]")).sendKeys("Comedian");
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Submit

        wd.findElement(By.cssSelector("#refer-someone > div > div.perform.buttons > div > input")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void toggle_send_an_email() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {
            Thread.sleep(5000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Go to Referrals page

        wd.findElement(By.xpath("//*[@id=\"Referrals\"]")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Toggle Send email

        wd.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Toggle Back

        wd.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void click_send_email() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {
            Thread.sleep(5000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Go to Referrals page

        wd.findElement(By.xpath("//*[@id=\"Referrals\"]")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Toggle Send email

        wd.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.xpath("//*[@id=\"refer-by-email\"]/div/div[1]/a[1]")).click();
        try {
            Thread.sleep(20001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /*

    @Test
    public void click_copy_to_clipboard() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {
            Thread.sleep(20001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Go to Referrals page

        wd.findElement(By.xpath("//*[@id=\"Referrals\"]")).click();
        try {
            Thread.sleep(2001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Toggle Send email

        wd.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
        try {
            Thread.sleep(2001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Click copy to clipboard

        wd.findElement(By.cssSelector("#global-zeroclipboard-flash-bridge > embed")).click();
        try {
            Thread.sleep(2001);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    */

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}


