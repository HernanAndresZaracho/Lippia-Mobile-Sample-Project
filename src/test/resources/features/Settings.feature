Feature: El usuario modifica las configuraciones

  Background:
    Given El usuario se encuetra logueado

  @ProyectoFinal @Settings @ChangeDarkmode
  Scenario: El usuario cambia a el modo darkmode
    When El usuario clickea en el boton del Menu
    And El usuario clickea en el boton settings
    And El usuario habilita el modo darkmode
    Then El usuario cambia la aplicacion a modo darkmode


