package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by Shannon on 2014-07-03.
 */

public class AdvocateMenu extends Advocate{

    @Test
    public void quick_filter_challenges(){

        //Toggle menu bar to Challenges

        wd.findElement(By.xpath("//*[@id=\"Challenges\"]")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle menu bar to Community

        wd.findElement(By.cssSelector("#Community")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle menu bar to Rewards

        wd.findElement(By.xpath("//*[@id=\"Rewards\"]")).click();
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle challenges by new

        wd.findElement(By.xpath("//*[@id=\"Referrals\"]")).click();
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
