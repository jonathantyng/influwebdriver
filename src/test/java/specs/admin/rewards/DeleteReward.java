package specs.admin.rewards;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class DeleteReward extends AbstractSpec {

    @Test
    public void canDeleteReward() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToRewards()
                .<pageobjects.admin.rewards.List>dismissTutorial()
                .addNewReward()
                .makeBasicReward("Some Reward")
                .navigateToRewards()
                .deleteNewReward()
                .confirmDelete()
                .pause(5000L);
                

        //assert reward is not on rewards list
        
    }

}
