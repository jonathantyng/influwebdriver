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

public class CreatingApprovalChallenges {

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
                .chooseChallengeType("Survey")
                .fillInName("Approval Challenge")
                .fillInHeadline("Approval Challenge")
                .fillInDescription("Approval challenge to Admin approving advocates during the first stage of a multi stage  challenge")
                .featureTheChallenge()
                .addStage()
                .surveyStage()
                .fillInSubject("The first question issss??")
                .addStage()
                .surveyStage()
                .fillInSubject("The second question issss?")
                .addStage()
                .corporateConfirmationStage()
                .saveChallenge();
    }
}
