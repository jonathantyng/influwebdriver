package Admin;

//JUnit suite

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuppressWarnings("unused")

@RunWith(Suite.class)

@SuiteClasses({Admin_Advocate_Actions.class, Admin_Challenge_Actions.class, Admin_Advocates_Tab.class, Admin_Challenges_Tab.class, Admin_Dashboard.class, Admin_Groups_Tab.class, Admin_Nominee_Tab.class, Admin_Rewards_Tab.class, Admin_Settings_Tab.class, Admin_Email_Settings_Tab.class})


public class Admin_Suite {

}