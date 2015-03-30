package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.groups.Details;
import specs.admin.AbstractSpec;

public class TargetByEngaged extends AbstractSpec {

    @Test
    public void groupTargetedToEngagedAdvocates() {
        LoginPage login = new LoginPage(driver);
        Details groupEditor = login.loginAdministrator()
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .addNewGroup()
                .generateGroupDetails()
                .switchToTargeting()
                .targetByEngaged()
                .saveGroup();
    }
}
