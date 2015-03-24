package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class persistent_referral extends BaseClass{


        @Test
        public void edit_persistent_referral_challenge() {

            WebDriverWait wait = new WebDriverWait(wd, 5);

            //Navigate to the challenge tab

            wd.findElement(By.id("Challenges")).click();

            //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

            boolean exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

            if (exists)
            {
                wd.findElement(By.linkText("No Thanks")).click();
                System.out.println("Challenge Tutorial Dismissed");
            }
            else
            {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a Challenge")));
                System.out.println("Tutorial not encountered");
            }

            //Search for persistent referral challenge and select

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_name_or_headline_contains")));
            wd.findElement(By.id("search_name_or_headline_contains")).sendKeys("Persistent");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Persistent Trackable Referral Challenge")));
            wd.findElement(By.linkText("Persistent Trackable Referral Challenge")).click();

            //Close publish challenge modal if it appears

            boolean close = wd.findElements( By.linkText("x")).size() != 0;

            if (close)
            {
                wd.findElement(By.linkText("x")).click();
                System.out.println("Publish tutorial dismiss");
            }
            else
            {
                System.out.println("Publish tutorial not encoutnered");
            }

            //Edit the challenge

            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Edit")));
            wd.findElement(By.linkText("Edit")).click();

            //Navigate to the lead synch stage

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#ui-id-4 > img.icon")));
            wd.findElement(By.cssSelector("#ui-id-4 > img.icon")).click();

            //Edit settings

            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Edit")));
            wd.findElement(By.linkText("Edit")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("lead_status[01Ji00000025nZjEAI]")));
            wd.findElement(By.name("lead_status[01Ji00000025nZjEAI]")).click();
            wd.findElement(By.xpath("(//input[@name='lead_status[01Ji00000025nZkEAI]'])[2]")).click();
            wd.findElement(By.name("lead_status[01Ji00000025nZmEAI]")).click();
            wd.findElement(By.xpath("(//input[@name='lead_status[01Ji00000025nZlEAI]'])[3]")).click();

            //Save changes

            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit-lead-status-mappings")));
            wd.findElement(By.id("submit-lead-status-mappings")).click();

            //Save challenge

            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("commit")));
            wd.findElement(By.name("commit")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        }
        @After
        public void tearDown() {
             wd.quit();
        }
    }


