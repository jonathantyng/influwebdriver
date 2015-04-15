
package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorDetails extends Editor {

    private final By groupNameSelector = By.name("group[name]");
    private final By groupDescriptionSelector = By.name("group[description]");
    private final By groupInviteCode = By.id("group_token");

    public EditorDetails(WebDriver driver) {
        super(driver);
    }

    public EditorDetails fillInName(String name) {
        findElement(groupNameSelector).sendKeys(name);

        return this;
    }

    public EditorDetails fillInDescription(String headline) {
        findElement(groupDescriptionSelector).sendKeys(headline);

        return this;
    }

    public EditorDetails fillInInviteCode(String description) {
        findElement(groupInviteCode).sendKeys(description);

        return this;
    }

    public EditorDetails generateGroupDetails() {
        fillInName("Random Group");   
        
        return this;
    }
}