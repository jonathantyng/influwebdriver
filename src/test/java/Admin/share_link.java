package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class share_link extends BaseClass{
    
    @Test
    public void share_link() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("Share this link");

        //Select social media from challenge type dropdown list

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Social Media");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge headline and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("Share this link");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("Share this link is amazing. Complete this challenge.");

        //Feature challenge and allow multiple completions

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("featured1")));
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-stage")));
        wd.findElement(By.id("add-stage")).click();

        //Select Share Link challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Share link']")));
        wd.findElement(By.xpath("//img[@alt='Share link']")).click();

        //Enter share URL

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.url")));
        wd.findElement(By.name("params.url")).sendKeys("http://www.nfl.com/draft/2012");

        //Enter default twitter text

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.default_content")));
        wd.findElement(By.name("params.default_content")).sendKeys("This is default twitter text!");
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
