
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
    
    
    
    


}