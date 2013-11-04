package alice_advocate;

import org.junit.Test;

import org.openqa.selenium.*;

public class alice_sign extends BaseClassTwo {

    @Test
    public void alice_s() {

    //Sign into app and access challenge screen

        wd.get("http://nov4.influitiveqa.com/join/Test");

        boolean newuser = wd.findElements( By.id("registration_user_email")).size() != 0;

        if (newuser)
        {
            wd.findElement(By.id("registration_user_email")).click();
            wd.findElement(By.id("registration_user_email")).click();
            wd.findElement(By.id("registration_user_email")).sendKeys("alice.advocate@gmail.com");
            wd.findElement(By.id("registration_contact_name")).click();
            wd.findElement(By.id("registration_contact_name")).click();
            wd.findElement(By.id("registration_contact_name")).sendKeys("Alice Advocate");
            wd.findElement(By.id("registration_user_password")).click();
            wd.findElement(By.id("registration_user_password")).click();
            wd.findElement(By.id("registration_user_password")).sendKeys("macbook18");
            wd.findElement(By.name("commit")).click();
        }
        else
        {
            wd.findElement(By.id("user_email")).click();
            wd.findElement(By.id("user_email")).clear();
            wd.findElement(By.id("user_email")).sendKeys("alice.advocate@gmail.com");
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.id("user_password")).click();
            wd.findElement(By.id("user_password")).clear();
            wd.findElement(By.id("user_password")).sendKeys("macbook18");
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.id("sign-in-button")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        }

    //Complete tutorial

        boolean exists = wd.findElements( By.linkText("Get Started!")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("Get Started!")).click();
            try { Thread.sleep(10000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.id("activity_responses_attributes_0_body_offer_my_expertise_to_help_others_when_i_can")).click();
            wd.findElement(By.name("commit")).click();
            wd.findElement(By.id("activity_responses_attributes_0_body_offer_tickets_to_a_popular_industry_event")).click();
            wd.findElement(By.name("commit")).click();
            wd.findElement(By.id("activity_responses_attributes_0_body_an_expert_customer_who_is_willing_to_help_new_customers")).click();
            wd.findElement(By.name("commit")).click();
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
            wd.findElement(By.id("activity_responses_attributes_0_body_facebook")).click();
            wd.findElement(By.name("commit")).click();
            wd.findElement(By.linkText("Let's start your next challenge")).click();

        }
        else
        {
            try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        }
    }
}
