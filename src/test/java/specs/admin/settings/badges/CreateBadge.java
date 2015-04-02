
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
                    .navigateToScoringAndAchievement()
                    .pause(5000L);
                
        
        
    
    
    }
    
    
    
    
    
    
}
