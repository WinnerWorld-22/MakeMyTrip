@timesheets
Feature: This feature is to get pending timesheet
Scenario Outline: This test is to verify the prending timesheet
Given the user is on the homepage
And the user click on the time option form the menu
And the user enter the name as "John Smith"
And clicks on the view button
Then the user should see the message as "<message>"
Examples:
|message|
|No Timesheets Found|