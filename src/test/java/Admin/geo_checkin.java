package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class geo_checkin extends BaseClass{


    @Test
    public void create_geo_checkin() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

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

        //Add geo check-in challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wd.findElement(By.id("create-new-challenge")).click();

        //Enter challenge name

        wd.findElement(By.name("name")).sendKeys("Geo Check-in");

        //Select testimonial from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Testimonial");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge headline

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("Geo Check-in");

        //Enter challenge description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("Geo Check-in challenge.");

        //Enable multiple completions and feature the challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("allow_multiple_response2")));
        wd.findElement(By.id("allow_multiple_response2")).click();
        wd.findElement(By.id("featured1")).click();

        //Select add a stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select geo check in stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Check in']")));
        wd.findElement(By.xpath("//img[@alt='Check in']")).click();

        //Enter location

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.address")));
        wd.findElement(By.cssSelector("input.address")).sendKeys("355 Adelaide Street West Toronto");

        //Locate address on map

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.lookup")));
        wd.findElement(By.cssSelector("input.lookup")).click();

        //Enter location name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.location")));
        wd.findElement(By.name("params.location")).sendKeys("The office");

        //Navigate back to the main challenge editor page

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

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

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
