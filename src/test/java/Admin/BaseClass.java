package Admin;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class BaseClass {


    WebDriver wd;

    @Before
    public void setUp() throws Exception {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://dec4.influitives.com/");

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        wd.manage().window().setSize(new Dimension(1400, 1400));
        /*
        //wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        wd = new RemoteWebDriver(
                new URL("http://127.0.0.1:4444/wd/hub"),
                DesiredCapabilities.chrome()
        );
        */
    }

}


//
//Uncomment everything below to enable SauceLabs integration
//

/*
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {


    WebDriver wd;

    @Before

    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability("version", "8");
        capabilities.setCapability("platform", "XP");
        this.wd = new RemoteWebDriver(
                new URL("http://influitive_dev:b372fec3-0552-4fb6-98bb-a027d82958b9@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        capabilities.setCapability("screen-resolution", "1920x1200");
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://sanityjune30.influitives.com");

    }
}
*/

