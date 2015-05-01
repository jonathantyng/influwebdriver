
package pageobjects.advocate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class TwitterSignInPage extends Page{

    public TwitterSignInPage(WebDriver driver) {
        super(driver);
    }

    public TwitterSignInPage fillInUserNameOrEmail() {
        findElement(By.cssSelector("#oauth_form > fieldset.sign-in > div.row.user > label")).sendKeys("alice.advocate@gmail.com");
         
        return TwitterSignInPage (getDriver());
    }
    
    
}
