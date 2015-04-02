
package pageobjects.admin.settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;


public class List extends Page {

    public List(WebDriver driver) {
        super(driver);
    }

    public List navigateToScoringAndAchievement() {
        findElement(By.linkText("Scoring & Achievement")).click();
        
        return this;
    }
    
}
