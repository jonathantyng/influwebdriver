package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.PageObject;

public class Page extends PageObject {

    private final By contextSwitchSelector = By.cssSelector("#context-switcher a");
    private final By challengesNavSelector = By.cssSelector("#main-navigation #Challenges");
    private final By groupsNavSelector = By.cssSelector("#main-navigation #Groups");
    private final By rewardNavSelector = By.cssSelector("#main-navigation #Rewards");
    private final By dismissTutorialSelector = By.cssSelector(".guider #NoThanks");
    private final By advocateNavSelector = By.cssSelector("#main-navigation #Advocates");
    private final By firstConditionSelector = By.cssSelector(".conditions .condition:first-child");
    private final By conditionFieldNameSelector = By.cssSelector(".field-name");
    

    public Page(WebDriver driver) {
        super(driver);
    }

    public pageobjects.admin.challenge.List navigateToChallenges() {
        findElement(challengesNavSelector).click();

        return new pageobjects.admin.challenge.List(getDriver());
    }

    public pageobjects.admin.groups.List navigateToGroups() {
        findElement(groupsNavSelector).click();

        return new pageobjects.admin.groups.List(getDriver());
    }

    public pageobjects.advocate.List switchToAdvocateContext() {
        findElement(contextSwitchSelector).click();

        return new pageobjects.advocate.List(getDriver());
    }

    public pageobjects.admin.rewards.List navigateToRewards() {
        findElement(rewardNavSelector).click();

        return new pageobjects.admin.rewards.List(getDriver());
    }
    
     public pageobjects.admin.advocates.List navigateToAdvocates() {
        findElement(advocateNavSelector).click();
                
        return new pageobjects.admin.advocates.List(getDriver());
    }
    
    public <T extends Page> T dismissTutorial() {
        findElement(dismissTutorialSelector).click();
        waitForElementToDisapear(dismissTutorialSelector);

        return (T)this;
    }
    
    public pageobjects.admin.settings.List navigateToSettings() {
        findElement(By.cssSelector("#header-bar > div.container > div > div > ul:nth-child(1)")).click();
        
        findElement(By.linkText("Settings")).click();
        
    
        return new pageobjects.admin.settings.List(getDriver());
    }

}
  
