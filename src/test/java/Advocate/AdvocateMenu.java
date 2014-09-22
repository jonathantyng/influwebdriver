package Advocate;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Shannon on 2014-07-03.
 */

public class AdvocateMenu extends Advocate{

    @Test
    public void quick_filter_challenges(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

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

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
