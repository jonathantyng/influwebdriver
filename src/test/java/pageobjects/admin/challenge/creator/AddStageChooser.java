package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;

public class AddStageChooser extends Creator {
    private final By surveyStageSelector = By.xpath("//img[@alt='Questions']");
    private final By corporateConfirmationStageSelector = By.xpath("//img[@alt='Corporate confirmation']");
    private final By facebookLikeStageSelector = By.cssSelector("img[alt='Facebook like page']");

    public AddStageChooser(WebDriver driver) {
        super(driver);
    }
    
    public SurveyStage surveyStage() {
        findElement(surveyStageSelector).click();
        
        return new SurveyStage(getDriver());
    }
    
    public CorporateConfirmationStage corporateConfirmationStage() {
        findElement(corporateConfirmationStageSelector).click();
        
        return new CorporateConfirmationStage(getDriver());
    }
    
    public FacebookLikeStage facebookLikeStage() {
        findElement(facebookLikeStageSelector).click();
        
        return new FacebookLikeStage(getDriver());
    }

    public LinkedInJoinGroupStage linkedInJoinGroup() {
        findElement(By.cssSelector("img[alt='Linkedin group join']")).click();
        
        return new LinkedInJoinGroupStage(getDriver());
    }
}
