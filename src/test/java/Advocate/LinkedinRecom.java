package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;


public class LinkedinRecom extends Advocate{

    @Test
    public void Rocommendation() {

        //Load challenge

        wd.get("https://advocatetest.influitives.com/challenges/27");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Recommend

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

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
