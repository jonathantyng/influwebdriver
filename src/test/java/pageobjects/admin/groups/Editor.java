package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Editor extends Page {
    
    private final By saveButtonSelector = By.id("save-button");
    private final By targettingTabSelector = By.cssSelector("#tab_targeting");
    
    public Editor(WebDriver driver) {
        super(driver);
    }

    public Details saveGroup() {
        findElement(saveButtonSelector).click();
        
        return new Details(getDriver());
    }
    
    public EditorTargeting switchToTargeting() {
        findElement(targettingTabSelector).click();
        
        return new EditorTargeting(getDriver());
    }
}
