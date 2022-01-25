package Live_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/*
Reading additional information
        Goal: Reading a popup that contains additional information about the account/lead.
        a. Open the browser to the Alchemy CRM site and login.
        b. Navigate to Sales -> Leads
        c. In the table, find the Additional information icon at the end of the row of the lead
        information. Click it.
        d. Read the popup and print the phone number displayed in it.
        e. Close the browser.
*/

public class Activity07 {
    public static WebDriver driver;
    @BeforeTest
    public void open_Browser() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void verify_icon_info() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@title='Log In']")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Sales']//parent::span//ul[1]//li[5]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tr[@class='oddListRowS1'][1]//td[10]/span[1]")).click();
    //    System.out.println("Clicked");
        Thread.sleep(3000);
        String text=driver.findElement(By.xpath("//span[@class='phone']")).getText();
        System.out.println("Phone number on popup : "+text);
    }
    @AfterTest
    public void close_Browser() {
        driver.close();
    }
}
