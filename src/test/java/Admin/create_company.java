package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class create_company extends BaseClass{

    @Test
    public void create_new_company() {

        //Navigate to hub
        wd.get("http://app.influitiveqa.com/users/sign_in");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.className("remove")).size() != 0;

        if (exists)
        {
            wd.findElement(By.className("remove")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Click on the admin dropdown (top right corner of screen)

        wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul[1]/li/a")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Settings from dropdown

        wd.findElement(By.linkText("Settings")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select system from settings list

        wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Companies from System settings list

        wd.findElement(By.linkText("Companies")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select 'Add a company'

        wd.findElement(By.linkText("Add a Company")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
<<<<<<< HEAD

        //Enter company name into text field

=======
        wd.findElement(By.id("company_name")).click();
        wd.findElement(By.id("company_name")).click();
        wd.findElement(By.id("company_name")).clear();
<<<<<<< HEAD
        wd.findElement(By.id("company_name")).sendKeys("june24");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("company_subdomain")).click();
        wd.findElement(By.id("company_subdomain")).clear();
        wd.findElement(By.id("company_subdomain")).sendKeys("june24");
=======
>>>>>>> FETCH_HEAD
        wd.findElement(By.id("company_name")).sendKeys("july8");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter company subdomain into text field

        wd.findElement(By.id("company_subdomain")).sendKeys("july8");
>>>>>>> c1e8ef787d0d0c3e487eb4395bc8486cd64b2266
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.linkText("Evangelist")).click();
        //try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.linkText("Evangelist")).click();

        //Enter admin email address

        wd.findElement(By.id("company_administrator_email")).sendKeys("samanthatester99@yahoo.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter admin name

        wd.findElement(By.id("company_administrator_name")).sendKeys("Samantha Tester");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Set the hub colour to green

        wd.findElement(By.linkText("blue")).click();
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li[3]/div")).click();
        try { Thread.sleep(4000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save and create company
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(60000l); } catch (Exception e) { throw new RuntimeException(e); }

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

