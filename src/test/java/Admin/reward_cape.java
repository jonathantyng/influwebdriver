package Admin;

import org.junit.Test;

import org.openqa.selenium.*;

public class reward_cape extends BaseClass{

    @Test
    public void cape() {

        //Log in as super admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to the rewards tab

        wd.findElement(By.id("Rewards")).click();

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

        //Add a new reward

        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //View reward info tab and enter name and description
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).sendKeys("Cape");
        wd.findElement(By.id("reward_description")).sendKeys("This is a great Cape!");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select reward type
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Swag");
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Select redeeming tab

        wd.findElement(By.id("link-redeeming")).click();

        //Choose perk settings

        wd.findElement(By.id("awardable")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Award if user completes the join linkedin group challenge

        wd.findElement(By.cssSelector("#s2id_reward_settings_challenge_id > a.select2-choice > span.select2-chosen")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#select2-drop > div.select2-search > input.select2-input.select2-focused")).sendKeys("Join a LinkedIn Group");
        wd.findElement(By.cssSelector("div.select2-result-label")).click();
        /*
        wd.findElement(By.id("reward_settings_challenge_times")).click();
        wd.findElement(By.id("reward_settings_challenge_times")).clear();
        wd.findElement(By.id("reward_settings_challenge_times")).sendKeys("3");

        */

        //Save reward

        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Publish reward

        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
    }
    /*
    @After
    public void tearDown() {
        wd.quit();
    }
    */
}