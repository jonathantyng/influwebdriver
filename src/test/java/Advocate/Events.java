package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

/**
 * Created by shannon on 2014-09-22.
 */
public class Events extends Advocate {

    @Test
    public void eventzone() {

        //enter event zone

        wd.findElement(By.cssSelector("#challenge-cards > div.col-0.column > div.widget.zone-card")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Toggle Menu Bar

        wd.findElement(By.id("Activity Feed")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.id("Community")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.id("Rewards")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.id("Referrals")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.id("Home")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }



        //Complete Challenge

        wd.findElement(By.xpath("//*[@id=\"challenge-cards\"]/div[1]/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.cssSelector("#activity_responses_attributes_0_body_9")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.cssSelector("#new_activity > div.perform.buttons > div > input")).click();
        try { Thread.sleep(7000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.cssSelector("#modal > div.modal-header > button")).click();
        try { Thread.sleep(7000l); } catch (Exception e) { throw new RuntimeException(e); }


        //Events Leaderboard


        wd.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.findElement(By.xpath("//*[@id=\"leaderboard-toggle\"]")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        wd.switchTo().alert().accept();


        wd.findElement(By.id("Home")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


        wd.findElement(By.cssSelector("#leaderboard-toggle")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }



        wd.switchTo().alert().accept();




        //Return to original Hub

        wd.findElement(By.cssSelector("#header > div > div > a")).click();
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
