package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest  extends BaseClass {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.

        WebDriver driver = new FirefoxDriver();

        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.get("http://sanitytwoapril28.influitives.com/users/sign_in");
        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        driver.findElement(By.id("sign-in-button")).click();
        driver.findElement(By.xpath("//div[@id='header']/div/ul[2]/li/a/b")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.linkText("Settings")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.xpath("//ul[@id='accordion']/li[2]/h4")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.linkText("Levels & Badges")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = driver.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            driver.findElement(By.linkText("No Thanks")).click();
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        driver.findElement(By.id("add_badge")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        driver.findElement(By.id("badge_name")).click();
        driver.findElement(By.id("badge_name")).clear();
        driver.findElement(By.id("badge_name")).sendKeys("Social Cookie");
        driver.findElement(By.id("badge_description")).click();
        driver.findElement(By.id("badge_description")).clear();
        driver.findElement(By.id("badge_description")).sendKeys("This is a social cookie badge! It is awarded to advocates who have completed 2 social media challenges.");
        driver.findElement(By.id("icon_1")).click();

        // Should see: "Cool QA Community"
        System.out.println("Page title is: " + driver.getTitle());

        //Close the browser
        driver.quit();

    }
}
