package specs.admin;

import org.junit.Test;
import pageobjects.LoginPage;

public class CreateNewAdminGoal extends AbstractSpec {

    @Test
    public void canCreateAdminGoal() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .addNewAdminGoal();
//                    .setTrackableAmount()
//                    .setGoalAmount();
// //                 .clickSave();
//        

    }
}
