Feature: El usuario modifica las configuraciones

  Background: El usuario se encuetra logueado

  @Demo
  @Settings
  Scenario: El usuario desactiva el modo online a offline
    When El usuario clickea en el boton del Menu
    And El usuario clickea en el boton settings
    And El usuario habilita el modo offline
    Then El usuario cambia la aplicacion a offline


