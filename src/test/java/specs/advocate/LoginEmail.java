
package specs.advocate;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.advocate.Dashboard;
import specs.admin.AbstractSpec;


public class LoginEmail extends AbstractSpec{
 
    @Test
    public void canLogInWithEmail() {
        LoginPage start = new LoginPage(driver);
        final Dashboard dashboard = start.loginAdvocate();
                
        Assert.assertTrue(dashboard.hasVisiblePoints());
    
    }
    
}
