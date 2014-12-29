package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class ExportGroupData extends AbstractSpec {
    
    @Test
    public void initiateExportGroupData (){
    LoginPage login = new LoginPage(driver);
    //login 
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .selectGroupDropdown()
                .exportGroupData();
                
        //verificaiton is manual - must verify report is received and correct 
    }
    
}
