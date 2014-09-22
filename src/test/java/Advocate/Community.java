package Advocate;



/**
 * Created by shannon on 2014-09-18.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Community extends Advocate{

    @Test
    public void post_to_community(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle menu bar to Community

        wd.findElement(By.cssSelector("#Community")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Post text to community

        wd.findElement(By.xpath("//*[@id=\"suggest-link-area\"]")).sendKeys("Sanity");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Post

        wd.findElement(By.cssSelector("#main > div.main-content.primary > div > div > input[type=\"submit\"]")).click();
        try { Thread.sleep(10001); } catch (Exception e) { throw new RuntimeException(e); }

        //View Advocate Profile

        wd.findElement(By.xpath("//*[@id=\"event_234\"]/div[1]/a/span")).click();
        try { Thread.sleep(10001); } catch (Exception e) { throw new RuntimeException(e); }

        //Close Advocate Profile

        wd.findElement(By.cssSelector("#Close")).click();
        try { Thread.sleep(10001); } catch (Exception e) { throw new RuntimeException(e); }

        //Like a post

        wd.findElement(By.xpath("//*[@id=\"event_229\"]/div[3]/div[1]/span/span/a")).click();
        try { Thread.sleep(10001); } catch (Exception e) { throw new RuntimeException(e); }

        //Unlike

        wd.findElement(By.xpath("//*[@id=\"event_229\"]/div[3]/div[1]/span/span/a")).click();
        try { Thread.sleep(10001); } catch (Exception e) { throw new RuntimeException(e); }

        //Leave a comment

        wd.findElement(By.xpath("//*[@id=\"event_229\"]/div[3]/div[1]/a")).click();
        try { Thread.sleep(10001); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.xpath("//*[@id=\"event_229\"]/div[3]/div[4]/div/div/ul[2]/li/div/textarea")).sendKeys("Yo, What's up Marge?");
        try { Thread.sleep(10001); } catch (Exception e) { throw new RuntimeException(e); }


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
