Feature: I want to use Clockify with my mobile device

  Scenario Outline: The user starts the application and logs in
    Given The app is loaded correctly
    When The user goes to the Sign Up page
    And The user logs in the application with: <email>, <password>
    Then The User Home Page is displayed properly

    @Demo
    Examples:
    |email                   |   password        |
    |lu.oderiz@gmail.com     |   ?2AXeS*h&d6N    |