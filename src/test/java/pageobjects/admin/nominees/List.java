
package pageobjects.admin.nominees;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.admin.Page;

public class List extends Page{

       public List(WebDriver driver) {
        super(driver);
    }

    public pageobjects.admin.nominees.add addANewNominee() {
        findElement(By.cssSelector("#click_add_new_advocate")).click();
        
        return new pageobjects.admin.nominees.add(getDriver());
    }


}