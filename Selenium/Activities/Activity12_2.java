package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity12_2 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("  https://www.training-support.net/selenium/iframes");
        System.out.println("Title : "+driver.getTitle());

     driver.switchTo().frame(0);
     WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
     System.out.println(frameHeading1.getText());
     driver.switchTo().defaultContent();
     driver.switchTo().frame(1);
     WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
     System.out.println(frameHeading2.getText());
     driver.close();
    }
}
