Feature: Verify Play sample application - Computers Database features

  Scenario Outline: User to validate Add functionality
    Given user navigates to url "http://computer-database.herokuapp.com/computers?f=ace"
    When user clicks on Add new Computer button
    Then Add Computer webpage dispalys
    And user enters "<ComputerName>", "<IntroducedDate>", "<DiscountinuedDate>"
    #And user selects "<Company>"
    Then user clicks Create this computer button
    Examples:
      | ComputerName  | IntroducedDate  | DiscountinuedDate  | Company |
      |Vivek Computer | 2010-08-14      | 2021-08-14         |IBM      |
      |Vivek2 Computer| 2011-08-14      | 2021-08-14         |IBM      |
      |Vivek3 Computer| 2012-08-14      | 2021-08-14         |IBM      |