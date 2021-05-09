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
  "duration": 3983801200,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCase.user_logs_in_with_username_and_password_to_freecrm()"
});
