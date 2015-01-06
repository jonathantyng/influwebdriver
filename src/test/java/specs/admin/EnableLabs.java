package specs.admin;

import org.junit.Test;
import pageobjects.LoginPage;

public class EnableLabs extends AbstractSpec {

    @Test
    public void enableInfluitiveLabs() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator();
//                    .navigateToAdminMenu()
//                    .clickOnSettings()
//                    .clickOnSystem()
//                    .clickOnInfluitiveLabs()
//                    .enableImprovedAdvocateOnboarding()
//                    .enableNomineeNurturing()
//                    .enableRewardTemplateLibrary();            
    } 

}
