Feature: Search amazon Product

Scenario: Search amazon Product

Given Search field available in amazon
When Search amazon product "Apple MacBook" price 1000
Then Display Product details "Apple MacBook"