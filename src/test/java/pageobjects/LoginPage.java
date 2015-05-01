package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.advocate.Dashboard;


public class LoginPage extends AbstractPageObject {
    
    private final By userNameFieldSelector = By.cssSelector(".new-session #user_email");
    private final By passwordFieldSelector = By.cssSelector(".new-session #user_password");
    private final By signinButtonSelector = By.cssSelector(".new-session #sign-in-button");
    private final By pageVerificationSelector = By.cssSelector("form.new-session");
    private final By facebookIcon = By.cssSelector(".login-providers #Facebook");
    private final By twitterIcon = By.cssSelector(".login-providers #Twitter");
    private final By LinkedInIcon = By.cssSelector(".login-providers #Linkedin");
    private final By loginWithLinkedInSelector = By.cssSelector("#logged-out-form-container > div.static-content > section.auth-providers.centered > div > div:nth-child(1) > a");
    private final By loginWithFacebookSelector = By.cssSelector("#logged-out-form-container > div.static-content > section.auth-providers.centered > div > div:nth-child(3) > a > img");
    private final By loginWithTwitterSelector = By.cssSelector("#logged-out-form-container > div.static-content > section.auth-providers.centered > div > div:nth-child(2) > a > img");
    private final String influAdminPassword = "1nflu1t1v3";
    private final String influAdminEmail = "admin@influitive.com";
    private final String influAdvocateEmail = "alice.advocate@gmail.com";
    private final String influAdvocatePassword = "macbook18";
    
    public Dashboard loginAdvocate;
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public pageobjects.advocate.Dashboard loginAdvocate() {
        return loginAdvocate(influAdvocateEmail, influAdvocatePassword);
    }
    
    public pageobjects.advocate.Dashboard loginAdvocate(String Email, String Password){
        this.loginUser(Email, Password);
        return new pageobjects.advocate.Dashboard(getDriver());
    }

    public pageobjects.admin.Dashboard loginAdministrator() {
        return loginAdministrator(influAdminEmail, influAdminPassword);
    }
    
    public pageobjects.admin.Dashboard loginAdministrator(String username, String password) {
        this.loginUser(username, password);
        return new pageobjects.admin.Dashboard(getDriver());
    }
    
    public pageobjects.advocate.LinkedInSignInPage loginWithLinkedIn(){
        findElement(loginWithLinkedInSelector).click();
        
        return new pageobjects.advocate.LinkedInSignInPage(getDriver());
    }
    
    public pageobjects.advocate.FacebookSignInPage loginWithFacebook() {
        findElement(loginWithFacebookSelector).click();
        
        return new pageobjects.advocate.FacebookSignInPage (getDriver());
    }
    
    public pageobjects.advocate.TwitterSignInPage loginWithTwitter(){
        findElement(loginWithTwitterSelector).click();
        
        return new pageobjects.advocate.TwitterSignInPage (getDriver());
        
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
    