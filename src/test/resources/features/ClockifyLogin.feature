Feature: El usuario se loguea y desloguea exitosamente

  Scenario Outline: El usuario se loguea correctamente
    Given La aplicacion se abre correctamente
    When El usuario ingresa su <mail> y su <password>.
    Then El menu de la aplicacion se muestra

    @Login
    Examples:
      | mail                          | password   |
      | hernanandreszaracho@gmail.com | 1705962013 |

  Scenario Outline: El usuario se desloguea correctamente
    Given La aplicacion se abre correctamente
    When El usuario ingresa su <mail> y su <password>.
    And El usuario clickea en el boton del Menu
    And El usuario clickea en el boton Logout
    And El usuario clickea en el boton de confirmacion de Logout
    Then El usuario se desloguea

  @Login
    Examples:
      | mail                          | password   |
      | hernanandreszaracho@gmail.com | 1705962013 |