package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditorTargeting extends Editor {
    private final By newAdvocateInfoCriteriaSelector = By.cssSelector("#include-conditions-list a[data-category=specific]");
    private final By newAdvocateBehaviourCriteriaSelector = By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(4) > a");

    private final By advocateInclusionCount = By.cssSelector(".search-conditions-view .contact_list .counts .count");
    private final By conditionValuesSelector = By.cssSelector(".values");
    private final By conditionOperaterEqualsSelector = By.xpath("//*[@class='select2-result-label' and text()='Equals']");
    private final By conditionOperatorSelector = By.cssSelector(".operator");
    private final By conditionFieldNameSelector = By.cssSelector(".field-name");
    private final By firstConditionSelector = By.cssSelector(".conditions .condition:first-child");
    private final By firstExplicitAdvocateNameSelector = By.cssSelector("#ui-id-2 .advocate:first-child .name");

    
    public EditorTargeting(WebDriver driver) {
        super(driver);
    }

    public EditorTargeting targetByEmail(String email) {
        findElement(newAdvocateInfoCriteriaSelector).click();
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
    
    public String getFirstExplicitAdvocateName() {
        waitForAjaxLoader();
        
        return findElement(firstExplicitAdvocateNameSelector).getText();
    }

    public EditorTargeting targetByLevel(String levelName) {
        findElement(newAdvocateInfoCriteriaSelector).click();
        
        WebElement parent = findElement(firstConditionSelector);
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Level");
        chooseSelect2Match();
        
        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input(levelName);
        chooseSelect2Match();
        
        return this;
    }
    
    public EditorTargeting targetByEngaged(){
        findElement(newAdvocateBehaviourCriteriaSelector).click();
        
        WebElement parent = findElement(firstConditionSelector);
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Engaged");
        chooseSelect2Match();
      
        return this;
            
    }

    public EditorTargeting targetByGroup(){
        findElement(By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(2) > a")).click();
        
        WebElement parent = findElement(firstConditionSelector);
        //parent.findElement(conditionFieldNameSelector).click();
        
        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input("Fan");
        chooseSelect2Match();
        
        return this;
    
    }

    public EditorTargeting targetByResponse() {
        findElement(By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(5) > a")).click();
        
        WebElement parent = findElement(firstConditionSelector);
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Yes or No");
        chooseSelect2Match();
        
        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input("Yes");
        chooseSelect2Match();
        
        return this;
           
    }




}
