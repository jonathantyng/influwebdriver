package interaction;

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

public class alice_sign extends BaseClassTwo {

    @Test
    public void alice_s() {

    //Sign into app and access challenge screen

        wd.get("http://may31.influitiveqa.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("alice.advocate@gmail.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    //Complete tutorial

        boolean exists = wd.findElements( By.linkText("Get Started!")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("Get Started!")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.id("activity_responses_attributes_0_body_offer_my_expertise_to_help_others_when_i_can")).click();
            wd.findElement(By.name("commit")).click();
            wd.findElement(By.linkText("Offer tickets to a popular event.")).click();
            wd.findElement(By.name("commit")).click();
            wd.findElement(By.id("activity_responses_attributes_0_body_an_expert_customer_who_is_willing_to_help_new_customers")).click();
            wd.findElement(By.name("commit")).click();
            wd.findElement(By.linkText("Facebook")).click();
            wd.findElement(By.name("commit")).click();
            wd.findElement(By.linkText("Let's start your next challenge")).click();

        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        }
    }
}
