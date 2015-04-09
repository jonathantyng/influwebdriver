
package pageobjects.admin.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class AddBadge extends Page{

    public AddBadge(WebDriver driver) {
        super(driver);
    }

    public AddBadge addBadgeName() {
        findElement(By.cssSelector("#badge_name")).sendKeys("Test Badge");
        
        return this;
    }
    
}
