Feature: El usuario crea y cancela escenarios

  Background: El usuario se encuetra logueado

  Scenario Outline: El usuario crea un escenario
    When El usuario clickea en el boton +
    And El usuario clickea en el boton Start
    And El usuario ingresa la <hora1>, el <minuto1> y el <dia1> del Start
    And El usuario guarda el Start
    And El usuario clickea en el boton End
    And El usuario ingresa la <hora2>, el <minuto2> y el <dia2> del End
    And El usuario guarda el End
    And El usuario guarda el escenario creado
    Then Se creo un nuevo escenario

    @Escenario
    Examples:
      | hora1 | minuto1 | dia1          | hora2 | minuto2 | dia2          |
      | 06    | 00      | 20 junio 2022 | 09    | 30      | 20 junio 2022 |

  Scenario Outline: El usuario crea un escenario pero no guarda
    When El usuario clickea en el boton +
    And El usuario clickea en el boton Start
    And El usuario ingresa la <horaStart>, el <minutoStart> y el <diaStart> del Start
    And El usuario guarda el Start
    And El usuario clickea en el boton End
    And El usuario ingresa la <horaEnd>, el <minutoEnd> y el <diaEnd> del End
    And El usuario guarda el End
    And El usuario no guarda el escenario creado
    Then No se crea el nuevo escenario

    @Escenario
    Examples:
      | horaStart | minutoStart | diaStart      | horaEnd | minutoEnd | diaEnd        |
      | 06        | 00          | 20 junio 2022 | 09      | 30        | 20 junio 2022 |


