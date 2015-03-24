package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class like_on_fb extends BaseClass{


    @Test
    public void like_on_fb() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("Like Us");

        //Select Facebook from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Facebook");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge headline and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("Like Us");
        wd.findElement(By.name("description")).sendKeys("Like us on facebook!  Complete this challenge.");

        //Feature challenge and allow multiple completions

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("featured1")));
        wd.findElement(By.id("featured1")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("allow_multiple_response2")));
        wd.findElement(By.id("allow_multiple_response2")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select Facebook like stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Facebook like page']")));
        wd.findElement(By.xpath("//img[@alt='Facebook like page']")).click();

        //Enter page url

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.facebook_page_url")));
        wd.findElement(By.name("params.facebook_page_url")).sendKeys("www.facebook.com/pepsi");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter custom notification message

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("notification_message")));
        wd.findElement(By.name("notification_message")).sendKeys("Thanks for the like!");
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
