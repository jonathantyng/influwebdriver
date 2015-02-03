package pageobjects.admin.rewards.editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.rewards.Editor;
import pageobjects.admin.rewards.List;

public class FulfillmentPane extends Editor {

    final private By manualSelector = By.id("reward_kind_manual");
    final private By redemptionLinkFulfillmentSelector = By.cssSelector("#reward_provider_printfection");
      
    
    public FulfillmentPane(WebDriver driver) {
        super(driver);
    }
    
    public FulfillmentPane chooseManualFulfillment() {
        findElement(manualSelector).click();
        
        return this;
    }

    public FulfillmentPane chooseRedemptionLinkFulfillment() {
        findElement(redemptionLinkFulfillmentSelector).click();
        
        return this;
    }

    public FulfillmentPane provideFulfillmentURL() {
        findElement(By.cssSelector("#reward_redemption_links")).sendKeys("http://www.reddit.com");
        
        return this;
    }

    public FulfillmentPane chooseAdvocateChosenCharityFor(Integer i) {
        findElement(By.id("reward_provider_first_giving")).click();
        findElement(By.id("advocate_chosen")).click();
        findElement(By.id("reward_amount")).sendKeys(i.toString());
        
        return this;
    }
          
}
