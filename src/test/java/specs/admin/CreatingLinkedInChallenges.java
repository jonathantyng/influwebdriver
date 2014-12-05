package specs.admin;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;

public class CreatingLinkedInChallenges {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1400, 1400));
        driver.get("http://pageobjects.influitives.com/");
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void canCreateAnApprovalChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator("admin@influitive.com", "1nflu1t1v3")
                .navigateToChallenges()
                .dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("LinkedIn")
                .fillInName("LinkedIn Challenge")
                .fillInHeadline("Join our LinkedIn Group!")
                .addStage()
                .linkedInJoinGroup()
                .fillInGroupURL("https://www.linkedin.com/groups/Influitives-Community-4449061")
                .validate()
                .saveChallenge();
        
        
        try {
            Thread.sleep(20000L);
        } catch (InterruptedException ex) {
            Logger.getLogger(CreatingLinkedInChallenges.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
                
                