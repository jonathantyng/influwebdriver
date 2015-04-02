
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.admin.challenge.creator.Stage;

public class TwitterPost extends Stage {

    private final WebElement requiredContent = findElement(By.name("params.required_content"));
    private final By firstConditionSelector = By.cssSelector(".conditions .condition:first-child");
    private final By conditionFieldNameSelector = By.cssSelector(".field-name");
    
    public TwitterPost(WebDriver driver) {
        super(driver);
    }

    public TwitterPost chooseTypeOfTweet(String typeOfTweet) {
        searchSelect2For(By.id("params.content_type20"), typeOfTweet);
       
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
