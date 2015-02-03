
package specs.admin.rewards;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.rewards.List;
import specs.admin.AbstractSpec;


public class CreateNewRedemptionLinkReward extends AbstractSpec {
    
    @Test
    public void canCreateRedemptionLinkReward (){
        final String rewardName = "Redemption Link Reward";
        
        LoginPage start = new LoginPage(driver);
        List rewardList = start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
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
        
        
        Assert.assertEquals(rewardName, rewardList.getRewardName(1));
    } 
}
