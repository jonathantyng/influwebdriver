package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by patrickprestley on 2014-05-02.
 */
public class Admin_Nominee_Tab extends BaseClass {

    @Test
    public void generate_url(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Click to generate new group invite link

        wd.findElement(By.linkText("click here to generate a group invite URL")).click();

        //Select invite modal dropdown

        wd.findElement(By.cssSelector("#s2id_groups > a")).click();

        //Select group from dropdown

        wd.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(1) > div")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Verify link creation

        Assert.assertTrue(wd.findElement(By.tagName("body")).getText().contains(".com/join"));

        //Close invite nominee modal

        wd.findElement(By.cssSelector("#modal > div.modal-header > button")).click();

    }

    @Test
    public void add_new_nominee(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Select 'Add new nominee button'

        wd.findElement(By.linkText("Add a new Nominee")).click();

        //Enter Nominee info

        wd.findElement(By.id("contact_email")).sendKeys("newnominee@gmail.com");
        wd.findElement(By.id("contact_name")).sendKeys("New Nominee");
        wd.findElement(By.id("contact_company")).sendKeys("New Company");
        wd.findElement(By.id("contact_title")).sendKeys("CFO");

        //Select groups dropdown

        wd.findElement(By.xpath("//*[@id=\"s2id_autogen11\"]")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select group from dropdown

        wd.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(2)")).click();

        //Switch to advanced settings

        wd.findElement(By.id("ui-id-2")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Save nominee

        wd.findElement(By.id("save-button")).click();
    }

    @Test
    public void search_for_nominee(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Select nominee search field and enter name
        wd.findElement(By.id("search_name_or_email_contains")).sendKeys("New Nominee");

    }

    @Test
    public void toggle_nominee_status(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Un-Select Active toggle

        wd.findElement(By.cssSelector("#nominee_search > div.filter-container > section:nth-child(4) > div:nth-child(2) > label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select Active toggle

        wd.findElement(By.cssSelector("#nominee_search > div.filter-container > section:nth-child(4) > div:nth-child(2) > label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-Select Active toggle

        wd.findElement(By.cssSelector("#nominee_search > div.filter-container > section:nth-child(4) > div:nth-child(2) > label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select hidden toggle

        wd.findElement(By.cssSelector("#nominee_search > div.filter-container > section:nth-child(4) > div:nth-child(3) > label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-Select hidden toggle

        wd.findElement(By.cssSelector("#nominee_search > div.filter-container > section:nth-child(4) > div:nth-child(3) > label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void toggle_nominee_nps(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Select detractor

        wd.findElement(By.id("search_by_nps_category_detractor")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select detractor

        wd.findElement(By.id("search_by_nps_category_detractor")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select neutral

        wd.findElement(By.id("search_by_nps_category_neutral")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select neutral

        wd.findElement(By.id("search_by_nps_category_neutral")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select promoter

        wd.findElement(By.id("search_by_nps_category_promoter")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select promoter

        wd.findElement(By.id("search_by_nps_category_promoter")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select Unknown

        wd.findElement(By.id("search_by_nps_category_unknown")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select Unknown

        wd.findElement(By.id("search_by_nps_category_unknown")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

    }

    @Test
    public void toggle_nominee_impact_score(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Select 80 to 100

        wd.findElement(By.id("search_by_impact_score_80 to 100")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select 80 to 100

        wd.findElement(By.id("search_by_impact_score_80 to 100")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select 60 to 79

        wd.findElement(By.id("search_by_impact_score_60 to 79")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select 60 to 79

        wd.findElement(By.id("search_by_impact_score_60 to 79")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select 40 to 59

        wd.findElement(By.id("search_by_impact_score_40 to 59")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select 40 to 59

        wd.findElement(By.id("search_by_impact_score_40 to 59")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select Below 40

        wd.findElement(By.id("search_by_impact_score_below 40")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select Below 40

        wd.findElement(By.id("search_by_impact_score_below 40")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void toggle_nominee_activity_count(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Select 20 and above

        wd.findElement(By.id("search_by_activity_count_20 and above")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select 20 and above

        wd.findElement(By.id("search_by_activity_count_20 and above")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select 10 to 19

        wd.findElement(By.id("search_by_activity_count_10 to 19")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select 10 to 19

        wd.findElement(By.id("search_by_activity_count_10 to 19")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select 5 to 9

        wd.findElement(By.id("search_by_activity_count_5 to 9")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select 5 to 9

        wd.findElement(By.id("search_by_activity_count_5 to 9")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select 1 to 4

        wd.findElement(By.id("search_by_activity_count_1 to 4")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select 1 to 4

        wd.findElement(By.id("search_by_activity_count_1 to 4")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Select none

        wd.findElement(By.id("search_by_activity_count_none")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Un-select none

        wd.findElement(By.id("search_by_activity_count_none")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
    }

    @Test
    public void archive_nominee(){

        //Navigate to hub

        wd.get("http://may31.influitiveqa.com");

        //Admin sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        wd.findElement(By.name("commit")).click();

        //Navigate to Advocates tab

        wd.findElement(By.id("Advocates")).click();

        //Navigate to nominee page

        wd.findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();

        //Select archive button

        wd.findElement(By.cssSelector("#contact-list > tr:nth-child(1) > td.archive > span")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}

        //Handle pop-up

        try {
            WebDriverWait wait = new WebDriverWait(wd, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = wd.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            //exception handling
        }



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
