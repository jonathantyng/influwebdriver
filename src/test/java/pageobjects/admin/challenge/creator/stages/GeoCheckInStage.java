package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;

public class GeoCheckInStage extends Stage {

    private final By inputAddressSelector = By.cssSelector("input.address");
    private final By validateLocationSelector = By.cssSelector("input.lookup");

    public GeoCheckInStage(WebDriver driver) {
        super(driver);

    }

    public GeoCheckInStage setGeoLocation(String location) {
        findInEditor(inputAddressSelector).sendKeys(location);

        return this;

    }

    public GeoCheckInStage validateLocation() {
        findInEditor(validateLocationSelector).click();

        return this;
    }

}
