Feature: El usuario crea y cancela escenarios

  Background: El usuario se encuetra logueado

  @Demo
  @Home
  Scenario Outline: El usuario crea un escenario
    When El usuario clickea en el boton +
    And El usuario clickea en el boton Start
    And El usuario ingresa la <horaDelStart>, el <minutoDelStart> y el <diaDelStart> del Start
    And El usuario guarda el Start
    And El usuario clickea en el boton End
    And El usuario ingresa la <horaDelEnd>, el <minutoDelEnd> y el <diaDelEnd> del End
    And El usuario guarda el End
    And El usuario guarda el escenario creado
    Then Se creo un nuevo escenario

    Examples:
      | horaDelStart | minutoDelStart | diaDelStart   | horaDelEnd | minutoDelEnd | diaDelEnd     |
      | 06           | 00             | 20 junio 2022 | 09         | 30           | 20 junio 2022 |

  @Home
  Scenario Outline: El usuario crea un escenario pero no guarda
    When El usuario clickea en el boton +
    And El usuario clickea en el boton Start
    And El usuario ingresa la <horaDelStart>, el <minutoDelStart> y el <diaDelStart> del Start
    And El usuario guarda el Start
    And El usuario clickea en el boton End
    And El usuario ingresa la <horaDelEnd>, el <minutoDelEnd> y el <diaDelEnd> del End
    And El usuario guarda el End
    And El usuario no guarda el escenario creado
    Then No se crea el nuevo escenario

    Examples:
      | horaDelStart | minutoDelStart | diaDelStart   | horaDelEnd | minutoDelEnd | diaDelEnd     |
      | 06           | 00             | 20 junio 2022 | 09         | 30           | 20 junio 2022 |


