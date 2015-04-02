
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.creator.Stage;


public class JoinAGroupStage extends Stage{

    public JoinAGroupStage(WebDriver driver) {
        super(driver);
    }

    public JoinAGroupStage selectExistingGroupFromDropdown(String groupName) {
        searchSelect2For(By.cssSelector("select[name=\"params.group_id\"]"), groupName);
        
        return this;
    }
    
    
}
