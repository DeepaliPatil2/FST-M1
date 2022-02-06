package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity07_2 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title : "+driver.getTitle());
        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class, 'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password");
        driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("Deepa.Patil@gmail.com");

        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        driver.close();
    }
}
