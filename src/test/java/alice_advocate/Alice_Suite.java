package alice_advocate;

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
@Suite.SuiteClasses({alice_sign.class, alice_reset.class, alice_appex_complete.class})

public class Alice_Suite {

}
