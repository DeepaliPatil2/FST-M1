package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginTestSteps {
    WebDriver driver;
    @Given("^User is on Login Page$")
    public void User_is_on_Login_Page() {
        driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }

    @When("^User enters username and password$")
    public void userEntersUsernameAndPassword() {
        driver.findElement(By.cssSelector("#username")).sendKeys("admin");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

    }

    @Then("^Read the page title and confirmation message$")
    public void readThePageTitleAndConfirmationMessage() {
        String title=driver.getTitle();
        String msg=driver.findElement(By.cssSelector("#action-confirmation")).getText();
        System.out.println("Page Title : "+title+"\nMassage : "+msg);
    }

    @And("Close browser")
    public void closeBrowser() {
        driver.close();
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEntersAnd(String username , String password) {
        driver.findElement(By.cssSelector("#username")).sendKeys(username);
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }
}
