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
public class Admin_Rewards_Tab extends BaseClass{

    @Test
    public void search_rewards(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Rewards tab

        wd.findElement(By.id("Rewards")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Group Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Click on search field and enter text

        wd.findElement(By.xpath("//*[@id=\"search_name_contains\"]")).sendKeys("Test");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void filter_by_group(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Rewards tab

        wd.findElement(By.id("Rewards")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Group Tutorial Dismissed");
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
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void filter_reward_type(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Rewards tab

        wd.findElement(By.id("Rewards")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Group Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Click on reward type field

        wd.findElement(By.xpath("//*[@id=\"s2id_autogen12\"]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter text

        wd.findElement(By.xpath("//*[@id=\"s2id_autogen12\"]")).sendKeys("All");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on search result

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void reward_state_toggles(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Rewards tab

        wd.findElement(By.id("Rewards")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Group Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select 'Active' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[1]/div[1]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Active' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[1]/div[1]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'Unpublished' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[1]/div[2]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Unpublished' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[1]/div[2]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void reward_redemption_toggle(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Rewards tab

        wd.findElement(By.id("Rewards")).click();

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Group Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        //Select 'In Catalog' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[2]/div[1]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'In Catalog' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[2]/div[1]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'Perk' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[2]/div[2]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Perk' toggle

        wd.findElement(By.xpath("//*[@id=\"reward_search\"]/section/section[2]/div[2]/label")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
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
