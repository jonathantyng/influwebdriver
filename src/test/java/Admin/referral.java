package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class referral extends BaseClass{
    
    @Test
    public void referral() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the challenges tab

        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a challenge")));
            System.out.println("Tutorial not encountered");
        }

        //Add new challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("Referral Challenge");

        //Select Referral from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Referral");
        wd.findElement(By.className("select2-match")).click();

        //Enter headline and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("Referral Challenge is amazing. Complete this challenge.");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("This is a referral challenge!");

        //Feature challenge and allow multiple completions

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("featured1")));
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-stage")));
        wd.findElement(By.id("add-stage")).click();

        //Select referral stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Refer prospect']")));
        wd.findElement(By.xpath("//img[@alt='Refer prospect']")).click();

        //Require all fields before saving

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("params.fields23")));
        wd.findElement(By.id("params.fields23")).click();
        wd.findElement(By.id("params.required22")).click();

        //Enable linkedin suggestions

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.vertical-space-medium > label.input.checkbox")));
        wd.findElement(By.cssSelector("div.vertical-space-medium > label.input.checkbox")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        wd.findElement(By.id("ui-id-2")).click();

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();

        //Publish challenge

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
