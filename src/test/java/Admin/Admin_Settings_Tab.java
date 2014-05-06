package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("AdvocateAnywhere lets you embed 'widgets' into any HTML page"));

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
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

        wd.findElement(By.id("white_label_embed_thanks")).clear();
        wd.findElement(By.id("white_label_embed_thanks")).sendKeys("Thanks! We really appreciate your participation!");

        //Save changes

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_point_structure(){

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

        //Navigate to 'Default Point Structure'

        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"collapse-me1\"]/li[1]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Move sliders **FIGURE OUT LATER**

        //Save changes

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void levels_and_badges(){

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

        //Navigate to 'Levels and Badges'

        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"collapse-me1\"]/li[2]/a")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Drag and drop badge

        WebElement source = wd.findElement(By.xpath("//*[@id=\"badge_21\"]/img"));
        WebElement target = wd.findElement(By.id("level_3"));

        Actions builder = new Actions(wd);
        builder.dragAndDrop(source, target) .perform();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Check for errors

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        //Create an activity badge

        wd.findElement(By.id("add_badge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter badge name and description

        wd.findElement(By.id("badge_name")).sendKeys("The Badge");
        wd.findElement(By.id("badge_description")).sendKeys("This is awarded to advocates who have accumulate 1000 points!");

        //Select icon

        wd.findElement(By.id("icon_20")).click();

        //Create point value rule

        wd.findElement(By.id("link-rules")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("badge_settings_rule_type_points_reached")).click();
        wd.findElement(By.id("badge_settings_points_value")).sendKeys("1000");
        wd.findElement(By.id("create_badge_button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Check for errors

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void private_leaderboards(){

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

        //Navigate to 'Levels and Badges'

        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"collapse-me1\"]/li[3]/a")).click();

        //Clear groups with private leaderboard field

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"s2id_private_leaderboard_group_ids\"]/ul/li[1]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"s2id_private_leaderboard_group_ids\"]/ul/li[1]/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save private leaderboards

        wd.findElement(By.name("commit")).click();

        //Check for errors

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Add test group to private leaderboard field

        wd.findElement(By.id("s2id_autogen9")).click();
        wd.findElement(By.xpath("//*[@id=\"s2id_autogen9\"]")).sendKeys("Test Group");
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")).click();

        //Add test group to private leaderboard field

        wd.findElement(By.id("s2id_autogen9")).click();
        wd.findElement(By.xpath("//*[@id=\"s2id_autogen9\"]")).sendKeys("Sanity Group");
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")).click();

        //Save private leaderboards

        wd.findElement(By.name("commit")).click();

        //Check for errors

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_reward_types(){

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

        //Navigate to 'Levels and Badges'

        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"collapse-me1\"]/li[4]/a")).click();

        //Add a reward type and save

        wd.findElement(By.linkText("Add Reward Type")).click();
        wd.findElement(By.xpath("//*[@id=\"reward_type_name\"]")).sendKeys("New Reward");
        wd.findElement(By.xpath("//*[@id=\"reward_type_description\"]")).sendKeys("This is a description");
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Check for errors

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_challenge_type(){

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

        //Navigate to 'Levels and Badges'

        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"collapse-me1\"]/li[5]/a")).click();

        //Click 'Add Challenge Type'

        wd.findElement(By.linkText("Add Challenge Type")).click();

        //Enter Name

        wd.findElement(By.xpath("//*[@id=\"challenge_type_name\"]")).sendKeys("New Challenge Type");

        //Save

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Check for errors

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void settings_event_type(){

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

        //Navigate to 'Levels and Badges'

        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"collapse-me1\"]/li[6]/a")).click();

        //Click 'Add an Event Type'

        wd.findElement(By.linkText("Add an Event Type")).click();

        //Enter Name

        wd.findElement(By.id("event_type_name")).sendKeys("New Event Type");

        //Save

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Check for errors

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
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
