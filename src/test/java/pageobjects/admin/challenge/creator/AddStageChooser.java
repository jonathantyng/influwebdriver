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
    private final By linkedInJoinGroupSelector = By.cssSelector("img[alt='Linkedin group join']");
    private final By twitterFollowStageSelector = By.cssSelector("#stages > div:nth-child(3) > ol > li:nth-child(2)");
    private final By shareALinkSelector = By.cssSelector("img[alt='Share link']");
    private final By blogPostSelector = By.cssSelector("img[alt='Blog post']");
    private final By advocateWorkflowSelector = By.cssSelector("img[alt='Advocate acceptance']");
    private final By answerSomeQuestionsSelector = By.cssSelector("#stages > div:nth-child(5) > ol > li:nth-child(1)");
    private final By postToTwitterSelector = By.cssSelector("img[alt='Twitter post']");
    private final By joinAGroupSelector = By.cssSelector("img[alt='Influitive group join']");
    private final By onlineActionStageSelector = By.cssSelector("#stages > div:nth-child(5) > ol > li:nth-child(3)");
    private final By uploadAnImageStageSelector = By.cssSelector("#stages > div:nth-child(5) > ol > li:nth-child(9)");




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
        findElement(linkedInJoinGroupSelector).click();
        
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
        findElement(postToTwitterSelector).click();
        
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
        findElement(joinAGroupSelector).click();
        
        return new JoinAGroupStage(getDriver());
    }

    public AdvocateWorkflowStage advocateWorkflow() {
        findElement(advocateWorkflowSelector).click();
        
        return new AdvocateWorkflowStage(getDriver());
    }

    public AnswerSomeQuestionsStage answerSomeQuestions() {
        findElement(answerSomeQuestionsSelector).click();
        
        return new AnswerSomeQuestionsStage(getDriver());
    }

    public OnlineActionStage onlineAction() {
        findElement(onlineActionStageSelector).click();
        
        return new OnlineActionStage(getDriver());
    }

    public UploadAnImageStage uploadAnImage() {
        findElement(uploadAnImageStageSelector).click();
        
        return new UploadAnImageStage(getDriver());
    }
    
}
