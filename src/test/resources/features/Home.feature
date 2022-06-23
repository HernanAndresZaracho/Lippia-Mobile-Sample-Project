Feature: El usuario crea y cancela escenarios

  Background:
    Given El usuario se encuetra logueado

  @ProyectoFinal @Home @CancelaCrearEscenario
  Scenario Outline: El usuario cancela crear un escenario
    When El usuario clickea en el boton +
    And El usuario clickea en el boton Fecha del Entry
    And El usuario ingresa la <horaDelStart> del Start
    And El usuario clickea en el boton End
    And El usuario ingresa la <horaDelEnd> del End
    And El usuario guarda el End
    And El usuario no guarda el escenario creado
    Then No se crea el nuevo escenario

    Examples:
      | horaDelStart | horaDelEnd |
      | 22           | 23         |

  @ProyectoFinal @Home @CreaEscenario
  Scenario Outline: El usuario crea un escenario
    When El usuario clickea en el boton +
    And El usuario clickea en el boton Fecha del Entry
    And El usuario ingresa la <horaDelStart> del Start
    And El usuario clickea en el boton End
    And El usuario ingresa la <horaDelEnd> del End
    And El usuario guarda el End
    And El usuario guarda el escenario creado
    Then Se creo un nuevo escenario

    Examples:
      | horaDelStart | horaDelEnd |
      | 23           | 00         |

  @ProyectoFinal @Home @CreaEscenarioConFecha
  Scenario Outline: El usuario crea un escenario con fecha
    When El usuario clickea en el boton +
    And El usuario clickea en el boton Fecha del Entry
    And El usuario selecciona <fechaDelStart> del Start
    And El usuario ingresa la <horaDelStart> del Start
    And El usuario clickea en el boton End
    And El usuario selecciona <fechaDelEnd> del End
    And El usuario ingresa la <horaDelEnd> del End
    And El usuario guarda el End
    And El usuario guarda el escenario creado
    Then Se creo un escenario con la fecha

    Examples:
      | horaDelStart | horaDelEnd | fechaDelStart | fechaDelEnd   |
      | 22           | 23         | 25 junio 2022 | 26 junio 2022 |



