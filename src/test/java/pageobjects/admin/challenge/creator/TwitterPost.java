
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;

public class TwitterPost extends Creator {

    private final By TypeOfTweetSelector = By.id("select2-drop");
    
    public TwitterPost(WebDriver driver) {
        super(driver);
    }

    public TwitterPost chooseTypeOfTweet(String typeOfTweet) {
        findParentOf(TypeOfTweetSelector)
                .findElement(By.cssSelector("#s2id_autogen22_search"))
                .click();
        
        typeInSelect2Input(typeOfTweet);
        chooseSelect2Match();
        
        return this;
    }


}
