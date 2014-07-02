package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;

public class corporate_confirm extends BaseClass{

    @Test
    public void corporateconfirm() {
        //wd.get("http://may14.influitiveqa.com/users/sign_in");

        //Log in as admin

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Add a new challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wd.findElement(By.id("create-new-challenge")).click();

        //Enter the challenge name and description

        wd.findElement(By.name("name")).sendKeys("Two Corporate Confirmations");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("headline")).sendKeys("Two Corporate Confirmations");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).sendKeys("Two Corporate Confirmations. Testing approving advocates in different stages of a challenge.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select challenge type from dropdown

        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Survey");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.className("select2-match")).click();

        //Feature challenge toggle

        wd.findElement(By.id("featured1")).click();

        //Add a new stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select the survey challenge type

        wd.findElement(By.xpath("//img[@alt='Questions']")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter survey question

        wd.findElement(By.name("subject")).sendKeys("The first question.");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enable public responses

        wd.findElement(By.name("public")).click();

        //Add a stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select corporate confirmation stage

        wd.findElement(By.xpath("//img[@alt='Corporate_confirmation']")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add a stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add another survey stage

        wd.findElement(By.xpath("//img[@alt='Questions']")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter second survey question

        wd.findElement(By.cssSelector("#c44 > label > input[name=\"subject\"]")).sendKeys("The second question");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add a stage

        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add a corporate confirmation stage

        wd.findElement(By.xpath("//img[@alt='Corporate_confirmation']")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("ui-id-2")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

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

    public static boolean isAlertPresent(SafariDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
