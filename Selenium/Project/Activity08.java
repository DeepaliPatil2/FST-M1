package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/*Traversing tables
        Goal: Open the accounts page and print the contents of the table.
        a. Open the browser to the Alchemy CRM site and login.
        b. Navigate to the Sales -> Accounts page.
        c. Find the table on the page and print the names of the first 5 odd-numbered rows
        of the table to the console.
        d. Close the browser.
*/
public class Activity08 {
    public static WebDriver driver;
    @BeforeTest
    public void open_Browser() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void traversing_tables() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@title='Log In']")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("//a[text()='Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Sales']//parent::span//ul[1]//li[2]")).click();
        Thread.sleep(3000);
        List<WebElement> all_Odd_Names=driver.findElements(By.xpath("//tr[@class='oddListRowS1']//td[@type='name']//b//a"));
        System.out.println("....Names of first 5 odd-numbered rows...");
        Thread.sleep(4000);
        for (int i=0;i<5;i++) {
            System.out.println(all_Odd_Names.get(i).getText());
        }
    }
    @AfterTest
    public void close_Browser() {
        //driver.close();
    }
}
