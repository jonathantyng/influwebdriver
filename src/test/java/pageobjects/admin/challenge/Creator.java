package pageobjects.admin.challenge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;
import pageobjects.admin.challenge.creator.AddStageChooser;

public class Creator extends Page {
    private final By verifySelector = By.cssSelector("#challenge-creator");
    private final By addStageSelector = By.cssSelector("#add-stage > img.icon");
    private final By saveButtonSelector = By.name("commit");
 
    public Creator(WebDriver driver) {
        super(driver);
    }

    public AddStageChooser addStage() {
        findElement(addStageSelector).click();
        
        return new AddStageChooser(getDriver());
    }
 
    public Show saveChallenge() {
        findElement(saveButtonSelector).click();
        
        return new Show(getDriver());
    }

    private void verify() {
        if( null == findElement(verifySelector) ) {
            throw new RuntimeException("Not on challenge creator");
        }
    }
}
