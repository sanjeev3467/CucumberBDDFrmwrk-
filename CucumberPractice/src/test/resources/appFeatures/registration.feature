@All
Feature: User Registration

Scenario: Register a list of users
Given Navigate to User Region Page
When Enter user details as follows
  |sanjeev|sompalli|sanjeevnaidu638@gmail.com|757657676|Hyderabad|
  |sanju|sompalli|sanjeevnaidu639@gmail.com|757657677|Hyderabad|
  |sanjay|sompalli|sanjeevnaidu637@gmail.com|757657678|Hyderabad|
Then User Registration is Successfull

Scenario: Register a list of users new
Given Navigate to User Region Page
When Enter user details as follows mapping data
  |FirstName|LastName|EMail|Phone|Location|
  |sanjeev|sompalli|sanjeevnaidu638@gmail.com|757657676|Hyderabad|
  |sanju|sompalli|sanjeevnaidu639@gmail.com|757657677|Hyderabad|
  |sanjay|sompalli|sanjeevnaidu637@gmail.com|757657678|Hyderabad|
Then User Registration is Successfull