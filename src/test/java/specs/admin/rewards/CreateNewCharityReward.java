package specs.admin.rewards;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.rewards.List;
import specs.admin.AbstractSpec;

public class CreateNewCharityReward extends AbstractSpec {
    @Test
    public void canCreateCharityRewards() {
         final String rewardName = "New charity reward";
        
        LoginPage start = new LoginPage(driver);      
        List rewardList = start.loginAdministrator()
                .navigateToRewards()
                .<pageobjects.admin.rewards.List>dismissTutorial()
                .addNewReward()
                .chooseAdvocateChosenCharityFor(500)
                .moveToDetailsPane()
                .fillInName(rewardName)
                .fillInDescription("Some description")
                .chooseType("Charity")
                .saveReward();
                
        Assert.assertEquals(rewardName, rewardList.getRewardName(1));
    }
}
