package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class create_company extends BaseClass{

    @Test
    public void create_new_company() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub
        wd.get("http://app.influitiveqa.com/users/sign_in");

        //Sign in as admin

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_email")));

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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")));
            System.out.println("Tutorial not encountered");
        }

        //Click on the admin dropdown (top right corner of screen)

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")).click();

        //Select Settings from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));

        wd.findElement(By.linkText("Settings")).click();

        //Select system from settings list

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='accordion']/li[4]/h4")));

        wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();

        //Select Companies from System settings list

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Companies")));

        wd.findElement(By.linkText("Companies")).click();

        //Select 'Add a company'

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a Company")));

        wd.findElement(By.linkText("Add a Company")).click();

        //Enter company name into text field

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_name")));

        wd.findElement(By.id("company_name")).sendKeys("aug12");

        //Enter company subdomain into text field

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_subdomain")));

        wd.findElement(By.id("company_subdomain")).sendKeys("aug12");

        //Enter admin email address

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_administrator_email")));

        wd.findElement(By.id("company_administrator_email")).sendKeys("samanthatester99@yahoo.com");

        //Enter admin name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_administrator_name")));

        wd.findElement(By.id("company_administrator_name")).sendKeys("Samantha Tester");

        //Set the hub colour to green

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("blue")));

        wd.findElement(By.linkText("blue")).click();
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li[3]/div")).click();

        //Save and create company

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));

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

