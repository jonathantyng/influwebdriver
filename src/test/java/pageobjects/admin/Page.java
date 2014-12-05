package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.PageObject;

public class Page extends PageObject {

    private final By contextSwitchSelector = By.cssSelector("#context-switcher a");
    private final By challengesNavSelector = By.cssSelector("#main-navigation #Challenges");
    private final By groupsNavSelector = By.cssSelector("#main-navigation #Groups");
    private final By rewardNavSelector = By.cssSelector("#main-navigation #Rewards");

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

    public pageobjects.advocate.Page switchToAdvocateContext() {
        findElement(contextSwitchSelector).click();

        return new pageobjects.advocate.Page(getDriver());
    }

    public pageobjects.admin.rewards.List navigateToRewards() {
        findElement(rewardNavSelector).click();

        return new pageobjects.admin.rewards.List(getDriver());
    }

}
