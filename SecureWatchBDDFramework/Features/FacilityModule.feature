Feature: Facility Module features

Background:

   Given Launch Browser
   When Enter Secure Watch URL as "https://infos1680.riskwatch.com/platform/login"
   Then Secure Watch Login page Title Confirmation as "SecureWatch"
   When Enter User Name as "sanjeevaiah.sompalli@info-sun.com" and Passowrd as "Info-123"
   Then Click on Login button
   And Dashboard Title Confirmation as "SecureWatch"
   When Click on Menu icon
   Then Click on Facility Module
   When Click on Region Link
   
@regression
Scenario: Create New Region Details
   
   Then Click on Add Region button
   Then Region Title Confirmation as "Add Region"
   When Enter Region Name as "South Africa39" and Region Description as "South Africa Region"
   Then Click on Save button
   And  Region Saved Success Message Confirmation as "Region Saved Successfully"
   Then Close Browser
   
@regression
Scenario: Search Region Details
  
   When Enter Region Name in Search
   Then Searched Region Name Confirmation
   Then Close Browser

@regression
Scenario: Duplicate Region validation on New screen
 
   Then Click on Add Region button
   Then Region Title Confirmation as "Add Region"
   When Enter Region Name as "South Africa39" and Region Description as "South Africa Region"
   Then Click on Save button
   And  Region Duplicate Message Confirmation as "Duplicate Region Name"
   

@regression  
Scenario: Update Region Details
  
   When Enter Region Name in Search
   Then Searched Region Name Confirmation
   When Click on region Edit icon
   Then Enter update Region Name as "South Africa40" and update Region desc as "South Africa40"
   And  Click on Save button for update
   Then Region update Success message as "Region Updated Successfully"
  
@regression
Scenario: Create New Region Details
   
   Then Click on Add Region button
   Then Region Title Confirmation as "Add Region"
   When Enter Region Name as "South Africa41" and Region Description as "South Africa Region"
   Then Click on Save button
   And  Region Saved Success Message Confirmation as "Region Saved Successfully"
   Then Close Browser
 
  
@regression
Scenario: Delete Region Details

   When Enter Region Name in Search
   Then Searched Region Name Confirmation
   And  Click on Delete icon
   When Delete Region Confirmation Yes
   Then Region delete Success message as "Region has been deleted."
   

  
     