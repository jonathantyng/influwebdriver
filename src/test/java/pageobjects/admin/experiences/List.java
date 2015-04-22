
package pageobjects.admin.experiences;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;


public class List extends Page{
    

    public List(WebDriver driver) {
        super(driver);
    }

    public Details addAnExperience() {
        findElement(By.cssSelector("#wrapper > div > div.main-half > span > ul > li > a")).click();
        
        return new pageobjects.admin.experiences.Details (getDriver());
    }

  
}
