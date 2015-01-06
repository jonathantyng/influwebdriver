package specs.admin.group;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.groups.Details;
import specs.admin.AbstractSpec;

public class CreateSimple extends AbstractSpec {

    @Test
    public void canCreateNewGroup() {
        LoginPage start = new LoginPage(driver);
        final String groupName = "Sanity Group";
        
        Details detailsPage = start.loginAdministrator()
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .addNewGroup()
                .fillInName(groupName)       
                .saveGroup();

        Assert.assertEquals(groupName, detailsPage.getGroupName());
    }
}
