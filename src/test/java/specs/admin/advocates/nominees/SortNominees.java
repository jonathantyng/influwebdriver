package specs.admin.advocates.nominees;

import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class SortNominees extends AbstractSpec {

    @Test
    public void sortNomineesByName() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByName();

    }

    @Test
    public void sortNomineesBySource() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesBySource();
    }

    @Test
    public void sortNomineesByNPSScore() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByNPSScore();
    }

    @Test
    public void sortNomineesByRelationship() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByRelationship();
    }

    @Test
    public void sortNomineesByChallengeCompletions() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByChallengeCompletions();
    }

    @Test
    public void sortNomineesByLastActivity() {

        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToAdvocates()
                .inviteNominees()
                .sortNomineesByLastActivity();

    }
}
