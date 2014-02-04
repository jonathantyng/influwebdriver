package Admin;

//JUnit suite

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuppressWarnings("unused")
@RunWith(Suite.class)
@SuiteClasses({create_company.class, create_company_settings.class, social_signup.class, badge_activity.class, badge_points_reached.class, group_email.class, group_sanity.class, group_test.class})

public class CompanyCreation_Suite {

}