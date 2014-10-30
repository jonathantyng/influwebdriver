package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by shannon on 2014-09-18.
 */


public class leaderboard extends Advocate{


    @Test
    public void leaderboard(){

        //Click on 'View Top 10'

        wd.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Remove me from Leaderboard

        wd.findElement(By.xpath("//*[@id=\"leaderboard-toggle\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.switchTo().alert().accept();

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Re add me to Leaderboard

        wd.findElement(By.xpath("//*[@id=\"leaderboard-toggle\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.switchTo().alert().accept();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


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
