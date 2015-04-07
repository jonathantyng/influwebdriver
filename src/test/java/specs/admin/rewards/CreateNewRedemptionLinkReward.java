
package specs.admin.rewards;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.rewards.Show;
import specs.admin.AbstractSpec;


public class CreateNewRedemptionLinkReward extends AbstractSpec {
    
    @Test
    public void canCreateRedemptionLinkReward (){
        final String rewardName = "Redemption Link Reward";
        
        LoginPage start = new LoginPage(driver);
        Show rewardShow = start.loginAdministrator()
                .navigateToRewards()
                .<pageobjects.admin.rewards.List>dismissTutorial()
                .addNewReward()
                .chooseRedemptionLinkFulfillment()
                .provideFulfillmentURL()
                .moveToDetailsPane()
                .fillInName(rewardName)
                .fillInDescription("Congrats! You won a link!")
                .chooseType("Gifts")
                .saveReward();
        
        
        Assert.assertEquals(rewardName, rewardShow.getRewardName());
    } 
}
