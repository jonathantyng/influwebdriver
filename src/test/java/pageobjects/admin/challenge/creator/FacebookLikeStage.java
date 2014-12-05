
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;

class FacebookLikeStage extends Creator {

    final private By editorSelector = By.cssSelector(".editor.stage");
    private final By facebookURLSelector = By.name("params.facebook_page_url");
    
    public FacebookLikeStage(WebDriver driver) {
        super(driver);
    
    }

    public FacebookLikeStage addFacebookPageURL(String facebookPageURL) {
        findChildOfVisibleParent(editorSelector, facebookURLSelector).sendKeys(facebookPageURL);
        
        return this;
    }
    
      
}
