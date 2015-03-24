package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class group_test extends BaseClass{

    @Test
    public void group_tests () {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Navigate to groups tab

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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a group")));
            System.out.println("Tutorial not encountered");
        }

        //Add Test Group

        wd.findElement(By.linkText("Add a Group")).click();

        //Enter name and description

        wd.findElement(By.id("group_name")).sendKeys("Test Group");
        wd.findElement(By.id("group_description")).sendKeys("This is a Admin group for testing!");

        //Enter group join code

        wd.findElement(By.id("group_token")).sendKeys("Test");
        wd.findElement(By.id("link-membership-rules")).click();

        //Save group

        wd.findElement(By.id("save-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @After
    public void tearDown() {
        wd.quit();
    }
}