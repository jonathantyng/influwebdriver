package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard extends Page {

    
    private final By addNewAdminGoal = By.cssSelector("#admin-goals > header > div > a");
    
    public Dashboard(WebDriver driver) {
        super(driver);
    }
  
   public Dashboard addNewAdminGoal() {
        findElement(addNewAdminGoal).click();
        
        return this;
    }

    public AdvocateView navigateToAdvocateView() {
        findElement(By.cssSelector("#context-switcher > a")).click();
        
        return new AdvocateView(getDriver());
        
    }

   
}
