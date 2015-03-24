package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class corporate_confirm extends BaseClass{


    @Test
    public void corporateconfirm() {
        WebDriverWait wait = new WebDriverWait(wd, 5);

        wd.findElement(By.id("create-new-challenge")).click();

        //Enter the challenge name and description

        wd.findElement(By.name("name")).sendKeys("Two Corporate Confirmations");
        wd.findElement(By.name("headline")).sendKeys("Two Corporate Confirmations");
        wd.findElement(By.name("description")).sendKeys("Two Corporate Confirmations. Testing approving advocates in different stages of a challenge.");

        //Select challenge type from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Survey");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-match")));
        wd.findElement(By.className("select2-match")).click();

        //Feature challenge toggle

        wd.findElement(By.id("featured1")).click();

        //Add a new stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select the survey challenge type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Questions']")));
        wd.findElement(By.xpath("//img[@alt='Questions']")).click();

        //Enter survey question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("subject")));
        wd.findElement(By.name("subject")).sendKeys("The first question.");

        //Enable public responses

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("public")));
        wd.findElement(By.name("public")).click();

        //Add a stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select corporate confirmation stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Corporate_confirmation']")));
        wd.findElement(By.xpath("//img[@alt='Corporate_confirmation']")).click();

        //Add a stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Add another survey stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Questions']")));
        wd.findElement(By.xpath("//img[@alt='Questions']")).click();

        //Enter second survey question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#c44 > label > input[name=\"subject\"]")));
        wd.findElement(By.cssSelector("#c44 > label > input[name=\"subject\"]")).sendKeys("The second question");

        //Add a stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Add a corporate confirmation stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Corporate_confirmation']")));
        wd.findElement(By.xpath("//img[@alt='Corporate_confirmation']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        wd.findElement(By.id("ui-id-2")).click();

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();

        //Publish challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));


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
