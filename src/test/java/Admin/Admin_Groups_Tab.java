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
public class Admin_Groups_Tab extends AdminBase {

    @Test
    public void search_groups(){

        //Navigate to hub

        //wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Groups tab

        wd.findElement(By.id("Groups")).click();

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

        //Enter text into search groups field

        wd.findElement(By.id("search_name_contains")).sendKeys("Test");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void filter_groups(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Groups tab

        wd.findElement(By.id("Groups")).click();

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

        //Select 'Has a join code' toggle

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[1]/label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Has a join code' toggle

        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[1]/label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'System Groups' toggle

        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[2]/label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'System Groups' toggle

        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[2]/label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void sort_groups(){

        //Navigate to hub

        //wd.get("http://advocatetest.influitives.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Groups tab

        wd.findElement(By.id("Groups")).click();

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

        //Select sort dropdown

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"s2id_sort_order\"]/a/span[1]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select Alphabetical from dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select sort dropdown

        wd.findElement(By.xpath("//*[@id=\"s2id_sort_order\"]/a/span[1]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select '# of Challenges' from dropdown

        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[3]/div")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
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
