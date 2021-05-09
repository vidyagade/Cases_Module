Feature: Filter the case

Background: User is Logged In to the FreeCRM
Given User navigates to the login page to the FreeCRM
When User enter the username and password
Then User should logged in and should be on the home page 

@filter1
Scenario: User filter the case using single parameter row
Given User should click on show filter
When User select title, operator and value and click filter
Then User should see that particular filtered cases

@filter2
Scenario: User clear filters
Given User should see filtered cases
When User click on clear
Then User should see cases dashboard page