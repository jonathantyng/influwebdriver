
package specs.admin.advocates;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class SortAdvocates extends AbstractSpec{
 
    @Test
    public void sortAdvocatesByAvailableChallenges(){
    LoginPage start = new LoginPage (driver);
            start.loginAdministrator()
                .navigateToAdvocates()
                .sortAdvocatesbyAvailableChallenges();
    
    }
    
    
    
}
