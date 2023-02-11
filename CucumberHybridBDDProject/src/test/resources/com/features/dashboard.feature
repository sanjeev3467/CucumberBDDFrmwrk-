Feature: Dashboard information

@smoke
Scenario: user should be login app
Given user should be login
|uName|passWord1|
|sanjeevaiah.sompalli@info-sun.com|Info-123|

@sanity
Scenario: Dashboard list map checking
Given Dashboard button navigation names

|New Assessment|
|Download Raw Data|
|Add Widget|
Then Dashboard button count matching
