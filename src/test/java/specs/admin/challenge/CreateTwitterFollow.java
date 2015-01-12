
package specs.admin.challenge;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class CreateTwitterFollow extends AbstractSpec{
    
    @Test
    
    public void createTwitterFollowChallenge () {
          LoginPage start = new LoginPage(driver);
            start.loginAdministrator()
                    .navigateToChallenges()
                    .<pageobjects.admin.challenge.List>dismissTutorial()
                    .addNewChallenge()
                    .createBlankChallenge()
                    .fillInName("Twitter Follow")
                    .fillInDescription("Follow us on Twitter")
                    .fillInHeadline("Tweet Tweet!")
                    .addStage()
                    .twitterFollowStage();
                    //.addTwitterFollowStageDetails
                    //.saveChallenge();
                    //addAssertion
            }
                    
            
        }       
        
        
    
   
    
    

