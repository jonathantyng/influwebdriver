//This suite tests each invidvidual challenge type, with unique specs. 
package specs.admin.challenge;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import specs.admin.AbstractSpec;

public class CreateChallengeStages extends AbstractSpec {

    @Test
    public void canCreatePostToTwitterChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Post to Twitter")
                .addStage()
                .postToTwitterStage()
                .addStage()
                .postToTwitterStage()
                .chooseTypeOfTweet("Hashtag")
                .<pageobjects.admin.challenge.creator.stages.TwitterPost>pause(5000L)
                .inputRequiredContent("#paulsimon")
                .inputDefaultText("#paulsimon is the best")
                .saveChallenge();

        //insert assertion statement here 
    }

    @Test
    public void createTwitterFollowChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Twitter")
                .fillInName("Twitter Follow")
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

    }

    @Test
    public void canCreateJoinGroupChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("ChallengeDetails")
                .addStage()
                .joinAGroup()
                .selectExistingGroupFromDropdown("Fan")
                .saveChallenge();

    }

    @Test
    public void canCreateAReferralChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("Referral")
                .fillInName("Referral Challenge")
                .fillInHeadline("Referral Challenge for You!")
                .fillInDescription("Refer your friends")
                .addStage()
                .trackableReferralChallenge()
                .saveChallenge();
    }

    @Test
    public void canCreateAFacebookChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
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
    }

    @Test
    public void canCreateALinkedinChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .chooseChallengeType("LinkedIn")
                .fillInName("LinkedIn Challenge")
                .fillInHeadline("Join our LinkedIn Group!")
                .addStage()
                .linkedInJoinGroup()
                .fillInGroupURL("https://www.linkedin.com/groups/Influitives-Community-4449061")
                .validate()
                .saveChallenge();

        //Assert.assertEquals("LinkedIn Challenge", showPage.getChallengeName());
    }

    @Test
    public void createShareALinkChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("ChallengeName")
                .addStage()
                .shareALink()
                .fillInLinkDetails("reddit.com")
                .loadURL()
                .saveChallenge();

    }

    @Test
    public void completeAnActionOnline() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("ActionOnlineChallenge")
                .addStage()
                .onlineAction()
                .addLinkToContent("http://mccallspatternbehavior.tumblr.com/")
                .saveChallenge();
                //.dismissPublishTutorial()
        //.pause(5000000L);
        //.publishChallenge()
        //.updatePublishingOptions();

    }
//               

    @Test
    public void createNPSChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("NPS Challenge")
                .addStage()
                .npsStage()
                .saveChallenge();

        //assert some shit here.
    }

    @Test
    public void createUpdateYourProfileChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Update Yo Profile")
                .addStage()
                .updateYourProfileStage()
                .saveChallenge();
        //.publishChallenge();
    }

    @Test
    public void createAdvocateWorkflowChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Advocate Workflow")
                .addStage()
                .advocateWorkflow()
                .switchToTargeting()
                .targetToSpecificAdvocates()
                .targetByPosition("CEO")
                .saveChallenge();

    }

    @Test
    public void createAnswerSomeQuestionsChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Answer Some Questions")
                .addStage()
                .answerSomeQuestions()
                .generateQuestion()
                .saveChallenge();

    }

    @Test
    public void uploadAnImageChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Upload an Image")
                .addStage()
                .uploadAnImage()
                .saveChallenge();

    }

    @Test
    public void corporateConfirmationChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Upload an Image")
                .addStage()
                .advocateWorkflow()
                .addStage()
                .corporateConfirmationStage()
                .saveChallenge();

    }

    @Test

    public void geoCheckInChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Geo CheckIn")
                .addStage()
                .geoCheckInStage()
                .setGeoLocation("191 Niagara Toronto Ontario")
                .validateLocation()
                .saveChallenge();

    }

       @Test
    
    public void onlineReviewChallenge() {
        LoginPage start = new LoginPage(driver);
        start.loginAdministrator()
                .navigateToChallenges()
                .<pageobjects.admin.challenge.List>dismissTutorial()
                .addNewChallenge()
                .createBlankChallenge()
                .generateDetails("Online Review")
                .addStage()
                .onlineReviewStage()
                .linkToReviewContent("www.reddit.com")
                .<pageobjects.admin.challenge.Creator>pause(5000L);
    
    
    }
    //@Test for AppExchange
    //@Test for GetApp
}
