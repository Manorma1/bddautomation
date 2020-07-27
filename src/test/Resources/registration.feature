@regression
Feature: Registration feature

  @test @smoke @sanity @trial
  Scenario:  User should able to register successfully,
  so that user can use all user functionality on my website

    Given  user is on homepage
    When user clicks on register button
    And user enter all required registration details
    And user Clicks on register-submit button
    Then user should be able to register successfully