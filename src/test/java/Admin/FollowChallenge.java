/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FollowChallenge extends BaseClass{

  @Test
    public void follow() {

        WebDriverWait wait = new WebDriverWait(wd, 5);  
      
    wd.findElement(By.id("Challenges")).click();
    wd.findElement(By.id("NoThanks")).click();
    wd.findElement(By.linkText("Influitive Admin")).click();
    wd.findElement(By.linkText("Settings")).click();
    wd.findElement(By.xpath("//ul[@id='accordion']/li[4]/h4")).click();
    wd.findElement(By.linkText("Influitive Labs")).click();
    wd.findElement(By.id("toggles_corporate_challenge_follow")).click();
    wd.findElement(By.name("commit")).click();
    wd.findElement(By.id("Challenges")).click();
    wd.findElement(By.cssSelector("#challenge-23 > div.id > div.channel-fav-container > a.corporate-challenge-follow")).click();
    wd.findElement(By.cssSelector("a.corporate-challenge-follow")).click();
    wd.findElement(By.cssSelector("#challenge-22 > div.id > div.channel-fav-container > a.corporate-challenge-follow")).click();
    wd.findElement(By.cssSelector("#challenge-22 > div.id > div.channel-fav-container > a.corporate-challenge-follow.followed")).click();
    wd.findElement(By.cssSelector("#challenge-23 > div.id > div.channel-fav-container > a.corporate-challenge-follow.followed")).click();
    wd.findElement(By.cssSelector("a.corporate-challenge-follow.followed")).click();
    wd.findElement(By.cssSelector("#challenge-23 > div.id > div.channel-fav-container > a.corporate-challenge-follow")).click();
    wd.findElement(By.id("Advocates")).click();
    wd.findElement(By.id("Challenges")).click();

  }

  @After
    public void tearDown() {
        wd.quit();
    }
 
}

