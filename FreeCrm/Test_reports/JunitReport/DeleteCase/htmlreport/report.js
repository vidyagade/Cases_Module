$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/DeleteCase.feature");
formatter.feature({
  "line": 1,
  "name": "Delete a case",
  "description": "",
  "id": "delete-a-case",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In of freecrm",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the login page of freecrm",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User logs in with username and password to freecrm",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should login and should be on home page of freecrm",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteCase.user_navigates_to_the_login_page_of_freecrm()"
});
formatter.result({
  "duration": 3819362800,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCase.user_logs_in_with_username_and_password_to_freecrm()"
});
formatter.result({
  "duration": 2764733700,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCase.user_should_login_and_should_be_on_home_page_of_freecrm()"
});
formatter.result({
  "duration": 1288833600,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User delete a case",
  "description": "",
  "id": "delete-a-case;user-delete-a-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@delete1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User select particular case and click on delete",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should see case in bin",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteCase.user_select_particular_case_and_click_on_delete()"
});
formatter.result({
  "duration": 867090400,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCase.user_should_see_case_in_bin()"
});
formatter.result({
  "duration": 1247899700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In of freecrm",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the login page of freecrm",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User logs in with username and password to freecrm",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should login and should be on home page of freecrm",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteCase.user_navigates_to_the_login_page_of_freecrm()"
});
formatter.result({
  "duration": 3127128800,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCase.user_logs_in_with_username_and_password_to_freecrm()"
});
formatter.result({
  "duration": 3553539700,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCase.user_should_login_and_should_be_on_home_page_of_freecrm()"
});
formatter.result({
  "duration": 1353914200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User delete multiple cases",
  "description": "",
  "id": "delete-a-case;user-delete-multiple-cases",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@delete2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User select multiple cases and clicks on delete",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User should see cases in bin",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteCase.user_select_multiple_cases_and_clicks_on_delete()"
});
formatter.result({
  "duration": 4561878100,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCase.user_should_see_cases_in_bin()"
});
formatter.result({
  "duration": 1271881600,
  "status": "passed"
});
});