
package pageobjects.admin.experiences;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Show extends Page{

    public Show(WebDriver driver) {
        super(driver);
    }
    
      public String getExperienceName (){
        return findElement(By.cssSelector("#content > div > div > div.experience_details > div > div > div")).getText();
    
    }
}
