package specs.admin;

import org.junit.Test;
import pageobjects.LoginPage;

public class SimpleLogin extends AbstractSpec {

    @Test
    public void canLogin() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator();
    }

}
