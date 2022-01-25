package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
/*

Menu checking
        Goal: Make sure that the “Activities” menu item exists and is clickable
        a. Open a browser.
        b. Navigate to ‘http://alchemy.hguy.co/crm’ and login using the credentials
        provided.
        c. Locate the navigation menu.
        d. Ensure that the “Activities” menu item exists.
        e. Close the browser
*/

public class Activity06 {
    public static WebDriver driver;
    @BeforeTest
    public void open_Browser() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void verify_menu_item_exits() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@title='Log In']")).click();
        Thread.sleep(20);
        List<WebElement> allmenu = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']//li[@class='topnav']//span[2]//a[@class='dropdown-toggle grouptab']"));

        for (WebElement menu : allmenu) {
            String value = menu.getText();

            if (value.equals("ACTIVITIES")) {
                System.out.println("Activities menu item exists");
                menu.click();
                System.out.println("Activities menu item is Clickable");
                break;
            }
        }
    }
    @AfterTest
    public void close_Browser() {
        driver.close();
    }
}
