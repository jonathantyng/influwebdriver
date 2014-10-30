package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class approval_challenge extends BaseClass{

    @Test
    public void approval_challenge_creation() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

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

        //Add Challenge

        wd.findElement(By.linkText("Add a challenge")).click();

        //Start with blank challenge

        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Choose challenge type from dropdown

        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Survey");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge name and description

        wd.findElement(By.name("name")).sendKeys("Approval Challenge");
        wd.findElement(By.name("headline")).sendKeys("Approval Challenge");
        wd.findElement(By.name("description")).sendKeys("Approval challenge to Admin approving advocates during the first stage of a multi stage  challenge");

        //Click featured toggle

        wd.findElement(By.id("featured1")).click();

        //Add a new stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select the survey challenge stage

        wd.findElement(By.xpath("//img[@alt='Questions']")).click();

        //Enter question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("subject")));
        wd.findElement(By.name("subject")).sendKeys("The first question issss??");

        //Add another question stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        wd.findElement(By.xpath("//img[@alt='Questions']")).click();

        //Enter second question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"c75\"]/label[1]/input")));
        wd.findElement(By.xpath("//*[@id=\"c75\"]/label[1]/input")).sendKeys("The second question issss?");

        //Add corporate confirmation stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        wd.findElement(By.xpath("//img[@alt='Corporate confirmation']")).click();
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
