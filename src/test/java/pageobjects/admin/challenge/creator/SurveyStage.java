package pageobjects.admin.challenge.creator;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;
import specs.admin.CreatingApprovalChallenges;

public class SurveyStage extends Creator {
    public static final By VERIFYSELECTOR = By.cssSelector(".stage-details.questions");
    
    private final By editorSelector = By.cssSelector(".stage.editor");
    private final By subjectSelector = By.name("subject");
    
    public SurveyStage(WebDriver driver) {
        super(driver);
    }
    
    public SurveyStage fillInSubject(String subject) {
        findChildOfVisibleParent(editorSelector, subjectSelector).sendKeys(subject);
        
        return this;
    }
     public SurveyStage pause(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(CreatingApprovalChallenges.class.getName()).log(Level.SEVERE, null, ex);
        }

        return this;
    }    
}
