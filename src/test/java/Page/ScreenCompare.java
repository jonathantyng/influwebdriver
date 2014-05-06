package Page;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

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
		File screenshotFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(scrFile));

		try {
			//Verify baseline image with actual image 
			assertEquals(CompareUtil.Result.Matched, CompareUtil.CompareImage(baseScrFile,scrFile));
		} catch (Error e) {
			//Capture and append Exceptions/Errors
			verificationErrors.append(e.toString());
		}
	}



	
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
