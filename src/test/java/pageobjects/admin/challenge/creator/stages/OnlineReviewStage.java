
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;


public class OnlineReviewStage extends Stage{

    public OnlineReviewStage(WebDriver driver) {
        super(driver);
    
    }

    public OnlineReviewStage linkToReviewContent(String ReviewURL) {
        findInEditor(By.name("params.url")).sendKeys(ReviewURL);
    
        return this;
                
        }
    
}
