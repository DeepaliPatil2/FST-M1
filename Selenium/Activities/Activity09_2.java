package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class Activity09_2 {
    public static void main(String[] args) {

       WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/selects");
        System.out.println("Title : "+driver.getTitle());
        WebElement option = driver.findElement(By.id("multi-value"));
        Select multiList = new Select(driver.findElement(By.id("multi-select")));

        if(multiList.isMultiple()) {

            multiList.selectByVisibleText("Javascript");
            System.out.println(option.getText());
            multiList.selectByValue("node");
            System.out.println(option.getText());
            for(int i=4; i<=6; i++) {
                multiList.selectByIndex(i);
            }
            System.out.println(option.getText());

            multiList.deselectByValue("node");
            System.out.println(option.getText());
            multiList.deselectByIndex(7);
            System.out.println(option.getText());
            List<WebElement> selectedOptions = multiList.getAllSelectedOptions();
            for(WebElement selectedop : selectedOptions) {
                System.out.println("Selected option: " + selectedop.getText());
            }
            multiList.deselectAll();
            System.out.println(option.getText());
        }
        driver.close();
    }
}
