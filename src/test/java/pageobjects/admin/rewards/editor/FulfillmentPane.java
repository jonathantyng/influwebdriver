package pageobjects.admin.rewards.editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.rewards.Editor;

public class FulfillmentPane extends Editor {

    final private By manualSelector = By.id("reward_kind_manual");
    
    public FulfillmentPane(WebDriver driver) {
        super(driver);
    }
    
    public FulfillmentPane chooseManualFulfillment() {
        findElement(manualSelector).click();
        
        return this;
    }
            
}
