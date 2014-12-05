package pageobjects.admin.rewards;

import pageobjects.admin.rewards.editor.DetailsPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Editor extends Page {
    private final By detailsSelector = By.cssSelector("#tab_details a");
    private final By saveButtonSelector = By.id("save-button");
  
    public Editor(WebDriver driver) {
        super(driver);
    }
   
    public DetailsPane moveToDetailsPane() {
        findElement(detailsSelector).click();
        
        return new DetailsPane(getDriver());
    }

    public List saveReward() {
        findElement(saveButtonSelector).click();
        
        return new List(getDriver());
    }
}
