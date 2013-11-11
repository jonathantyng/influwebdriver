package alice_advocate;

import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.*;

public class alice_appex_complete extends BaseClassTwo{

    @Test
    public void appex() {

        //Log in as alice

        wd.get("http://sanitynov11.influitives.com/challenges/41");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).clear();
        wd.findElement(By.id("user_email")).sendKeys("alice.advocate@gmail.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).clear();
        wd.findElement(By.id("user_password")).sendKeys("macbook18");
        wd.findElement(By.id("sign-in-button")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Enter saleforce user info

        wd.findElement(By.id("app_exchange_handle_text_")).click();
        wd.findElement(By.id("app_exchange_handle_text_")).clear();
        wd.findElement(By.id("app_exchange_handle_text_")).sendKeys("Ken Lague");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Click 'Take me there' to view appexchange review site

        wd.findElement(By.linkText("Take Me There")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Store original handle

        String winHandleBefore = wd.getWindowHandle();

        //Switch to new tab

        for(String winHandle : wd.getWindowHandles()){
            wd.switchTo().window(winHandle);
        }

        //Close the new tab

        wd.close();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }

        //Switch to original tab

        wd.switchTo().window(winHandleBefore);

        //Complete the challenge

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

    }

    @After
    public void tearDown() {
        wd.quit();
    }
}
