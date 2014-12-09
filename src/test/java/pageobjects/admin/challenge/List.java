package pageobjects.admin.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class List extends Page {

    private final By addChallengeSelector = By.cssSelector(".button-list.primary .highlighted");
    
    public List(WebDriver driver) {
        super(driver);
    }
    
    public TemplateLibrary addNewChallenge() {
        verifyOnChallengesPage();

        findElement(addChallengeSelector).click();
        
        return new TemplateLibrary(getDriver());
    }
    
    private void verifyOnChallengesPage() {
        if( null == findElement(addChallengeSelector) ) {
            throw new RuntimeException("Not on admin challenge list page");
        }
    }
}
