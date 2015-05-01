
package pageobjects.advocate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class FacebookSignInPage extends Page{

    public FacebookSignInPage(WebDriver driver) {
        super(driver);
    }

    public FacebookSignInPage fillInEmailAddress(String email) {
       findElement(By.cssSelector("#email")).sendKeys(email);
        
        return this;
    }

    public FacebookSignInPage fillInPassword(String password) {
        findElement(By.cssSelector("#pass")).sendKeys(password);
        
        return this;
    }

    public pageobjects.advocate.Dashboard allowAccess() {
        findElement(By.cssSelector("#u_0_2")).click();
        
        return new pageobjects.advocate.Dashboard(getDriver());
        
    }
    
}
