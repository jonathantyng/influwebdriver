
package specs.admin.rewards;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.rewards.List;
import specs.admin.AbstractSpec;


public class CreateNewTangoCardReward extends AbstractSpec {
    
    @Test
    public void canCreateTangoCardReward (){
        final String rewardName = "Redemption Link Reward";
        
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToRewards()
                .<pageobjects.admin.rewards.List>dismissTutorial()
                .addNewReward()
                .chooseTangoCardFulfilment();
                //.provideFulfillmentURL()
                //.moveToDetailsPane()
                //.fillInName(rewardName)
                //.fillInDescription("Congrats! You won a link!")
                //.chooseType("Gifts")
                //.saveReward()
                //.navigateToRewards();
        
        
    }
    
}
                
                
                
                