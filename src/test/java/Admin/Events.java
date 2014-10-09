package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;
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



        //Navigate to settings page

        wd.findElement(By.cssSelector("#header-bar > div.container > div > div > ul:nth-child(1) > li > a")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#header-bar > div.container > div > div > ul:nth-child(1) > li > ul > li:nth-child(2) > a")));
        wd.findElement(By.cssSelector("#header-bar > div.container > div > div > ul:nth-child(1) > li > ul > li:nth-child(2) > a")).click();


        //Navigate to Events

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#collapse-me0 > li:nth-child(6) > a")));
        wd.findElement(By.cssSelector("#collapse-me0 > li:nth-child(6) > a")).click();

        //Add New Event

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#configuration-panel > div > a")).click();


        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //add event name

        wd.findElement(By.id("zone_name")).click();
        wd.findElement(By.id("zone_name")).sendKeys("This is a new event");


        //add event description

        wd.findElement(By.xpath("//*[@id=\"zone_description\"]")).click();
        wd.findElement(By.xpath("//*[@id=\"zone_description\"]")).sendKeys("New events are amazing");

        wd.findElement(By.cssSelector("#new_zone > div.action-buttons.vertical-space-small > input")).click();



    }

}


