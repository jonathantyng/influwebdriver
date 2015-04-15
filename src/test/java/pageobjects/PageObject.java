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

public interface PageObject {
    public WebDriver getDriver();
    public Predicate<WebElement> getDisplayedElementPredicate();
    public WebDriverWait getWait();
    
    default void typeInSelect2Input(String keys) {
        findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys(keys);
    }

    default void chooseSelect2Match() {
        findElement(By.className("select2-match")).click();
    }
    
    default void chooseFirstSelect2Result() {
        findElement(By.className("select2-result")).click();
    }

    default WebElement findElement(By selector) {
        return getDriver().findElement(selector);
    }
    
    default java.util.List<WebElement> findElements(By selector) {
        return getDriver().findElements(selector);
    }

    default WebElement findChildOfVisibleParent(By parentSelector, By childSelector) {
        return findVisibleElement(parentSelector).findElement(childSelector);
    }

    default WebElement findVisibleElement(By selector) {
        java.util.List<WebElement> elements = getDriver().findElements(selector);

        return CollectionUtils.find(elements, getDisplayedElementPredicate());
    }

    default WebElement findParentOf(By selector) {
        return findElement(selector).findElement(By.xpath("parent::*"));
    }

    default void waitForElement(By selector) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(selector));
    }

    default void waitForElementToDisapear(By selector) {
        getWait().until(ExpectedConditions.invisibilityOfElementLocated(selector));
    }
    
    default void waitForElementToAppear(By selector) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    default <T extends PageObject > T pause(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }

        return (T)this;
    }

    default void waitForAjaxLoader() {
        waitForElementToDisapear(By.cssSelector(".ajax-load"));
    }

    default void searchSelect2For(By selector, String thingToSelect) {
        findParentOf(selector).findElement(By.cssSelector(".select2-container")).click();
        typeInSelect2Input(thingToSelect);
        chooseSelect2Match();
    }
    
}
