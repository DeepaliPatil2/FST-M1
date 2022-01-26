package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchSteps {
WebDriver driver;
    @Given("^User is on Google Home Page$")
    public void user_is_on_google_home_page() {
    driver=new FirefoxDriver();
    driver.get("https://www.google.com/");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void userTypesInCheeseAndHitsENTER() {
      WebElement searchbox= driver.findElement(By.xpath("//input[@title='Search']"));
        searchbox.sendKeys("Cheese", Keys.ENTER);

    }

    @Then("^Show how many search results were shown$")
    public void showHowManySearchResultsWereShown() throws InterruptedException {
        Thread.sleep(3000);
        String result=driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of search result : "+result);
    }

    @And("^Close the browser$")
    public void closeTheBrowser() {

        driver.close();
    }


}
