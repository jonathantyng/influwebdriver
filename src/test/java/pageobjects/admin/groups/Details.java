package pageobjects.admin.groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Details extends Page {

    private final By groupNameSelector = By.cssSelector(".details .name");
    private final By addAdvocateButton = By.cssSelector(".button-list.primary .dialog-link" );
    private final By membershipLastUpdatedSelector = By.xpath("//*[@id='kpis']//*[@class='details_actions']");
    private final By membershipCountSelector = By.xpath("//*[@id='kpis']//*[@class='details_actions']//p[contains(text(), 'Member Count')]/strong ");
    
    public Details(WebDriver driver) {
        super(driver);
    }

    public String getGroupName() {
        return findElement(groupNameSelector).getText();
    }

    public AddAdvocates addAdvocates() {
        findElement(addAdvocateButton).click();
        
        return new AddAdvocates(getDriver());
    }

    public String waitForAndGetNewMembershipCount() {
        int tries = 0;
        while(tries++ < 3) {
            getDriver().navigate().refresh();
            
            if (getLastRefreshed().equals("Membership updated less than a minute ago")) {
                break;
            }
        }
        
        return findElement(membershipCountSelector).getText();
    }
    
    public String getLastRefreshed() {
        return findElement(membershipLastUpdatedSelector).getText();
    }
   
}
