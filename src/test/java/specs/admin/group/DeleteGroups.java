
package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class DeleteGroups extends AbstractSpec{
    
    @Test
    public void deleteEmptyGroup(){
        LoginPage login = new LoginPage(driver);
        //login step - unsure, we don't use the targeting module so i'm not sure what the line here would be
        //login.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
            .navigateToGroups()
            .<pageobjects.admin.groups.List>dismissTutorial()
            .selectDropdownOnEmptyGroup()
            .deleteGroup();
            
                    
        //verify group has been deleted        
        
        
                   
        }
    
    @Test
    public void attemptDeletingGroupWithAdvocates(){
        LoginPage login = new LoginPage(driver);
        //login step - unsure, we don't use the targeting module so i'm not sure what the line here would be
        //login.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
            .navigateToGroups()
            .<pageobjects.admin.groups.List>dismissTutorial()
            .selectDropdownOnGroupWithAdvocate()
            .deleteGroup();
            
        //verify group has not been deleted
        
    }
    
}
