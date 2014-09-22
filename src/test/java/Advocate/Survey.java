package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Survey extends Advocate{

    @Test
    public void GenSurvey() {

        //Load challenge

        wd.get("https://princessland.influitives.com/challenges/37");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter survey response

        wd.findElement(By.id("activity_responses_attributes_0_body")).click();
        wd.findElement(By.id("activity_responses_attributes_0_body")).clear();
        wd.findElement(By.id("activity_responses_attributes_0_body")).sendKeys("This is a cool response");

        //Submit response

        wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[3]/div/input")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

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
