@regresion
Feature: Login

  @login @manual @smoke
  Scenario: Login - Login exitoso con con email y password correctos.
    Given el usuario se encuentra en la pagina de login de clockify
    When hace clic en el enlace "Log in manually"
    And el campo email se completa con un email valido
    And el campo password se completa con la contraseña correcta
    And hace clic en el boton "Log in"
    Then se visualiza la pantalla de carga horaria de clockify
    And se valida que la url es: https://app.clockify.me/tracker#

  @logout @manual @smoke
  Scenario: Login - Logout exitoso.
    Given el usuario se encuentra en la pagina de login de clockify
    When hace clic en el enlace "Log in manually"
    And el campo email se completa con un email valido
    And el campo password se completa con la contraseña correcta
    And hace clic en el boton "Log in"
    And hace clic el logo de perfil
    And hace clic en la opcion "Log out"
    Then se valida que el usuario cerro sesion