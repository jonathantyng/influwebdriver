package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class reward_print extends BaseClass{

    @Test
    public void reward_p() {
        wd.get("http://sanitymar17.influitives.com/users/sign_in");
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
        wd.findElement(By.id("reward_name")).click();
        wd.findElement(By.id("reward_name")).clear();
        wd.findElement(By.id("reward_name")).sendKeys("Printfection Perk");
        wd.findElement(By.id("reward_description")).click();
        wd.findElement(By.id("reward_description")).clear();
        wd.findElement(By.id("reward_description")).sendKeys("This is a perk from printfection");
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Swag");
        wd.findElement(By.cssSelector("div.select2-result-label")).click();
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("awardable")).click();
        wd.findElement(By.id("reward_settings_rule_type_none")).click();
        wd.findElement(By.id("link-fulfillment")).click();
        wd.findElement(By.id("reward_kind_redemptionlink")).click();
        wd.findElement(By.id("reward_redemption_links")).click();
        wd.findElement(By.id("reward_redemption_links")).clear();
        wd.findElement(By.id("reward_redemption_links")).sendKeys("http://www.pepsi.com");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

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
