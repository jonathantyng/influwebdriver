package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;

public class AddStageChooser extends Creator {
    private final By surveyStageSelector = By.xpath("//img[@alt='Questions']");
    private final By corporateConfirmationStageSelector = By.xpath("//img[@alt='Corporate confirmation']");
    private final By facebookLikeStageSelector = By.cssSelector("img[alt='Facebook like page']");
    private final By referralStageSelector = By.cssSelector("img[alt='Refer prospect']");
    private final By LinkedInJoinGroupSelector = By.cssSelector("img[alt='Linkedin group join']");
    private final By twitterFollowStage = By.cssSelector("#stages > div:nth-child(3) > ol > li:nth-child(2)");


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
        findElement(LinkedInJoinGroupSelector).click();
        
        return new LinkedInJoinGroupStage(getDriver());
    }
    
    public ReferralChallenge trackableReferralChallenge() {
        findElement(referralStageSelector).click();
        
        return new ReferralChallenge(getDriver());
    }

    public TwitterFollowStage twitterFollowStage() {
        findElement(twitterFollowStage).click();
        
        return new TwitterFollowStage(getDriver());
                
    }
 

}
