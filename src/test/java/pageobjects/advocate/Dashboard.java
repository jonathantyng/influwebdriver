package pageobjects.advocate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard extends List {

    public Dashboard(WebDriver driver) {
        super(driver);
    }

    /*public void navigateToSettings() {    
    }*/

    public boolean hasVisiblePoints() {
        findElement(By.cssSelector("#header-points")).equals(true);
        
        return true;
    }

   
    
}
