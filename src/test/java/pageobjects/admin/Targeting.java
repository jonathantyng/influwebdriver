package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.PageObject;

public interface Targeting<T> extends PageObject {
    final By newAdvocateInfoCriteriaSelector = By.cssSelector("#include-conditions-list a[data-category=specific]");
    final By newAdvocateBehaviourCriteriaSelector = By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(4) > a");

    final By advocateInclusionCount = By.cssSelector(".search-conditions-view .contact_list .counts .count");
    final By conditionValuesSelector = By.cssSelector(".values");
    final By conditionOperaterEqualsSelector = By.xpath("//*[@class='select2-result-label' and text()='Equals']");
    final By conditionOperatorSelector = By.cssSelector(".operator");
    final By conditionFieldNameSelector = By.cssSelector(".field-name");
    final By firstConditionSelector = By.cssSelector(".conditions .condition:first-child");
    final By firstExplicitAdvocateNameSelector = By.cssSelector("#ui-id-2 .advocate:first-child .name");

    default String getMatchedAdvocateCount() {
        waitForAjaxLoader();
 
        return findElement(advocateInclusionCount).getText();
    }
    
    default String getFirstExplicitAdvocateName() {
        waitForAjaxLoader();
         
        return findElement(firstExplicitAdvocateNameSelector).getText();
    }

    default T targetByEmail(String email) {
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
        
        return (T)this;
    }
    
    default T targetByLevel(String levelName) {
        findElement(newAdvocateInfoCriteriaSelector).click();
        
        WebElement parent = findElement(firstConditionSelector);
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Level");
        chooseSelect2Match();
        
        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input(levelName);
        chooseSelect2Match();
        
        return (T)this;
    }
    
    default T targetByEngaged(){
        findElement(newAdvocateBehaviourCriteriaSelector).click();
        
        WebElement parent = findElement(firstConditionSelector);
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Engaged");
        chooseSelect2Match();
      
        return (T)this;
            
    }

    default T targetByGroup(){
        findElement(By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(2) > a")).click();
        
        WebElement parent = findElement(firstConditionSelector);
        //parent.findElement(conditionFieldNameSelector).click();
        
        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input("Fan");
        chooseSelect2Match();
        
        return (T)this;
    }

    default T targetByResponse() {
        findElement(By.cssSelector("#include-conditions-list > div > footer > ul > li:nth-child(5) > a")).click();
        
        WebElement parent = findElement(firstConditionSelector);
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Yes or No");
        chooseSelect2Match();
        
        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input("Yes");
        chooseSelect2Match();
        
        return (T)this;
    }

    default T targetByPosition(String position) {
        findElement(newAdvocateInfoCriteriaSelector).click();

        WebElement parent = findElement(firstConditionSelector);
       
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Position");
        chooseSelect2Match();

        parent.findElement(conditionOperatorSelector).click();
        findElement(conditionOperaterEqualsSelector).click();

        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input(position);
        chooseSelect2Match();

        return (T)this;
    }
}
