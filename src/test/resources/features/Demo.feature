Feature: As a potential client i want to interact with the mobile application

  Scenario Outline: El usuario se registra correctamente
    Given The app is loaded correctly
    When The user goes to the Sign Up page
    And The user registers a new user with: <username>, <email>, <password>
    Then Home page is displayed

    @Demo
    Examples:
      | username    | email                | password |
      | automation2 | automation@gmail.com | 123456   |


  Scenario Outline: El usuario se loguea correctamente
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    Then Home page is displayed

    @Demo
    Examples:
      | username    | email                | password |
      | automation2 | automation@gmail.com | 123456   |


  Scenario Outline: El usuario se registra correctamente
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    And The user changes the language
    Then Home page is displayed

    @Demo
    Examples:
      | username    | email                | password |
      | automation2 | automation@gmail.com | 123456   |


