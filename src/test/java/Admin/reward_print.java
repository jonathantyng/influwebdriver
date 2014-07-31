package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reward_print extends BaseClass{

    @Test
    public void reward_p() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Sign in as super admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to rewards tab

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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a reward")));
            System.out.println("Tutorial not encountered");
        }


        //Add a reward
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a reward")).click();

        //Click on rewards info tab and enter name and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-headline")));
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).sendKeys("Printfection Perk");
        wd.findElement(By.id("reward_description")).sendKeys("This is a perk from printfection");

        //Choose reward type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")));
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.select2-result-label")));
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Make reward perkable

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-redeeming")));
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("awardable")).click();
        wd.findElement(By.id("reward_settings_rule_type_none")).click();

        //Select printfection from fulfillment tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-fulfillment")));
        wd.findElement(By.id("link-fulfillment")).click();
        wd.findElement(By.id("reward_kind_redemptionlink")).click();

        //Enter redemtion link

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reward_redemption_links")));
        wd.findElement(By.id("reward_redemption_links")).sendKeys("http://www.pepsi.com");

        //Save reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save-button")));
        wd.findElement(By.id("save-button")).click();

        //Publish reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

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
