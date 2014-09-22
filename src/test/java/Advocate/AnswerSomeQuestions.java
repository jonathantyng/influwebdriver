package Advocate;

import org.junit.Test;
import org.openqa.selenium.By;

public class AnswerSomeQuestions extends Advocate{

    @Test
    public void Answer_some_questions() {

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