package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadImage extends Advocate{

    @Test
    public void UImage() {

        //Load challenge

        wd.get("https://advocatetest.influitives.com/challenges/37");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Signout

        wd.findElement(By.id("contact-dropdown")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Sign out")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }


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
