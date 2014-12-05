package pageobjects.admin.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Show extends Page {

    public Show(WebDriver driver) {
        super(driver);
    }

    public String getChallengeName() {
        return findElement(By.cssSelector(".information .name")).getText();
    }
}
