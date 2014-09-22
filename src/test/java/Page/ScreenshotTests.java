package Page;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class ScreenshotTests extends BasePage{

	@Test
	public void testElementScreenshot(){

        wd.get("https://princessland.influitives.com/users/sign_in");

        //Enter email and password to sign in

        wd.findElement(By.id("user_email")).sendKeys("lisasimpson@thesimpsons.com");
        wd.findElement(By.id("user_password")).sendKeys("macbook18");

        //Click submit button

        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Load challenge

        wd.get("https://princessland.influitives.com/challenges/20");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        WebElement Appex = wd.findElement(By.xpath("//*[@id=\"open-challenges\"]/ul"));
        try {
	    	FileUtils.copyFile(WebElementExtender.captureElementBitmap(Appex), new File("/Users/patrickprestley/Desktop/scrn/div.png"));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
        try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }

    }
	
	@After
	public void tearDown()
	{
		wd.close();
		wd.quit();
	}
  
}