$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/InvalidCases.feature");
formatter.feature({
  "line": 1,
  "name": "Invalid Testcases",
  "description": "Description: Testing invalid functionality",
  "id": "invalid-testcases",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User is log in to the freecrm",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the login page of the freecrm",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User put his username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should logged in and should be on home page of the freecrm",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidCase.user_navigates_to_the_login_page_of_the_freecrm()"
});
formatter.result({
  "duration": 4283797900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_put_his_username_and_password()"
});
formatter.result({
  "duration": 1813759900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_should_logged_in_and_should_be_on_home_page_of_the_freecrm()"
});
formatter.result({
  "duration": 1331685200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User fills invalid data in title field",
  "description": "",
  "id": "invalid-testcases;user-fills-invalid-data-in-title-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters invalid data in title and click on save",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should see a error message and case should not create",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidCase.user_enters_invalid_data_in_title_and_click_on_save()"
});
formatter.result({
  "duration": 459955900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_should_see_a_error_message_and_case_should_not_create()"
});
formatter.result({
  "duration": 10083281300,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat StepDefinition.InvalidCase.user_should_see_a_error_message_and_case_should_not_create(InvalidCase.java:78)\r\n\tat ✽.Then User should see a error message and case should not create(src/test/resources/Features/InvalidCases.feature:12)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 4,
  "name": "User is log in to the freecrm",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the login page of the freecrm",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User put his username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should logged in and should be on home page of the freecrm",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidCase.user_navigates_to_the_login_page_of_the_freecrm()"
});
formatter.result({
  "duration": 3682464100,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_put_his_username_and_password()"
});
formatter.result({
  "duration": 1095949800,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_should_logged_in_and_should_be_on_home_page_of_the_freecrm()"
});
formatter.result({
  "duration": 1255888700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User fills invalid data in company field",
  "description": "",
  "id": "invalid-testcases;user-fills-invalid-data-in-company-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User enters invalid data in company and click on save",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should see error message and case should not be create",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidCase.user_enters_invalid_data_in_company_and_click_on_save()"
});
formatter.result({
  "duration": 5099023900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_should_see_error_message_and_case_should_not_be_create()"
});
formatter.result({
  "duration": 14551097400,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat StepDefinition.InvalidCase.user_should_see_error_message_and_case_should_not_be_create(InvalidCase.java:106)\r\n\tat ✽.Then User should see error message and case should not be create(src/test/resources/Features/InvalidCases.feature:17)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 4,
  "name": "User is log in to the freecrm",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to the login page of the freecrm",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User put his username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should logged in and should be on home page of the freecrm",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidCase.user_navigates_to_the_login_page_of_the_freecrm()"
});
formatter.result({
  "duration": 4207010800,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_put_his_username_and_password()"
});
formatter.result({
  "duration": 1042530200,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_should_logged_in_and_should_be_on_home_page_of_the_freecrm()"
});
formatter.result({
  "duration": 1795659100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User fills invalid data in contact field",
  "description": "",
  "id": "invalid-testcases;user-fills-invalid-data-in-contact-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User enters invalid data in contact and click on save",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User should see error message and case should not be create with that contact",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidCase.user_enters_invalid_data_in_contact_and_click_on_save()"
});
formatter.result({
  "duration": 5399732500,
  "status": "passed"
});
formatter.match({
  "location": "InvalidCase.user_should_see_error_message_and_case_should_not_be_create_with_that_contact()"
});
formatter.result({
  "duration": 5051623900,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat StepDefinition.InvalidCase.user_should_see_error_message_and_case_should_not_be_create_with_that_contact(InvalidCase.java:136)\r\n\tat ✽.Then User should see error message and case should not be create with that contact(src/test/resources/Features/InvalidCases.feature:22)\r\n",
  "status": "failed"
});
});