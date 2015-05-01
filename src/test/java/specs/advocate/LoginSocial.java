
package specs.advocate;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.advocate.Dashboard;
import specs.admin.AbstractSpec;


public class LoginSocial extends AbstractSpec{
    
    @Test
    public void canLogInWithLinkedIn (){
        LoginPage start = new LoginPage(driver);
        final Dashboard dashboard = start.loginWithLinkedIn()
            .fillInEmailAddress()
            .fillInPassword()
            .allowAccess();
        
        Assert.assertTrue(dashboard.hasVisiblePoints());
                
       //Assert.assertEquals(challengeName, challengeShow.getChallengeName());
    }
    
    
    @Test
    public void canLogInWithFacebook (){
        LoginPage start = new LoginPage(driver);
        final Dashboard dashboard = start.loginWithFacebook()
            .fillInEmailAddress("alice.advocate@gmail.com")
            .fillInPassword("macbook19")
            .allowAccess();
        
        Assert.assertTrue(dashboard.hasVisiblePoints());
                
    }
    
    
    @Test 
    public void canLogInWithTwitter(){
        LoginPage start = new LoginPage(driver);
        start.loginWithTwitter()
                .fillInUserNameOrEmail();
        
        Assert.assertTrue(dashboard.hasVisiblePoints());
    
    }
}
