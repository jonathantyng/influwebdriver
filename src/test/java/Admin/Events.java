package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Events extends BaseClass {

    @Test
    public void Events() {

        WebDriverWait wait = new WebDriverWait(wd,5);

        //Log in as super admin

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

        //Navigate to settings page

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")).click();

        //Select Settings from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Select Events

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"collapse-me0\"]/li[6]/a")));
        wd.findElement(By.xpath("//*[@id=\"collapse-me0\"]/li[6]/a")).click();

        //Create new event

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add Event")));
        wd.findElement(By.linkText("Add Event")).click();

        //Name/Description for New Event

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("zone_name")));
        wd.findElement(By.id("zone_name")).sendKeys("New Zone");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("zone_description")));
        wd.findElement(By.id("zone_description")).sendKeys("This is the new zone");

        //Save Zone

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"new_zone\"]/div[5]/input")));
        wd.findElement(By.xpath("//*[@id=\"new_zone\"]/div[5]/input")).click();


    }

}


