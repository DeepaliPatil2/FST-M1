package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class Activity04_1 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of main window: "+driver.getTitle());
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        System.out.println("Title of new window: "+driver.getTitle());
        driver.close();
    }
}
