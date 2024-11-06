@regresion
Feature: Time tracker

  Background:
    Given el usuario se encuentra logueado

  @cargaHoraria @agregar
  Scenario Outline: Agregar carga horaria sin proyecto exitosamente.
    When hace clic en el icono de carga manual
    And el campo hora de inicio se completa con <hora-inicio>
    And el campo hora de fin se completa con <hora-fin>
    And el campo fecha se completa con <fecha>
    And hace clic en el boton "ADD"
    Then se visualiza el mensaje de creacion exitosa

    Examples:
      | hora-inicio | hora-fin | fecha      |
      | 06          | 12       | 31/10/2024 |


  @timer @descartar
  Scenario: Descartar carga horaria agregadas por timer exitosamente.
    When hace clic en el icono del temporizador
    And hace clic en el boton "START"
    And hace clic en las opciones
    And hace clic en la opcion "Discard"
    And hace clic en el boton "DISCARD"
    Then se visualiza el mensaje de cancelacion exitosa

  @billeable @modificar
  Scenario: Modificar cobro de carga horaria existente exitosamente.
    When hace clic en el icono pesos
    Then se visualiza el mensaje de modificacion de cobro

  @descripcion @modificar
  Scenario: Modificar descripcion de carga horaria existente exitosamente.
    When el campo descripcion se actualiza
    Then se visualiza el mensaje de modificacion de descripcion

  @proyecto @modificar
  Scenario: Modificar proyecto de carga horaria existente exitosamente.
    When hace clic en el boton "Project"
    And selecciona un proyecto del listado
    Then se visualiza el mensaje de modificacion de proyecto

  @tag @modificar
  Scenario: Modificar tag de carga horaria existente exitosamente.
    When hace clic en el icono del tag
    And selecciona un tag del listado
    And hace clic en las opciones
    Then se visualiza el mensaje de modificacion de tag

  @horaFinal @modificar
  Scenario Outline: Modificar hora final de carga horaria existente exitosamente.
    When el campo hora de fin se actualiza a <hora-fin>
    Then se visualiza el mensaje de modificacion de hora de fin

    Examples:
      | hora-fin |
      | 18       |


  @horaInicial @modificar
  Scenario Outline: Modificar hora inicial de carga horaria existente exitosamente.
    When el campo hora de inicio se actualiza a <hora-inicio>
    Then se visualiza el mensaje de modificacion de hora de inicio

    Examples:
      | hora-inicio |
      | 09           |


  @cargaHoraria @eliminar
  Scenario: Borrar carga horaria existente exitosamente.
    When hace clic en las opciones
    And hace clic en la opcion "Delete"
    And hace clic en el boton "DELETE"
    Then se visualiza el mensaje de eliminacion exitosa