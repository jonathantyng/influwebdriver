package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class CreateReferral extends AbstractSpec {

    @Test
    public void canCreateAReferralChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Referral")
                .fillInName("Referral Challenge")
                .fillInHeadline("Referral Challenge for You!")
                .fillInDescription("Refer your friends")
                .addStage()
                .trackableReferralChallenge()
                .saveChallenge();

    }

}
