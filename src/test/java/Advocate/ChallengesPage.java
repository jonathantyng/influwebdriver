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


public class ChallengesPage extends Advocate{

    @Test
    public void toggle_challenges() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}


        //Head on over to the Challenges page

        wd.findElement(By.xpath("//*[@id=\"Challenges\"]")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Hit 'Open' - even tho we default to open

        wd.findElement(By.xpath("//*[@id=\"open-challenges-tab\"]")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}


        //Toggle completed challenges

        wd.findElement(By.xpath("//*[@id=\"completed-challenges-tab\"]")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}


        //Toggle dismissed challenges

        wd.findElement(By.xpath("//*[@id=\"dismissed-challenges-tab\"]")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}


        //View Open Challenges

        wd.findElement(By.xpath("//*[@id=\"open-challenges-tab\"]")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

        /* Sort challenges

        wd.findElement(By.cssSelector("#select2-drop-mask")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

       */


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
