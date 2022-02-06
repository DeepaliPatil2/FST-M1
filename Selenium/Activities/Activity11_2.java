package Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity11_2 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title : "+driver.getTitle());
        driver.findElement(By.cssSelector("button#confirm")).click();

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();
     System.out.println("Alert text is: " + confirmAlert.getText());
        confirmAlert.accept();
     driver.close();
    }
}
