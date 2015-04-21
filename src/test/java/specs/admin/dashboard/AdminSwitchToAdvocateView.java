
package specs.admin.dashboard;

import junit.framework.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;


public class AdminSwitchToAdvocateView extends AbstractSpec{
    
    @Test
    public void adminCanViewAdvocateView (){
        LoginPage start = new LoginPage(driver);
        
        start.loginAdministrator()
                .navigateToAdvocateView();
        
        //Assert.assertEquals(homeMenu, advocateDashboard.getHomeMenu());
        
    }

}
