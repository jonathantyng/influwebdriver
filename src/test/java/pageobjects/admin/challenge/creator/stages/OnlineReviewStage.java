package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;

public class OnlineReviewStage extends Stage {

    private final By linkToReviewContentSelector = By.name("params.url");

    public OnlineReviewStage(WebDriver driver) {
        super(driver);

    }

    public OnlineReviewStage linkToReviewContent(String ReviewURL) {
        findInEditor(linkToReviewContentSelector).sendKeys(ReviewURL);

        return this;

    }

}
