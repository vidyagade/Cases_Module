$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/ExportCase.feature");
formatter.feature({
  "line": 1,
  "name": "Export case",
  "description": "Description: Testing export option from dashboard",
  "id": "export-case",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User is Log In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logged in with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should login and be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ExportCase.user_navigates_to_login_page()"
});
formatter.result({
  "duration": 5459324000,
  "status": "passed"
});
formatter.match({
  "location": "ExportCase.user_logged_in_with_username_and_password()"
});
formatter.result({
  "duration": 1397722800,
  "status": "passed"
});
formatter.match({
  "location": "ExportCase.user_should_login_and_be_on_home_page()"
});
formatter.result({
  "duration": 2062712499,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Exporting case",
  "description": "",
  "id": "export-case;exporting-case",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@export"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User selects case from dashboard and clicks on export option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Case should be exported to documents section",
  "keyword": "Then "
});
formatter.match({
  "location": "ExportCase.user_selects_case_from_dashboard_and_clicks_on_export_option()"
});
formatter.result({
  "duration": 5142888200,
  "status": "passed"
});
formatter.match({
  "location": "ExportCase.case_should_be_exported_to_documents_section()"
});
formatter.result({
  "duration": 6325972500,
  "status": "passed"
});
});