package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Approval extends Advocate{

    @Test
    public void approval() {

        //Click on challenge card for Approval Challenge

        wd.findElement(By.cssSelector("#challenge-cards > div.col-1.column > div:nth-child(1) > div.title")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click Approval

        wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[3]/div/input")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }



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
