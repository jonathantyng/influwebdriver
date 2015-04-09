
package specs.admin.challenge;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.challenge.Show;
import specs.admin.AbstractSpec;

public class CreateChallengeFromTemplate extends AbstractSpec {
    
    @Test
    public void canCreateChallengeFromTemplate() {
        
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Brad's Totally Kickass Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .selectChallengeFromTemplate()
                .saveChallenge();
        
        Assert.assertEquals(challengeName, challengeShow.getChallengeName());
    
    
    }
    
}
