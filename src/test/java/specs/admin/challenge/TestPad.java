package specs.admin.challenge;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.challenge.Show;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec {
    

    @Test

  public void getAppChallenge() {
        
        
        LoginPage start = new LoginPage(driver);
        final String challengeName = "GetApp Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .getAppExchangeStage()
                .linkToGetAppWebsite()
                .loadGetAppWebsite()
                .saveChallenge();
                
                
       Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }
    
}
