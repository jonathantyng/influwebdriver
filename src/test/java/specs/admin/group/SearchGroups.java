
package specs.admin.group;

import java.util.Arrays;
import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class SearchGroups extends AbstractSpec{
    
    @Test
    public void searchForGroups() {
        LoginPage login = new LoginPage(driver);
        final String employeeGroupName = "Employees";

        //verify Employees group is visible
        pageobjects.admin.groups.List groupsPage = login.loginAdministrator()
            .navigateToGroups()
            .<pageobjects.admin.groups.List>dismissTutorial()
            .searchForGroup(employeeGroupName);
            
        java.util.List<String> groupNames = groupsPage.getGroupNames();
        java.util.List<String> expectedNames = Arrays.asList(employeeGroupName);
        
        Assert.assertEquals(expectedNames, groupNames);        
//        //verify Fan group
//        groupsPage.filterByJoinCode();
//        
//        Assert.assertTrue(groupsPage.hasGroup(fanGroupName));
//        Assert.assertFalse(groupsPage.hasGroup(employeeGroupName));
//        
//        //verify search
//        groupsPage.filterByJoinCode()

//        
//        Assert.assertTrue(groupsPage.hasGroup(employeeGroupName));

    }
    
    @Test
    public void filterShouldFilterGroupList() {
        LoginPage login = new LoginPage(driver);
        final String groupName = "Fan Group";
        
        pageobjects.admin.groups.List groupsPage = login.loginAdministrator()
            .navigateToGroups()
            .<pageobjects.admin.groups.List>dismissTutorial()
            .viewGroup(groupName);
//            .editGroup()
//            .assignJoinCode("fan")
//            .saveGroup()
//            .navigateToGroups()
//            .filterByJoinCode();
            
        java.util.List<String> groupNames = groupsPage.getGroupNames();
        java.util.List<String> expectedNames = Arrays.asList(groupName);
        
        Assert.assertEquals(expectedNames, groupNames);     
    }
    
    
}
