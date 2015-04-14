
package pageobjects.admin.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;


public class List extends Page {
    private final By levelsAndBadgesSelector = By.partialLinkText("Levels");
    
    public List(WebDriver driver) {
        super(driver);
    }

    protected List openScoringAndAchievements() {
        findElement(By.cssSelector(".accordion .accordion-group:nth-child(2) .accordion-toggle")).click();
        //#accordion > li:nth-child(2) > h4
        return this;
    }

    public List navigateToLevelsAndBadges() {
        openScoringAndAchievements();
        waitForElementToAppear(levelsAndBadgesSelector);
        findElement(levelsAndBadgesSelector).click();
                
        return this;
                
    }

    public AddBadge addNewBadge() {
        findElement(By.cssSelector("#add_badge")).click();
        
        return new AddBadge(getDriver());
    
    }
    
    
    
}
