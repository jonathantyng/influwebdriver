
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;


public class AppExchangeStage extends Stage{

    public AppExchangeStage(WebDriver driver) {
        super(driver);
    }

    public AppExchangeStage linkToAppExchangeWebsite() {
        findElement(By.cssSelector("#c97 > div > div > fieldset > section > label > input")).sendKeys("https://appexchange.salesforce.com/listingDetail?listingId=a0N300000016YDkEAM");
        
        return this;
    }
    
    
    
    
}
