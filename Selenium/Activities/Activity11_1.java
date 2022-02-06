package Java;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity11_1 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title : "+driver.getTitle());
     driver.findElement(By.cssSelector("button#simple")).click();
     Alert simpleAlert = driver.switchTo().alert();
     System.out.println("Alert text is: " + simpleAlert.getText());
     simpleAlert.accept();
     driver.close();
    }
}
