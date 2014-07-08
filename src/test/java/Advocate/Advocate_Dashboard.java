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
public class Advocate_Dashboard extends Advocate{

    @Test
    public void quick_filter_challenges(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle challenges by Featured

        wd.findElement(By.xpath("//*[@id=\"challenge-filter\"]/ul/li[2]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle challenges by In Progress

        wd.findElement(By.xpath("//*[@id=\"challenge-filter\"]/ul/li[3]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle challenges by popular

        wd.findElement(By.xpath("//*[@id=\"challenge-filter\"]/ul/li[4]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle challenges by new

        wd.findElement(By.xpath("//*[@id=\"challenge-filter\"]/ul/li[5]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void filter_by_type(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select 'By Type' dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-chosen-8\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //



    }

    @Test
    public void add_goal(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on add a goal

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[2]/div/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void view_levels(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on 'Level up by unlocking badges'

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[4]/p[2]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Close badges modal

        wd.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void make_a_referral_link(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on the make a referral

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[1]/h2[1]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void visit_community(){

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on 'Visit Community'

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[1]/h2[2]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("Error"));

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
