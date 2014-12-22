package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class CreatingFacebook extends AbstractSpec {

    @Test
    public void canCreateAnApprovalChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Facebook")
                .fillInName("Facebook Challenge")
                .fillInDescription("This is a Facebook challenge")
                .fillInHeadline("Facebook Challenge")
                .addStage()
                .facebookLikeStage()
                .addFacebookPageURL("https://www.facebook.com/PepsiCanada")
                .saveChallenge();
    }
}