package Live_Project;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
/*

. Verify the website title
        Goal: Read the title of the website and verify the text
        a. Open a browser.
        b. Navigate to ‘http://alchemy.hguy.co/crm’.
        c. Get the title of the website.
        d. Make sure it matches “SuiteCRM” exactly.
        e. If it matches, close the browser.
*/

public class Activity01 {
    public static WebDriver driver;
    @BeforeTest
    public void open_Browser() {
        driver = new FirefoxDriver();
          driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void verify_Title(){
        Assert.assertEquals(driver.getTitle(),"SuiteCRM","Title is matched");
    }
    @AfterTest
    public void close_Browser() {
        driver.close();
    }
}
