package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reward_tshirt extends BaseClass{

    @Test
    public void reward_tshirt() {

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

        //Add a reward

        wd.findElement(By.linkText("Add a reward")).click();

        //Enter reward name and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-headline")));
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).sendKeys("T-Shirt");
        wd.findElement(By.id("reward_description")).sendKeys("What a great T-Shirt!");

        //Select reward type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")));
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.select2-result-label")));
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Add to reward catalog

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-redeeming")));
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("reward_in_catalog")).click();

        //Assign points

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reward_points")));
        wd.findElement(By.id("reward_points")).sendKeys("5");

        //Add a follow up question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("+ Add A Question")));
        wd.findElement(By.linkText("+ Add A Question")).click();
        wd.findElement(By.name("subject")).sendKeys("What size do you wear??");

        //Save reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save-button")));
        wd.findElement(By.id("save-button")).click();

        //Publish reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();

        //Add visibility settings --- members of the Sanity Group

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibility_setting_membership_group")));
        wd.findElement(By.id("visibility_setting_membership_group")).click();
        wd.findElement(By.cssSelector("#s2id_visibility_setting_group_ids > ul.select2-choices > li.select2-search-field")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Sanity Group");
        wd.findElement(By.className("select2-match")).click();

        //Save

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}