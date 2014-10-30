package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by patrickprestley on 2014-07-02.
 */
public class Admin_Advocate_Actions extends AdminBase {

      @Test
      public void edit_advocate(){

          WebDriverWait wait = new WebDriverWait(wd, 5);

          //Navigate to Advocates Tab

          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
          wd.findElement(By.id("Advocates")).click();

          //Click on advocate dropdown

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Select edit from dropdown

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[1]/a")));
          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[1]/a")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Click on passwords tab

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"profile-password-tab\"]")));
          wd.findElement(By.xpath("//*[@id=\"profile-password-tab\"]")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Click on profiles tab

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"profile-email-tab\"]")));
          wd.findElement(By.xpath("//*[@id=\"profile-email-tab\"]")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Click on match criteria tab

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"profile-match-tab\"]")));
          wd.findElement(By.xpath("//*[@id=\"profile-match-tab\"]")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Save edit advocate

          wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
          wd.findElement(By.name("commit")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
      }

      @Test
      public void log_activity(){

          WebDriverWait wait = new WebDriverWait(wd, 5);

          //Navigate to Advocates Tab

          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
          wd.findElement(By.id("Advocates")).click();

          //Click on advocate dropdown

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Select log activity from dropdown

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[2]/a")));
          wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[2]/a")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Add activity name

          wait.until(ExpectedConditions.presenceOfElementLocated(By.id("activity_name")));
          wd.findElement(By.id("activity_name")).sendKeys("Testing Log Activities");
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Click 'Add Note'

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[3]/div/a")));
          wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[3]/div/a")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Enter note

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"activity_description\"]")));
          wd.findElement(By.xpath("//*[@id=\"activity_description\"]")).sendKeys("This is a note");
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Click on award points

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[4]/div/a")));
          wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/div[4]/div/a")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Enter points

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"activity_logged_points\"]")));
          wd.findElement(By.xpath("//*[@id=\"activity_logged_points\"]")).sendKeys("1111");
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

          //Log activity

          wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_activity\"]/div[2]/input")));
          wd.findElement(By.xpath("//*[@id=\"new_activity\"]/div[2]/input")).click();
          Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
          try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
      }

    @Test
    public void give_perk(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates Tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Click on advocate dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_19\"]/div[2]/div/a/img")));
        wd.findElement(By.xpath("//*[@id=\"advocate_19\"]/div[2]/div/a/img")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select give perk from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_19\"]/div[2]/div/ul/li[3]/a")));
        wd.findElement(By.xpath("//*[@id=\"advocate_19\"]/div[2]/div/ul/li[3]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click on perk dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-chosen-7\"]")));
        wd.findElement(By.xpath("//*[@id=\"select2-chosen-7\"]")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select perk from list

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-results-7\"]")));
        wd.findElement(By.xpath("//*[@id=\"select2-results-7\"]")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click give reward button

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_award_status\"]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_award_status\"]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void send_advocate_message(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates Tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select send message from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[4]/a")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[4]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Enter subject line

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"messaging_conversation_starter_subject\"]")));
        wd.findElement(By.xpath("//*[@id=\"messaging_conversation_starter_subject\"]")).sendKeys("Testing Message");

        //Enter message body

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"messaging_conversation_starter_message_body\"]")));
        wd.findElement(By.xpath("//*[@id=\"messaging_conversation_starter_message_body\"]")).sendKeys("Testing message body");

        //Send message -- click button

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_messaging_conversation_starter\"]/div[2]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_messaging_conversation_starter\"]/div[2]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void add_note(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates Tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Click on advocate dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select add note from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[5]/a")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[5]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Enter note text

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"contact_flag_notes\"]")));
        wd.findElement(By.xpath("//*[@id=\"contact_flag_notes\"]")).sendKeys("This is an advocate note");

        //Update note --- click update button

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"edit_contact_15\"]/input")));
        wd.findElement(By.xpath("//*[@id=\"edit_contact_15\"]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void disable_advocate_account(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates Tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Click on advocate dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select disable account from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[6]/a")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[6]/a")).click();
        //Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("wrong"));

        //Click ok in the 'are you sure' pop up

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = wd.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
    }

    @Test
    public void enable_advocate_account(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates Tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Click on advocate dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select disable account from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[6]/a")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[6]/a")).click();
        //Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("wrong"));

        //Click ok in the 'are you sure' pop up

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = wd.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }
    }

    @Test
    public void export_contact_activity(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates Tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Click on advocate dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select export contact activity from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[7]/a\n")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[7]/a\n")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void adjust_points(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates Tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Click on advocate dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select adjust points from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[10]/a")));
        wd.findElement(By.xpath("//*[@id=\"advocate_15\"]/div[2]/div/ul/li[10]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Enter adjustment amount

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"point_adjustment_points\"]")));
        wd.findElement(By.xpath("//*[@id=\"point_adjustment_points\"]")).sendKeys("1111");

        //Click 'leave message' checkbox

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"point_adjustment_should_send_message\"]")));
        wd.findElement(By.xpath("//*[@id=\"point_adjustment_should_send_message\"]")).click();

        //Enter subject

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"point_adjustment_subject\"]")));
        wd.findElement(By.xpath("//*[@id=\"point_adjustment_subject\"]")).sendKeys("Adjust Points!!!");

        //Enter message body

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"point_adjustment_message\"]")));
        wd.findElement(By.xpath("//*[@id=\"point_adjustment_message\"]")).sendKeys("Point adjustment message!!!");

        //Click adjust points button

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_point_adjustment\"]/div[2]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_point_adjustment\"]/div[2]/input")).click();
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
