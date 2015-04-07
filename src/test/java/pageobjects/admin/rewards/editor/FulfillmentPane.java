package pageobjects.admin.rewards.editor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.rewards.Editor;

public class FulfillmentPane extends Editor {

    private final By manualSelector = By.id("reward_kind_manual");
    private final By redemptionLinkFulfillmentSelector = By.cssSelector("#reward_provider_printfection");
    private final By rememptionLinkFullfilmentURLSelector = By.cssSelector("#reward_redemption_links");
    private final By tangoCardRewardSelector = By.cssSelector("#reward_provider_tango_card");
    private final By rewardAmountSelector = By.id("reward_amount");
    private final By advocateChosenCharitySelector = By.id("advocate_chosen");
    private final By charityRewardSelector = By.id("reward_provider_first_giving");

    public FulfillmentPane(WebDriver driver) {
        super(driver);
    }

    public FulfillmentPane chooseManualFulfillment() {
        findElement(manualSelector).click();

        return this;
    }

    public FulfillmentPane chooseRedemptionLinkFulfillment() {
        findElement(redemptionLinkFulfillmentSelector).click();

        return this;
    }

    public FulfillmentPane provideFulfillmentURL() {
        findElement(rememptionLinkFullfilmentURLSelector).sendKeys("http://www.reddit.com");

        return this;
    }

    public FulfillmentPane chooseAdvocateChosenCharityFor(Integer i) {
        findElement(charityRewardSelector).click();
        findElement(advocateChosenCharitySelector).click();
        findElement(rewardAmountSelector).sendKeys(i.toString());

        return this;
    }

    public pageobjects.admin.rewards.List makeBasicReward(String rewardName) {
        return moveToDetailsPane()
                .fillInName(rewardName)
                .fillInDescription("Some description")
                .chooseType("Swag")
                .saveReward();

    }

    public FulfillmentPane chooseTangoCardFulfilment() {
        findElement(tangoCardRewardSelector).click();
        
        return this;
    }
}
