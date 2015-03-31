
package pageobjects.admin.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class PublishingInterface extends Page {

     public PublishingInterface(WebDriver driver) {
        super(driver);
    }

    public PublishingInterface updatePublishingOptions() {
        findElement(By.cssSelector("#visibility_setting_publish")).click();
        
        return this;
    }
    
}
