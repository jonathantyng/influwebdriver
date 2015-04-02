
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;

public class AnswerSomeQuestionsStage extends Stage{
    
    public AnswerSomeQuestionsStage (WebDriver driver) {
        super(driver);
        
    }

    public AnswerSomeQuestionsStage generateQuestion() {
        findInEditor(By.cssSelector("#c98 > label:nth-child(3) > input")).sendKeys("Yes or No");
        
        return this;
    }

    
 
    
    
}
