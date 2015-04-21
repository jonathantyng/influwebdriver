
package pageobjects.admin.challenge.creator.stages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.challenge.Show;
import pageobjects.admin.challenge.creator.Stage;


public class GetAppStage extends Stage{

    public GetAppStage(WebDriver driver) {
        super(driver);
   
    }

    public GetAppStage linkToGetAppWebsite() {
        findElement(By.cssSelector("#c97 > div > div > fieldset > section > label > input")).sendKeys("https://www.getapp.com/marketing-software/a/advocatehub/reviews/write/");
           
            return this;
    }

    public GetAppStage loadGetAppWebsite() {
        findElement(By.cssSelector("#c97 > div > div > fieldset > section > label > a")).click();
        
        return this;
    }

    

}
