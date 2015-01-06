
package specs.admin.group;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class SearchGroups extends AbstractSpec{
    
    @Test
    public void searchForGroups() {
        LoginPage login = new LoginPage(driver);
        final String employeeGroupName = "Employees";
        final String fanGroupName = "Fan Group";
                
        //verify Employees group is visible
        pageobjects.admin.groups.List groupsPage = login.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
            .navigateToGroups()
            .<pageobjects.admin.groups.List>dismissTutorial();
         
        Assert.assertTrue(groupsPage.hasGroup(employeeGroupName));
           
        //verify Fan group
        groupsPage.filterByJoinCode();
        
        Assert.assertTrue(groupsPage.hasGroup(fanGroupName));
        Assert.assertFalse(groupsPage.hasGroup(employeeGroupName));
        
        //verify search
        groupsPage.filterByJoinCode()
            .searchForGroup(employeeGroupName);
        
        Assert.assertTrue(groupsPage.hasGroup(employeeGroupName));
        Assert.assertFalse(groupsPage.hasGroup(fanGroupName));
    }
    
    
}
