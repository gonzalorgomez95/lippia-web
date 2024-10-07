@regresion
Feature: Crear Workspace.

  @workspaces @crear @smoke
  Scenario: Crear Workspace - Crear workspace exitoso desde pagina Workspaces.
    Given el usuario se encuentra logueado
    And se encuentra en la pagina Workspaces de clockify
    When hace clic en el enlace "Create new workspace"
    And el campo workspace name se completa con nombre valido
    And hace clic en el boton "Create"
    Then se visualiza el mensaje de confirmacion en pantalla