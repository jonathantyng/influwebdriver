package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class appexchangechallenge extends BaseClass{

    @Test
    public void appexchangechallenge() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Create from scratch

        wd.findElement(By.id("create-new-challenge")).click();

        //Select challenge type dropdown and select 'Testimonial'

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Testimonial");
        wd.findElement(By.className("select2-match")).click();

        //Select allow multiple responses

        wd.findElement(By.id("allow_multiple_response2")).click();

        //Enter challenge name and description

        wd.findElement(By.name("name")).sendKeys("AppExchange Review");
        wd.findElement(By.name("headline")).sendKeys("AppExchange Review");
        wd.findElement(By.name("description")).sendKeys("AppExchange Review");

        //Select new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img.icon")));
        wd.findElement(By.cssSelector("img.icon")).click();

        //Choose appexchange challenge type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='App exchange']")));
        //wd.findElement(By.xpath("//*[@id=\"stages\"]/div[4]/ol/li[3]")).click();
        wd.findElement(By.xpath("//img[@alt='App exchange']")).click();

        //Enter appexchange url

        wd.findElement(By.name("params.url")).click();
        wd.findElement(By.name("params.url")).sendKeys("https://appexchange.salesforce.com/listingDetail?listingId=a0N300000016YDkEAM");
        //wd.findElement(By.linkText("Load")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Navigate back to the main tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        wd.findElement(By.id("ui-id-2")).click();

        /*

        wd.findElement(By.id("visibility_setting_membership_group")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("li.select2-search-field")).sendKeys("Test Group");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.id("select2-drop-mask")).sendKeys("Test Group");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.className("select2-match")).click();

        */
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-1")));
        wd.findElement(By.id("ui-id-1")).click();

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();

        //Publish Challenge

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
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
