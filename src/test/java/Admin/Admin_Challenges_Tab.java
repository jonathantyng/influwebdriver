package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by patrickpriestley on 2014-05-02.
 */
public class Admin_Challenges_Tab extends BaseClass{

    String baseUrl = "http://may31.influitiveqa.com";

    @Test
    public void challenge_search(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Enter challenge into search field

        wd.findElement(By.id("search_name_or_headline_contains")).sendKeys("1234567");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Make sure no records are found

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains("No records found"));
    }

    @Test
    public void challenges_targeted_groups(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Select 'targeted to group' dropdown

        wd.findElement(By.cssSelector("#s2id_search_visibility_groups_id_equals > a > span.select2-chosen")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select group from dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void select_challenge_type(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Click on challenge type dropdown

        wd.findElement(By.cssSelector("#s2id_autogen14")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Search for Survey from challenge type dropdown

        wd.findElement(By.cssSelector("#s2id_autogen14")).sendKeys("Survey");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on survey type

        wd.findElement(By.cssSelector("#select2-drop > ul > li > div > span")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Assert no error appears

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @Test
    public void select_challenge_creator(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Click on challenge creator field
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"s2id_autogen15\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter text into search field

        wd.findElement(By.id("s2id_autogen15")).sendKeys("All");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'All' from dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Assert that no error has occurred

        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


    }

    @Test
    public void challenge_state_toggles(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Deselect Active toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Active toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(2) > label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Unpublished toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Unpublished toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(3) > label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Archived toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Archived toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(2) > div:nth-child(4) > label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_expiry_toggle(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Select 'This Week' toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(2) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'This Week' toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(2) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'Next Week' toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(3) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Next Week' toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(3) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'Overdue' toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(4) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Overdue' toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(3) > div:nth-child(4) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_channel_toggle(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Select AdvocateAnywhere toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(2) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect AdvocateAnywhere toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(2) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select AdvocateHub toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(3) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect AdvocateAnywhere toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(3) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select Maven toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(4) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Maven toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(4) > div:nth-child(4) > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_other_toggle(){


        //Navigate to hub

        wd.get(baseUrl);

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Select Featured toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(5) > div > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect Featured toggle

        wd.findElement(By.cssSelector("#challenge_search > section > section:nth-child(5) > div > label"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void challenge_sorting(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Challenges tab

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

        //Click on sort order dropdown

        wd.findElement(By.cssSelector("#s2id_sort_order")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select 'Completed Count' from dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click on sort order dropdown

        wd.findElement(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select 'Dismissed Count'

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[3]/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Click on sort dropdown

        wd.findElement(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select Active Count

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[4]/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select sort dropdown

        wd.findElement(By.cssSelector("#s2id_sort_order > a > span.select2-chosen")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Select 'Alphabetical'

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[5]/div")).click();
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
