package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class ExportGroupData extends AbstractSpec {
    
    @Test
    public void initiateExportGroupData (){
    LoginPage login = new LoginPage(driver);
    //missing login step - unsure, we don't use the targeting module so i'm not sure what the login line here would be
    //login.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .selectGroupDropdown()
                .exportGroupData();
                
        //verificaiton is manual - must verify report is received and correct 
    }
    
}
