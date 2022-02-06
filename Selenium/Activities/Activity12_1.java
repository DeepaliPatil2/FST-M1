package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


public class Activity12_1 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("  https://www.training-support.net/selenium/iframes");
        System.out.println("Title : "+driver.getTitle());

     driver.switchTo().frame(0);
     WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
     System.out.println(frameHeading1.getText());
     WebElement button1 = driver.findElement(By.cssSelector("button"));
     System.out.println(button1.getText());
     System.out.println(button1.getCssValue("background-color"));
     button1.click();
     System.out.println(button1.getText());
     System.out.println(button1.getCssValue("background-color"));
     driver.switchTo().defaultContent();
     driver.switchTo().frame(1);
     WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
     System.out.println(frameHeading2.getText());
     WebElement button2 = driver.findElement(By.cssSelector("button"));
     System.out.println(button2.getText());
     System.out.println(button2.getCssValue("background-color"));
     button2.click();
     System.out.println(button2.getText());
     System.out.println(button2.getCssValue("background-color"));
     driver.switchTo().defaultContent();
     driver.close();
    }
}
