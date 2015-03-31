package pageobjects.admin.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Show extends Page {

        private final By dismissPublishTutorialSelector = By.xpath("//*[@id=\"challenges\"]/div[10]/div[1]/a");

        
    public Show(WebDriver driver) {
        super(driver);
    }

    public String getChallengeName() {
        return findElement(By.cssSelector(".information .name")).getText();
    }

    public PublishingInterface publishChallenge() {
        findElement(By.cssSelector("#flag-122 > a")).click();

        return new PublishingInterface(getDriver());
    }

    public Show dismissPublishTutorial() {
        findElement(dismissPublishTutorialSelector).click();
        waitForElementToDisapear(dismissPublishTutorialSelector);
        return this;

    }

    public boolean isOnCorrectPage() {
       
          return getDirectLink().matches(".*/corporate/challenges/\\d+");
    }

    public String getDirectLink() {
        return findElement(By.cssSelector("#kpis > div.cell > div:nth-child(2) > p:nth-child(6) > span")).getText();
        
    }

}
