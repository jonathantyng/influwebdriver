package Advocate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Shannon on 2014-05-13.
 *
 */

//JUnit suite


@SuppressWarnings("unused")

@RunWith(Suite.class)

@Suite.SuiteClasses({AdvocateMenu.class, Advocate_Dashboard.class, leaderboard.class, ChallengesPage.class, Community.class, Rewards.class, AdvocateDropdown.class,
AdvocateProfile.class, Messages.class, AdvocateChallengeCompletion.class, Events.class, })

public class Sanity {

}
