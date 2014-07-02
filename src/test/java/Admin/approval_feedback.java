package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class approval_feedback extends BaseClass{

    @Test
    public void approval_with_feedback() {
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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Add a new challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wd.findElement(By.id("create-new-challenge")).click();

        //Choose challenge type from dropdown

        wd.findElement(By.linkText("Choose One")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Survey");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.className("select2-match")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter challenge name and description

        wd.findElement(By.name("name")).sendKeys("Approval Challenge with Feedback");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("headline")).sendKeys("Approval Challenge with Feedback");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).sendKeys("Approval Challenge with Feedback. This is to Admin approving an advocates action with admin feedback.");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on featured toggle

        wd.findElement(By.id("featured1")).click();

        //Add a new stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select advocate acceptance

        wd.findElement(By.xpath("//img[@alt='Advocate_acceptance']")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add a new stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();

        //Select a survey challenge stage

        wd.findElement(By.xpath("//img[@alt='Questions']")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter survey question

        wd.findElement(By.name("subject")).sendKeys("Answer this question please");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add corporate confirmation stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        wd.findElement(By.xpath("//img[@alt='Corporate_confirmation']")).click();
        wd.findElement(By.id("ui-id-2")).click();

        //Save challenge

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Publish challenge

        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
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
