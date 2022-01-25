package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*

Get the copyright text
        Goal: Print the first copyright text in the footer to the console
        a. Open a browser.
        b. Navigate to ‘http://alchemy.hguy.co/crm’.
        c. Get the first copyright text in the footer.
        d. Print the text to the console.
        e. Close the browse
*/

public class Activity03 {
    public static WebDriver driver;
    @BeforeTest
    public void open_Browser() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void verify_copyright_text(){
        String copyright_text = driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
        System.out.println("Copyright text : "+copyright_text);
    }
    @AfterTest
    public void close_Browser() {
        driver.close();
    }
}
