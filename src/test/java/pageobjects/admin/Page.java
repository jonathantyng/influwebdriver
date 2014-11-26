package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObject;
import pageobjects.admin.challenge.List;

public class Page extends PageObject {

    private final By contextSwitchSelector = By.cssSelector("#context-switcher a");
    private final By challengesNavSelector = By.cssSelector("#main-navigation #Challenges");
    
    public Page(WebDriver driver) {
        super(driver);
    }

    public List navigateToChallenges() {
        findElement(challengesNavSelector).click();
        
        return new List(getDriver());
    }
            
    public pageobjects.advocate.Page switchToAdvocateContext() {
        findElement(contextSwitchSelector).click();
        
        return new pageobjects.advocate.Page(getDriver());
    }
}
