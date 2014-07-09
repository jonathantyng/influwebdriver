package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

public class group_earned_badge extends BaseClass{

    @Test
    public void group_badge () {

        //Log in as super admin

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

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
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
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
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click on the secondary dropdown and select social cookie

        wd.findElement(By.xpath("//*[@id=\"s2id_autogen19\"]/ul/li")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//*[@id=\"s2id_autogen19\"]/ul/li")).sendKeys("Social Cookie");
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.className("select2-match")).click();

        //Save group

        wd.findElement(By.id("save-button")).click();
    }

    @After
    public void tearDown() {
        wd.quit();
    }

}