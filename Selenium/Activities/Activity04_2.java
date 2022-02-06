package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class Activity04_2 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title : "+driver.getTitle());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Deepali");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patil");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Deepali.Patil@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9878767676");
        driver.findElement(By.xpath("//textarea")).sendKeys("This is all about me");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.className("green")).click();
        driver.close();
    }
}
