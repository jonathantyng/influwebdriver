package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class join_group extends BaseClass{
    
    @Test
    public void join_group() {
        wd.get("http://sanitydec20.influitives.com/users/sign_in");

        //If user doesn't have a cookie, sign in. Otherwise, continue with testing.

        boolean signin = wd.findElements( By.id("user_email")).size() != 0;

        if (signin)
        {
            wd.findElement(By.id("user_email")).click();
            wd.findElement(By.id("user_email")).clear();
            wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
            wd.findElement(By.id("user_password")).click();
            wd.findElement(By.id("user_password")).clear();
            wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
            wd.findElement(By.id("sign-in-button")).click();
            System.out.println("Sign in complete");
            wd.findElement(By.id("Challenges")).click();

        }
        else
        {
            System.out.println("Found cookie");
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.id("Challenges")).click();
        }

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean  exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

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

        //Add join group challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Start With Blank Challenge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("name")).sendKeys("Join Group");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        /*
        wd.findElement(By.linkText("Add...")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("challenge_type_name")).click();
        wd.findElement(By.id("challenge_type_name")).click();
        wd.findElement(By.id("challenge_type_name")).clear();
        wd.findElement(By.id("challenge_type_name")).sendKeys("Join Group");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#new_challenge_type > input[name=\"commit\"]")).click();
        wd.findElement(By.cssSelector("button.close")).click();
        */

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Join Group");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.name("headline")).click();
        wd.findElement(By.name("headline")).clear();
        wd.findElement(By.name("headline")).sendKeys("Join Group");
        wd.findElement(By.name("description")).click();
        wd.findElement(By.name("description")).clear();
        wd.findElement(By.name("description")).sendKeys("Join this awesome group! You will be rewarded with cool offers and prizes!");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("label.input.checkbox")).click();
        wd.findElement(By.xpath("//div[@id='challenge']/section/fieldset[2]/label[2]")).click();
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        wd.findElement(By.xpath("//img[@alt='Influitive_group_join']")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//div[@id='s2id_params.group_id17']/a/span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.className("select2-match")).click();
        //try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("ui-id-2")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
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
