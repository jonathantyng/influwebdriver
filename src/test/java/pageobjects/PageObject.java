package pageobjects;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Predicate<WebElement> displayedElementPredicate = new Predicate<WebElement>() {
        @Override
        public boolean evaluate(WebElement t) {
            return t.isDisplayed();
        }
    };

    public PageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
    }

    protected void typeInSelect2Input(String keys) {
        findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys(keys);
    }

    protected void chooseSelect2Match() {
        findElement(By.className("select2-match")).click();
    }
    
    protected void chooseFirstSelect2Result() {
        findElement(By.className("select2-result")).click();
    }

    protected WebElement findElement(By selector) {
        return getDriver().findElement(selector);
    }
    
    protected java.util.List<WebElement> findElements(By selector) {
        return getDriver().findElements(selector);
    }

    protected WebElement findChildOfVisibleParent(By parentSelector, By childSelector) {
        return findVisibleElement(parentSelector).findElement(childSelector);
    }

    protected WebElement findVisibleElement(By selector) {
        java.util.List<WebElement> elements = getDriver().findElements(selector);

        return CollectionUtils.find(elements, displayedElementPredicate);
    }

    protected WebElement findParentOf(By selector) {
        return findElement(selector).findElement(By.xpath("parent::*"));
    }

    protected void waitForElement(By selector) {
        wait.until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    protected void waitForElementToDisapear(By selector) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(selector));
    }

    public <T extends PageObject > T pause(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }

        return (T)this;
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    protected void waitForAjaxLoader() {
        waitForElementToDisapear(By.cssSelector(".ajax-load"));
    }

    protected void searchSelect2For(By selector, String thingToSelect) {
        findParentOf(selector).findElement(By.cssSelector(".select2-container")).click();
        typeInSelect2Input(thingToSelect);
        chooseSelect2Match();
    }
}
