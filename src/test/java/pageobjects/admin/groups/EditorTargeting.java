package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditorTargeting extends Editor {
    private final By newAdvocateInfoCriteriaSelector = By.cssSelector("a[data-category=specific");
    private final By advocateInclusionCount = By.cssSelector(".search-conditions-view .contact_list .counts .count");
    
    private final By conditionValuesSelector = By.cssSelector(".values");
    private final By conditionOperaterEqualsSelector = By.xpath("//*[@class='select2-result-label' and text()='Equals']");
    private final By conditionOperatorSelector = By.cssSelector(".operator");
    private final By conditionFieldNameSelector = By.cssSelector(".field-name");
    private final By firstConditionSelector = By.cssSelector(".conditions .condition:first-child");
    
    public EditorTargeting(WebDriver driver) {
        super(driver);
    }

    public EditorTargeting addAdvocateInfoCriteria() {
        findElement(newAdvocateInfoCriteriaSelector).click();
        
        return this;
    }
    

    public EditorTargeting targetByEmail(String email) {
        WebElement parent = findElement(firstConditionSelector);

        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Email");
        chooseSelect2Match();
        
        parent.findElement(conditionOperatorSelector).click();
        findElement(conditionOperaterEqualsSelector).click();

        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input(email);
        chooseSelect2Match();
        
        return this;
    }
    
    public String getMatchedAdvocateCount() {
        waitForAjaxLoader();
 
        return findElement(advocateInclusionCount).getText();
    }
    
}
