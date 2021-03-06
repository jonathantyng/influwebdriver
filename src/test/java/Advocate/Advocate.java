package Advocate;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;


public class Advocate {

    WebDriver wd;

    @Before
    public void setUp() throws Exception {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://advocatetest.influitives.com/");

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("advocatebob7@gmail.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();

        wd.manage().window().setSize(new Dimension(1400, 1400));

    }
}




//
//Uncomment everything below to enable SauceLabs integration
//


/*
public class Advocate {

    WebDriver wd;

    @Before

    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability("version", "8");
        capabilities.setCapability("platform", Platform.XP);
        capabilities.setCapability("name", "Advocate Challenge Completion");
        capabilities.setCapability("screen-resolution", "1920x1200");
        this.wd = new RemoteWebDriver(
                new URL("http://influitive_dev:b372fec3-0552-4fb6-98bb-a027d82958b9@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}

*/
