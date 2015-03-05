package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;
import pageobjects.admin.challenge.Show;

public class AddStageChooser extends Creator {
    private final By surveyStageSelector = By.xpath("//img[@alt='Questions']");
    private final By corporateConfirmationStageSelector = By.xpath("//img[@alt='Corporate confirmation']");
    private final By facebookLikeStageSelector = By.cssSelector("img[alt='Facebook like page']");
    private final By referralStageSelector = By.cssSelector("img[alt='Refer prospect']");
    private final By LinkedInJoinGroupSelector = By.cssSelector("img[alt='Linkedin group join']");
    private final By twitterFollowStageSelector = By.cssSelector("#stages > div:nth-child(3) > ol > li:nth-child(2)");
    private final By shareALinkSelector = By.cssSelector("img[alt='Share link']");
    private final By blogPostSelector = By.cssSelector("img[alt='Blog post']");
    private final By AdvocateWorkflowSelector = By.xpath("//img[@alt='Advocate acceptance']]");



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
        findElement(twitterFollowStageSelector).click();
        
        return new TwitterFollowStage(getDriver());
                
    }

    public TwitterPost postToTwitterStage() {
        findElement(By.cssSelector("img[alt='Twitter post']")).click();
        
        return new TwitterPost(getDriver());
    }

    public ShareLink shareALink() {
        findElement(shareALinkSelector).click();
        
        return new ShareLink(getDriver());
    }

    public CommentOnBlogPost commentOnABlog() {
        findElement(blogPostSelector).sendKeys("http://www.reddit.com");
    
        return new CommentOnBlogPost(getDriver());
    }

    public JoinAGroupStage joinAGroup() {
        findElement(By.cssSelector("img[alt='Influitive group join']")).click();
        
        return new JoinAGroupStage(getDriver());
    }

    public AdvocateWorkflowStage advocateWorkflowStage() {
        findElement(AdvocateWorkflowSelector).click();
        
        return new AdvocateWorkflowStage (getDriver());
    }
    
}
