@regresion
Feature: Workspace

  @workspaces @crear @smoke
  Scenario: Crear Workspace - Crear workspace exitoso desde pagina Workspaces.
    Given el usuario se encuentra logueado
    And se encuentra en la pagina Workspaces de clockify
    When hace clic en el enlace "Create new workspace"
    And el campo workspace name se completa con nombre valido
    And hace clic en el boton "Create"
    Then se visualiza el mensaje de creacion de workspace

  @workspaces @modificar @smoke
  Scenario: Modificar - Modificar nombre de workspace exitoso desde pagina workspaces.
    Given el usuario se encuentra logueado
    And se encuentra en la pagina Workspaces de clockify
    When hace clic en el boton "Settings"
    And en el campo nombre se actualiza
    And hace clic en la pantalla
    Then se visualiza el mensaje de actualizacion de workspace