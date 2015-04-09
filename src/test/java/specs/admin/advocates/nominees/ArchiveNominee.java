
package specs.admin.advocates.nominees;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class ArchiveNominee extends AbstractSpec{
    
    @Test
    public void canArchiveNominee() {
    LoginPage start = new LoginPage (driver);
    start.loginAdministrator()
            .navigateToAdvocates()
            .inviteNominees()
            .selectNomineeForArchive()
            .archiveNominee();
            
    }
    
}
