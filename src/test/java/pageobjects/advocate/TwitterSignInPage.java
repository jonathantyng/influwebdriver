
package pageobjects.advocate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class TwitterSignInPage extends Page{

    public TwitterSignInPage(WebDriver driver) {
        super(driver);
    }

    public TwitterSignInPage fillInUserNameOrEmail(String email) {
        findElement(By.cssSelector("#oauth_form > fieldset.sign-in > div.row.user > label")).sendKeys(email);
         
        return this;
    }

    public TwitterSignInPage fillInPassword(String password) {
        findElement(By.cssSelector("#oauth_form > fieldset.sign-in > div.row.password > label")).sendKeys(password);
    
        return this;
    }

    public Dashboard allowAccess() {
        findElement(By.cssSelector("#allow")).click();
        
        return new pageobjects.advocate.Dashboard(getDriver());
    
    }
    
    
    
}
