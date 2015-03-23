
package specs.admin.advocates;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;
import pageobjects.admin.Page;

public class FilterAdvocatesByLevel extends AbstractSpec{
    
    @Test
    public void canFilterAdvocatesByFan (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByFan()
                .pause(500L);
                
           //add assertion that advocates on page are fan only
            
    
    }
    
    @Test
    public void canFilterAdvocatesbyAdvocate (){
    
    LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByAdvocate()
                .pause(500L);
        
        //add assertion that advocate level advocates are visible on page only)
    }
    
    @Test
    public void canFilterAdvocatesbyEvangelist (){
    
    LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByEvangelist()
                .pause(500L);
        
        //add assertion that evangelist advocates are visible
    }
    

    @Test
    public void canFilterAdvocatesbyRockstar (){
    
    LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .filterAdvocatesByRockstar();
                
                
        
        //add assertion that rockstar advocates are visible
    }
    
}
