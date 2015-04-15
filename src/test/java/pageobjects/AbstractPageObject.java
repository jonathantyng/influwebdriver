package pageobjects;

import org.apache.commons.collections4.Predicate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPageObject implements PageObject {

    public final WebDriver driver;
    private final WebDriverWait wait;
    private final Predicate<WebElement> displayedElementPredicate = new Predicate<WebElement>() {
        @Override
        public boolean evaluate(WebElement t) {
            return t.isDisplayed();
        }
    };

    public AbstractPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
    }

    public WebDriver getDriver() {
        return this.driver;
    }
    
    public Predicate<WebElement> getDisplayedElementPredicate() {
        return this.displayedElementPredicate;
    }
    
    public WebDriverWait getWait() {
        return this.wait;
    }
}
