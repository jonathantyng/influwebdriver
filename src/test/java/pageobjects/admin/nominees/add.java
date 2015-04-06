
package pageobjects.admin.nominees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;



public class add extends Page{

        private final By nomineeEmailSelector = By.cssSelector("#contact_email");
        private final By nomineeNameSelector = By.cssSelector("#contact_name");
        private final By nomineeCompanySelector = By.cssSelector("#contact_company");
        private final By nomineeTitleSelector = By.cssSelector("#contact_title");


    public add(WebDriver driver) {
        super(driver);
                
    }

    public add addNomineeEmail() {
        findElement(nomineeEmailSelector).sendKeys("shannon+nominee@influitive.com");
    
        return this;   
    }

    public add addNomineeName() {
        findElement(nomineeNameSelector).sendKeys("Shannon Nominee");
        
        return this;
    }

    public add addNomineeCompany() {
        findElement(nomineeCompanySelector).sendKeys("Influitive");
        
        return this;
    }

    public add addNomineeTitle() {
        findElement(nomineeTitleSelector).sendKeys("QA");
        
        return this;
    }

    public List addNomineeSave() {
        findElement(By.cssSelector("#save-button")).click();
        
        return new List(getDriver());
    }
    
     
    
     
    
}
