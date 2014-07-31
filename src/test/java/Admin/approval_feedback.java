package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class approval_feedback extends BaseClass{

    @Test
    public void approval_with_feedback() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //wd.get("http://may14.influitiveqa.com/users/sign_in");

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
            System.out.println("Tutorial not encountered");
        }

        //Add a new challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wd.findElement(By.id("create-new-challenge")).click();

        //Choose challenge type from dropdown

        wd.findElement(By.linkText("Choose One")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Survey");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-match")));
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge name and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("Approval Challenge with Feedback");
        wd.findElement(By.name("headline")).sendKeys("Approval Challenge with Feedback");
        wd.findElement(By.name("description")).sendKeys("Approval Challenge with Feedback. This is to Admin approving an advocates action with admin feedback.");

        //Click on featured toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("featured1")));
        wd.findElement(By.id("featured1")).click();

        //Add a new stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select advocate acceptance

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Advocate acceptance']")));
        wd.findElement(By.xpath("//img[@alt='Advocate acceptance']")).click();

        //Add a new stage
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select a survey challenge stage

        wd.findElement(By.xpath("//img[@alt='Questions']")).click();

        //Enter survey question

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("subject")));
        wd.findElement(By.name("subject")).sendKeys("Answer this question please");

        //Add corporate confirmation stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#add-stage > img.icon")));
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        wd.findElement(By.xpath("//img[@alt='Corporate confirmation']")).click();
        wd.findElement(By.id("ui-id-2")).click();

        //Save challenge

        wd.findElement(By.name("commit")).click();

        //Publish challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
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
