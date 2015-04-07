package specs.admin.challenge;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.challenge.Show;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec {
    


  @Test
    public void createShareALinkChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Share A Link Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .shareALink()
                .fillInLinkDetails("reddit.com")
                .loadURL()
                .addDefaultTwitterText()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }
    
}
