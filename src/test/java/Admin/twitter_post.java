package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twitter_post extends BaseClass{
    
    @Test
    public void twitter_post() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("The Great Twitter Challenge");

        //Select Twitter from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.select2-input.select2-focused")));
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Twitter");
        wd.findElement(By.className("select2-match")).click();

        //Enter challenge name and description

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("headline")));
        wd.findElement(By.name("headline")).sendKeys("The Great Twitter Challenge");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("description")));
        wd.findElement(By.name("description")).sendKeys("The Great Twitter Challenge is amazing. Complete this challenge.");

        //Feature challenge and allow multiple completions

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("featured1")));
        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();

        //Add a new stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img.icon")));
        wd.findElement(By.cssSelector("img.icon")).click();

        //Select twitter post stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Twitter post']")));
        wd.findElement(By.xpath("//img[@alt='Twitter post']")).click();

        //Preview challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Preview")));
        wd.findElement(By.linkText("Preview")).click();

        //Close preview modal

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.close")));
        wd.findElement(By.cssSelector("button.close")).click();

        //Select challenge type from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Choose One")));
        wd.findElement(By.linkText("Choose One")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='select2-drop']/ul/li[2]/div")));
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]/div")).click();

        //Enter required content

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.required_content")));
        wd.findElement(By.name("params.required_content")).sendKeys("#testing123");

        //Enter default twitter text

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.default_text")));
        wd.findElement(By.name("params.default_text")).sendKeys("Tweet #testing123");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        wd.findElement(By.id("ui-id-2")).click();

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();

        //Publish challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
    }


    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
