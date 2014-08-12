package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class blog_post extends BaseClass{

    @Test
    public void Blog_Post() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Sign in as admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.id("sign-in-button")).click();

        //Navigate to the challenges tab

        wd.findElement(By.id("Challenges")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a challenge")));
            System.out.println("Tutorial not encountered");
        }

        //Add a new challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name and description

        wd.findElement(By.name("name")).sendKeys("Comment on a Blog Post");
        wd.findElement(By.name("headline")).sendKeys("Comment on a Blog Post");
        wd.findElement(By.name("description")).sendKeys("Comment on a Blog Post");

        //Select challenge type from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")));
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Testimonial");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-match")));
        wd.findElement(By.className("select2-match")).click();

        //Click featured and allow multiple responses checkboxes

        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();

        //Add new stage

        wd.findElement(By.cssSelector("img.icon")).click();

        //Select blog post stage

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Blog post']")));
        wd.findElement(By.xpath("//img[@alt='Blog post']")).click();

        //Enter blog post URL

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("params.url")));
        wd.findElement(By.name("params.url")).sendKeys("http://www.slashgear.com/jobs-movie-tanks-on-opening-weekend-19294106/");

        //Click the load button

        wd.findElement(By.className("summarize-url")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Navigate to visibility settings

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-2")));
        wd.findElement(By.id("ui-id-2")).click();

        //Set visibility to one person

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("criteria_radio")));
        wd.findElement(By.id("criteria_radio")).click();
        wd.findElement(By.xpath("//*[@id=\"include-conditions-list\"]/div/footer/ul/li[2]/a")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("s2id_autogen81")));
        wd.findElement(By.id("s2id_autogen81")).click();
        wd.findElement(By.id("s2id_autogen81")).sendKeys("Pelican");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt=\"Pelican Pete\"]")));
        wd.findElement(By.cssSelector("img[alt=\"Pelican Pete\"]")).click();

        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();

        //Publish challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("NOT PUBLISHED")));
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}