package pageobjects.admin.challenge.creator;

import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;
import pageobjects.admin.Targeting;

public class EditorTargeting extends Creator implements Targeting<EditorTargeting> {

    public EditorTargeting(WebDriver driver) {
        super(driver);
    }

}