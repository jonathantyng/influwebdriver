package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class create_company extends BaseCreate{

    @Test
    public void create_new_company() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

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

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#configuration-panel > div > div.clearfix.padded > a.button.highlighted.right")));

        wd.findElement(By.cssSelector("#configuration-panel > div > div.clearfix.padded > a.button.highlighted.right")).click();

        //Enter company name into text field

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_name")));

        wd.findElement(By.id("company_name")).sendKeys("jan30");

        //Enter company subdomain into text field

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company_subdomain")));

        wd.findElement(By.id("company_subdomain")).sendKeys("jan30");

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

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}

