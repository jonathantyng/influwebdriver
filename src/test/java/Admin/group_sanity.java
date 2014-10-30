package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class group_sanity extends BaseClass{

    @Test
    public void group_sanity () {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Select groups tab

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

        wd.findElement(By.linkText("Add a group")).click();

        //Enter name and description

        wd.findElement(By.id("group_name")).sendKeys("Sanity Group");
        wd.findElement(By.id("group_description")).sendKeys("This is a group for sane people!");

        //Enter group join code

        wd.findElement(By.id("group_token")).sendKeys("Sanity");
        wd.findElement(By.id("link-membership-rules")).click();

        //Save group

        wd.findElement(By.id("save-button")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }
}