package specs.admin;

import org.junit.Test;
import pageobjects.LoginPage;

public class CreatingApprovalChallenges extends AbstractSpec {

    @Test
    public void canCreateAnApprovalChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Survey")
                .fillInName("Approval Challenge")
                .fillInHeadline("Approval Challenge")
                .fillInDescription("Approval challenge to Admin approving advocates during the first stage of a multi stage  challenge")
                .featureTheChallenge()
                .addStage()
                .surveyStage()
                .fillInSubject("The first question issss??")
                .addStage()
                .surveyStage()
                .fillInSubject("The second question issss?")
                .addStage()
                .corporateConfirmationStage()
                .saveChallenge();
    }
}
