package specs.admin;

import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;
import pageobjects.admin.groups.Details;

public class CreateNewGroup {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1400, 1400));
        driver.get("http://pageobjects.influitives.com/");
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void canCreateNewGroup() {
        LoginPage start = new LoginPage(driver);
        final String groupName = "Sanity Group";
        
        Details detailsPage = start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .addNewGroup()
                .fillInName(groupName)       
                .saveGroup();

        Assert.assertEquals(groupName, detailsPage.getGroupName());
    }
}
