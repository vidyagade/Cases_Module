Feature: Invalid Testcases
Description: Testing invalid functionality

Background: User is log in to the freecrm
Given User navigates to the login page of the freecrm
When User put his username and password 
Then User should logged in and should be on home page of the freecrm

@invalid
Scenario: User fills invalid data in title field
When User enters invalid data in title and click on save
Then User should see a error message and case should not create

@invalid
Scenario: User fills invalid data in company field
When User enters invalid data in company and click on save
Then User should see error message and case should not be create

@invalid
Scenario: User fills invalid data in contact field
When User enters invalid data in contact and click on save
Then User should see error message and case should not be create with that contact
