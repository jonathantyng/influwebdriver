package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multi_stage extends BaseClass{
    
    @Test
    public void multi_stage() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the challenge tab

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
        wd.findElement(By.name("name")).sendKeys("Multi-Stage Challenge");

        //Select challenge type from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Social Media");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge headline and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("THIS WEEK ONLY! A super bonus that is yours for the taking!");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("![limo](https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSxAKcZWzfSVrn4CHqko80w9fOGmmjtmOVYOJO3e3mYQDGMRhWV)\n" +
                "\n" +
                "We have some hot new rewards for July and we want you to get a head start in redeeming them! Just think, a limo ride from the airport could be yours with these bonus points.\n" +
                "\n" +
                "Click next for more information.");

        //Feature challenge and enable multiple completions

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("featured1")));
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select the survey stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Questions']")));
        wd.findElement(By.xpath("//img[@alt='Questions']")).click();

        //Enable public responses

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("public")));
        wd.findElement(By.name("public")).click();

        //Enter survey question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("subject")));
        wd.findElement(By.name("subject")).sendKeys("Answer this question!");

        //Preview challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Preview")));
        wd.findElement(By.linkText("Preview")).click();

        //Close preview modal

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.close")));
        wd.findElement(By.cssSelector("button.close")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select advocate acceptance stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Advocate acceptance']")));
        wd.findElement(By.xpath("//img[@alt='Advocate acceptance']")).click();
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
