package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec {
        
        @Test
    
    public void onlineReviewChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Online Review")
                .addStage()
                .onlineReviewStage()
                .linkToReviewContent("www.reddit.com")
                .<pageobjects.admin.challenge.Creator>pause(5000L);
        

        //insert assertion statement here 
    }
    
}
