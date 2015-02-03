package specs.admin.rewards;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.rewards.List;
import specs.admin.AbstractSpec;

public class CreateNewManualReward extends AbstractSpec {

    @Test
    public void canCreateNewReward() {
        final String rewardName = "New manual reward";
        
        LoginPage start = new LoginPage(driver);      
        List rewardList = start.loginAdministrator()
                .navigateToRewards()
                .<pageobjects.admin.rewards.List>dismissTutorial()
                .addNewReward()
                //.chooseManualFulfillment()
                .moveToDetailsPane()
                .fillInName(rewardName)
                .fillInDescription("Some description")
                .chooseType("Swag")
                .saveReward();
                
        Assert.assertEquals(rewardName, rewardList.getRewardName(1));
    }
}
