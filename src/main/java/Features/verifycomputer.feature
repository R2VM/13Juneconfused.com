Feature: Verify Add feature of Play sample application - Computers Database

  Scenario: User to verify Add Computer functionality
    Given user navigates to url "http://computer-database.herokuapp.com/computers?f=ace"
    When user enters aaaa on Filter by name field
    Then Computer name displays
    And Introduced date displays
    And Discountinued sate displays
    And Company name displays
