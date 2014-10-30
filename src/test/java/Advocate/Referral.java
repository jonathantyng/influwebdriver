package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;


public class Referral extends Advocate{

    @Test
    public void Ref() {

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

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
