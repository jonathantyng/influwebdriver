package specs.admin;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;


public class LoginSocialFacebook {
    
    WebDriver driver;
    
    @Before
    public void setup (){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1400, 1400));
        driver.get("http://pageobjects.influitives.com");
    }
    
    @After
    public void teardown (){
        driver.quit();
    }
    
    
    @Test
    public void LoginwithFacebook(){
        LoginPage start = new LoginPage(driver);
//            .clickFacebookIcon();
//        
    
    }

   

  
    
}
