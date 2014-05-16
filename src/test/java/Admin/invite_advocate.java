package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class invite_advocate extends BaseClass{
    
    @Test
    public void invite_joe_prospect() {

        //wd.get("http://may14.influitiveqa.com/users/sign_in");

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Click on the Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements(By.linkText("No Thanks")).size() != 0;

        if (exists) {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        } else {
            try {
                Thread.sleep(2000l);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tutorial not encountered");
        }

        //Invite Joe Prospect

        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        wd.findElement(By.linkText("Add a new Nominee")).click();

        //Enter contact name and email

        wd.findElement(By.id("contact_email")).sendKeys("joe.prospect5@gmail.com");
        wd.findElement(By.id("contact_name")).sendKeys("Joe Prospect");

        //Save select and send invite

        wd.findElement(By.id("save-button")).click();

        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();

        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        wd.findElement(By.id("send-invite")).click();

        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test public void invite_fred_prospect() {

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Click on the Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements(By.linkText("No Thanks")).size() != 0;

        if (exists) {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        } else {
            try {
                Thread.sleep(2000l);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tutorial not encountered");
        }

        //Invite nominee
        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        wd.findElement(By.linkText("Add a new Nominee")).click();
        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Enter contact email and name

        wd.findElement(By.id("contact_email")).sendKeys("fredprospect@yahoo.ca");
        wd.findElement(By.id("contact_name")).sendKeys("Fred Prospect");
        wd.findElement(By.id("save-button")).click();
        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //Select nominee and send invite

        wd.findElement(By.cssSelector("div.name")).click();
        wd.findElement(By.cssSelector("input.pull-right.highlighted")).click();
        try {
            Thread.sleep(2000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        wd.findElement(By.id("send-invite")).click();
        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test public void invite_mike_random(){

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Click on the Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements(By.linkText("No Thanks")).size() != 0;

        if (exists) {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        } else {
            try {
                Thread.sleep(2000l);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tutorial not encountered");
        }

        //Invite nominee

        wd.findElement(By.partialLinkText("Invite Nominees")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a new Nominee")).click();

        //Enter contact email and name

        wd.findElement(By.id("contact_email")).sendKeys("mikerandom23@yahoo.com");
        wd.findElement(By.id("contact_name")).sendKeys("Mike Random");

        //Save select and send invite

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
