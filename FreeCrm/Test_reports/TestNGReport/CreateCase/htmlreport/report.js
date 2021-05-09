$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/CreateCase.feature");
formatter.feature({
  "line": 1,
  "name": "Create a case",
  "description": "Description: This feature will test creating a case functionality",
  "id": "create-a-case",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logs in with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 5284639400,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_logs_in_with_username_and_password()"
});
formatter.result({
  "duration": 1029461800,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1782495001,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User fills the required fields",
  "description": "",
  "id": "create-a-case;user-fills-the-required-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@create1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters title and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should see the cases on the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_enters_title_and_clicks_on_save()"
});
formatter.result({
  "duration": 371154500,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_see_the_cases_on_the_dashboard()"
});
formatter.result({
  "duration": 3946161400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logs in with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 3114287099,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_logs_in_with_username_and_password()"
});
formatter.result({
  "duration": 1536008000,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1307489900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User does not fills the required fields",
  "description": "",
  "id": "create-a-case;user-does-not-fills-the-required-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@create2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User enters contact and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should see a error message",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_enters_contact_and_clicks_on_save()"
});
formatter.result({
  "duration": 2216671001,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_see_a_error_message()"
});
formatter.result({
  "duration": 136464900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logs in with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 3497855399,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_logs_in_with_username_and_password()"
});
formatter.result({
  "duration": 1070629099,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1256612200,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User enters valid data in the fields",
  "description": "",
  "id": "create-a-case;user-enters-valid-data-in-the-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@create3"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User enters tile, description, identifier and clicks on save",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User should see the case on the cases dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_enters_tile_description_identifier_and_clicks_on_save()"
});
formatter.result({
  "duration": 6351545900,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_see_the_case_on_the_cases_dashboard()"
});
formatter.result({
  "duration": 3303924600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User is Logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logs in with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should login and should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 3153802300,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_logs_in_with_username_and_password()"
});
formatter.result({
  "duration": 1274859900,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_login_and_should_be_on_home_page()"
});
formatter.result({
  "duration": 1331156001,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "User cancel the case",
  "description": "",
  "id": "create-a-case;user-cancel-the-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@create4"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User enters the fields such as title, access, assigned to, contact, company, deal, type, deadline, tags, priority, status and clicks on cancel",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User should see case dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateCase.user_enters_the_fields_such_as_title_access_assigned_to_contact_company_deal_type_deadline_tags_priority_status_and_clicks_on_cancel()"
});
formatter.result({
  "duration": 6102567999,
  "status": "passed"
});
formatter.match({
  "location": "CreateCase.user_should_see_case_dashboard_page()"
});
formatter.result({
  "duration": 120789000,
  "status": "passed"
});
});