package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/*Traversing tables 2
Goal: Open the leads page and print the usernames and full names from the table.
a. Open the browser to the Alchemy CRM site and login.
b. Navigate to the Sales -> Leads.
c. Find the table on the page and print the first 10 values in the Name column and
the User column of the table to the console.
d. Close the browser
*/
public class Activity09 {
   public static WebDriver driver;
   @BeforeTest
   public void open_Browser() {
       driver = new FirefoxDriver();
       driver.get("http://alchemy.hguy.co/crm");
   }
   @Test
   public void traversing_tables2() throws InterruptedException {

       driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
       driver.findElement(By.xpath("//input[@title='Log In']")).click();
       Thread.sleep(20);
       driver.findElement(By.xpath("//a[text()='Sales']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Sales']//parent::span//ul[1]//li[5]")).click();
       Thread.sleep(3000);
       List<WebElement> all_Names=driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody[1]//tr//td[@type='name']//b//a"));
       System.out.println(".... First 10 values in the Name column ...");
       Thread.sleep(4000);
       for (int i=0;i<10;i++) {
           System.out.println(all_Names.get(i).getText());
       }
       List<WebElement> all_users=driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody[1]//td[8]//a"));
       System.out.println("\n....First 10 values in the User column ...");
       Thread.sleep(4000);
       for (int i=0;i<10;i++) {
           System.out.println(all_users.get(i).getText());
       }
   }
   @AfterTest
   public void close_Browser() {
       driver.close();
   }
}
