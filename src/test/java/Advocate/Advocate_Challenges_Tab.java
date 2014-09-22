package Advocate;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by patrickprestley on 2014-07-03.
 */
public class Advocate_Challenges_Tab extends Advocate {

    @Test
    public void filter_by(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //View challenges tab

        wd.get("http://princessland.influitives.com/challenges");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on completed filter

        wd.findElement(By.xpath("//*[@id=\"completed-challenges-tab\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click on dismissed filter

        wd.findElement(By.xpath("//*[@id=\"dismissed-challenges-tab\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void view_earned_badges(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //View challenges tab

        wd.get("http://princessland.influitives.com/challenges");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on "Earned Badges"

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[4]/div[3]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void view_levels(){
        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //View challenges tab

        wd.get("http://princessland.influitives.com/challenges");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on "Level up by.."

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[4]/p[2]/a\n")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

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
