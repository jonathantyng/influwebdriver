package Admin;


import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AdminBase {

    ChromeDriver wd;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/patrickprestley/Downloads/chromedriver");

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.get("http://sanityfeb3.influitives.com");

        wd.manage().window().setSize(new Dimension(1400,1400));


    }

}


//
//Uncomment everything below to enable SauceLabs integration
//
/*

import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BaseClass {



    WebDriver wd;

    @Before

    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("version", "26");
        capabilities.setCapability("platform", Platform.MAC);
        this.wd = new RemoteWebDriver(
                new URL("http://influitive_dev:b372fec3-0552-4fb6-98bb-a027d82958b9@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        capabilities.setCapability("screen-resolution", "1920x1200");
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://advocatetest.influitives.com");

        }
    }


*/
