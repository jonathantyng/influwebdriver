package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadImage extends Advocate{

    @Test
    public void UImage() {

        //Load challenge

        wd.get("https://princessland.influitives.com/challenges/37");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

    }


    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
