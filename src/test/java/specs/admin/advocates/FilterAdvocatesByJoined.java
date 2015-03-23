package specs.admin.advocates;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class FilterAdvocatesByJoined extends AbstractSpec{
    
    
    @Test
    public void filterAdvocatesbyJoined (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
            .navigateToAdvocates()
            .filterAdvocatesbyJoined();
        
    }
    
    
    @Test
    public void filterAdvocatesbyNotJoined (){
        LoginPage start = new LoginPage (driver);
        start.loginAdministrator()
            .navigateToAdvocates()
            .filterAdvocatesbyNotJoined();
        
    }
    
    
            
                
    
    
    }
    
    

