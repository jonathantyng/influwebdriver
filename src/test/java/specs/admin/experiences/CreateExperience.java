
package specs.admin.experiences;

import org.junit.Assert;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.admin.experiences.List;
import specs.admin.AbstractSpec;


public class CreateExperience extends AbstractSpec{

    @Test
    public void canCreateNewExperience (){
    LoginPage start = new LoginPage(driver);
    final String experienceName = "Super Happy Fun Time";
    final List experienceList = start.loginAdministrator()
         .navigateToExpereinces()
         .addAnExperience()
         .fillInExperienceName(experienceName)
         .fillInExperienceDescription("Where fun stuff happens!")
         .createExperienceURL("FunTime")
         .switchToExperienceTargeting()
         .targetByAdvocate()
         .saveExperience();

         Assert.assertEquals(experienceName, experienceList.getExperienceName());
    
    }    
}
