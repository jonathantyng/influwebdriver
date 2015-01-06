package specs.admin.challenge;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.challenge.Show;
import specs.admin.AbstractSpec;

public class CreatingLinkedIn extends AbstractSpec {

    @Test
    public void canCreateAnApprovalChallenge() {
        LoginPage start = new LoginPage(driver);
        Show showPage = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("LinkedIn")
                .fillInName("LinkedIn Challenge")
                .fillInHeadline("Join our LinkedIn Group!")
                .addStage()
                .linkedInJoinGroup()
                .fillInGroupURL("https://www.linkedin.com/groups/Influitives-Community-4449061")
                .validate()
                .saveChallenge();
        
        Assert.assertEquals("LinkedIn Challenge", showPage.getChallengeName());       
    }
}
                
                