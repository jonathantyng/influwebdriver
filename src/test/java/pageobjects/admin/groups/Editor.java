package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Editor extends Page {
    
    private final By saveButtonSelector = By.id("save-button");
    
    public Editor(WebDriver driver) {
        super(driver);
    }

    public Details saveGroup() {
        findElement(saveButtonSelector).click();
        
        return new Details(getDriver());
    }
}
