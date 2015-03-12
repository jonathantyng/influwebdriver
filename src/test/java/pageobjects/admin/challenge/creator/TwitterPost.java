
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.admin.challenge.Creator;

public class TwitterPost extends Creator {

    private final By TypeOfTweetSelector = By.id("select2-drop");
    private final WebElement requiredContent = findElement(By.name("params.required_content"));
    
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

    public TwitterPost inputRequiredContent(String paulsimon) {
        requiredContent.sendKeys("#paulsimon");
    
        return this;         
    }

    public TwitterPost inputDefaultText(String paulsimon) {
        findElement(By.name("params.default_text")).sendKeys("#paulsimon");    
                
        return this;
    }
    
    


}
