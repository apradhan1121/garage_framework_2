Feature: Windows Automation for Calculator
  Scenario: Addition of two numbers
    Given I open the calculator
    When I add 5 and 6
    Then I should see the result as 11