package test;

//JUnit suite

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuppressWarnings("unused")
@RunWith(Suite.class)
@SuiteClasses({create_company.class, create_company_settings.class, social_signup.class})

public class CompanyCreation_Suite {

}