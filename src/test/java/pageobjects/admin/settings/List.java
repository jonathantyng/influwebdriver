
package pageobjects.admin.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;


public class List extends Page {

    public List(WebDriver driver) {
        super(driver);
    }

    public List navigateToScoringAndAchievement() {
        findElement(By.cssSelector(".accordion .accordion-group:nth-child(2)")).click();
        
        return this;
    }
    
}
