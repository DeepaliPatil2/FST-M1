package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Activity09_1 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Title : "+driver.getTitle());
        WebElement option = driver.findElement(By.id("single-value"));
        Select dropdown = new Select(driver.findElement(By.id("single-select")));
        dropdown.selectByVisibleText("Option 2");
        System.out.println(option.getText());

        dropdown.selectByIndex(3);
        System.out.println(option.getText());
        dropdown.selectByValue("4");
        System.out.println(option.getText());

        List<WebElement> options = dropdown.getOptions();
        for(WebElement op : options) {
            System.out.println("Option: " + op.getText());
        }

        driver.close();
    }
}
