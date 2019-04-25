Feature: Login Feature
#Scenario: Valid User Scenario
#Given The URL of TestMe App
#When  User enters "Lalitha" as username
#And  User enters "Password123" as password
#And  User click Login
#Then User is in Home Page


@valid
Scenario Outline: Valid User Scenario
Given The URL of TestMe App
When  User enters <username> as username
And  User enters <password> as password
And  User click Login
Then User is in <page>
Examples:
|username|password   |page      |
|Lalitha |Password123|Home      |
|admin   |Password456|Admin Home|


#Scenario: Valid Admin User Scenario
#Given The URL of TestMe App
#When  User enters "Admin" as username
#And  User enters "Password456" as password
#And  User click Login
#Then User is in Home Page


@invalid
Scenario: Invalid Scenario
Given The URL of TestMe App
When User enters invalid data
|username|password   |
|abcxyz  |Password123|
|Lalitha |abc123     |
And User click Login
Then User is in Home 
|hytj|
|deg|
|ges|