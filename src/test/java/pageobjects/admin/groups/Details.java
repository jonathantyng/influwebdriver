package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Details extends Page {

    private final By groupNameSelector = By.cssSelector(".details .name");

    public Details(WebDriver driver) {
        super(driver);
    }

    public String getGroupName() {
        return findElement(groupNameSelector).getText();
    }
}
