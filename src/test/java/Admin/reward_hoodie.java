package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class reward_hoodie extends BaseClass{

    @Test
    public void reward_hoodie() {
        wd.get("http://sanitytwoapril28.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
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

        wd.findElement(By.linkText("Add a reward")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).clear();
        wd.findElement(By.id("reward_name")).sendKeys("Hoodie");
        wd.findElement(By.id("reward_description")).click();
        wd.findElement(By.id("reward_description")).clear();
        wd.findElement(By.id("reward_description")).sendKeys("This is a great hoodie!");
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.select2-result-label")).click();
        //wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("reward_in_catalog")).click();
        wd.findElement(By.id("reward_points")).click();
        wd.findElement(By.id("reward_points")).clear();
        wd.findElement(By.id("reward_points")).sendKeys("10");
        wd.findElement(By.linkText("+ Add A Question")).click();
        wd.findElement(By.name("subject")).click();
        wd.findElement(By.name("subject")).clear();
        wd.findElement(By.name("subject")).sendKeys("What size do you wear??");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("visibility_setting_membership_group")).click();
        wd.findElement(By.xpath("//*[@id=\"s2id_visibility_setting_group_ids\"]/ul/li")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Test Group");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}