package Admin;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Experience extends BaseClass {

    @Test
    public void Create_Experience() {

        WebDriverWait wait = new WebDriverWait(wd,5);


        //If tutorial hasn't been completed, dismiss pop-up.. Otherwise continue.


        boolean exists = wd.findElements( By.className("remove")).size() != 0;

        if (exists)
            {
                wd.findElement(By.className("remove")).click();
                System.out.println("Challenge Tutorial Dismissed");
            }
        else
            {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")));
                System.out.println("Tutorial not encountered");
            }

        //Navigate to settings page

        wd.findElement(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")).click();

        //Select Settings from dropdown

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Settings")));
        wd.findElement(By.linkText("Settings")).click();

        //Select Experiences

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"collapse-me0\"]/li[6]/a")));
        wd.findElement(By.xpath("//*[@id=\"collapse-me0\"]/li[6]/a")).click();

        //Create new Experience

        try { Thread.sleep(2000l); } catch (Exception e) { throw new RuntimeException(e); }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add Experience")));
        wd.findElement(By.linkText("Add Experience")).click();

        // Name/Description for new Experience

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("zone_name")));
        wd.findElement(By.id("zone_name")).sendKeys("New Experience");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("zone_description")));
        wd.findElement(By.id("zone_description")).sendKeys("Super Good Fun Time Experience");
        
        wd.findElement(By.id("link-targeting")).click();

        wd.findElement(By.id("save-button")).click();
        
        //Save Experience


    }
    
   
        
    @Test
    public void Create_Challenge_Experience(){
        
        WebDriverWait wait = new WebDriverWait(wd,5);
        
         boolean exists = wd.findElements( By.className("remove")).size() != 0;

        if (exists)
        {
            wd.findElement(By.className("remove")).click();
            System.out.println("Challenge Tutorial Dismissed");
        }
        else

        {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-bar\"]/div[1]/div/div/ul[1]/li/a")));
            System.out.println("Tutorial not encountered");
        }


            wd.findElement(By.id("Challenges")).click();
            wd.findElement(By.linkText("Add a challenge")).click();
            wd.findElement(By.id("create-new-challenge")).click();
            wd.findElement(By.name("name")).click();
            wd.findElement(By.name("name")).clear();
            wd.findElement(By.name("name")).sendKeys("Target to an Experience");
            wd.findElement(By.name("headline")).clear();
            wd.findElement(By.name("headline")).sendKeys("Target to an Experience");
            wd.findElement(By.name("description")).clear();
            wd.findElement(By.name("description")).sendKeys("Target to an Experience");
            wd.findElement(By.cssSelector("img.icon")).click();
            wd.findElement(By.xpath("//img[@alt='Advocate acceptance']")).click();
            wd.findElement(By.name("completion_text")).clear();
            wd.findElement(By.name("completion_text")).sendKeys("Experiences Rock!");
            wd.findElement(By.id("ui-id-2")).click();
            wd.findElement(By.name("New Experience")).click();
  }    
        
    
    
    }
            
            

     @After
    public void tearDown() {
        wd.quit();
    }
    
}


