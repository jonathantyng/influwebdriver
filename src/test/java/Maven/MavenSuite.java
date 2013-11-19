package Maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.*;

//JUnit suite

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuppressWarnings("unused")
@RunWith(Suite.class)
@Suite.SuiteClasses({CompanyOne.class, CompanyTwo.class, CompanyThree.class, CompanyFour.class})

public class MavenSuite {

}