package specs.admin.challenge;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.challenge.Show;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec {
    

    @Test
    public void canCreatePostToTwitterChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Post to Twitter";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .postToTwitterStage()
                .chooseTypeOfTweet("Hashtag")
                .<pageobjects.admin.challenge.creator.stages.TwitterPost>pause(5000L)
                .inputRequiredContent("#paulsimon")
                .inputDefaultText("#paulsimon is the best")
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());
        
    }
    
}
