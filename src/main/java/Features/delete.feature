Feature: Verify Delete feature of Play sample application - Computers Database

  Scenario: User to verify Delete functionality
    Given user navigates to url "http://computer-database.herokuapp.com/computers?f=ace"
    When user clicks on a Computer name
    Then Computer details displays
    And user clicks on Delete this computer button
    And Done This computer has been deleted message displays
