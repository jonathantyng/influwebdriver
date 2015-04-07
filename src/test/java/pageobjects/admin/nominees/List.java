
package pageobjects.admin.nominees;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class List extends Page{

        private final By addNewNomineeSelector = By.cssSelector("#click_add_new_advocate");
        private final By sortNomineesByNameSelector = By.cssSelector("#sort-name");
        private final By sortNomineesBySourceSelector = By.cssSelector("#sort-source");
        private final By sortNomineesByNPSScoreSelector = By.cssSelector("#sort-nps");
        private final By sortNomineesByRelationshipSelector = By.cssSelector("#sort-relationship");
        private final By sortNomineesByChallengeCompletionsSelector = By.cssSelector("#sort-challenge-completions");
        private final By sortNomineesByLastActivitySelector = By.cssSelector("#sort-last-activity");
        private final By filterByNomineeNameSelector = By.cssSelector("#q_name_or_email_cont");
        private final By filterByActiveNomineesSelector = By.cssSelector("#search_by_hidden_active");
        private final By filterByArchivedNomineesSelector = By.cssSelector("#search_by_hidden_archived");
        private final By filterByDetractorNomineeSelector = By.cssSelector("#search_by_nps_category_detractor");
        private final By filterByNeutralNomineeSelector = By.cssSelector("#search_by_nps_category_neutral");
        private final By filterByPromoterNomineeSelector = By.cssSelector("#search_by_nps_category_promoter");
        private final By filterByUnknownNPSNomineesSelector = By.cssSelector("#search_by_nps_category_unknown");
        private final By filterByNomineeSourceSelector = By.cssSelector("#s2id_autogen8");



       public List(WebDriver driver) {
        super(driver);
    }

    public pageobjects.admin.nominees.add addANewNominee() {
        findElement(addNewNomineeSelector).click();
        
        return new pageobjects.admin.nominees.add(getDriver());
    }

    public List sortNomineesByName() {
        findElement(sortNomineesByNameSelector).click();
        
        return this;
    }

    public List sortNomineesBySource() {
        findElement(sortNomineesBySourceSelector).click();
        
        return this;
    }

    public List sortNomineesByNPSScore() {
        findElement(sortNomineesByNPSScoreSelector).click();
        
        return this;
        }

    public List sortNomineesByRelationship() {
        findElement(sortNomineesByRelationshipSelector).click();
        
        return this;
    }

    public List sortNomineesByChallengeCompletions() {
        findElement(sortNomineesByChallengeCompletionsSelector).click();
        
        return this;
                
    }

    public List sortNomineesByLastActivity() {
        findElement(sortNomineesByLastActivitySelector).click();
        
        return this;
    }

    public List filterByNomineeName() {
        findElement(filterByNomineeNameSelector).sendKeys("Shannon");
        
        return this;
    }
    
    public List filterByActiveNominees() {
        findElement(filterByActiveNomineesSelector).click();
        
        return this;
    }
    
    public List filterByArchivedNominees(){
        findElement(filterByArchivedNomineesSelector).click();
        
        return this;
    }

    public List filterByDetractorNominee(){
        findElement(filterByDetractorNomineeSelector).click();
        
        return this;
    }

    public List filterByNeutralNominee(){
        findElement(filterByNeutralNomineeSelector).click();
        
        return this;
    }
    
    public List filterByPromoterNominee(){
        findElement(filterByPromoterNomineeSelector).click();
        
        return this;
    }
    
    public List filterByUnknownNPSNominees() {
        findElement(filterByUnknownNPSNomineesSelector).click();
        
        return this;
    
    }

    public List filterByNomineeSource() {
        findElement(filterByNomineeSourceSelector).sendKeys("Maven");
        
        return this;
    }
}