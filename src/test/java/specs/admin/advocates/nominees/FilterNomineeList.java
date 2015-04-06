
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
  
     @Test
    public void filterByActiveNominees (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByActiveNominees();
                
        
    }
    
    @Test
    public void filterByArchivedNominees (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByArchivedNominees();
        
    }
    
      @Test
    public void filterNomineeListByDetractorNPSScore (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByDetractorNominee();
        
    }
    
      @Test
    public void filterNomineeListByPromoterNPSScore (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByPromoterNominee();
        
    }
    
      @Test
    public void filterNomineeListByNeutralNPSScore (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByNeutralNominee();
        
    }
    
      @Test
    public void filterNomineeListByUnknownNPSScore (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByUnknownNPSNominees();
        
    }
    
      @Test
    public void filterNomineeListBySource (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .filterByNomineeSource();
        
    }
}
