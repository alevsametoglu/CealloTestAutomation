Feature:  Contacts Module Functionality
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  @CEA10-274  @wip
  Scenario: Create a new contact
    Given The user is on the contact page
    When when user click on new contact button
    And The user enter user name
    Then  The user should see his name on the list of contacts

  @CEA10-275 @wip
  Scenario: see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
    Given The user is on the contact page
    Then The user should see all the contacts and number of contacts

  @CEA10-276 @wip
  Scenario: Change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
    Given The user is on the contact page
    When The user click one of the concat name
    And  The user click on  the little gray button of on the profile picture
    And The user click on  Choose from file folder
    And The user click one of the picture
    And The  user click on  Choose button
    Then The  user should see the picture on  his profile

  @CEA10-277 @wip
  Scenario: Delete any selected contact
    Given The user is on the contact page
    When The user click one of the concat name
    And The user click on three dot on the top right  of the page
    And The user click on delete button
    Then The user should not see the contact on the list













