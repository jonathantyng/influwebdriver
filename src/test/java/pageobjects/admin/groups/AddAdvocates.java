
package pageobjects.admin.groups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObject;


public class AddAdvocates extends PageObject {

    private final By selectedAdvocateContainer = By.cssSelector(".select2-container");
    private final By commitButtonSelector = By.cssSelector("input[type='submit']");
    
    public AddAdvocates(WebDriver driver) {
        super(driver);
    }

    public AddAdvocates selectAdvocateByName(String name) {
        findElement(selectedAdvocateContainer).click();
        typeInSelect2Input(name);
        
        return this;
    }

    public EditorTargeting saveExplicitAdvocate() {
        findElement(commitButtonSelector).click();
        
        return new EditorTargeting(getDriver());
    }
    
    
    
}
