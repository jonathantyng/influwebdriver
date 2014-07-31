package Admin;

import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reward_cape extends BaseClass{

    @Test
    public void cape() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a reward")));
            System.out.println("Tutorial not encountered");
        }

        //Add a new reward

        wd.findElement(By.linkText("Add a reward")).click();

        //View reward info tab and enter name and description
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).sendKeys("Cape");
        wd.findElement(By.id("reward_description")).sendKeys("This is a great Cape!");

        //Select reward type
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")));
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.select2-result-label")));
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Select redeeming tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-redeeming")));
        wd.findElement(By.id("link-redeeming")).click();

        //Choose perk settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("awardable")));
        wd.findElement(By.id("awardable")).click();

        //Award if user completes the join linkedin group challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_reward_settings_challenge_id > a.select2-choice > span.select2-chosen")));
        wd.findElement(By.cssSelector("#s2id_reward_settings_challenge_id > a.select2-choice > span.select2-chosen")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#select2-drop > div.select2-search > input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("#select2-drop > div.select2-search > input.select2-input.select2-focused")).sendKeys("Join a LinkedIn Group");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.select2-result-label")));
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Save reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save-button")));
        wd.findElement(By.id("save-button")).click();

        //Publish reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
    }
    /*
    @After
    public void tearDown() {
        wd.quit();
    }
    */
}