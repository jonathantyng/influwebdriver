package test;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class corporate_confirm extends BaseClass{

    @Test
    public void corporateconfirm() {
        wd.get("http://oct24.influitiveqa.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Tutorial dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Create confirm challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wd.findElement(By.id("create-new-challenge")).click();
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        wd.findElement(By.name("name")).sendKeys("Two Corporate Confirmations");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Survey");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.className("select2-match")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("headline")).click();
        wd.findElement(By.name("headline")).clear();
        wd.findElement(By.name("headline")).sendKeys("Two Corporate Confirmations");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).click();
        wd.findElement(By.name("description")).clear();
        wd.findElement(By.name("description")).sendKeys("Two Corporate Confirmations. Testing approving advocates in different stages of a challenge.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//img[@alt='Questions']")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("subject")).click();
        wd.findElement(By.name("subject")).clear();
        wd.findElement(By.name("subject")).sendKeys("The first question.");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("public")).click();
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//img[@alt='Corporate_confirmation']")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//img[@alt='Questions']")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#c43 > label > input[name=\"subject\"]")).click();
        wd.findElement(By.cssSelector("#c43 > label > input[name=\"subject\"]")).clear();
        wd.findElement(By.cssSelector("#c43 > label > input[name=\"subject\"]")).sendKeys("The second question");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//img[@alt='Corporate_confirmation']")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("ui-id-2")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wd.findElement(By.name("commit")).click();
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
