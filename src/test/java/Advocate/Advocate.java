package Advocate;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Advocate {

    ChromeDriver wd;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/shannon/chromedriver");

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("http://princessland.influitives.com");

        //Sign in as advocate

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();

        wd.manage().window().setSize(new Dimension(1400,1400));

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

public class Advocate {

    WebDriver wd;

    @Before

    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability("version", "8");
        capabilities.setCapability("platform", "XP");
        capabilities.setCapability("name", "Advocate Challenge Completion");
        capabilities.setCapability("screen-resolution", "1920x1200");
        this.wd = new RemoteWebDriver(
                new URL("http://influitive_dev:b372fec3-0552-4fb6-98bb-a027d82958b9@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}

*/

