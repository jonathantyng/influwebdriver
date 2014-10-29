package Page;

import org.junit.Test;

/**
 * Created by shannon on 2014-06-20.
 */
public class scroll extends BasePage{

    @Test
    public void testing(){

        wd.get("http://www.cnn.com");
// TODO: This should scroll to an element
//        wd.executeScript("window.scrollBy(0,500)");



                  try {
                        Thread.sleep(30001);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

    }

}
