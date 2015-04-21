
package specs.admin.settings;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class NavigateToSettings extends AbstractSpec {
 
    @Test
    public void canNavigateToSettingsAsAdmin() {
    
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator("Shannon@influitive.com", "macbook18")
                .navigateToSettings();
        
    
    }       
}
