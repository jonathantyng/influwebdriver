package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Login_Page {

    private static WebElement element = null;

    public static WebElement login_email(WebDriver driver){

        element = driver.findElement(By.id("user_email"));

        return element;

    }

    public static WebElement login_password(WebDriver driver){

        element = driver.findElement(By.id("user_password"));

        return element;

    }

}
