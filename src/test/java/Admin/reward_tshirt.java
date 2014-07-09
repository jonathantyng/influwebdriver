package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class reward_tshirt extends BaseClass{

    @Test
    public void reward_tshirt() {

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

        //Add a reward

        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter reward name and description

        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).sendKeys("T-Shirt");
        wd.findElement(By.id("reward_description")).sendKeys("What a great T-Shirt!");

        //Select reward type

        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Add to reward catalog

        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("reward_in_catalog")).click();

        //Assign points

        wd.findElement(By.id("reward_points")).sendKeys("5");

        //Add a follow up question

        wd.findElement(By.linkText("+ Add A Question")).click();
        wd.findElement(By.name("subject")).sendKeys("What size do you wear??");

        //Save reward

        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Publish reward
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add visibility settings --- members of the Sanity Group

        wd.findElement(By.id("visibility_setting_membership_group")).click();
        wd.findElement(By.cssSelector("#s2id_visibility_setting_group_ids > ul.select2-choices > li.select2-search-field")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Sanity Group");
        wd.findElement(By.className("select2-match")).click();

        //Save

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}