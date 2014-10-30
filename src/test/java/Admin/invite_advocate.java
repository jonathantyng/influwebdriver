package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class invite_advocate extends BaseClass{
    
    @Test
    public void invite_joe_prospect() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Click on the Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements(By.linkText("No Thanks")).size() != 0;

        if (exists) {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        } else {

            System.out.println("Tutorial not encountered");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Invite Nominees")));
        }

        //Invite Joe Prospect

        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a new Nominee")));
        wd.findElement(By.linkText("Add a new Nominee")).click();

        //Enter contact name and email

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("contact_email")));
        wd.findElement(By.id("contact_email")).sendKeys("joe.prospect51@gmail.com");
        wd.findElement(By.id("contact_name")).sendKeys("Joe Prospect");

        //Save select and send invite

        wd.findElement(By.id("save-button")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.name")));
        wd.findElement(By.cssSelector("div.name")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/input[1]")));
        wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/input[1]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-invite")));
        wd.findElement(By.id("send-invite")).click();

        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test public void invite_fred_prospect() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Click on the Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements(By.linkText("No Thanks")).size() != 0;

        if (exists) {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        } else {

            System.out.println("Tutorial not encountered");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Invite Nominees")));
        }

        //Invite Joe Prospect

        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a new Nominee")));
        wd.findElement(By.linkText("Add a new Nominee")).click();

        //Enter contact email and name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("contact_email")));
        wd.findElement(By.id("contact_email")).sendKeys("fredprospect1@yahoo.ca");
        wd.findElement(By.id("contact_name")).sendKeys("Fred Prospect");
        wd.findElement(By.id("save-button")).click();

        //Select nominee and send invite

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.name")));
        wd.findElement(By.cssSelector("div.name")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/input[1]")));
        wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/input[1]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-invite")));
        wd.findElement(By.id("send-invite")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test public void invite_mike_random(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Click on the Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements(By.linkText("No Thanks")).size() != 0;

        if (exists) {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        } else {

            System.out.println("Tutorial not encountered");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Invite Nominees")));
        }

        //Invite Joe Prospect

        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a new Nominee")));
        wd.findElement(By.linkText("Add a new Nominee")).click();

        //Enter contact email and name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("contact_email")));
        wd.findElement(By.id("contact_email")).sendKeys("mikerandom231@yahoo.com");
        wd.findElement(By.id("contact_name")).sendKeys("Mike Random");

        //Save select and send invite

        wd.findElement(By.id("save-button")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.name")));
        wd.findElement(By.cssSelector("div.name")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/input[1]")));
        wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/input[1]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("send-invite")));
        wd.findElement(By.id("send-invite")).click();
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
