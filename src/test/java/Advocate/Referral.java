package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Referral extends Advocate{

    @Test
    public void Ref() {

        //Load challenge

        wd.findElement(By.cssSelector("#challenge-cards > div.col-1.column > div:nth-child(1) > div.title")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter referral name

        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_name")).click();
        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_name")).clear();
        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_name")).sendKeys("Name Namerson");

        //Enter referral Email

        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_email")).click();
        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_email")).clear();
        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_email")).sendKeys("name@namerson.com");

        //Enter referral Company

        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_company")).click();
        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_company")).clear();
        wd.findElement(By.cssSelector("#activity_prospect_attributions_attributes_0_prospect_attributes_company")).sendKeys("Cooompany");


        //Submit referral

        wd.findElement(By.xpath("//*[@id=\"refer-someone\"]/div/div[2]/div/input")).click();
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
