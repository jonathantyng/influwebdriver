package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class join_group extends BaseClass{

    @Test
    public void join_group() {
        WebDriverWait wait = new WebDriverWait(wd, 5);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Challenges")));
        wd.findElement(By.id("Challenges")).click();


        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.

        boolean  exists = wd.findElements( By.linkText("No Thanks")).size() != 0;

        if (exists)
        {
            wd.findElement(By.linkText("No Thanks")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else
        {
            System.out.println("Tutorial not encountered");
            wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add a Challenge")));
        }

        //Add join group challenge

        wd.findElement(By.linkText("Add a challenge")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Start With Blank Challenge")));
        wd.findElement(By.linkText("Start With Blank Challenge")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        wd.findElement(By.name("name")).sendKeys("Join Group");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }


        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("#s2id_challenge_type_id0 > a.select2-choice > span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("input.select2-input.select2-focused")).sendKeys("Join Group");
        wd.findElement(By.className("select2-match")).click();
        wd.findElement(By.name("headline")).click();
        wd.findElement(By.name("headline")).clear();
        wd.findElement(By.name("headline")).sendKeys("Join Group");
        wd.findElement(By.name("description")).click();
        wd.findElement(By.name("description")).clear();
        wd.findElement(By.name("description")).sendKeys("Join this awesome group! You will be rewarded with cool offers and prizes!");
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.cssSelector("label.input.checkbox")).click();
        //wd.findElement(By.xpath("//div[@id='challenge']/section/fieldset[2]/label[2]")).click();
        wd.findElement(By.cssSelector("#add-stage > img.icon")).click();
        wd.findElement(By.xpath("//img[@alt='Influitive group join']")).click();
        //wd.findElement(By.xpath("//*[@id=\"stages\"]/ol/li[13]")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//div[@id='s2id_params.group_id17']/a/span")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.xpath("//div[@id='select2-drop']/ul/li[2]/div")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        //wd.findElement(By.className("select2-match")).click();
        //try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.id("ui-id-2")).click();
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.linkText("NOT PUBLISHED")).click();
        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }
        wd.findElement(By.name("commit")).click();
        try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
