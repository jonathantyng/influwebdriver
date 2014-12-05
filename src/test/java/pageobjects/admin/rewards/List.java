
package pageobjects.admin.rewards;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class List extends Page {

    private final By addNewRewardSelector = By.cssSelector(".button-list.primary .highlighted");
    private final By dismissTutorialSelector = By.cssSelector(".guider #NoThanks");
  
   
    public List(WebDriver driver) {
        super(driver);
    }
    public List dismissTutorial() {
        findElement(dismissTutorialSelector).click();
        waitForElementToDisapear(dismissTutorialSelector);

        return this;
    }   

    public List addNewReward() {
        findElement(addNewRewardSelector).click();
        
        return this;
    }

   
}