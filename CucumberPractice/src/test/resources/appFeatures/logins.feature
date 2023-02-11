Feature: Login Page

 Scenario Outline: Login validations
    Given Landing into Login Page
    When Enter User Name as "<UName>" and Enter Password as "<PWD>"
    Then Click on Login button in page
    Then Landing into Dashboard

    Examples: 
      | UName  | PWD    |
      | sanjeev   | sanjeev@123 |
      | sanjay    | sanjeev@123 |
      | sanju     | sanjeev@123 |