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
import pageobjects.admin.rewards.List;

public class CreateNewReward {

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
    public void canCreateNewReward() {
        LoginPage start = new LoginPage(driver);
        
        List rewardList = start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToRewards()
                .dismissTutorial()
                .addNewReward()
                .chooseManualFulfillment()
                .moveToDetailsPane()
                .fillInName("New reward name")
                .fillInDescription("Some description")
                .chooseType("Swag")
                .saveReward();
                
        Assert.assertEquals("New reward name", rewardList.getRewardName(1));
    }
}
