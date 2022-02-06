package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity10_2 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title : "+driver.getTitle());
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
        Actions actions = new Actions(driver);
     WebElement pressedKey = driver.findElement(By.id("keyPressed"));
     Action actionSequence1 = actions.sendKeys("S").build();
     actionSequence1.perform();
     System.out.println("Pressed key is: " + pressedKey.getText());
     Action actionSequence2 = actions
             .keyDown(Keys.CONTROL)
             .sendKeys("a")
             .sendKeys("c")
             .keyUp(Keys.CONTROL)
             .build();
     actionSequence2.perform();
     System.out.println("Pressed key is: " + pressedKey.getText());

     driver.close();
    }
}
