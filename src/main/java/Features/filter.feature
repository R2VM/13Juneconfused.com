Feature: Verify Filter feature of Play sample application - Computers Database

  Scenario Outline: User to verify Filter functionality
    Given user navigates to url "http://computer-database.herokuapp.com/computers?f=ace"
    When user enters "<Search>"
    Then user clicks on Filter by name button
    And Vivek Computer name details display
    Examples:
      | Search |
      | Vivek  |