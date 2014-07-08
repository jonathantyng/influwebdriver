package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by patrickprestley on 2014-07-02.
 */
public class Admin_Advocate_Actions extends AdminBase {

      @Test
      public void edit_advocate(){

          //Admin sign in

          wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
          wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
          wd.findElement(By.name("commit")).click();

          //Navigate to Advocates Tab

          wd.findElement(By.id("Advocates")).click();
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Click on advocate dropdown

          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Select edit from dropdown

          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[1]/a")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Click on passwords tab

          wd.findElement(By.xpath("//*[@id=\"profile-password-tab\"]")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Click on profiles tab

          wd.findElement(By.xpath("//*[@id=\"profile-email-tab\"]")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Click on match criteria tab

          wd.findElement(By.xpath("//*[@id=\"profile-match-tab\"]")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Save edit advocate

          wd.findElement(By.name("commit")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
      }

      @Test
      public void log_activity(){

          //Admin sign in

          wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
          wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
          wd.findElement(By.name("commit")).click();

          //Navigate to Advocates Tab

          wd.findElement(By.id("Advocates")).click();
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Click on advocate dropdown

          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Select log activity from dropdown

          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[2]/a")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Add activity name

          wd.findElement(By.id("activity_name")).sendKeys("Testing Log Activities");
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Click 'Add Note'

          wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[3]/div/a")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
          wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[3]/div/a")).click();


          //Enter note

          wd.findElement(By.xpath("//*[@id=\"activity_description\"]")).sendKeys("This is a note");
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Click on award points

          wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[4]/div/a")).click();
          //wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[4]/div/a")).clear();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
          //wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[4]/div/a")).click();

          //Enter points

          wd.findElement(By.xpath("//*[@id=\"activity_logged_points\"]")).sendKeys("1111");
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

          //Log activity

          wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/input")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
      }

    @Test
    public void give_perk(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates Tab

        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select give perk from dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[3]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on perk dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-chosen-10\"]")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select perk from list

        wd.findElement(By.xpath("//*[@id=\"select2-results-10\"]")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click give reward button

        wd.findElement(By.xpath("//*[@id=\"new_award_status\"]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void send_advocate_message(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates Tab

        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select send message from dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[4]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter subject line

        wd.findElement(By.xpath("//*[@id=\"messaging_conversation_starter_subject\"]")).sendKeys("Testing Message");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter message body

        wd.findElement(By.xpath("//*[@id=\"messaging_conversation_starter_message_body\"]")).sendKeys("Testing message body");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Send message -- click button

        wd.findElement(By.xpath("//*[@id=\"new_messaging_conversation_starter\"]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void add_note(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates Tab

        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select add note from dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[5]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter note text

        wd.findElement(By.xpath("//*[@id=\"contact_flag_notes\"]")).sendKeys("This is an advocate note");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Update note --- click update button

        wd.findElement(By.xpath("//*[@id=\"edit_contact_15\"]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void disable_advocate_account(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates Tab

        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select disable account from dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[6]/a")).click();
        //Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("wrong"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click ok in the 'are you sure' pop up

        try {
            WebDriverWait wait = new WebDriverWait(wd, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = wd.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
    }

    @Test
    public void enable_advocate_account(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates Tab

        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select disable account from dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[6]/a")).click();
        //Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("wrong"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click ok in the 'are you sure' pop up

        try {
            WebDriverWait wait = new WebDriverWait(wd, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = wd.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
    }

    @Test
    public void export_contact_activity(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates Tab

        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select export contact activity from dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[7]/a\n")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void adjust_points(){

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates Tab

        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select adjust points from dropdown

        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[10]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter adjustment amount

        wd.findElement(By.xpath("//*[@id=\"point_adjustment_points\"]")).sendKeys("1111");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click 'leave message' checkbox

        wd.findElement(By.xpath("//*[@id=\"point_adjustment_should_send_message\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter subject

        wd.findElement(By.xpath("//*[@id=\"point_adjustment_subject\"]")).sendKeys("Adjust Points!!!");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Enter message body

        wd.findElement(By.xpath("//*[@id=\"point_adjustment_message\"]")).sendKeys("Point adjustment message!!!");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click adjust points button

        wd.findElement(By.xpath("//*[@id=\"new_point_adjustment\"]/div[2]/input")).click();
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
