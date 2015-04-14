
package pageobjects.admin.experiences;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;


public class Details extends Page{

    private final By experienceNameSelector = By.cssSelector("#experience_name");
    private final By experienceDescriptionSelector = By.cssSelector("#experience_description");
    private final By joinCodeSelector = By.cssSelector("#join-code-target");

   

    public Details(WebDriver driver) {
        super(driver);
    }

    public Details fillInExperienceName(String experienceName) {
        findElement(experienceNameSelector).sendKeys(experienceName);
        return this;
    }

  
    public Details fillInExperienceDescription(String experienceDescription) {
        findElement(experienceDescriptionSelector).sendKeys(experienceDescription);
        return this;
    }

    public Details createExperienceURL(String experienceURL) {
        findElement(joinCodeSelector).clear();
        findElement(joinCodeSelector).sendKeys(experienceURL);
        
        return this;
    }

    public EditorTargeting switchToExperienceTargeting() {
        findElement(By.cssSelector("#link-targeting")).click();
        
        return new EditorTargeting(getDriver());
    }

        
}
