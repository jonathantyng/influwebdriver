package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.admin.challenge.Creator;

public class EditorTargeting extends Creator {

    private final By targetToSpecificAdvocatesSelector = By.cssSelector("#criteria_radio");
    private final By setAdvocateInfoCriteriaSelector = By.cssSelector("a[data-category=specific]");

    private final By conditionValuesSelector = By.cssSelector(".values");
    private final By conditionOperaterEqualsSelector = By.xpath("//*[@class='select2-result-label' and text()='Equals']");
    private final By conditionOperatorSelector = By.cssSelector(".operator");
    private final By conditionFieldNameSelector = By.cssSelector(".field-name");
    private final By firstConditionSelector = By.cssSelector(".conditions .condition:first-child");
    private final By firstExplicitAdvocateNameSelector = By.cssSelector("#ui-id-2 .advocate:first-child .name");

    public EditorTargeting(WebDriver driver) {
        super(driver);
    }

    public EditorTargeting targetToSpecificAdvocates() {
        findElement(targetToSpecificAdvocatesSelector).click();

        return this;
    }

    public EditorTargeting targetByPosition(String position) {
        findElement(setAdvocateInfoCriteriaSelector).click();

        WebElement parent = findElement(firstConditionSelector);
       
        parent.findElement(conditionFieldNameSelector).click();
        typeInSelect2Input("Position");
        chooseSelect2Match();

        //parent.findElement(conditionOperatorSelector).click();
        //findElement(conditionOperaterEqualsSelector).click();

        parent.findElement(conditionValuesSelector).click();
        typeInSelect2Input("CEO");
        chooseSelect2Match();

        return this;
    }

    public EditorTargeting searchByAdvocateEmail() {
        findElement(By.cssSelector("#challenges > div.infl-embed.infl-popover.infl-bottom.infl-width64.infl-animate")).click();

        return this;
    }
}