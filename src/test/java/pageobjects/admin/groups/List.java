package pageobjects.admin.groups;

import java.util.function.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.admin.Page;

public class List extends Page {

    private final By addGroupSelector = By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a");
    private final By hasJoinCodeFilterSelector = By.cssSelector(".filters .input");
    private final By groupListItemSelector = By.cssSelector("ul.list > li");
    private final By groupNameSelector = By.cssSelector(".name a");
    private final By searchBarInputSelector = By.cssSelector("input.search-field");
    
    public List(WebDriver driver) {
        super(driver);
    }
    
    private void verifyOnGroupsPage() {
        if( null == findElement(addGroupSelector) ) {
            throw new RuntimeException("Not on admin group list page");
        }
    }
    
    public boolean hasGroup(String groupName) {
        waitForAjaxLoader();
        java.util.List<WebElement> groups = findElements(groupListItemSelector);
        Predicate<WebElement> p = we -> (we.findElement(groupNameSelector) == null ? groupName == null : we.findElement(groupNameSelector).getText().equals(groupName));
        
        return groups.stream().anyMatch(p);
    }

    public EditorDetails addNewGroup() {
        findElement(addGroupSelector).click();
        
        return new EditorDetails(getDriver());
    }
    
    public List filterByJoinCode() {
        findElement(hasJoinCodeFilterSelector).click();
        
        return this;
    }
    
    public List searchForGroup(String groupName) {
        findElement(searchBarInputSelector).sendKeys(groupName);
        
        return this;
    }
}
