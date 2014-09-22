package Admin;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by patrickpriestley on 2014-05-02.
 */
public class Admin_Groups_Tab extends AdminBase {

    @Test
    public void search_groups(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Groups tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Groups")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_name_contains")));
            System.out.println("Tutorial not encountered");
        }

        //Enter text into search groups field

        wd.findElement(By.id("q_name_cont")).sendKeys("Test");
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

    }

    @Test
    public void filter_groups(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Groups tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Groups")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"group_search\"]/section/section/div[1]/label")));
            System.out.println("Tutorial not encountered");
        }

        //Select 'Has a join code' toggle

        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[1]/label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'Has a join code' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"group_search\"]/section/section/div[1]/label")));
        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[1]/label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select 'System Groups' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"group_search\"]/section/section/div[2]/label")));
        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[2]/label")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Deselect 'System Groups' toggle

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"group_search\"]/section/section/div[2]/label")));
        wd.findElement(By.xpath("//*[@id=\"group_search\"]/section/section/div[2]/label")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void sort_groups(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Groups tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Groups")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s2id_sort_order\"]/a/span[1]")));
            System.out.println("Tutorial not encountered");
        }

        //Select sort dropdown

        wd.findElement(By.xpath("//*[@id=\"s2id_sort_order\"]/a/span[1]")).click();

        //Select Alphabetical from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div")));
        wd.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/div")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));

        //Select sort dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s2id_sort_order\"]/a/span[1]")));
        wd.findElement(By.xpath("//*[@id=\"s2id_sort_order\"]/a/span[1]")).click();

        //Select '# of Challenges' from dropdown

        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-result-label-6")));
        wd.findElement(By.id("select2-result-label-6")).click();
        try {Thread.sleep(2000l);} catch (Exception e) {throw new RuntimeException(e);}
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
    }

    @Test
    public void edit_group(){

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to Groups tab

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Groups")));
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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"list_collection\"]/li[1]/div/div[1]/div/a/img")));
            System.out.println("Tutorial not encountered");
        }

        //Click on groups dropdown

        wd.findElement(By.xpath("//*[@id=\"list_collection\"]/li[1]/div/div[1]/div/a/img")).click();

        //Select edit from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"list_collection\"]/li[1]/div/div[1]/div/ul/li[1]/a")));
        wd.findElement(By.xpath("//*[@id=\"list_collection\"]/li[1]/div/div[1]/div/ul/li[1]/a")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("wrong"));

        //Save group

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"save-button\"]")));
        wd.findElement(By.xpath("//*[@id=\"save-button\"]")).click();
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("Error"));
        Assert.assertFalse(wd.findElement(By.tagName("body")).getText().contains("wrong"));
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
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
