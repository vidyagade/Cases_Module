Feature: Create a case
Description: This feature will test creating a case functionality

Background: User is Logged In
Given User navigates to the login page
When User logs in with username and password 
Then User should login and should be on home page

@create1
Scenario: User fills the required fields
When User enters title and clicks on save
Then User should see the cases on the dashboard


@create2
Scenario: User does not fills the required fields
When User enters contact and clicks on save
Then User should see a error message

@create3
Scenario: User enters valid data in the fields
When User enters tile, description, identifier and clicks on save
Then User should see the case on the cases dashboard

@create4
Scenario: User cancel the case
When User enters the fields such as title, access, assigned to, contact, company, deal, type, deadline, tags, priority, status and clicks on cancel
Then User should see case dashboard page
