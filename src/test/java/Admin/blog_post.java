package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class blog_post extends BaseClass{

    @Test
    public void Blog_Post() {
        //wd.get("http://may14.influitiveqa.com/users/sign_in");

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Add a new challenge

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a challenge")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Start With Blank Challenge")).click();

        //Enter challenge name and description

        wd.findElement(By.name("name")).sendKeys("Comment on a Blog Post");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("headline")).sendKeys("Comment on a Blog Post");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("description")).sendKeys("Comment on a Blog Post");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select challenge type from dropdown

        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Testimonial");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.className("select2-match")).click();

        //Click featured and allow multiple responses checkboxes

        wd.findElement(By.id("featured1")).click();
        wd.findElement(By.id("allow_multiple_response2")).click();

        //Add new stage

        wd.findElement(By.cssSelector("img.icon")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select blog post stage

        wd.findElement(By.xpath("//img[@alt='Blog post']")).click();
        //wd.findElement(By.xpath("//*[@id=\"stages\"]/div[3]/ol/li[5]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter blog post URL

        wd.findElement(By.name("params.url")).sendKeys("http://www.slashgear.com/jobs-movie-tanks-on-opening-weekend-19294106/");

        //Click the load button

        wd.findElement(By.className("summarize-url")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        //Navigate to visibility settings

        wd.findElement(By.id("ui-id-2")).click();

        //Set visibility to one person

        wd.findElement(By.id("criteria_radio")).click();
        wd.findElement(By.xpath("//*[@id=\"include-conditions-list\"]/div/footer/ul/li[2]/a")).click();

        wd.findElement(By.xpath("//*[@id=\"s2id_autogen36\"]/ul/li")).click();
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]")).sendKeys("Pelican");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("img[alt=\"Pelican Pete\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.id("ui-id-1")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Save challenge

        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Publish challenge

        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
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