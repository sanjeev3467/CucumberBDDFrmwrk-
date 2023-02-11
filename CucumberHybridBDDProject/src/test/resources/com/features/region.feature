Feature: Region save information

Scenario Outline: Region Details save
Given Click on Facility link
When Click on Region Link
When Click on Add New button
Then Enter Region Name in Sheet "<Sheet>" Row "<row>"
Then Click on Save button

Examples:

|Sheet|row|
|Sheet1|0|