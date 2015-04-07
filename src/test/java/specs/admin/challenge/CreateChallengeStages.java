//This suite tests each invidvidual challenge type, with unique specs. 
package specs.admin.challenge;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.challenge.Show;
import specs.admin.AbstractSpec;

public class CreateChallengeStages extends AbstractSpec {

     @Test
    public void canCreatePostToTwitterChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Post to Twitter";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .postToTwitterStage()
                .chooseTypeOfTweet("Hashtag")
                .inputRequiredContent("#paulsimon")
                .inputDefaultText("#paulsimon is the best")
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test
    public void createTwitterFollowChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Twitter Follow";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Twitter")
                .fillInName(challengeName)
                .fillInDescription("Follow us on Twitter")
                .fillInHeadline("Tweet Tweet!")
                .addStage()
                .twitterFollowStage()
                .addTwitterUserToFollow("Pepsi")
                .validateTwitterUser()
                .switchToTargeting()
                .targetToSpecificAdvocates()
                .targetByPosition("CEO")
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test
    public void canCreateJoinGroupChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Join Group Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .joinAGroup()
                .selectExistingGroupFromDropdown("Fan")
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());
    }

    @Test
    public void canCreateAReferralChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Referral Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Referral")
                .fillInName(challengeName)
                .fillInHeadline("Referral Challenge for You!")
                .fillInDescription("Refer your friends")
                .addStage()
                .trackableReferralChallenge()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test
    public void canCreateAFacebookChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Facebook Challenge";

        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Facebook")
                .fillInName("Facebook Challenge")
                .fillInDescription("This is a Facebook challenge")
                .fillInHeadline("Facebook Challenge")
                .addStage()
                .facebookLikeStage()
                .addFacebookPageURL("https://www.facebook.com/PepsiCanada")
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());
    }

    @Test
    public void canCreateALinkedinChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "LinkedIn Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("LinkedIn")
                .fillInName(challengeName)
                .fillInHeadline("Join our LinkedIn Group!")
                .addStage()
                .linkedInJoinGroup()
                .fillInGroupURL("https://www.linkedin.com/groups/Influitives-Community-4449061")
                .validate()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());
    }

    @Test
    public void createShareALinkChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Share A Link Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .shareALink()
                .fillInLinkDetails("reddit.com")
                .loadURL()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test
    public void completeAnActionOnline() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Online Action Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .onlineAction()
                .addLinkToContent("http://mccallspatternbehavior.tumblr.com/")
                .saveChallenge();
                //.dismissPublishTutorial()
        //.pause(5000000L);
        //.publishChallenge()
        //.updatePublishingOptions();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }
//               

    @Test
    public void createNPSChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "NPS Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .npsStage()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());
    }

    @Test
    public void createUpdateYourProfileChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Update Yo Profile";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .updateYourProfileStage()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test
    public void createAdvocateWorkflowChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Advocate Workflow";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .advocateWorkflow()
                .switchToTargeting()
                .targetToSpecificAdvocates()
                .targetByPosition("CEO")
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test
    public void createAnswerSomeQuestionsChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Answer Some Questions";

        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .answerSomeQuestions()
                .generateQuestion()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test
    public void uploadAnImageChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Upload an Image";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .uploadAnImage()
                .saveChallenge();

        Assert.assertEquals(challengeName, challengeShow.getChallengeName());
    }

    @Test
    public void corporateConfirmationChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Corporate Confirmation Challenge";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .advocateWorkflow()
                .addStage()
                .corporateConfirmationStage()
                .saveChallenge();
        
        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test

    public void geoCheckInChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Geo CheckIn";
        
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .geoCheckInStage()
                .setGeoLocation("191 Niagara Toronto Ontario")
                .validateLocation()
                .saveChallenge();
        
        Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }

    @Test

    public void onlineReviewChallenge() {
        LoginPage start = new LoginPage(driver);
        final String challengeName = "Online Review";
        final Show challengeShow = start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails(challengeName)
                .addStage()
                .onlineReviewStage()
                .linkToReviewContent("http://www.reddit.com")
                .saveChallenge();
        
          Assert.assertEquals(challengeName, challengeShow.getChallengeName());

    }
    //@Test for AppExchange
    //@Test for GetApp
}
