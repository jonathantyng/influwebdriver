package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Details extends Page {

    private final By groupNameSelector = By.cssSelector(".details .name");
    private final By addAdvocateButton = By.cssSelector(".button-list.primary .dialog-link" );
    

    public Details(WebDriver driver) {
        super(driver);
    }

    public String getGroupName() {
        return findElement(groupNameSelector).getText();
    }

    public AddAdvocates addAdvocates() {
        findElement(addAdvocateButton).click();
        
        return new AddAdvocates(getDriver());
    }
   
}
