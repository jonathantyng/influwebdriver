
package specs.admin.rewards;

import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.rewards.List;
import pageobjects.admin.rewards.editor.FulfillmentPane;
import specs.admin.AbstractSpec;


public class CreateNewRedemptionLinkReward extends AbstractSpec {
    
    @Test
    public void canCreateRedemptionLinkReward (){
        LoginPage start = new LoginPage(driver);
        List rewardList = start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToRewards()
                .<pageobjects.admin.rewards.List>dismissTutorial()
                .addNewReward()
                .chooseRedemptionLinkFulfillment()
                .provideFulfillmentURL()
                .moveToDetailsPane()
                .fillInName("Redemption Link Reward")
                .fillInDescription("Congrats! You won a link!")
                .chooseType("Gifts")
                .saveReward();
        
        
        
    }
    
    
}
