package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends PageObject {
    
    private final By userNameFieldSelector = By.cssSelector(".new-session #user_email");
    private final By passwordFieldSelector = By.cssSelector(".new-session #user_password");
    private final By signinButtonSelector = By.cssSelector(".new-session #sign-in-button");
    private final By pageVerificationSelector = By.cssSelector("form.new-session");
    private final By facebookIcon = By.cssSelector(".login-providers #Facebook");
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }
 
    public pageobjects.admin.Dashboard loginAdministrator() {
        return loginAdministrator("admin@influitive.com", "1nflu1t1v3");
    }
    
    public pageobjects.admin.Dashboard loginAdministrator(String username, String password) {
        this.loginUser(username, password);
        return new pageobjects.admin.Dashboard(getDriver());
    }
    
    public pageobjects.advocate.Dashboard loginAdvocate(String username, String password) {
        this.loginUser(username, password);
        return new pageobjects.advocate.Dashboard(getDriver());
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
}
    