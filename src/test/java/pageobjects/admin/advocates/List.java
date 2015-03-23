
package pageobjects.admin.advocates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class List extends Page{

private final By fanFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(2) > label");
private final By advocateFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(3) > label");
private final By evangelistFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(4) > label");
private final By rockstarFilter = By.cssSelector("#contact_search > section > section:nth-child(2) > div:nth-child(5) > label");
private final By engagedFilter = By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(2) > label");
private final By notEngagedFilter = By.cssSelector("#contact_search > section > section:nth-child(3) > div:nth-child(3) > label");
private final By joinedFilter = By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(2) > label");
private final By notJoinedFilter = By.cssSelector("#contact_search > section > section:nth-child(4) > div:nth-child(3) > label");
private final By sortByAvailableChallenges = By.id("select2-drop-mask");
private final By searchByAdvocateName = By.cssSelector("#q_search_for_term");
private final By filterByDetratorNPSSelector = By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(2) > label");
private final By filterByNeutralNPSSelector = By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(3) > label");
private final By filterByAdvocatePromotorSelector = By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(4) > label");
private final By filterByAdvocateUnknownNPSSelector = By.cssSelector("#contact_search > section > section:nth-child(5) > div:nth-child(5) > label");

    
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

    public List filterAdvocatesByEngaged() {
        findElement(engagedFilter).click();
        return this;
    }

    public List filterAdvocatesByNotEngaged() {
        findElement(notEngagedFilter).click();
        
        return this;
    }

    public List filterAdvocatesbyJoined() {
        findElement(joinedFilter).click();
        
        return this;
        
    }

       public List filterAdvocatesbyNotJoined() {
        findElement(notJoinedFilter).click();
        
        return this;
        
    }

    public List sortAdvocatesbyAvailableChallenges() {
        findElement(sortByAvailableChallenges).click();
        
        return this;
    }

    public List searchAdvocateName() {
        findElement(searchByAdvocateName).sendKeys("Alice");
        
        return this;
    }

    public List filterAdvocatesByDetractor() {
        findElement(filterByDetratorNPSSelector).click();

        return this;
    }

    public List filterAdvocatesByNeuturalNPS() {
        findElement(filterByNeutralNPSSelector).click();
        
        return this;
    }

    public List filterAdvocatesByPromoterNPS() {
        findElement(filterByAdvocatePromotorSelector).click();
        
        return this; 
    }

    public List filterAdvocatesByUnknownNPS() {
        findElement(filterByAdvocateUnknownNPSSelector).click();
    
        return this;
    }
    
    
    

    
    
}
