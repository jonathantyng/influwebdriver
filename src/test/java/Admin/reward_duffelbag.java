package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reward_duffelbag extends BaseClass{

    @Test
    public void reward_duffel() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Log in as super admin

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

        //Add a new reward

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a reward")).click();

        //Navigate to reward info tab and enter name and descriptiom

        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).sendKeys("Duffel Bag");
        wd.findElement(By.id("reward_description")).sendKeys("This is a great Duffel Bag!");

        //Select reward type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")));
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.select2-result-label")));
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Award as perk

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-redeeming")));
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("awardable")).click();

        //Award if advocate completes the follow on twitter challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_reward_settings_challenge_id > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_reward_settings_challenge_id > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/div/input")));
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Follow on Twitter");
        wd.findElement(By.className("select2-match")).click();

        //Save reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save-button")));
        wd.findElement(By.id("save-button")).click();

        //Publish reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}