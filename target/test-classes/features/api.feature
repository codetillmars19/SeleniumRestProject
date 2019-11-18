Feature: Testing sample API page

@API
  Scenario: Visit testapi website
  Given Open restApi url
  When Get information of a city
  Then Validate the response of the city

@UITEST
  Scenario: Sign in to google
  Given Open google
  When Sign in to Google by entering username and password
  Then Logout from Google
