package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Referral extends Advocate{

    @Test
    public void Ref() {

        //Sign into app and access challenge screen

        wd.get("https://advocatetest.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Load challenge

        wd.get("https://advocatetest.influitives.com/challenges/32");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter referral name

        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_title")).click();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_name")).clear();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_name")).sendKeys("Name Namerson");

        //Enter referral Email

        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_email")).click();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_email")).clear();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_email")).sendKeys("name@namerson.com");

        //Enter referral Company

        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_company")).click();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_company")).clear();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_company")).sendKeys("Cooompany");

        //Enter referral Title

        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_title")).click();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_title")).clear();
        wd.findElement(By.id("activity_prospect_attributions_attributes_0_prospect_attributes_title")).sendKeys("CEO");

        //Submit referral

        wd.findElement(By.xpath("//*[@id=\"refer-someone\"]/div/div[3]/div/input")).click();
        try {
            Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e);
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
