package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class Activity04_3 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/target-practice");
        System.out.println("Title : "+driver.getTitle());
      String text1=  driver.findElement(By.cssSelector("#third-header")).getText();
      System.out.println("Third header text : "+text1);

        String text2=driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fifth header text color is : "+text2);
        String text3 = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes are: " + text3);
        String text4 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + text4);
        driver.close();
    }
}
