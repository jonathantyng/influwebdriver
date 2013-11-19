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


public class CompanyOne {

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
    public void Companyone_challenge_completion() throws Exception {

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


        //Log in as Pelican Pete

        driver.findElement(By.xpath("//window[1]/button[1]")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("PelicanPete1")).click();
        try { Thread.sleep(15000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Swipe screen

        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 160.0);
        swipeObject.put("startY", 74.0);
        swipeObject.put("endX", 160.0);
        swipeObject.put("endY", 450.0);
        swipeObject.put("duration", 4.0);
        js.executeScript("mobile: swipe", swipeObject);
        try { Thread.sleep(20000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Swipe to locate 'add company'

        js = (JavascriptExecutor) driver;
        HashMap<String, Double> flickObject = new HashMap<String, Double>();
        flickObject.put("endX", 0.0);
        flickObject.put("endY", 0.0);
        flickObject.put("touchCount", 1.0);
        js.executeScript("mobile: flick", flickObject);
        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Add company one

        driver.findElement(By.name("Add a company")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("window[1]/textfield[1]")).click();
        driver.findElement(By.xpath("window[1]/textfield[1]")).sendKeys("Companyone");
        driver.findElement(By.name("Search")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//window[1]/tableview[1]/cell[1]/text[1]")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select company one

        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        js = (JavascriptExecutor) driver;
        flickObject = new HashMap<String, Double>();
        flickObject.put("endX", 160.0);
        flickObject.put("endY", 450.0);
        flickObject.put("touchCount", 1.0);
        js.executeScript("mobile: flick", flickObject);

        try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }

        try { Thread.sleep(20000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Companyone AdvocateHub")).click();

        //Complete follow on twitter

        driver.findElement(By.name("Follow on Twitter")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Continue")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Follow on Twitter")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Complete Join linkedin group

        driver.findElement(By.name("Join a linkedin group")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Continue")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Join LinkedIn Group")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Share Link challenge
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Share this link")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Continue")).click();

        //Share via email and cancel
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//window[1]/button[2]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Cancel")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("Delete Draft")).click();
        try { Thread.sleep(4000l); } catch (Exception e) { throw new RuntimeException(e); }

        /*
        //Share via social
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//window[1]/button[1]")).click();

        //Select FB share
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//window[1]/button[1]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("OK")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.name("OK")).click();

        */

        //Submit share link challenge

        driver.findElement(By.name("I've shared the link")).click();

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