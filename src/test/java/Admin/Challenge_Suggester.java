package Admin;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Challenge_Suggester {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://oct10.influitives.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitled() throws Exception {
        driver.get(baseUrl + "/users/sign_in");
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        driver.findElement(By.id("sign-in-button")).click();
        driver.findElement(By.id("Challenges")).click();
        driver.findElement(By.id("NoThanks")).click();
        driver.findElement(By.linkText("Add a challenge")).click();
        driver.findElement(By.id("create-new-challenge")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("Suggest this challenge");
        driver.findElement(By.name("headline")).clear();
        driver.findElement(By.name("headline")).sendKeys("Suggest this challenge");
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("Suggest this challenge");
        driver.findElement(By.cssSelector("img.icon")).click();
        driver.findElement(By.xpath("//img[@alt='Advocate acceptance']")).click();
        driver.findElement(By.id("ui-id-2")).click();
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Not Published")).click();
        driver.findElement(By.id("visibility_setting_publish")).click();
        driver.findElement(By.id("Challenges")).click();
        driver.findElement(By.linkText("Add a challenge")).click();
        driver.findElement(By.linkText("Select")).click();
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Not Published")).click();
        driver.findElement(By.id("visibility_setting_publish")).click();
        driver.findElement(By.linkText("Influitive Admin")).click();
        driver.findElement(By.linkText("Sign out")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("alice.advocate@gmail.com");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("macbook19");
        driver.findElement(By.id("sign-in-button")).click();
        driver.findElement(By.xpath("//div[@id='challenge-cards']/div/div[2]")).click();
        driver.findElement(By.id("activity_responses_attributes_0_body")).clear();
        driver.findElement(By.id("activity_responses_attributes_0_body")).sendKeys("I am so cool");
        driver.findElement(By.cssSelector("div.positive-actions > input[name=\"commit\"]")).click();
        driver.findElement(By.xpath("//body[@id='home']/div[9]")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}