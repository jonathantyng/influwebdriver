package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nps extends BaseClass{


    @Test
    public void nps() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("NPS Survey Challenge");

        //Select survey from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Survey");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge headline and desciption

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("NPS Survey Challenge");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("NPS Survey Challenge");

        //Feature the challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("featured1")));
        wd.findElement(By.id("featured1")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select the NPS stage type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Nps']")));
        wd.findElement(By.xpath("//img[@alt='Nps']")).click();

        //Enter custom button text

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("instructions")));
        wd.findElement(By.name("instructions")).sendKeys("Do it!");
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
