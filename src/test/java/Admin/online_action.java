package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class online_action extends BaseClass{
    
    @Test
    public void online_action() {

        //Log in as super admin

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

        //Add new challenge

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a challenge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wd.findElement(By.name("name")).sendKeys("Online Action and Share");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select social media from challenge type dropdown

        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Social Media");
        wd.findElement(By.className("select2-match")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter challenge headline and description

        wd.findElement(By.name("headline")).sendKeys("Online Action and Share");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).sendKeys("Online Action and Share is amazing. Complete this challenge.");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("label.input.checkbox")).click();

        //Add a new stage

        wd.findElement(By.id("add-stage")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select online action stage type

        wd.findElement(By.xpath("//img[@alt='Online action']")).click();
        //wd.findElement(By.xpath("//*[@id=\"stages\"]/div[5]/ol/li[2]")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter URL

        wd.findElement(By.name("params.url")).sendKeys("http://mashable.com/2013/04/09/no-nose-gifs/");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Load embedly preview

        wd.findElement(By.linkText("Load")).click();
        wd.findElement(By.id("ui-id-2")).click();

        //Save challenge

        wd.findElement(By.xpath("(//input[@name='commit'])[2]")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Publish challenge

        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
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
