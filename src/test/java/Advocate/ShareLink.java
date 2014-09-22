package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ShareLink extends Advocate{

    @Test
    public void Share() {

        //Load challenge

        wd.get("https://princessland.influitives.com/challenges/33");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select twitter

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
