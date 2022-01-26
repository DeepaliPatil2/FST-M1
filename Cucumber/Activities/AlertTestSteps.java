package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertTestSteps {
    WebDriver driver;

    @Given("^User is on the page$")
    public void user_is_on_page() {
        driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }

    @When("^User clicks the Simple Alert button$")
    public void userClicksTheSimpleAlertButton() {
        driver.findElement(By.cssSelector("#simple")).click();
    }
    @When("^User clicks the Confirm Alert button$")
    public void userClicksTheConfirmAlertButton() {
        driver.findElement(By.cssSelector("#confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void userClicksThePromptAlertButton() {
        driver.findElement(By.cssSelector("#prompt")).click();
    }

    @Then("^Alert opens$")
    public void alertOpens() {
        driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void readTheTextFromItAndPrintIt() {
        String popuptext=driver.switchTo().alert().getText();
        System.out.println("Text : "+popuptext);
    }

    @And("^Close the alert$")
    public void closeTheAlert() {
        driver.switchTo().alert().accept();
    }

    @And("^Read the result text$")
    public void readTheResultText() {
       String text= driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println("Result text : "+text);
    }

    @And("^Close Browser$")
    public void closeBrowser() {
        driver.close();
    }

    @And("^Close the alert with Cancel$")
    public void closeTheAlertWithCancel() {
        driver.switchTo().alert().dismiss();
    }

    @And("^Write a custom message in it$")
    public void writeACustomMessageInIt() {
        driver.switchTo().alert().sendKeys(" in the prompt alert");
    }


}
