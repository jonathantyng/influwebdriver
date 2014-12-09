package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class List extends Page {

    private final By addGroupSelector = By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a");
    
    public List(WebDriver driver) {
        super(driver);
    }
    
    private void verifyOnGroupsPage() {
        if( null == findElement(addGroupSelector) ) {
            throw new RuntimeException("Not on admin group list page");
        }
    }

    public EditorDetails addNewGroup() {
        findElement(addGroupSelector).click();
        
        return new EditorDetails(getDriver());
    }
}
