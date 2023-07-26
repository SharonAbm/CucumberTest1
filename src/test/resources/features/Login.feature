Feature: Login into App

#Scenario: Valid login
#Given User is on Login page
#When User enters login credential
#Then Should display Home Page

#Scenario: Valid login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page

#Scenario Outline: Valid login
#Given User is on Login page
#When User enters "<username>" and "<password>"
#Then Should display Home Page

 #Examples:
 #|username|password|
 #|tomsmith|SuperSecretPassword!|
 #|testuser1|welcome123|
 #|testuser2|welcome123|
 
Scenario: Valid login
Given User is on Login page
When User enters login credentials
|username|password|
|tomsmith|SuperSecretPassword!|
Then Should display Home Page
