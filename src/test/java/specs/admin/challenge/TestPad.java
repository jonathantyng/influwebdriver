package specs.admin.challenge;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class TestPad extends AbstractSpec {
        
    
    
    @Test 
    
    public void geoCheckInChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Geo CheckIn")
                .addStage()
                .geoCheckInStage()
                .setGeoLocation("191 Niagara Toronto Ontario")
                .validateLocation()
                .saveChallenge();
             
        }

}