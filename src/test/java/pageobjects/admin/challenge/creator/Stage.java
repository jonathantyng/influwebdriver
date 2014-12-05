package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.admin.challenge.Creator;

public class Stage extends Creator {

    private final By editorSelector = By.cssSelector(".editor.stage");
    
    public Stage(WebDriver driver) {
        super(driver);
    }
    
    protected WebElement findInEditor(By selector) {
        return findChildOfVisibleParent(editorSelector, selector);
    }
}
