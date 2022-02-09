import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity09 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened Browser |");
        Reporter.log("Page title is " + driver.getTitle() + " |");
    }
    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("Test Case Setup started |");
        driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void simpleAlertTestCase() {
        Reporter.log("simpleAlertTestCase() started |");
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened |");

        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");
        String alertText = simpleAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");
        Assert.assertEquals("This is a JavaScript Alert!", alertText);

        simpleAlert.accept();
        Reporter.log("Alert closed");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("confirmAlertTestCase() started |");
        //Click the button to open a simple alert
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm Alert opened |");

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

        confirmAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 2)
    public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");
        String alertText = promptAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        promptAlert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert |");
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);

        promptAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }
    @AfterClass
    public void afterclass() {
        Reporter.log("Ending Test |");driver.quit();
    }

}
