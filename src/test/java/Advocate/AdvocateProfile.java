package Advocate;

/**
 * Created by Shannon on 2014-09-18.
 */

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AdvocateProfile extends Advocate{


    @Test
    public void view_profile(){

        //Advocate Profile

        wd.findElement(By.xpath("//*[@id=\"contact-dropdown\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[4]/ul/li[1]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"ui-id-6\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"ui-id-5\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}


    }


    @Test
    public void edit_profile(){

        //Advocate Profile

        wd.findElement(By.xpath("//*[@id=\"contact-dropdown\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[4]/ul/li[1]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Edit Profile

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //edit Title

        wd.findElement(By.xpath("//*[@id=\"contact_title\"]")).sendKeys("CEO");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"profile-tabs\"]/div/div[6]/input")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}



    }

    @Test
    public void update_password(){

        //Advocate Profile

        wd.findElement(By.xpath("//*[@id=\"contact-dropdown\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[4]/ul/li[1]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Edit Profile

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click Password

        wd.findElement(By.xpath("//*[@id=\"ui-id-8\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter Old Password

        wd.findElement(By.id("contact_user_attributes_old_password")).sendKeys("macbook18");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.id("contact_user_attributes_password")).sendKeys("macbook18");
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