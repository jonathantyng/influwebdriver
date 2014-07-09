package Admin;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class persistent_referral extends BaseClass{


        @Test
        public void Blog_Post() {

            //Sign in as super admin

            wd.findElement(By.id("user_email")).sendKeys("admin@influitive.com");
            wd.findElement(By.id("user_password")).sendKeys("1nflu1t1v3");
            wd.findElement(By.id("sign-in-button")).click();

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
                try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
                System.out.println("Tutorial not encountered");
            }

            //Search for persistent referral challenge and select

            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.id("search_name_or_headline_contains")).sendKeys("Persistent");
            try { Thread.sleep(5000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.linkText("Persistent Trackable Referral Challenge")).click();

            //Close publish challenge modal if it appears

            boolean close = wd.findElements( By.linkText("x")).size() != 0;

            if (close)
            {
                wd.findElement(By.linkText("x")).click();
                try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
                System.out.println("Publish tutorial dismiss");
            }
            else
            {
                try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
                System.out.println("Publish tutorial not encoutnered");
            }

            //Edit the challenge

            wd.findElement(By.linkText("Edit")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

            //Navigate to the lead synch stage

            wd.findElement(By.cssSelector("#ui-id-4 > img.icon")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

            //Edit settings

            wd.findElement(By.linkText("Edit")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.name("lead_status[01Ji00000025nZjEAI]")).click();
            wd.findElement(By.xpath("(//input[@name='lead_status[01Ji00000025nZkEAI]'])[2]")).click();
            wd.findElement(By.name("lead_status[01Ji00000025nZmEAI]")).click();
            wd.findElement(By.xpath("(//input[@name='lead_status[01Ji00000025nZlEAI]'])[3]")).click();

            //Save changes

            wd.findElement(By.id("submit-lead-status-mappings")).click();
            try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }

            //Save challenge

            wd.findElement(By.name("commit")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        }
        @After
        public void tearDown() {
             wd.quit();
        }
    }


