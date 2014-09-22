package Advocate;

import org.junit.After;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Shannon on 2014-09-18.
 */
public class Messages extends Advocate{

    @Test
    public void message_admin() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}



        //Message Center

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[2]/a/ins")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}



        //Send message to Admin

        wd.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[1]/a")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.id("messaging_conversation_starter_subject")).sendKeys("Hey Admin");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.id("messaging_conversation_starter_message_body")).sendKeys("I'm having a great time chatting with you here!");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"new_messaging_conversation_starter\"]/div[2]/input")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }


        @Test
        public void respond_to_admin() {

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Message Center

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/nav[2]/ul/li[2]/a/ins")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select message from Admin

        wd.findElement(By.xpath("//*[@id=\"conversation_11\"]/div/p[1]/span")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //respond to admin

        wd.findElement(By.xpath("//*[@id=\"messaging_message_body\"]")).sendKeys("Hi Admin, I'm writing you back!");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        wd.findElement(By.xpath("//*[@id=\"new_messaging_message\"]/input")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

        @Test
        public void message_advocate() {

            //Sign in as advocate

            wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
            wd.findElement(By.id("user_password")).sendKeys("macbook18");
            wd.findElement(By.id("sign-in-button")).click();
            try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}


            //click on advocate name from leaderboard

            wd.findElement(By.xpath("//*[@id=\"advocate_11\"]/td[3]/a")).click();
            try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

            //Click on send message

            wd.findElement(By.xpath("//*[@id=\"home\"]/div[9]/div[1]/p/div[4]/a")).click();
            try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

            //Compose Message

            wd.findElement(By.xpath("//*[@id=\"messaging_conversation_starter_subject\"]")).sendKeys("Hey Moe");
            try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

            wd.findElement(By.xpath("//*[@id=\"messaging_conversation_starter_message_body\"]")).sendKeys("Having a good day?");
            try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}


            //Send Message

            wd.findElement(By.xpath("//*[@id=\"new_messaging_conversation_starter\"]/div[2]/input")).click();
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
