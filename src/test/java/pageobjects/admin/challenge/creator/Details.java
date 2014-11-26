package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.admin.challenge.Creator;

public class Details extends Creator {

    private final By challengeTypeSelector = By.cssSelector("select[name=challenge_type_id]");
    private final By challengeNameSelector = By.name("name");
    private final By challengeHeadlineSelector = By.name("headline");
    private final By challengeDescriptionSelector = By.name("description");
    private final By challengeFeaturedSelector = By.id("featured1");

    public Details(WebDriver driver) {
        super(driver);
    }

    public Details chooseChallengeType(String challengeType) {
        findParentOf(challengeTypeSelector)
                .findElement(By.cssSelector(".select2-container"))
                .click();

        typeInSelect2Input(challengeType);
        chooseSelect2Match();

        return this;
    }

    public Details fillInName(String name) {
        findElement(challengeNameSelector).sendKeys(name);

        return this;
    }

    public Details fillInHeadline(String headline) {
        findElement(challengeHeadlineSelector).sendKeys(headline);

        return this;
    }

    public Details fillInDescription(String description) {
        findElement(challengeDescriptionSelector).sendKeys(description);

        return this;
    }

    public Details featureTheChallenge() {
        WebElement featuredElement = findElement(challengeFeaturedSelector);

        if (false == featuredElement.isSelected()) {
            featuredElement.click();
        }

        return this;
    }
}
