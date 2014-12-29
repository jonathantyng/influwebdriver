
package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class SearchGroups extends AbstractSpec{
    
    @Test
    public void searchForGroups() {
        LoginPage login = new LoginPage(driver)    
                //log in? 
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .searchByName("Employees")
                //verify Employees group is visible 
                .filterByJoinCode()
                //verify Fan group 
                .sortByNumberofAdvocate();
                //no idea how to verify that one
        
    }
    
    
}
