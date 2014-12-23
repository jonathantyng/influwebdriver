package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.groups.EditorTargeting;
import specs.admin.AbstractSpec;


public class CreateExplicit extends AbstractSpec {
    
    @Test
    public void groupAddAdvocateShouldContainAdvocate() {
        LoginPage login = new LoginPage(driver);
        EditorTargeting groupEditor = login.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
            .navigateToGroups()
            .<pageobjects.admin.groups.List>dismissTutorial()          
            .addNewGroup()
            .generateGroupDetails()
            .saveGroup()
            .addAdvocates()
            .selectAdvocateByName("Alice Advocate")
            .saveExplicitAdvocate();
            
                
                
    }
   
    
}
