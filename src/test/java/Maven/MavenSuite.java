package Maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit suite


@SuppressWarnings("unused")
@RunWith(Suite.class)
@Suite.SuiteClasses({CompanyOne.class, CompanyTwo.class, CompanyThree.class, CompanyFour.class})

public class MavenSuite {

}