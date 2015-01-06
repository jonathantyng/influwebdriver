package specs.admin;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.rewards.List;

public class CreateNewReward extends AbstractSpec {

    @Test
    public void canCreateNewReward() {
        LoginPage start = new LoginPage(driver);
        
        List rewardList = start.loginAdministrator()
                .navigateToRewards()
                .<pageobjects.admin.rewards.List>dismissTutorial()
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
