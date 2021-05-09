$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/EditCase.feature");
formatter.feature({
  "line": 1,
  "name": "Edit a case",
  "description": "",
  "id": "edit-a-case",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In FreeCRM",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the login page of FreeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User logs in with username and password in FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should login and should be on home page of FreeCRM",
  "keyword": "Then "
});
formatter.match({
  "location": "EditCase.user_navigates_to_the_login_page_of_FreeCRM()"
});
formatter.result({
  "duration": 4346205200,
  "status": "passed"
});
formatter.match({
  "location": "EditCase.user_logs_in_with_username_and_password_in_FreeCRM()"
});
formatter.result({
  "duration": 3070925800,
  "status": "passed"
});
formatter.match({
  "location": "EditCase.user_should_login_and_should_be_on_home_page_of_FreeCRM()"
});
formatter.result({
  "duration": 2042169100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User edit the case",
  "description": "",
  "id": "edit-a-case;user-edit-the-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@edit"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User select particular case and click on edit",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should edit case and click on save",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should able to see edited case",
  "keyword": "And "
});
formatter.match({
  "location": "EditCase.user_select_particular_case_and_click_on_edit()"
});
formatter.result({
  "duration": 821123300,
  "status": "passed"
});
formatter.match({
  "location": "EditCase.user_should_edit_case_and_click_on_save()"
});
formatter.result({
  "duration": 1455197000,
  "status": "passed"
});
formatter.match({
  "location": "EditCase.user_should_able_to_see_edited_case()"
});
formatter.result({
  "duration": 255818600,
  "status": "passed"
});
});