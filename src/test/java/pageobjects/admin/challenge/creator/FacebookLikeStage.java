
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;

public class FacebookLikeStage extends Creator {

    private final By editorSelector = By.cssSelector(".editor.stage");
    private final By facebookURLSelector = By.name("params.facebook_page_url");
    
    public FacebookLikeStage(WebDriver driver) {
        super(driver);
    }

    public FacebookLikeStage addFacebookPageURL(String facebookPageURL) {
        findChildOfVisibleParent(editorSelector, facebookURLSelector).sendKeys(facebookPageURL);
        
        return this;
    }
    
      
}
