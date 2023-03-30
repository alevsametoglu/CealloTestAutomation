@wip
Feature: Library app login feature

  User Story:
  As a user, I should be able to login with correct credentials

  Background: For the scenarios in the feature file , user is expected to be on login page
    Given  user is on the Login page

  Scenario: Login as user
    When  user enter  username "Employee81"
    And user enters Password "Employee123"
    Then user should see the dashboard
