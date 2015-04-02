
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;

public class FacebookLikeStage extends Stage {

    private final By facebookURLSelector = By.name("params.facebook_page_url");
    
    public FacebookLikeStage(WebDriver driver) {
        super(driver);
    }

    public FacebookLikeStage addFacebookPageURL(String facebookPageURL) {
        findInEditor(facebookURLSelector).sendKeys(facebookPageURL);
        
        return this;
    }
    
      
}
