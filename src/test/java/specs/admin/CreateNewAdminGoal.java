package specs.admin;

import org.junit.Test;
import pageobjects.LoginPage;

public class CreateNewAdminGoal extends AbstractSpec {

    @Test
    public void canCreateAdminGoal() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .addNewAdminGoal();
//                    .setTrackableAmount()
//                    .setGoalAmount();
// //                 .clickSave();
//        

    }
}
