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

        wd.get("http://www.google.com");

        WebElement pmoabsdiv = wd.findElement(By.xpath("//*[@id=\"hplogo\"]"));
	    
	    try {
	    	FileUtils.copyFile(WebElementExtender.captureElementBitmap(pmoabsdiv), new File("/Users/patrickprestley/Desktop/scrn/div.png"));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	  }
	
	@After
	public void teadDown()
	{
		wd.close();
		wd.quit();
	}
  
}