Feature: login feature
  Scenario: validate login
    Given user is on login page
    When user enters username and password
    And he clicks on login button
    Then he should be on homepage
    And customer clikes on setting icon
    Then customer clicked on logout button