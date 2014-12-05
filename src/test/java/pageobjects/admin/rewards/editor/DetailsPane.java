package pageobjects.admin.rewards.editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.rewards.Editor;

public class DetailsPane extends Editor {
    private final By headlineSelector = By.id("reward_name");
    private final By rewardTypeSelector = By.id("reward_reward_type_id");
    private final By descriptionSelector = By.id("reward_description");
    
    public DetailsPane(WebDriver driver) {
        super(driver);
    }

    public DetailsPane fillInName(String name) {
        findElement(headlineSelector).sendKeys(name);
        
        return this;
    }

    public DetailsPane chooseType(String rewardType) {
        findParentOf(rewardTypeSelector)
                .findElement(By.cssSelector(".select2-container"))
                .click();

        typeInSelect2Input(rewardType);
        chooseSelect2Match();

        return this;
    
    }

    public DetailsPane fillInDescription(String someDescription) {
        findElement(descriptionSelector).sendKeys(someDescription);
        
        return this;
    }
}
