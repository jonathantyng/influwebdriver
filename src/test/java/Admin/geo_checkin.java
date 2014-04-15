package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class geo_checkin extends BaseClass{
    
    @Test
    public void geo_checkin() {
        wd.get("http://april14.influitives.com/users/sign_in");
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
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Add geo check-in challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wd.findElement(By.id("create-new-challenge")).click();
        wd.findElement(By.name("name")).click();
        wd.findElement(By.name("name")).clear();
        wd.findElement(By.name("name")).sendKeys("Geo Check-in");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Testimonial");
        wd.findElement(By.className("select2-match")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("headline")).click();
        wd.findElement(By.name("headline")).clear();
        wd.findElement(By.name("headline")).sendKeys("Geo Check-in");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).click();
        wd.findElement(By.name("description")).clear();
        wd.findElement(By.name("description")).sendKeys("Geo Check-in challenge.");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.cssSelector("fieldset.callout > label.input.")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//img[@alt='Check_in']")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.address")).click();
        wd.findElement(By.cssSelector("input.address")).clear();
        wd.findElement(By.cssSelector("input.address")).sendKeys("355 Adelaide Street West Toronto");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.lookup")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("params.location")).click();
        wd.findElement(By.name("params.location")).clear();
        wd.findElement(By.name("params.location")).sendKeys("The office");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("ui-id-2")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
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
