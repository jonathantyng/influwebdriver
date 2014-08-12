package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class online_action extends BaseClass{
    
    @Test
    public void online_action() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Log in as super admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

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
        wd.findElement(By.name("name")).sendKeys("Online Action and Share");

        //Select social media from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Social Media");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-match")));
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge headline and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("Online Action and Share");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("Online Action and Share is amazing. Complete this challenge.");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label.input.checkbox")));
        wd.findElement(By.cssSelector("label.input.checkbox")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-stage")));
        wd.findElement(By.id("add-stage")).click();

        //Select online action stage type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Online action']")));
        wd.findElement(By.xpath("//img[@alt='Online action']")).click();

        //Enter URL

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.url")));
        wd.findElement(By.name("params.url")).sendKeys("http://mashable.com/2013/04/09/no-nose-gifs/");

        //Load embedly preview

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Load")));
        wd.findElement(By.linkText("Load")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        wd.findElement(By.id("ui-id-2")).click();

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@name='commit'])[2]")));
        wd.findElement(By.xpath("(//input[@name='commit'])[2]")).click();

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
