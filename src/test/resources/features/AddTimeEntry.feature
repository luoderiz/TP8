@Demo
Feature: I want to add a Time Entry to Clockify from my mobile device

  Scenario: The user adds a Time Entry Successfully
    Given The app is loaded correctly
    And The user goes to the Sign Up page
    And The user logs in the application with: lu.oderiz@gmail.com, ?2AXeS*h&d6N
    And The User Home Page is displayed properly
    When The user goes to Add Entry
    And The user selects the date by month November and day 12
    And The user picks the starting time by hour 10 and minutes 00
    And The user picks the ending time by hour 15 and minutes 00
    And The user enters the description Automation
    And The user chooses the Project Proyecto Uno
    And The user selects the Task Automatizar notificaciones
    And The user saves the changes on the new entry
    Then The new Time entry can be seen in the User Home Page