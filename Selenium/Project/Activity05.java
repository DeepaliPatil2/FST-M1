package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*

Getting colors
         Goal: Get the color of the navigation menu
         a. Open a browser.
         b. Navigate to ‘http://alchemy.hguy.co/crm’ and login using the credentials
         provided.
         c. Get the color of the navigation menu and print it to the console.
         d. Close the browser.
*/

public class Activity05 {
    public static WebDriver driver;
        @BeforeTest
    public void open_Browser() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void Verify_color(){
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@title='Log In']")).click();
        String color=driver.findElement(By.xpath("//div[@id='toolbar']")).getCssValue("color");
        System.out.println("Color : "+color);
    }
    @AfterTest
    public void close_Browser() {
        driver.close();
    }
}
