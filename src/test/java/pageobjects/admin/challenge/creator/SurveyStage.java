package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SurveyStage extends Stage {
    
    public static final By VERIFYSELECTOR = By.cssSelector(".stage-details.questions");
    private final By subjectSelector = By.name("subject");
    
    public SurveyStage(WebDriver driver) {
        super(driver);
    }
    
    public SurveyStage fillInSubject(String subject) {
        findInEditor(subjectSelector).sendKeys(subject);
        
        return this;
    }
}
