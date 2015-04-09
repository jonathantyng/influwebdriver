
package specs.admin.experiences;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class CreateExperience extends AbstractSpec{

    @Test
    public void canCreateNewExperience (){
    LoginPage start = new LoginPage(driver);
    start.loginAdministrator()
         .navigateToExpereinces();
    
    }
    
    
}
