@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking Cab for sedan
Given Uber wants to select a Car Type "sedan" from uber app
When user selects car "sedan" and pickup point "banglore" and drop location "pune"
Then Driver Starts Journey
And Driver ends journey
Then User pays 1000 USD

@Sanity
Scenario: Booking Cab for SUV
Given Uber wants to select a Car Type "SUV" from uber app
When user selects car "SUV" and pickup point "Delhi" and drop location "pune"
Then Driver Starts Journey
And Driver ends journey
Then User pays 2000 USD

@Prod
Scenario: Booking Cab for Inova
Given Uber wants to select a Car Type "Inova" from uber app
When user selects car "SUV" and pickup point "banglore" and drop location "Hyderabad"
Then Driver Starts Journey
And Driver ends journey
Then User pays 3000 USD