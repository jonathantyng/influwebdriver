package pageobjects.admin.rewards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Show extends Page {

    public Show(WebDriver driver) {
        super(driver);
    }

    public String getRewardName() {
        return findElement(By.cssSelector(".details .name")).getText();
          
    }
    
    
}
