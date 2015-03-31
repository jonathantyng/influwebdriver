package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineActionStage extends Stage {

    private final By linkToContentSelector = By.cssSelector("#c96 > div > div > fieldset > section > label > input");

    public OnlineActionStage(WebDriver driver) {
        super(driver);
    }

    public OnlineActionStage addLinkToContent(String LinkURL) {
        findInEditor(linkToContentSelector).sendKeys(LinkURL);

        return this;
    }

}
