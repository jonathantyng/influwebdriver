package specs.admin.advocates.nominees;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class FilterNominees extends AbstractSpec {

    @Test
    public void filterNomineesByName() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByName();

    }

    @Test
    public void filterNomineesBySource() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesBySource();
    }

    @Test
    public void filterNomineesByNPSScore() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByNPSScore();
    }

    @Test
    public void filterNomineesByRelationship() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByRelationship();
    }

    @Test
    public void filterNomineesByChallengeCompletions() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByChallengeCompletions();
    }

    @Test
    public void filterNomineesByLastActivity() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByLastActivity();

    }
}
