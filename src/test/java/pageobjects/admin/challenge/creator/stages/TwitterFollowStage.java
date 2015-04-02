
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;

 
public class TwitterFollowStage extends Stage {

    private final By twitterUserToFollowSelector = By.name("screen_name");
    private final By validateTwitterUserSelector = By.cssSelector("button.load-preview");
  
    public TwitterFollowStage(WebDriver driver) {
        super(driver);
    }
    
    public TwitterFollowStage addTwitterUserToFollow(String twitterUserToFollow){
        findElement(twitterUserToFollowSelector).sendKeys(twitterUserToFollow);
        
        return this;
    }   

    public TwitterFollowStage validateTwitterUser() {
        findElement(validateTwitterUserSelector).click();
        
                
        return this;
                }
    
}
