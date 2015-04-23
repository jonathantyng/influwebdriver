
package specs.admin.experiences;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.experiences.Show;
import specs.admin.AbstractSpec;


public class CreateExperience extends AbstractSpec{

    @Test
    public void canCreateNewPublicExperience (){
    LoginPage start = new LoginPage(driver);
    final String experienceName = "Public Experience";
    final Show experienceList = start.loginAdministrator()
         .navigateToExpereinces()
         .addAnExperience()
         .fillInExperienceName(experienceName)
         .fillInExperienceDescription("Where fun stuff happens!")
         /*.createExperienceURL("FunTime")   This doesnt work, because you cant reuse ExperienceURLS - once it's created once, it fails every time afterwards. */
         .switchToExperienceTargeting()
         .targetByAdvocate()
         .saveExperience();

         Assert.assertEquals(experienceName, experienceList.getExperienceName());
    
    }    
    
    @Test 
    public void canCreateNewPrivateExperience(){
    LoginPage start = new LoginPage(driver);
    final String experienceName = "Private Experience";
    final Show experienceList = start.loginAdministrator()
            .navigateToExpereinces()
            .addAnExperience()
            .fillInExperienceName(experienceName)
            .fillInExperienceDescription("You're not invited unless I tell you the secret code")
            .makeExperiencePrivate()
            .switchToExperienceTargeting()
            .saveExperience();
    
            Assert.assertEquals(experienceName, experienceList.getExperienceName());

    }
}
