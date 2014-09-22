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
		
		//Navigate to hub and take a screenshot of the login page for comparison
		wd.get("https://may31.influitiveqa.com/");
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        WebElement loginpage = wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]"));

        try {
            FileUtils.copyFile(WebElementExtender.captureElementBitmap(loginpage), new File(scrFile));
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
    public void compare_advocate_filter() throws Exception {

        String advocatefilterFile = "/Users/patrickprestley/Desktop/scrn/advocateFilter.png";
        String baseadvocatefilterFile = "/Users/patrickprestley/Desktop/scrn/baseAdvocateFilter.png";

        //Navigate to hub

        wd.get("https://princessland.influitives.com/corporate/contacts");

        //Enter email and password to sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");

        //Click submit button

        wd.findElement(By.id("sign-in-button")).click();
        try {
            Thread.sleep(3000l);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        WebElement challenge = wd.findElement(By.xpath("//*[@id=\"kpis\"]"));

        try {
            FileUtils.copyFile(WebElementExtender.captureElementBitmap(challenge), new File(advocatefilterFile));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //Verify baseline image with actual image
            assertEquals(CompareUtil.Result.Matched, CompareUtil.CompareImage(baseadvocatefilterFile, advocatefilterFile));
        } catch (Error e) {
            //Capture and append Exceptions/Errors
            verificationErrors.append(e.toString());
        }
    }
        @Test
        public void compare_challenges_filter() throws Exception{

            String challengefilterFile = "/Users/patrickprestley/Desktop/scrn/challengeFilter.png";
            String basechallengefilterFile = "/Users/patrickprestley/Desktop/scrn/baseChallengeFilter.png";

            //Navigate to hub

            wd.get("https://princessland.influitives.com/corporate/challenges");

            //Enter email and password to sign in

            wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
            wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");

            //Click submit button

            wd.findElement(By.id("sign-in-button")).click();
            try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

            //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

            boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

            if (exists)
            {
                wd.findElement(By.linkText("No Thanks")).click();
                System.out.println("Challenge Tutorial Dismissed");
            }
            else
            {
                try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
                System.out.println("Tutorial not encountered");
            }

            try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

            WebElement challenge = wd.findElement(By.xpath("//*[@id=\"kpis\"]"));

            try {
                FileUtils.copyFile(WebElementExtender.captureElementBitmap(challenge), new File(challengefilterFile));
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                //Verify baseline image with actual image
                assertEquals(CompareUtil.Result.Matched, CompareUtil.CompareImage(basechallengefilterFile,challengefilterFile));
            } catch (Error e) {
                //Capture and append Exceptions/Errors
                verificationErrors.append(e.toString());
            }
    }

    @Test
    public void compare_group_filter() throws Exception{

        String groupfilterFile = "/Users/patrickprestley/Desktop/scrn/groupFilter.png";
        String baseGroupfilterFile = "/Users/patrickprestley/Desktop/scrn/baseGroupFilter.png";

        //Navigate to hub

        wd.get("https://princessland.influitives.com/corporate/groups");

        //Enter email and password to sign in

        wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
        wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");

        //Click submit button

        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            System.out.println("Tutorial not encountered");
        }

        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        WebElement group = wd.findElement(By.xpath("//*[@id=\"kpis\"]"));

        try {
            FileUtils.copyFile(WebElementExtender.captureElementBitmap(group), new File(groupfilterFile));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //Verify baseline image with actual image
            assertEquals(CompareUtil.Result.Matched, CompareUtil.CompareImage(baseGroupfilterFile,groupfilterFile));
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
