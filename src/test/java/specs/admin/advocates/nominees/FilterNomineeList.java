
package specs.admin.advocates.nominees;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class FilterNomineeList extends AbstractSpec {

    @Test
    public void filterNomineeListByName (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByNomineeName();
        
    }
    
    
    
}
