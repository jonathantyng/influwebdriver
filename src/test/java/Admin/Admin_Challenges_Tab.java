package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

/**
 * Created by patrickpriestley on 2014-05-02...
 */
public class Admin_Challenges_Tab extends AdminBase{


    @Test
    public void challenge_search(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_name_or_headline_contains")));
            System.out.println("Tutorial not encountered");
        }

        //Enter challenge into search field

        wd.findElement(By.id("search_name_or_headline_contains")).sendKeys("1234567");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Make sure no records are found

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("No records found"));
    }

    @Test
    public void challenges_targeted_groups(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_search_visibility_groups_id_equals > a > span.select2-chosen")));
            System.out.println("Tutorial not encountered");
        }

        //Select 'targeted to group' dropdown

        wd.findElement(By.cssSelector("#s2id_search_visibility_groups_id_equals > a > span.select2-chosen")).click();

        //Select group from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")));
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void select_challenge_type(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_autogen9")));
            System.out.println("Tutorial not encountered");
        }

        //Click on challenge type dropdown

        wd.findElement(By.cssSelector("#s2id_autogen9")).click();

        //Search for Survey from challenge type dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_autogen9")));
        wd.findElement(By.cssSelector("#s2id_autogen9")).sendKeys("Survey");

        //Click on survey type

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#select2-drop > ul > li > div > span")));
        wd.findElement(By.cssSelector("#select2-drop > ul > li > div > span")).click();

        //Assert no error appears

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void select_challenge_creator(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_autogen10")));
            System.out.println("Tutorial not encountered");
        }

        //Click on challenge creator field
        wd.findElement(By.cssSelector("#s2id_autogen10")).click();

        //Enter text into search field

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_autogen10")));
        wd.findElement(By.cssSelector("#s2id_autogen10")).sendKeys("All");
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'All' from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")));
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")).click();

        //Assert that no error has occurred

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


    }

    @Test
    public void challenge_state_toggles(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(2) > label")));
            System.out.println("Tutorial not encountered");
        }

        //Deselect Active toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Active toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Unpublished toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Unpublished toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Archived toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Archived toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_expiry_toggle(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(2) > label")));
            System.out.println("Tutorial not encountered");
        }

        //Select 'This Week' toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(2) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'This Week' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(2) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'Next Week' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(3) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Next Week' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(3) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'Overdue' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(4) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Overdue' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(4) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_channel_toggle(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(2) > label")));
            System.out.println("Tutorial not encountered");
        }

        //Select AdvocateAnywhere toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(2) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect AdvocateAnywhere toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(2) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(2) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select AdvocateHub toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(3) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect AdvocateAnywhere toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(3) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(3) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Maven toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(4) > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Maven toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(4) > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(4) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_other_toggle(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(5) > div > label")));
            System.out.println("Tutorial not encountered");
        }

        //Select Featured toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(5) > div > label"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Featured toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#challenge_search > section > section:nth-child(5) > div > label")));
        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(5) > div > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_sorting() throws IOException {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_sort_order")));
            System.out.println("Tutorial not encountered");
        }

        //Click on sort order dropdown

        wd.findElement(By.cssSelector("#s2id_sort_order")).click();

        //Select 'Completed Count' from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click on sort order dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")));
        wd.findElement(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")).click();

        //Select 'Dismissed Count'

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Dismissed Count")));
        wd.findElement(By.linkText("Dismissed Count")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click on sort dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")));
        wd.findElement(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")).click();

        //Select Active Count

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Active Count")));
        wd.findElement(By.linkText("Active Count")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select sort dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")));
        wd.findElement(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")).click();

        //Select 'Alphabetical'

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Alphabetical")));
        wd.findElement(By.linkText("Alphabetical")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));


    }

    @After
    public void tearDown() {

            //File screenshot = wd.getScreenshotAs(OutputType.FILE);
            //try {
               // FileUtils.copyFile(screenshot, new File("/Users/patrickprestley/Desktop/new/test"));
            //} catch (IOException e) {
                //e.printStackTrace();
            //}

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
