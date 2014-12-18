package specs.admin;

import org.junit.Test;
import pageobjects.LoginPage;

public class EnableLabs extends AbstractSpec {

    @Test
    public void enableInfluitiveLabs() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator("admin@influitive.com", "1nflu1t1v3");
                    // .navigateToSettings();
    } 
}
