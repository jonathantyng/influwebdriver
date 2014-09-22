package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class BlogPost extends Advocate{

    @Test
    public void Blog() {

        //Load challenge

        wd.get("https://princessland.influitives.com/challenges/38");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click 'Go there' to view blog

        wd.findElement(By.linkText("Go there")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        wd.close();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to original tab

        wd.switchTo().window(winHandleBefore);

        //Complete the challenge

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
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
