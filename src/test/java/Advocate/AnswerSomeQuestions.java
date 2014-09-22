package Advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class AnswerSomeQuestions extends Advocate{

    @Test
    public void Answer_some_questions() {


        //Log in to hub

        wd.get("https://princessland.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Challenge Card

        wd.findElement(By.cssSelector("#challenge-cards > div.col-1.column > div:nth-child(1) > div.title")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


        //Answer Question 1

        wd.findElement(By.cssSelector("#activity_responses_attributes_0_body")).sendKeys("Yup");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


        /*Answer Question 2

        wd.findElement(By.cssSelector("#question_19 > div > div > div > div")).click();
        wd.findElement(By.cssSelector("#question_19 > div > div > div > div")).sendKeys("Yes");

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        */

        //Answer Question 3

        wd.findElement(By.cssSelector("#activity_responses_attributes_2_body_yes")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


        //Answer Question 4

        wd.findElement(By.xpath("//*[@id=\"question_21\"]/div/div/div/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }




    }




}