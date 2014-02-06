package Advocate;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/*
public class Advocate {

    ChromeDriver wd;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver" ,"/Users/patrickprestley/Downloads/chromedriver");

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
*/



//
//Uncomment everything below to enable SauceLabs integration
//



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


