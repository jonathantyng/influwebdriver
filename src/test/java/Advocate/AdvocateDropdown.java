package Advocate;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by shannon on 2014-09-18.
 */

public class AdvocateDropdown extends Advocate{

    @Test
    public void advocate_dropdown(){

        //Advocate Profile

        wd.findElement(By.xpath("//*[@id=\"contact-dropdown\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[4]/ul/li[1]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //View Feedback

        wd.findElement(By.xpath("//*[@id=\"contact-dropdown\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[4]/ul/li[3]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //View About Page

        wd.findElement(By.xpath("//*[@id=\"contact-dropdown\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[4]/ul/li[4]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Sign Out

        wd.findElement(By.xpath("//*[@id=\"contact-dropdown\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[4]/ul/li[5]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}


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


