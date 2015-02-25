
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class ShareLink extends Stage {
  
   private final By linkToContent = By.cssSelector("#c75 > div > div > fieldset > section > label.input.string > input");

       public ShareLink(WebDriver driver) {
        super(driver);
    }

//    public linkToContent fillinLinkDetails(String linkURL) {
//        findElement(linkToContent).sendKeys(linkURL);
//       
//        return new linkToContent();
//    }
 
}