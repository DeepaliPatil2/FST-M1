package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Activity03 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title : "+driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Deepali");
        driver.findElement(By.id("lastName")).sendKeys("Patil");
        driver.findElement(By.id("email")).sendKeys("Deepali.Patil@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9878767676");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.className("green")).click();
       driver.close();
    }
}