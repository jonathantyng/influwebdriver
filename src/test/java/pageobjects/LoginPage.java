package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends AbstractPageObject {
    
    private final By userNameFieldSelector = By.cssSelector(".new-session #user_email");
    private final By passwordFieldSelector = By.cssSelector(".new-session #user_password");
    private final By signinButtonSelector = By.cssSelector(".new-session #sign-in-button");
    private final By pageVerificationSelector = By.cssSelector("form.new-session");
    private final By facebookIcon = By.cssSelector(".login-providers #Facebook");
    private final By twitterIcon = By.cssSelector(".login-providers #Twitter");
    private final By LinkedInIcon = By.cssSelector(".login-providers #Linkedin");


    private final String influAdminPassword = "1nflu1t1v3";
    private final String influAdminEmail = "admin@influitive.com";
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }


 
    public pageobjects.admin.Dashboard loginAdministrator() {
        return loginAdministrator(influAdminEmail, influAdminPassword);
    }
    
    public pageobjects.admin.Dashboard loginAdministrator(String username, String password) {
        this.loginUser(username, password);
        return new pageobjects.admin.Dashboard(getDriver());
    }
    
    public pageobjects.advocate.Dashboard loginAdvocate(String username, String password) {
        this.loginUser(username, password);
        return new pageobjects.advocate.Dashboard(getDriver());
    }
    
    public pageobjects.advocate.LinkedInSignInPage loginWithLinkedIn(){
        findElement(By.cssSelector("#logged-out-form-container > div.static-content > section.auth-providers.centered > div > div:nth-child(1) > a")).click();
        
        return new pageobjects.advocate.LinkedInSignInPage(getDriver());
    }
    
    private void loginUser(String username, String password) {
        if (null == findElement(pageVerificationSelector)) {
            throw new RuntimeException("Not on login page");
        }
        
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getSignInButton().click();
    }
    
    private WebElement getUsernameField() {
        return findElement(userNameFieldSelector);
    }
    
    private WebElement getPasswordField() {
        return findElement(passwordFieldSelector);
    }

    private WebElement getSignInButton() {
        return findElement(signinButtonSelector);
    }
 
    private WebElement clickFacebookIcon(){
        return findElement(facebookIcon);
    }
    
    private WebElement clickTwitterIcon(){
        return findElement(twitterIcon);
    }
    
    private WebElement clickLinkedInIcon(){
        return findElement(LinkedInIcon);
    }

}
    