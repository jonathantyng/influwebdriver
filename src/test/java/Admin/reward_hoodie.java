package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reward_hoodie extends BaseClass{

    @Test
    public void reward_hoodie() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

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

        //Add a new rewards tab

        wd.findElement(By.linkText("Add a reward")).click();

        //Select reward info tab and enter name and headline

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-headline")));
        wd.findElement(By.id("link-headline")).click();
        wd.findElement(By.id("reward_name")).sendKeys("Hoodie");
        wd.findElement(By.id("reward_description")).sendKeys("This is a great hoodie!");

        //Select reward type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")));
        wd.findElement(By.cssSelector("#s2id_reward_reward_type_id > a.select2-choice")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.select2-result-label")));
        wd.findElement(By.cssSelector("div.select2-result-label")).click();

        //Add to rewards catalog

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-redeeming")));
        wd.findElement(By.id("link-redeeming")).click();
        wd.findElement(By.id("reward_in_catalog")).click();

        //Enter reward cost

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reward_points")));
        wd.findElement(By.id("reward_points")).sendKeys("10");

        //Add a follow up question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("+ Add A Question")));
        wd.findElement(By.linkText("+ Add A Question")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("subject")));
        wd.findElement(By.name("subject")).sendKeys("What size do you wear??");

        //Save reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("save-button")));
        wd.findElement(By.id("save-button")).click();

        //Publish reward

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();

        //Set vistibilty to only those in Test Group

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibility_setting_membership_group")));
        wd.findElement(By.id("visibility_setting_membership_group")).click();
        wd.findElement(By.xpath("//*[@id=\"s2id_visibility_setting_group_ids\"]/ul/li")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Test Group");
        wd.findElement(By.className("select2-match")).click();

        //Publish

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}