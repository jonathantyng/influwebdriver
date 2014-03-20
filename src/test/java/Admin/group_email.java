package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class group_email extends BaseClass{

    @Test
    public void create_group_email () {
        wd.get("http://sanitymar17.influitives.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("Groups")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Group Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Add Test Group


        wd.findElement(By.id("Groups")).click();
        wd.findElement(By.linkText("Add a group")).click();
        wd.findElement(By.id("group_name")).click();
        wd.findElement(By.id("group_name")).clear();
        wd.findElement(By.id("group_name")).sendKeys("Employee Group");
        wd.findElement(By.id("group_description")).click();
        wd.findElement(By.id("group_description")).clear();
        wd.findElement(By.id("group_description")).sendKeys("This is a Admin group for employees with employee email addresses!");
        wd.findElement(By.id("link-membership rules")).click();
        wd.findElement(By.linkText("Add new criteria...")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_group_search_criteria_attributes0_field_name > a.select2-choice > span.select2-chosen")).click();
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Email");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li/ul/li/div")).click();
        try { Thread.sleep(4000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("s2id_group_search_criteria_attributes0_value")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("gmail.com, ");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("save-button")).click();
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