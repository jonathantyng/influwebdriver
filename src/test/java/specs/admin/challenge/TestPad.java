
package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec{
   

     @Test 
     public void createAdvocateWorkflowChallenge(){
      LoginPage start = new LoginPage(driver);
            start.loginAdministrator()     
             .navigateToChallenges()
             .<pageobjects.admin.challenge.List>dismissTutorial()
             .addNewChallenge()
             .createBlankChallenge()
             .generateDetails("Advocate Workflow")
             .addStage()
             .advocateWorkflow()
             .switchToTargeting() 
             .targetToSpecificAdvocates()
             .setAdvocateInfoCriteria()
             .provideAdvocatePosition("CEO")
             .pause(5000L);
             //.saveChallenge();
            
     }
     
}
