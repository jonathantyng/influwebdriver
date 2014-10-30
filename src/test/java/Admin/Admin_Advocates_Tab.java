package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by patrickpriestley on 2014-05-02.
 */
public class Admin_Advocates_Tab extends AdminBase {

    @Test
    public void toggle_level_fiter(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Select Fan from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle Fan from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Select Advocate from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle Advocate from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Select Evangelist from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-Toggle Evangelist from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Select Rockstar from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle Rockstar from level filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void toggle_status_filter(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Select Engaged toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle Engaged from status filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Select not engaged toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle not engaged status filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void toggle_nps_filter(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Select detractor toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle detractor filter

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Select Neutral toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle neutral toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Select Promoter toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle promoter toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Select unknown toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(5) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));

        //Un-toggle unknown toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(5) > label")));
        wd.findElement(By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(5) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @Test
    public void search_for_advocates(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Enter text into advocate search field

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("q_search_for_term")));
        wd.findElement(By.id("q_search_for_term")).sendKeys("11111");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("No records found"));

    }

    @Test
    public void import_advocates(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Advocates tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Advocates")));
        wd.findElement(By.id("Advocates")).click();

        //Click on advocates tab dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wrapper\"]/div/div[1]/span/div/a")));
        wd.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[1]/span/div/a")).click();

        //Select import advocates from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wrapper\"]/div/div[1]/span/div/ul/li[1]/a")));
        wd.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[1]/span/div/ul/li[1]/a")).click();

        //Select CSV file --- uses the absolute path of the file on comp

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"advocate_csv_importer_csv\"]")));
        wd.findElement(By.xpath("//*[@id=\"advocate_csv_importer_csv\"]")).sendKeys("/Users/patrickprestley/Workspace/import.csv");

        //Import -- click on import button

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_advocate_csv_importer\"]/div[3]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_advocate_csv_importer\"]/div[3]/input")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
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

