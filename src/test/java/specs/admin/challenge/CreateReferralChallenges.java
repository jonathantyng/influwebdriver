package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class CreateReferralChallenges extends AbstractSpec {

    @Test
    public void canCreateAReferralChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
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
