
package specs.admin.settings.badges;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class CreateBadge extends AbstractSpec{
    
    @Test
    public void canCreateNewBadge() {
        
        LoginPage start = new LoginPage(driver);
            start.loginAdministrator()
                    .navigateToSettings()
                    .navigateToLevelsAndBadges()                    
                    .<pageobjects.admin.settings.List>dismissTutorial()
                    .addNewBadge();
                    
                    //.addBadgeName();
            
               
      
    }
}
