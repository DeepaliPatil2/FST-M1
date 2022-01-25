package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        e. Close the browser
*/

public class Activity02 {
    public static WebDriver driver;
    @BeforeTest
    public void open_Browser() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void verify_url_of_header_image() {
        String src= driver.findElement(By.xpath("//div[@class='companylogo']//img")).getAttribute("src");
        System.out.println("URL of header image "+src);
    }
    @AfterTest
    public void close_Browser() {
        driver.close();
    }
}
