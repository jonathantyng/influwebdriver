

package specs.admin.advocates;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class SearchForAdvocate extends AbstractSpec{
    
    @Test
    public void searchForAdvocateOnAdvocateList (){
    
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .searchAdvocateName()
                .pause(5000L);
    
    } 
    
}
