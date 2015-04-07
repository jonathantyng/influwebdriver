package pageobjects.admin.rewards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;
import pageobjects.admin.rewards.editor.FulfillmentPane;

public class List extends Page {

    private final By addNewRewardSelector = By.cssSelector(".button-list.primary .highlighted");

    public List(WebDriver driver) {
        super(driver);
    }

    public FulfillmentPane addNewReward() {
        findElement(addNewRewardSelector).click();

        return new FulfillmentPane(getDriver());
    }

    public List deleteNewReward() {
        findElement(By.cssSelector("#list_collection > li:nth-child(1) > div.buttons > div")).click();
        findElement(By.cssSelector("#list_collection > li:nth-child(1) > div.buttons > div > ul > li:nth-child(5) > a")).click();
        
        return this;
    }

    public List confirmDelete() {
        driver.switchTo().alert().accept();
        
        return this;   
    }
}
