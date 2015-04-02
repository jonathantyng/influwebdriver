
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;

public class ShareLink extends Stage {
  
   private final By linkToContent = By.cssSelector("#c75 > div > div > fieldset > section > label.input.string > input");

       public ShareLink(WebDriver driver) {
        super(driver);
    }

    public ShareLink fillInLinkDetails(String linkURL) {
        findInEditor(By.cssSelector("#c96 > div > div > fieldset > section > label.input.string > input")).sendKeys(linkURL);
        
        return this;
    }

    public ShareLink loadURL() {
        findInEditor(By.cssSelector("#c96 > div > div > fieldset > section > label.input.string > a")).click();
        
        return this;
        
    }
 
}