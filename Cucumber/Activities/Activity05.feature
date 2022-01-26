#StepDefinination class= "LoginTestSteps.java"
@activity2_5
Feature: Login Test

  @SmokeTest
  Scenario Outline: Testing Login with Examples
    Given User is on Login Page
    When User enters <usernm> and <psword>
    Then Read the page title and confirmation message
    And Close browser
    Examples:
      | usernm |psword|
    |"admin" | "password"|
