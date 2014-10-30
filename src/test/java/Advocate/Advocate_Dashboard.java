package Advocate;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by patrickprestley on 2014-07-03. Updated by Shannonon 2014-09-18
 */
public class Advocate_Dashboard extends Advocate{

    @Test
    public void quick_filter_challenges(){

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

    //The below test won't pass, no matter what I do... *sad face*

    @Test
    public void filter_by_type(){

        //Select 'By Type' dropdown - big ass failing test!

        wd.findElement(By.cssSelector("#select2-chosen-15")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //

    }

    @Test
    public void add_goal(){

        //Click on add a goal

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[2]/div/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Add goal

        wd.findElement(By.cssSelector("#all-rewards > ul:nth-child(1) > li > section > div.goal-toggle")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


    }


    @Test
    public void link_to_Make_a_Referral(){

        //Click on Make a Referral

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[1]/h2[1]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }


    @Test
    public void link_to_Visit_Community(){

        //Click on Visit Community

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[1]/h2[2]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void link_to_Maven(){

        //Click on Maven IOS App

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[1]/h2[3]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void view_levels(){

        //Click on 'Level up by unlocking badges'

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[4]/p[2]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Close badges modal

        wd.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void make_a_referral_link(){

        //Click on the make a referral

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[1]/h2[1]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void visit_community(){

        //Click on 'Visit Community'

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[1]/h2[2]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
       public void see_earned_badges(){

        //See Earned Badges

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[1]/section[4]/div[3]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void powered_by_influitive(){

        //Click on Powered By Influitive

        wd.findElement(By.xpath("//*[@id=\"content\"]/footer/h3/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }


    @Test
    public void Notifications() {

        //Click on notifications

        wd.findElement(By.xpath("//*[@id=\"notifications-menu\"]/a/ins")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle to previous notificatons by clicking 'More'

        wd.findElement(By.xpath("//*[@id=\"notification-drop\"]/a[2]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Toggle back

        wd.findElement(By.xpath("//*[@id=\"notification-drop\"]/a[1]")).click();
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
