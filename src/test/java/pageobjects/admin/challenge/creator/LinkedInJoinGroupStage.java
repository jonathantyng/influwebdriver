package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedInJoinGroupStage extends Stage {

    public LinkedInJoinGroupStage(WebDriver driver) {
        super(driver);
    }

    public LinkedInJoinGroupStage fillInGroupURL(String url) {

        findInEditor(By.name("entered_url")).sendKeys(url);

        return this;
    }

    public LinkedInJoinGroupStage validate() {
        findInEditor(By.cssSelector(".load-preview")).click();
        waitForElement(By.cssSelector(".linkedin-group.preview"));
        return this;
    }

}
