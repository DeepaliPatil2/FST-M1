package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/*

 Getting colors
         Goal: Get the color of the navigation menu
         a. Open a browser.
         b. Navigate to ‘http://alchemy.hguy.co/crm’ and login using the credentials
         provided.
         c. Get the color of the navigation menu and print it to the console.
         d. Close the browser.
*/

public class Activity04 {
        public static WebDriver driver;
        @BeforeTest
        public void open_Browser() {
            driver = new FirefoxDriver();
            driver.get("http://alchemy.hguy.co/crm");
        }
        @Test
        public void verify_homepage_opened(){
            driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@title='Log In']")).click();
        WebElement home_icon=driver.findElement(By.xpath("//a[@class='navbar-brand with-home-icon suitepicon suitepicon-action-home']"));
        Assert.assertTrue(home_icon.isDisplayed(),"Homepage has opened");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @AfterTest
    public void close_Browser() {
        driver.close();
    }
}
