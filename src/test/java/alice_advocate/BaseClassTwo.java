package alice_advocate;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class BaseClassTwo {

    WebDriver wd;

    @Before
    public void setUp() throws Exception {

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}



//
//Uncomment everything below to enable SauceLabs integration
//

/*

public class BaseClassTwo {

    WebDriver wd;

    @Before

    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        capabilities.setCapability("version", "10");
        capabilities.setCapability("platform", Platform.WIN8);
        this.wd = new RemoteWebDriver(
                new URL("http://influitive_dev:b372fec3-0552-4fb6-98bb-a027d82958b9@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
    }

*/
