
package specs.advocate;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class LoginSocial extends AbstractSpec{
    
    @Test
    public void canLogInWithLinkedIn (){
        LoginPage start = new LoginPage(driver);
        start.loginWithLinkedIn()
            .fillInEmailAddress()
            .fillInPassword()
            .allowAccess();
                
    }
    
}
