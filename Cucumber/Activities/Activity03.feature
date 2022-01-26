#StepDefinination class= "AlertTestSteps.java"
@activity1_3
Feature: Testing with Tags

  Background: Alert is Open
    Given User is on the page

  @SimpleAlert
  @SmokeTest
  Scenario: Testing with Simple Alert
    When User clicks the Simple Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert
    And Close Browser

  @ConfirmAlert
  Scenario: Testing with Confirm Alert
    When User clicks the Confirm Alert button
    Then Alert opens
    And Read the text from it and print it
  And Close the alert with Cancel
  And Close Browser

  @PromptAlert
  Scenario: Testing with Prompt Alert
    When User clicks the Prompt Alert button
    Then Alert opens
    And Read the text from it and print it
     And Write a custom message in it
    And Close the alert
    And Close Browser

