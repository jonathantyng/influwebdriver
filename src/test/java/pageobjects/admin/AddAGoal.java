package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAGoal extends Page {


    private final By selectTrackableEvent = By.cssSelector("#s2id_autogen4_search");

    public AddAGoal(WebDriver driver) {
        super(driver);
    }

    public AddAGoal selectTrackableEvent() {
       findElement(selectTrackableEvent).click();
       
       return this;
   }
    
    public AddAGoal addTrackableValue() {
        findElement(By.cssSelector("#admin_goal_settings_times")).sendKeys("10");
        
        return this;
    }
    
    public AddAGoal saveGoal() {
        findElement(By.cssSelector("#new_admin_goal > input[type=\"submit\"]:nth-child(7)")).click();
        
        return this;
    }
}

