
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 
public class TwitterFollowStage extends Stage {

    private final By twitterUserToFollowSelector = By.name("screen_name");
    private final By validateTwitterUserSelector = By.cssSelector("#c75 > div > div > fieldset > div.column.larger-width > label > div:nth-child(1) > button");
  
    public TwitterFollowStage(WebDriver driver) {
        super(driver);
    }
    
    public TwitterFollowStage addTwitterUserToFollow(String twitterUserToFollow){
        findElement(twitterUserToFollowSelector).sendKeys(twitterUserToFollow);
        
        return this;
    }   

    public TwitterFollowStage validateTwitterUser() {
        findElement(validateTwitterUserSelector).click(); 
        waitForElement(By.cssSelector("#c75 > div > div > fieldset > div.twitter-preview.hide.callout.column.x-husky-width"));
                
        return this;
                }
    
}
