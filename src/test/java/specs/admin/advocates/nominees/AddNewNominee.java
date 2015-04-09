
package specs.admin.advocates.nominees;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.nominees.List;
import specs.admin.AbstractSpec;


public class AddNewNominee extends AbstractSpec {
    
    @Test
        public void addANewNomineeToNomineeList() {
        
            LoginPage start = new LoginPage (driver);
            final String nomineeName = "Shannon Nominee";
            final List nomineeList = start.loginAdministrator()
                    .navigateToAdvocates()
                    .inviteNominees()
                    .addANewNominee()
                    .addNomineeEmail()
                    .addNomineeName(nomineeName)
                    .addNomineeCompany()
                    .addNomineeTitle()
                    .addNomineeSave();
                   
            Assert.assertEquals(nomineeName, nomineeList.getNomineeName());
        }
   
}
