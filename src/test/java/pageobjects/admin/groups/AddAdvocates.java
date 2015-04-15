
package pageobjects.admin.groups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.AbstractPageObject;


public class AddAdvocates extends AbstractPageObject {

    private final By selectedAdvocateContainer = By.id("s2id_contact_ids");
    private final By commitButtonSelector = By.cssSelector(".new_explicit_group_contact input[type='submit']");
    
    public AddAdvocates(WebDriver driver) {
        super(driver);
    }

    public AddAdvocates selectAdvocateByName(String name) {
        findElement(selectedAdvocateContainer).click();
        typeInSelect2Input(name);
        chooseFirstSelect2Result();
        
        return this;
    }

    public EditorTargeting saveExplicitAdvocate() {
        findElement(commitButtonSelector).click();
        
        return new EditorTargeting(getDriver());
    }
    
    
    
}
