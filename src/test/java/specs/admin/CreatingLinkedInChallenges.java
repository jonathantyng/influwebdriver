package specs.admin;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.challenge.Show;

public class CreatingLinkedInChallenges extends AbstractSpec {

    @Test
    public void canCreateAnApprovalChallenge() {
        LoginPage start = new LoginPage(driver);
        Show showPage = start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
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
                
                