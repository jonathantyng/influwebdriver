
package pageobjects.advocate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;


public class LinkedInSignInPage extends Page{

    private final By fillInEmailAddressSelector = By.cssSelector("#session_key-oauthAuthorizeForm");
    private final By fillInPasswordSelector = By.cssSelector("#session_password-oauthAuthorizeForm");
    private final By allowAccessSelector = By.cssSelector("#body > div > form > div.actions > ul > li:nth-child(1) > input");

    public LinkedInSignInPage(WebDriver driver) {
        super(driver);
    }
    
     public LinkedInSignInPage fillInEmailAddress() {
         findElement(fillInEmailAddressSelector).sendKeys("alice.advocate@gmail.com");
         
         return new LinkedInSignInPage (getDriver());
     
     }
    
       public LinkedInSignInPage fillInPassword() {
         findElement(fillInPasswordSelector).sendKeys("macbook18");
         
         return new LinkedInSignInPage (getDriver());
     }
       
       public Dashboard allowAccess() {
           findElement(allowAccessSelector).click();
           
           return new pageobjects.advocate.Dashboard(driver);
       
       }
    
}
