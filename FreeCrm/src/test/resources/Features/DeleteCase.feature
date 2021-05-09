Feature: Delete a case

Background: User is Logged In of freecrm
Given User navigates to the login page of freecrm
When User logs in with username and password to freecrm
Then User should login and should be on home page of freecrm

@delete1
Scenario: User delete a case
When User select particular case and click on delete
Then User should see case in bin

@delete2
Scenario: User delete multiple cases
When User select multiple cases and clicks on delete
Then User should see cases in bin