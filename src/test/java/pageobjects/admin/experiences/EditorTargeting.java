
package pageobjects.admin.experiences;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EditorTargeting extends Details{
    
     private final By firstConditionSelector = By.cssSelector(".conditions .condition:first-child");
     private final By conditionValuesSelector = By.cssSelector(".values");
    
    public EditorTargeting(WebDriver driver) {
        super(driver);
    }     

     public EditorTargeting targetByAdvocate() {
        
        findElement(By.cssSelector("#criteria_radio")).click();
        findElement(By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(2) > a")).click();
        
        WebElement parent = findElement(firstConditionSelector);
     
        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input("Alice");
        chooseFirstSelect2Result();
        
        return this;
     }

    public List saveExperience() {
        findElement(By.cssSelector("#save-button")).click();
        
        return new List (getDriver());
    }

}
