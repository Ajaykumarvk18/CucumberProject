@valid
Feature: Login feature
Scenario Outline:: Valid User Scenario
Given The URL of TestMe APP
When user enters <username> as username
And user enters <password> as password
Then user is in <page>
Examples:
|username|password   |page      |
|Lalitha |Password123|Home      |
|admin   |Password456|Admin Home|
@invalid
Scenario: invalid scenario
Given The URL of TestMe APP
When user enters invalid data
|abcxyz|Password123|
|Lalitha|abc123|
|abc123|abc123|
Then user is in loginpage
|bdc|
|ddc|
|hdc|
#Scenario: Valid Admin User Scenario
#Given The URL of TestMe APP
#When user enters "admin" as username
#And user enters "Password456" as password
#Then user is in home page