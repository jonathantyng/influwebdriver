
package pageobjects.admin.advocates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class List extends Page{

private final By fanFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label");
private final By advocateFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label");
private final By evangelistFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label");
private final By rockstarFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label");
   
    
    public List(WebDriver driver) {
        super(driver);
    }

    public List filterAdvocatesByFan() {
        findElement(fanFilter).click();
    
        return this;
    }

    public List filterAdvocatesByAdvocate() {
        findElement(advocateFilter).click();
        
        return this;
    }

    public List filterAdvocatesByEvangelist() {
        findElement(evangelistFilter).click();
        return this;
    }

    public List filterAdvocatesByRockstar() {
        findElement(rockstarFilter).clear();
        return this;
    }
    
    
    

    
    
}
