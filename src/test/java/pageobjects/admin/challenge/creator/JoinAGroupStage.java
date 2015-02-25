
package pageobjects.admin.challenge.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JoinAGroupStage extends Stage{

    public JoinAGroupStage(WebDriver driver) {
        super(driver);
    }

    public JoinAGroupStage selectExistingGroupFromDropdown(String groupName) {
        searchSelect2For(By.cssSelector("select[name=\"params.group_id\"]"), groupName);
        
        return this;
    }
    
    
}
