package specs.admin.group;

import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.groups.Details;
import specs.admin.AbstractSpec;

public class TargetByResponse extends AbstractSpec {

    @Test
    public void groupTargetedToResponse() {
        LoginPage login = new LoginPage(driver);
        Details groupEditor = login.loginAdministrator()
                .navigateToGroups()
                .<pageobjects.admin.groups.List>dismissTutorial()
                .addNewGroup()
                .generateGroupDetails()
                .switchToTargeting()
                .targetByResponse()
                .saveGroup();
    }
}