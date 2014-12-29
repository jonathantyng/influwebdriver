
package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.groups.EditorTargeting;
import specs.admin.AbstractSpec;

public class TargetedByGroup extends AbstractSpec{
    
    @Test
    public void groupTargetedByExistingGroup (){
    LoginPage login = new LoginPage(driver);
    EditorTargeting groupEditor = login.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
            .navigateToGroups()
            .<pageobjects.admin.groups.List>dismissTutorial()
            .addNewGroup()
            .generateGroupDetails()
            .switchToTargeting()
            .targetToGroups()
            .targetByGroupName("Fan")
            .saveGroup();
    
    //add verification group advocate count = fan advocate count 
        
    }
    
}
