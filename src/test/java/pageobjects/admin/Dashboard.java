package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.groups.Details;

public class Dashboard extends Page {

    
    private final By addNewAdminGoal = By.cssSelector("#admin-goals > header > div > a");
    private final By selectTrackableEvent = By.cssSelector("#select2-drop");
  
    
    public Dashboard(WebDriver driver) {
        super(driver);
    }
  
   public void addNewAdminGoal() {
        findElement(addNewAdminGoal).click();
    }
        
   public void selectTrackableEvent() {
       findElement(selectTrackableEvent).click();
   }

    public Details rewardToRewards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
