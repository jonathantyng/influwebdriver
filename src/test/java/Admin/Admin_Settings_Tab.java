package Admin;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by patrickpriestley on 2014-05-02.
 */
public class Admin_Settings_Tab extends BaseClass{

    @Test
    public void settings_program_name(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com/users/sign_in");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to the settings page

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul[1]/li/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();

        //Select Program Name

        wd.findElement(By.linkText("Program Name")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save program name

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_custom_messaging(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com/users/sign_in");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to the settings page

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul[1]/li/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();

        //Select 'Custom Messaging'

        wd.findElement(By.xpath("//*[@id=\"collapse-me0\"]/li[2]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Preview about page text

        wd.findElement(By.id("preview-link")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Close preview modal

        wd.findElement(By.xpath("//*[@id=\"modal\"]/div[1]/button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save messaging changes

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_custom_domain(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com/users/sign_in");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to the settings page

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul[1]/li/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();

        //Select 'Custom Domain'

        wd.findElement(By.xpath("//*[@id=\"collapse-me0\"]/li[3]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_branding(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com/users/sign_in");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to the settings page

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul[1]/li/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();

        //Select branding

        wd.findElement(By.xpath("//*[@id=\"collapse-me0\"]/li[4]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select colour

        wd.findElement(By.xpath("//*[@id=\"edit_white_label_85\"]/div[2]/div/div/label[5]/span")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Check off 'use different logo for emails and make sure it expands

        wd.findElement(By.xpath("//*[@id=\"edit_white_label_85\"]/div[3]/div[1]/div[2]/div[1]/div/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Save changes

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_advocateanywhere(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com/users/sign_in");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to the settings page

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/ul[1]/li/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Settings")).click();

        //Navigate to AdvocateAnywhere settings

        wd.findElement(By.xpath("//*[@id=\"collapse-me0\"]/li[5]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //View AA guide in new tab

        wd.findElement(By.xpath("//*[@id=\"edit_white_label_85\"]/div[2]/p[2]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("AdvocateHub Support"));

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

        //Preview AA

        wd.findElement(By.id("preview-advocate-anywhere")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select widget dropdown

        wd.findElement(By.xpath("//*[@id=\"s2id_white_label_embed_tab_location\"]/a/span[1]")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Choose selection from dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Change widget image size

        wd.findElement(By.xpath("//*[@id=\"edit_white_label_85\"]/div[6]/a[2]/img")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select new colour scheme

        wd.findElement(By.xpath("//*[@id=\"edit_white_label_85\"]/div[7]/div[1]/span[5]")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Enter white label thank you message

        wd.findElement(By.id("white_label_embed_thanks")).sendKeys("Thanks! We really appreciate your participation!");

        //Save changes

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

}
