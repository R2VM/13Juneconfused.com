$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/avkin/Downloads/confused.com/src/main/java/Features/add.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Play sample application - Computers Database features",
  "description": "",
  "id": "verify-play-sample-application---computers-database-features",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User to validate Add functionality",
  "description": "",
  "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to url \"http://computer-database.herokuapp.com/computers?f\u003dace\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Add new Computer button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Add Computer webpage dispalys",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cComputerName\u003e\", \"\u003cIntroducedDate\u003e\", \"\u003cDiscountinuedDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#And user selects \"\u003cCompany\u003e\""
    }
  ],
  "line": 9,
  "name": "user clicks Create this computer button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;",
  "rows": [
    {
      "cells": [
        "ComputerName",
        "IntroducedDate",
        "DiscountinuedDate",
        "Company"
      ],
      "line": 11,
      "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;;1"
    },
    {
      "cells": [
        "Vivek Computer",
        "2010-08-14",
        "2021-08-14",
        "IBM"
      ],
      "line": 12,
      "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;;2"
    },
    {
      "cells": [
        "Vivek2 Computer",
        "2011-08-14",
        "2021-08-14",
        "IBM"
      ],
      "line": 13,
      "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;;3"
    },
    {
      "cells": [
        "Vivek3 Computer",
        "2012-08-14",
        "2021-08-14",
        "IBM"
      ],
      "line": 14,
      "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User to validate Add functionality",
  "description": "",
  "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to url \"http://computer-database.herokuapp.com/computers?f\u003dace\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Add new Computer button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Add Computer webpage dispalys",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Vivek Computer\", \"2010-08-14\", \"2021-08-14\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#And user selects \"\u003cCompany\u003e\""
    }
  ],
  "line": 9,
  "name": "user clicks Create this computer button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://computer-database.herokuapp.com/computers?f\u003dace",
      "offset": 23
    }
  ],
  "location": "addTest.user_navigates_to_url(String)"
});
formatter.result({
  "duration": 9788932500,
  "status": "passed"
});
formatter.match({
  "location": "addTest.user_clicks_on_Add_new_Computer_button()"
});
formatter.result({
  "duration": 505230300,
  "status": "passed"
});
formatter.match({
  "location": "addTest.add_Computer_webpage_dispalys()"
});
formatter.result({
  "duration": 12479300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vivek Computer",
      "offset": 13
    },
    {
      "val": "2010-08-14",
      "offset": 31
    },
    {
      "val": "2021-08-14",
      "offset": 45
    }
  ],
  "location": "addTest.user_enters(String,String,String)"
});
formatter.result({
  "duration": 610624800,
  "status": "passed"
});
formatter.match({
  "location": "addTest.user_clicks_Create_this_computer_button()"
});
formatter.result({
  "duration": 419838400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User to validate Add functionality",
  "description": "",
  "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to url \"http://computer-database.herokuapp.com/computers?f\u003dace\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Add new Computer button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Add Computer webpage dispalys",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Vivek2 Computer\", \"2011-08-14\", \"2021-08-14\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#And user selects \"\u003cCompany\u003e\""
    }
  ],
  "line": 9,
  "name": "user clicks Create this computer button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://computer-database.herokuapp.com/computers?f\u003dace",
      "offset": 23
    }
  ],
  "location": "addTest.user_navigates_to_url(String)"
});
formatter.result({
  "duration": 8110499500,
  "status": "passed"
});
formatter.match({
  "location": "addTest.user_clicks_on_Add_new_Computer_button()"
});
formatter.result({
  "duration": 662633600,
  "status": "passed"
});
formatter.match({
  "location": "addTest.add_Computer_webpage_dispalys()"
});
formatter.result({
  "duration": 15196000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vivek2 Computer",
      "offset": 13
    },
    {
      "val": "2011-08-14",
      "offset": 32
    },
    {
      "val": "2021-08-14",
      "offset": 46
    }
  ],
  "location": "addTest.user_enters(String,String,String)"
});
formatter.result({
  "duration": 604408300,
  "status": "passed"
});
formatter.match({
  "location": "addTest.user_clicks_Create_this_computer_button()"
});
formatter.result({
  "duration": 417594400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User to validate Add functionality",
  "description": "",
  "id": "verify-play-sample-application---computers-database-features;user-to-validate-add-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to url \"http://computer-database.herokuapp.com/computers?f\u003dace\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Add new Computer button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Add Computer webpage dispalys",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Vivek3 Computer\", \"2012-08-14\", \"2021-08-14\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#And user selects \"\u003cCompany\u003e\""
    }
  ],
  "line": 9,
  "name": "user clicks Create this computer button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://computer-database.herokuapp.com/computers?f\u003dace",
      "offset": 23
    }
  ],
  "location": "addTest.user_navigates_to_url(String)"
});
formatter.result({
  "duration": 16712032100,
  "status": "passed"
});
formatter.match({
  "location": "addTest.user_clicks_on_Add_new_Computer_button()"
});
formatter.result({
  "duration": 407003600,
  "status": "passed"
});
formatter.match({
  "location": "addTest.add_Computer_webpage_dispalys()"
});
formatter.result({
  "duration": 12771300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vivek3 Computer",
      "offset": 13
    },
    {
      "val": "2012-08-14",
      "offset": 32
    },
    {
      "val": "2021-08-14",
      "offset": 46
    }
  ],
  "location": "addTest.user_enters(String,String,String)"
});
formatter.result({
  "duration": 573714900,
  "status": "passed"
});
formatter.match({
  "location": "addTest.user_clicks_Create_this_computer_button()"
});
formatter.result({
  "duration": 490787000,
  "status": "passed"
});
});