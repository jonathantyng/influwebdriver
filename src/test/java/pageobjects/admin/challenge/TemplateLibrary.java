package pageobjects.admin.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;
import pageobjects.admin.challenge.creator.Details;

public class TemplateLibrary extends Page {
    private final By verifySelector = By.cssSelector(".challenge-template-library");
    private final By newChallengeSelector = By.cssSelector("#create-new-challenge");
    
    public TemplateLibrary(WebDriver driver) {
        super(driver);
    }
    
    public Details createBlankChallenge() {
        findElement(newChallengeSelector).click();
        
        return new Details(getDriver());
    }
    
    private void verify() {
        if (null == findElement(verifySelector) ) {
            throw new RuntimeException("Not on the template library");
        }
    }
}
