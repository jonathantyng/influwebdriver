
package pageobjects.advocate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;


public class JoinCodePage extends Page{
    
    public JoinCodePage(WebDriver driver) {
        super(driver);
    }

    public pageobject.advocate.AccountCreationPage enterJoinCode(String joinCode) {
        findElement(By.cssSelector("#group_token")).sendKeys(joinCode);
        
        return new pageobject.advocate.AccountCreationPage (getDriver());
    }
    
    
    
}
