
package specs.admin.advocates.nominees;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class AddNewNominee extends AbstractSpec {
    
    @Test
        public void addANewNomineeToNomineeList() {
        
            LoginPage start = new LoginPage (driver);
            start.loginAdministrator()
                    .navigateToAdvocates()
                    .inviteNominees()
                    .addANewNominee()
                    .addNomineeEmail()
                    .addNomineeName()
                    .addNomineeCompany()
                    .addNomineeTitle()
                    .addNomineeSave();
                   
           
        
        }
    
    

    
    
    
    
}
