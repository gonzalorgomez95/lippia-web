@regresion
Feature: Proyecto

  @proyectos @crear @publico @smoke
  Scenario: Crear Proyecto - Crear proyecto exitoso desde seccion Time Tracker.
    Given el usuario se encuentra logueado
    And hace clic en el enlace "Proyecto"
    When hace clic en la opcion "Create new project"
    And el campo project name se completa con nombre valido
    And hace clic en el boton "Create"
    Then se visualiza el mensaje de confirmacion de proyecto