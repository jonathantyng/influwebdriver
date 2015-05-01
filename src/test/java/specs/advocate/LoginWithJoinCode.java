
package specs.advocate;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class LoginWithJoinCode extends AbstractSpec{
 
    @Test
    public void canLoginWithJoinCode (){
        LoginPage start = new LoginPage(driver);
        start.loginWithJoinCode()
                .enterJoinCode();
    
    }
    
    
}
