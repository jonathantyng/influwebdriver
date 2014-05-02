package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class invite_advocate extends BaseClass{
    
    @Test
    public void invite_advocate() {

        wd.get("http://sanitytwoapril28.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();
        wd.findElement(By.id("Advocates")).click();

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

        //Invite nominees

        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a new Nominee")).click();
        wd.findElement(By.id("contact_email")).click();
        wd.findElement(By.id("contact_email")).clear();
        wd.findElement(By.id("contact_email")).sendKeys("joe.prospect5@gmail.com");
        wd.findElement(By.id("contact_name")).click();
        wd.findElement(By.id("contact_name")).clear();
        wd.findElement(By.id("contact_name")).sendKeys("Joe Prospect");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("send-invite")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a new Nominee")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("contact_email")).click();
        wd.findElement(By.id("contact_email")).clear();
        wd.findElement(By.id("contact_email")).sendKeys("fredprospect@yahoo.ca");
        wd.findElement(By.id("contact_name")).click();
        wd.findElement(By.id("contact_name")).clear();
        wd.findElement(By.id("contact_name")).sendKeys("Fred Prospect");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("send-invite")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a new Nominee")).click();
        wd.findElement(By.id("contact_email")).click();
        wd.findElement(By.id("contact_email")).clear();
        wd.findElement(By.id("contact_email")).sendKeys("mikerandom23@yahoo.com");
        wd.findElement(By.id("contact_name")).click();
        wd.findElement(By.id("contact_name")).clear();
        wd.findElement(By.id("contact_name")).sendKeys("Mike Random");
        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("send-invite")).click();
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
