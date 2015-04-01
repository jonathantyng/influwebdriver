
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class GeoCheckInStage extends Stage{

    public GeoCheckInStage(WebDriver driver) {
       
        super(driver);
    
    }

    public GeoCheckInStage setGeoLocation(String location) {
        findInEditor(By.cssSelector("input.address")).sendKeys(location);
        
        return this;
    
    }

    public GeoCheckInStage validateLocation() {
        findInEditor(By.cssSelector("input.lookup")).click();
        
        return this;
    }
    
}
