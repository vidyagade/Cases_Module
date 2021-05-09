$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/ViewCase.feature");
formatter.feature({
  "line": 1,
  "name": "view a case",
  "description": "",
  "id": "view-a-case",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is Logs In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to login page of FreeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters his username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should login and be on home page of FreeCRM",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewCase.user_navigates_to_login_page_of_FreeCRM()"
});
formatter.result({
  "duration": 3705764700,
  "status": "passed"
});
formatter.match({
  "location": "ViewCase.user_enters_his_username_and_password()"
});
formatter.result({
  "duration": 1267067900,
  "status": "passed"
});
formatter.match({
  "location": "ViewCase.user_should_login_and_be_on_home_page_of_FreeCRM()"
});
formatter.result({
  "duration": 1346480300,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User view the case",
  "description": "",
  "id": "view-a-case;user-view-the-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@view"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User select particular case and click on view",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should see that case",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewCase.user_select_particular_case_and_click_on_view()"
});
formatter.result({
  "duration": 3077087500,
  "status": "passed"
});
formatter.match({
  "location": "ViewCase.user_should_see_that_case()"
});
formatter.result({
  "duration": 767071200,
  "status": "passed"
});
});