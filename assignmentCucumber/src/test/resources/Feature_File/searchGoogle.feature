Feature: to search google page

  @Smoke
  Scenario: Perform search on google chrome
    Given User is on the google page
    When User enters CapGemini
    And Clicks on search button
    Then User gets result in Chrome browser

  @Regression
  Scenario: Perform search on Mozilla Firefox
    Given User is on google page
    When User enters Accenture
    And Click on search button
    Then User gets result in Mozilla Firefox
