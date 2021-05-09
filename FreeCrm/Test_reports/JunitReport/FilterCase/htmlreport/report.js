$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/FilterCase.feature");
formatter.feature({
  "line": 1,
  "name": "Filter the case",
  "description": "",
  "id": "filter-the-case",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In to the FreeCRM",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the login page to the FreeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should logged in and should be on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterCase.user_navigates_to_the_login_page_to_the_FreeCRM()"
});
formatter.result({
  "duration": 4412181500,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_enter_the_username_and_password()"
});
formatter.result({
  "duration": 1397536400,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_should_logged_in_and_should_be_on_the_home_page()"
});
formatter.result({
  "duration": 1139584400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User filter the case using single parameter row",
  "description": "",
  "id": "filter-the-case;user-filter-the-case-using-single-parameter-row",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@filter1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User should click on show filter",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User select title, operator and value and click filter",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should see that particular filtered cases",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterCase.user_should_click_on_show_filter()"
});
formatter.result({
  "duration": 56211100,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_select_title_operator_and_value_and_click_filter()"
});
formatter.result({
  "duration": 12510971400,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_should_see_that_particular_filtered_cases()"
});
formatter.result({
  "duration": 764992000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is Logged In to the FreeCRM",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the login page to the FreeCRM",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should logged in and should be on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterCase.user_navigates_to_the_login_page_to_the_FreeCRM()"
});
formatter.result({
  "duration": 3507651100,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_enter_the_username_and_password()"
});
formatter.result({
  "duration": 1189165300,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_should_logged_in_and_should_be_on_the_home_page()"
});
formatter.result({
  "duration": 1086304100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User clear filters",
  "description": "",
  "id": "filter-the-case;user-clear-filters",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@filter2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User should see filtered cases",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User click on clear",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should see cases dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterCase.user_should_see_filtered_cases()"
});
formatter.result({
  "duration": 12527893800,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_click_on_clear()"
});
formatter.result({
  "duration": 5106405900,
  "status": "passed"
});
formatter.match({
  "location": "FilterCase.user_should_see_cases_dashboard_page()"
});
formatter.result({
  "duration": 116570500,
  "status": "passed"
});
});