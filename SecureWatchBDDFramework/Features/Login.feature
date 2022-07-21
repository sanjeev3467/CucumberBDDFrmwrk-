Feature: Secure Watch Login
@sanity
Scenario: Login into the Secure Watch Application

   Given Launch Browser
   When Enter Secure Watch URL as "https://infos1680.riskwatch.com/platform/login"
   Then Secure Watch Login page Title Confirmation as "SecureWatch"
   When Enter User Name as "sanjeevaiah.sompalli@info-sun.com" and Passowrd as "Info-123"
   Then Click on Login button
   And Dashboard Title Confirmation as "SecureWatch"
   Then Close Browser
