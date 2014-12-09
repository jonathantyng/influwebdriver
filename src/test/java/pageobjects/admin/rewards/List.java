package pageobjects.admin.rewards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public String getRewardName(int rewardListNumber) {
        By rewardSelector = By.cssSelector(".bonus:nth-child(" + rewardListNumber + ") .name");
        WebElement element = findElement(rewardSelector);
        return element.getText();
    }
}
