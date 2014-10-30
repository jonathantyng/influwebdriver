package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sfdc_reference extends BaseClass{

    @Test
    public void sfdc() {

        WebDriverWait wait = new WebDriverWait(wd, 5);

        //Log in to SFDC Dev account

        wd.get("http://salesforce.com/");
        wd.findElement(By.linkText("Login")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        wd.findElement(By.id("username")).sendKeys("patrick@influitive.com");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        wd.findElement(By.id("password")).sendKeys("1nflu1t1v3");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Login")));
        wd.findElement(By.id("Login")).click();

        //Edit reference button

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Customize_font")));
        wd.findElement(By.id("Customize_font")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Opportunity_font")));
        wd.findElement(By.id("Opportunity_font")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("OpportunityLinks_font")));
        wd.findElement(By.id("OpportunityLinks_font")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Request a Reference 2")));
        wd.findElement(By.linkText("Request a Reference 2")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("edit")));
        wd.findElement(By.name("edit")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("WebLinkFields_ContentEditor")));
        wd.findElement(By.id("WebLinkFields_ContentEditor")).click();
        wd.findElement(By.id("WebLinkFields_ContentEditor")).clear();
        wd.findElement(By.id("WebLinkFields_ContentEditor")).sendKeys("http://may14.influitiveqa.com/corporate/request_reference?embedded=true&salesforce_org_id={!$Organization.Id}&salesforce_opp_id={!Opportunity.Id}&owner_id={!$User.Id}&opp_name={!Opportunity.Name}&session_id={!API.Session_ID}&api_partner_server_url={!API.Partner_Server_URL_90}");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("save_close")));
        wd.findElement(By.name("save_close")).click();

        //Create new reference request

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Opportunities")));
        wd.findElement(By.linkText("Opportunities")).click();
        wd.findElement(By.linkText("DATGUY-")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("request_a_reference_2")));
        wd.findElement(By.name("request_a_reference_2")).click();

        //Focus on new window

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }
        //Save challenge

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("link-recommend an advocate")));
        wd.findElement(By.id("link-recommend an advocate")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
        wd.findElement(By.name("commit")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Close this window to return to the opportunity.")));
        wd.findElement(By.linkText("Close this window to return to the opportunity.")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @After
    public void tearDown() {
        wd.quit();
    }
}
