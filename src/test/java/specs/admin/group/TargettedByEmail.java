package specs.admin.group;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.groups.EditorTargeting;
import specs.admin.AbstractSpec;

public class TargettedByEmail extends AbstractSpec {
    
    @Test
    public void groupTargettedByNameOnlyHasThatPerson() {
        LoginPage login = new LoginPage(driver);
        EditorTargeting groupEditor = login.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .addNewGroup()
                .generateGroupDetails()
                .switchToTargetting()
                .addAdvocateInfoCriteria()
                .targetByEmail("alice.advocate@gmail.com");
        
        Assert.assertEquals("1", groupEditor.getMatchedAdvocateCount());
        
        String memberCount = groupEditor.saveGroup()
            .waitForAndGetNewMembershipCount();
        
        Assert.assertEquals("1", memberCount);
    }
}
