package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by patrickpriestley on 2014-05-08.
 */

public class Admin_Email_Settings_Tab extends AdminBase{

    String settings_tab = "//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a";

    @Test
    public void general_email_settings(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the settings page

        wd.findElement(By.xpath(settings_tab)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Navigate to 'General' settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")));
        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click 'Update Default Sender'

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_settings_builder\"]/div[3]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_settings_builder\"]/div[3]/input")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void welcome_email_settings(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the settings page

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(settings_tab)));
        wd.findElement(By.xpath(settings_tab)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Navigate to 'welcome email' settings

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")));
        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Welcome Email")));
        wd.findElement(By.linkText("Welcome Email")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Toggle enable welcome emails off

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings_builder_preferences_deliver_welcome_email")));
        wd.findElement(By.id("settings_builder_preferences_deliver_welcome_email")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Toggle enable welcome emails on

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings_builder_preferences_deliver_welcome_email")));
        wd.findElement(By.id("settings_builder_preferences_deliver_welcome_email")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Clear welcome email text

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings_builder_email_template_body")));
        wd.findElement(By.id("settings_builder_email_template_body")).clear();

        //Enter welcome email text

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings_builder_email_template_body")));
        wd.findElement(By.id("settings_builder_email_template_body")).sendKeys("Welcome!!!");

        //Preview welcome email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        wd.close();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to original tab

        wd.switchTo().window(winHandleBefore);

        //Save changes

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void invitation_email_settings(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the settings page

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(settings_tab)));
        wd.findElement(By.xpath(settings_tab)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Navigate to 'invitation' settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")));
        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Invitations")));
        wd.findElement(By.linkText("Invitations")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Toggle 'Send follow-up emails' on

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings_builder_preferences_send_followup_email")));
        wd.findElement(By.id("settings_builder_preferences_send_followup_email")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Toggle 'Send follow-up emails' off

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("settings_builder_preferences_send_followup_email")));
        wd.findElement(By.id("settings_builder_preferences_send_followup_email")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Preview invitation email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_settings_builder\"]/input[2]")));
        wd.findElement(By.xpath("//*[@id=\"new_settings_builder\"]/input[2]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        wd.close();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to original tab

        wd.switchTo().window(winHandleBefore);

        //Save changes

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void digest_email_settings(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the settings page

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(settings_tab)));
        wd.findElement(By.xpath(settings_tab)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Navigate to 'digest' settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")));
        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Challenge Digest")));
        wd.findElement(By.linkText("Challenge Digest")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Toggle 'Send follow-up emails' off

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_preference_email_digest_send")));
        wd.findElement(By.id("company_preference_email_digest_send")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Toggle 'Send follow-up emails' on

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_preference_email_digest_send")));
        wd.findElement(By.id("company_preference_email_digest_send")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Preview digest email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"edit_company_preference_1\"]/input[2]")));
        wd.findElement(By.xpath("//*[@id=\"edit_company_preference_1\"]/input[2]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        wd.close();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to original tab

        wd.switchTo().window(winHandleBefore);

        //Save changes

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_email_settings(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the settings page

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(settings_tab)));
        wd.findElement(By.xpath(settings_tab)).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Navigate to 'challenge email' settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")));
        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Challenge Email")));
        wd.findElement(By.linkText("Challenge Email")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Preview challenge email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"edit_email_template_4\"]/fieldset/input")));
        wd.findElement(By.xpath("//*[@id=\"edit_email_template_4\"]/fieldset/input")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        wd.close();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to original tab

        wd.switchTo().window(winHandleBefore);

        //Save changes

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void notifications_email_settings(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the settings page

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(settings_tab)));
        wd.findElement(By.xpath(settings_tab)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Navigate to 'notification email' settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")));
        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[3]/h4")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Notifications")));
        wd.findElement(By.linkText("Notifications")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Preview challenge email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"configuration-panel\"]/div/fieldset/form/input")));
        wd.findElement(By.xpath("//*[@id=\"configuration-panel\"]/div/fieldset/form/input")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        wd.close();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to original tab

        wd.switchTo().window(winHandleBefore);

        //Save changes

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
