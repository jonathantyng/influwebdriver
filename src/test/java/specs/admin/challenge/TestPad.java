
package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec{
    
    
@Test
    public void canCreatePostToTwitterChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("ChallengeName")
                .addStage()
                .postToTwitterStage()
                .chooseTypeOfTweet("Hashtag")
                .inputRequiredContent("#paulsimon")
                .inputDefaultText("#paulsimon")
                .saveChallenge();
                //.publishChallenge();

     }
}
