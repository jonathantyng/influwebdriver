package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class sfdc_reference extends BaseClass{

    @Test
    public void sfdc() {

        //Log in to SFDC Dev account

        wd.get("http://developer.force.com/");
        wd.findElement(By.linkText("DE LOGIN")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys("patrick@influitive.com");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("1nflu1t1v3");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("Login")).click();

        //Edit reference button

        wd.findElement(By.id("Customize_font")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("Opportunity_font")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("OpportunityLinks_font")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Request a Reference 2")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("edit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("WebLinkFields_ContentEditor")).click();
        wd.findElement(By.id("WebLinkFields_ContentEditor")).clear();
        wd.findElement(By.id("WebLinkFields_ContentEditor")).sendKeys("http://april14.influitives.com/corporate/request_reference?embedded=true&salesforce_org_id={!$Organization.Id}&salesforce_opp_id={!Opportunity.Id}&owner_id={!$User.Id}&opp_name={!Opportunity.Name}&session_id={!API.Session_ID}&api_partner_server_url={!API.Partner_Server_URL_90}");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("save_close")).click();

        //Create new reference request

        wd.findElement(By.linkText("Opportunities")).click();
        wd.findElement(By.linkText("DATGUY-")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("request_a_reference_2")).click();

        //Focus on new window

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }
        //Save challenge

        wd.findElement(By.id("link-recommend an advocate")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("Close this window to return to the opportunity.")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @After
    public void tearDown() {
        wd.quit();
    }
}
