Feature: Billing Calculations

  Scenario Outline: Calculate billing details
    Given Landing to Billing details
    When Enter Billing Billing amount "<BAMT>"
    When Enter Tax Amount "<TAXAMNT>"
    Then Click on Calculate button
    Then Final Amount information "<FinalAmount>"

    Examples: 
      | BAMT  | TAXAMNT | FinalAmount |
      | 100 | 20.78 | 120.78 |
      | 1000 | 200.12 | 1200.12|
