Feature: Login page feature

@smoke
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then Login page title should be "SecureWatch"

@sanity
Scenario: Forgot Password link
Given user is on login page
Then forgot password link should be displayed

@regression 
Scenario: Login with correct credentials
Given user is on login page
When user enters username "sanjeevaiah.sompalli@info-sun.com"
And user enters password "Info-123"
And user clicks on Login button
Then user gets the title of the page
And home page title should be "SecureWatch | ERM" 

