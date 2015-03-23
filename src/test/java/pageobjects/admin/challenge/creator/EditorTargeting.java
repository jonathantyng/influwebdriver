
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Creator;

public class EditorTargeting extends Creator{

     private final By targetToSpecificAdvocatesSelector = By.cssSelector("#criteria_radio");
     private final By setAdvocateInfoCriteriaSelector = By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(4) > a");

     
    public EditorTargeting(WebDriver driver) {
        super(driver);
    }

    public EditorTargeting targetToSpecificAdvocates() {
        findElement(targetToSpecificAdvocatesSelector).click();
        
       return this;
    }

    public EditorTargeting setAdvocateInfoCriteria() {
        findElement(setAdvocateInfoCriteriaSelector).click();
        
        return this;
    }
    
    public EditorTargeting searchByAdvocateEmail() {
        findElement(By.cssSelector("#challenges > div.infl-embed.infl-popover.infl-bottom.infl-width64.infl-animate")).click();
        
        return this;
    }

    public EditorTargeting provideAdvocatePosition() {
        findElement(By.cssSelector("#s2id_autogen22 > ul")).sendKeys("CEO");
        
        return this;
    }
    
}

   

 
