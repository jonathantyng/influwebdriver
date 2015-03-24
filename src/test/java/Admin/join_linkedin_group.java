package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class join_linkedin_group extends BaseClass{
    
    @Test
    public void join_linkedin_group() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Click start with blank challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("Join a linkedin group");

        //Select linkedin from challenge type dropdown

        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("LinkedIn");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge headline

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("Join a linkedin group");

        //Enter challenge description

        wd.findElement(By.name("description")).sendKeys("Join a linkedin group is amazing. Complete this challenge.");

        //Feature the challenge

        wd.findElement(By.id("featured1")).click();

        //Select 'add a stage'

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select linkedin join group stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Linkedin group join']")));
        wd.findElement(By.xpath("//img[@alt='Linkedin group join']")).click();

        //Enter LI group URL

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("entered_url")));
        wd.findElement(By.name("entered_url")).sendKeys("http://www.linkedin.com/groups/Javascript-121615?trk=myg_ugrp_ovr");

        //Load embedly preview

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.load-preview.right")));
        wd.findElement(By.cssSelector("button.load-preview.right")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();

        //Publish challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
