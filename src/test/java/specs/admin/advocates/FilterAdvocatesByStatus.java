
package specs.admin.advocates;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class FilterAdvocatesByStatus extends AbstractSpec{
    
      @Test
        public void canFilterAdvocatesByEngaged (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByEngaged();
                
        }
        
       
      @Test
        public void canFilterAdvocatesByNotEngaged (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByNotEngaged();
                
        }
}
