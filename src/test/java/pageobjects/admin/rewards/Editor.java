package pageobjects.admin.rewards;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class Editor extends Page {
    private final By fufillmentSelector = By.cssSelector("#reward_kind_manual");
    private final By selectHeadlineTab = By.cssSelector("#link-headline");

  
    public Editor(WebDriver driver) {
        super(driver);
    }
   
 
//    public void addHeadline() {
//        findElement(selectHeadlineTab).click();
//        
//        //return new headlineTab();
//    }  
}
