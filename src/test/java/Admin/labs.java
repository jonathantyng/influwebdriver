package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by shannon on 2014-10-09.
 */


public class labs extends BaseClass {


    @Test
    public void labs() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub
        wd.get("http://app.influitives.com/users/sign_in");

        //Sign in as admin

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_email")));

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements(By.className("remove")).size() != 0;

        if (exists) {
            wd.findElement(By.className("remove")).click();
            System.out.println("Challenge Tutorial Dismissed");
        } else

        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")));
            System.out.println("Tutorial not encountered");
        }

        //Click on the admin dropdown (top right corner of screen)

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")).click();

        //Select Settings from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));

        wd.findElement(By.linkText("Settings")).click();

        //Select System

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"accordion\"]/li[4]/h4")));
        wd.findElement(By.xpath("//*[@id=\"accordion\"]/li[4]/h4")).click();

        //Select Labs

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Influitive Labs")));
        wd.findElement((By.linkText("Influitive Labs"))).click();

        //Toggle appropriate labs

        //Community

        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"toggles_community\"]")));
        wd.findElement(By.xpath("//*[@id=\"toggles_community\"]")).click();



        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

//        TODO: Not sure what this is trying to do
//        wd.executeScript("window.scrollBy(0,700)");


        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Nominee Nurturing

        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"toggles_nominee_nurturing\"]")));
        wd.findElement(By.xpath("//*[@id=\"toggles_nominee_nurturing\"]")).click();

        //Events

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"toggles_zones\"]")));
        wd.findElement(By.xpath("//*[@id=\"toggles_zones\"]")).click();

        //Rewarads Library

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"toggles_awesome_rewards\"]")));
        wd.findElement(By.xpath("//*[@id=\"toggles_awesome_rewards\"]")).click();

        //Save Labs

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"configuration-panel\"]/div/form/input")));
        wd.findElement(By.xpath("//*[@id=\"configuration-panel\"]/div/form/input")).click();



    }


        @After
        public void tearDown() {
            wd.quit();
        }

        public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}
