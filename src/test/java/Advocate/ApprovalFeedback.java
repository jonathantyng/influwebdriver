package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ApprovalFeedback extends Advocate{

    @Test
    public void ApprovalFeedbacks() {

        //Load challenge

        wd.get("https://princessland.influitives.com/challenges/22");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Accept challenge

        wd.findElement(By.name("commit")).click();

        //Enter response

        wd.findElement(By.id("activity_responses_attributes_0_body")).click();
        wd.findElement(By.id("activity_responses_attributes_0_body")).sendKeys("Entering another response");

        //Submit response

        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
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
