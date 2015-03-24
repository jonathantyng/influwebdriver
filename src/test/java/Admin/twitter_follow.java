package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twitter_follow extends BaseClass{


    @Test
    public void create_twitter_follow() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("Follow on Twitter");

        //Select Twitter from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Twitter");
        wd.findElement(By.className("select2-match")).click();

        //Enter headline and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("Follow on Twitter");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("Follow on Twitter is amazing. Complete this challenge.");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label.input.checkbox")));
        wd.findElement(By.cssSelector("label.input.checkbox")).click();

        //Add a stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select twitter follow stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Twitter follow']")));
        wd.findElement(By.xpath("//img[@alt='Twitter follow']")).click();

        //Enter twitter handle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("screen_name")));
        wd.findElement(By.name("screen_name")).sendKeys("pepsi");

        //Click to load twitter preview

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.load-preview")));
        wd.findElement(By.cssSelector("button.load-preview")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("screen_name")));
        wd.findElement(By.name("screen_name")).click();

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
    
    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
