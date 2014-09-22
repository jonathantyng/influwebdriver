package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class group_earned_badge extends BaseClass{

    @Test
    public void group_badge () {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to the groups tab

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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Add a group")));
            System.out.println("Tutorial not encountered");
        }

        //Add Test Group

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Add a group")).click();

        //Enter group name and description

        wd.findElement(By.id("group_name")).sendKeys("Chocolate Chips");
        wd.findElement(By.id("group_description")).sendKeys("This is a group for people who have earned the social cookie.");

        //Click on membership rule

        wd.findElement(By.id("link-membership-rules")).click();

        //Select behaviour from includes criteria

        wd.findElement(By.linkText("Behaviour")).click();

        //Click on the secondary dropdown and select social cookie

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s2id_autogen14\"]/ul/li")));
        wd.findElement(By.xpath("//*[@id=\"s2id_autogen14\"]/ul/li")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"s2id_autogen14\"]/ul/li")));
        wd.findElement(By.xpath("//*[@id=\"s2id_autogen14\"]/ul/li")).sendKeys("Social Cookie");
        wd.findElement(By.xpath("select2-match"));
        wd.findElement(By.className("select2-match")).click();

        //Save group

        wd.findElement(By.id("save-button")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }

}