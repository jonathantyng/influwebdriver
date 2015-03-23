
package specs.admin.advocates;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class FilterAdvocatesByNPS extends AbstractSpec{
    
    @Test
    public void canFilterAdvocatesByDetractor (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByDetractor()
                .pause(500L);
        
    }
    
    @Test
    public void canFilterAdvocatesByNeutral(){
        LoginPage start = new LoginPage (driver);
             start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByNeuturalNPS();
    }
    
 @Test
    public void canFilterAdvocatesByPromoter(){
        LoginPage start = new LoginPage (driver);
             start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByPromoterNPS();
    }

       
 @Test
    public void canFilterAdvocatesByUnknown(){
        LoginPage start = new LoginPage (driver);
             start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByUnknownNPS();
    }

}
