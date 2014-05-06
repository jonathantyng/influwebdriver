package Page;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ScreenCompare extends BasePage{

	private StringBuffer verificationErrors = new StringBuffer();

	@Test
	public void login_page() throws Exception {
	
		String scrFile = "/Users/patrickprestley/Desktop/scrn/Login.png";
		String baseScrFile = "/Users/patrickprestley/Desktop/scrn/baseLogin.png";
		
		//Open the BMI Calculator Page and get a Screen Shot of Page into a File
		wd.get("http://may31.influitiveqa.com");
        WebElement pmoabsdiv = wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]"));

        try {
            FileUtils.copyFile(WebElementExtender.captureElementBitmap(pmoabsdiv), new File(scrFile));
        } catch (Exception e) {
            e.printStackTrace();
        }

		try {
			//Verify baseline image with actual image 
			assertEquals(CompareUtil.Result.Matched, CompareUtil.CompareImage(baseScrFile,scrFile));
		} catch (Error e) {
			//Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
		}
	}

    @Test

	
	@After
	public void tearDown() throws Exception {
		//Close the browser
		wd.quit();
		
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
