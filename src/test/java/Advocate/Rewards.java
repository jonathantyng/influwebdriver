package Advocate;



/**
 * Created by shannon on 2014-09-18.
 */

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Rewards extends Advocate{

    @Test
    public void redeem_reward(){

        //Click on menu bar 'Rewards'

        wd.findElement(By.xpath("//*[@id=\"Rewards\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Redeem Reward

        wd.findElement(By.cssSelector("#all-rewards > ul:nth-child(2) > li > section > div.general > div.name > a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.cssSelector("#new_reward_redemption > input.highlighted")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void set_goal() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on menu bar 'Rewards'

        wd.findElement(By.xpath("//*[@id=\"Rewards\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Set a reward as a goal

        wd.findElement(By.cssSelector("#all-rewards > ul:nth-child(2) > li > section > div.goal-toggle")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void remove_goal() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on menu bar 'Rewards'

        wd.findElement(By.xpath("//*[@id=\"Rewards\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Remove Goal

        wd.findElement(By.cssSelector("#all-rewards > ul:nth-child(2) > li > section > div.goal-toggle.on")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void view_goals() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {Thread.sleep(5000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on menu bar 'Rewards'

        wd.findElement(By.xpath("//*[@id=\"Rewards\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Remove Goal

        wd.findElement(By.cssSelector("#advocate-rewards > nav > ul > li.goal-legend > a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

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


