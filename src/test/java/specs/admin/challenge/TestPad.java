package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec {
    @Test
    public void corporateConfirmationChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Upload an Image")
                .addStage()
                .advocateWorkflow()
                .addStage()
                .corporateConfirmationStage()
                .saveChallenge();

    }

}
