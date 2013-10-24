package test;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Set{
    ChromeDriver wd;

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver" ,"/Users/patrickprestley/Downloads/chromedriver");

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
   }
