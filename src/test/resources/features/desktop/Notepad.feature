Feature: Automation of Desktop Notepad application
  Scenario: Automate Notepad
    Given Setting up the Notepad application and open the Notepad
    When I type "Hello World" in the Notepad
    Then I should see the text "Hello World" in the Notepad