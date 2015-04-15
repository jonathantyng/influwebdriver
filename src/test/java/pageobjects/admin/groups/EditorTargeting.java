package pageobjects.admin.groups;

import org.openqa.selenium.WebDriver;
import pageobjects.admin.Targeting;

public class EditorTargeting extends Editor implements Targeting<EditorTargeting> {
    
    public EditorTargeting(WebDriver driver) {
        super(driver);
    }

}
