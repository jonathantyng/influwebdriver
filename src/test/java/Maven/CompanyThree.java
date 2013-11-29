package Maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CompanyThree {

    private WebDriver driver;

    private List<Integer> values;

    private static final int MINIMUM = 0;
    private static final int MAXIMUM = 10;

    @Before
    public void setUp() throws Exception {
        // set up appium

        File appDir = new File("/Users/patrickprestley/Library/Developer/Xcode/DerivedData/Influnet-fvwocgujorahvednhdqjlaedpqro/Build/Products/InSanity-iphoneos");
        File app = new File(appDir, "Maven.app");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
        capabilities.setCapability(CapabilityType.VERSION, "7.0");
        capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
        capabilities.setCapability("device", "iPhone Simulator");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new SwipeableWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        values = new ArrayList<Integer>();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Companythree_challenge_completion() throws Exception {

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


        //Sign up as nominee

        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//window[1]/button[5]")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[1]/textfield[1]")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[1]/textfield[1]")).sendKeys("Test 14");
        driver.findElement(By.name("Done")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[2]/textfield[1]")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[2]/textfield[1]")).sendKeys("Admin@14.com");
        driver.findElement(By.name("Done")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[3]/secure[1]")).click();
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[3]/secure[1]")).sendKeys("macbook18");
        driver.findElement(By.name("Done")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Sign up now")).click();
        try { Thread.sleep(15000l); } catch (Exception e) { throw new RuntimeException(e); }


        //Add company three

        driver.findElement(By.name("Add a company")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("window[1]/textfield[1]")).click();
        driver.findElement(By.xpath("window[1]/textfield[1]")).sendKeys("Companythree");
        driver.findElement(By.name("Search")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[1]/text[1]")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select company three

        driver.findElement(By.name("Companythree AdvocateHub")).click();

        //Complete join group

        driver.findElement(By.name("Join Group")).click();
        driver.findElement(By.name("Continue")).click();

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Join Group")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Complete Online action

        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Online Action and Share")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Continue")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Done")).click();
        try { Thread.sleep(4000l); } catch (Exception e) { throw new RuntimeException(e); }


        //Complete Survey

        driver.findElement(By.name("Survey")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Continue")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//window[1]/textfield[1]")).click();
        driver.findElement(By.xpath("//window[1]/textfield[1]")).sendKeys("This is a wonderful survey response");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Done")).click();
        driver.findElement(By.name("Submit")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    public class SwipeableWebDriver extends RemoteWebDriver implements HasTouchScreen {
        private RemoteTouchScreen touch;

        public SwipeableWebDriver(URL remoteAddress, Capabilities desiredCapabilities) {
            super(remoteAddress, desiredCapabilities);
            touch = new RemoteTouchScreen(getExecuteMethod());
        }

        public TouchScreen getTouch() {
            return touch;
        }
    }
}