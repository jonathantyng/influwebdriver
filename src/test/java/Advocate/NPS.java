package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NPS extends Advocate{


    @Test
    public void NPSChallenge() {

        //Load challenge

        wd.get("https://princessland.influitives.com/challenges/29");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select NPS value

        wd.findElement(By.id("activity_responses_attributes_0_body_8")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Submit response

        wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[3]/div/input")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

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
