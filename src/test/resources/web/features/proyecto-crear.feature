@proyecto @regresion
Feature: Crear Proyecto.

  @crear @modal @elementosVisuales
  Scenario: Crear Proyecto - Se abre modal create new project exitoso desde seccion Time Tracker.
    Given el usuario se encuentra en la seccion Time Tracker de clockify
    When hace clic en el boton "Project"
    And hace clic en el enlace "Create new project"
    Then se visualiza el modal "Create new project" en pantalla

  @crear @modal @elementosVisuales
  Scenario: Crear Proyecto - Se abre modal create new project exitoso desde seccion Projects.
    Given el usuario se encuentra en la seccion Projects de clockify
    And hace clic en el enlace "Create new project"
    Then se visualiza el modal "Create new project" en pantalla

  @crear @exitoso @publico @smoke
  Scenario Outline: Crear Proyecto - Crear proyecto exitoso desde seccion Time Tracker.
    Given el usuario se encuentra en la seccion Time Tracker de clockify
    And no tiene ningun proyecto con el nombre <nombre>
    When hace clic en el boton "Project"
    And hace clic en el enlace "Create new project"
    And el campo project name se completa con <nombre>
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre |
      | ab     |
      | 12     |
      | @!     |
      | test   |

  @crear @exitoso @publico @smoke
  Scenario Outline: Crear Proyecto - Crear proyecto exitoso desde seccion Projects.
    Given el usuario se encuentra en la seccion Projects de clockify
    And no tiene ningun proyecto con el nombre <nombre>
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre |
      | ab     |
      | 12     |
      | @!     |
      | test   |


  @crear @exitoso @cliente
  Scenario Outline: Crear Proyecto - Crear proyecto exitoso con cliente diferente.
    Given el usuario se encuentra en la seccion Projects de clockify
    And tiene un proyecto con el nombre <nombre>
    And se valida que el proyecto tiene cliente <cliente> asignado
    And tiene cliente <cliente_seleccionado> creado
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And selecciona el cliente <cliente_seleccionado>
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre | cliente  | cliente_seleccionado |
      | test   |          | Cliente1             |
      | test   | Cliente1 | Cliente2             |
      | test   | Cliente2 | Cliente3             |


  @crear @fallido
  Scenario Outline: Crear Proyecto - Crear proyecto fallido por <razon>.
    Given el usuario se encuentra en la seccion Projects de clockify
    And tiene un proyecto con el nombre <nombre>
    And se valida que el proyecto tiene cliente <cliente> asignado
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And selecciona el cliente <cliente>
    And hace clic en el boton "Create"
    Then se visualiza el mensaje <mensaje> en pantalla.

    Examples:
      | razon                                    | nombre | cliente  | mensaje                                                   |
      | nombre de proyecto y cliente existentes  | test   | Cliente1 | test project for client Cliente1 already exists.          |
      | nombre de proyecto y cliente existentes  | test   |          | test project for client already exists.                   |
      | nombre de proyecto vacio                 |        |          | project name has to be between 2 and 250 characters long. |
      | nombre de proyecto menos de 2 caracteres | a      |          | project name has to be between 2 and 250 characters long. |
      | nombre de proyecto menos de 2 caracteres | 1      |          | project name has to be between 2 and 250 characters long. |
      | nombre de proyecto menos de 2 caracteres | .      |          | project name has to be between 2 and 250 characters long. |
      | nombre de proyecto menos de 2 caracteres | Ñ      |          | project name has to be between 2 and 250 characters long. |


  @crear @exitoso @cliente
  Scenario Outline: Crear Proyecto - Crear proyecto agregando un cliente desde campo.
    Given el usuario se encuentra en la seccion Projects de clockify
    And no tiene ningun proyecto con el nombre <nombre>
    And tiene cliente <cliente> creado
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And el campo Add/Search client se completa con <cliente>
    And selecciona el cliente <cliente>
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre | cliente  |
      | test5  | Cliente1 |
      | test5  | Cliente2 |
      | test5  | Cliente3 |

  @crear @exitoso @cliente
  Scenario Outline: Crear Proyecto - Crear proyecto buscando un cliente desde campo.
    Given el usuario se encuentra en la seccion Projects de clockify
    And no tiene ningun proyecto con el nombre <nombre>
    And no tiene cliente <cliente> creado
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And el campo Add/Search client se completa con <cliente>
    And hace clic en el enlace "create '<cliente>' client"
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre | cliente  |
      | test5  | Cliente8 |


  @crear @exitoso @color
  Scenario Outline: Crear Proyecto - Crear proyecto exitoso con color - <color>.
    Given el usuario se encuentra en la seccion Projects de clockify
    And no tiene ningun proyecto con el nombre <nombre>
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And selecciona el color <color>
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre | color        |
      | test1  | rosa         |
      | test1  | violeta      |
      | test1  | morado       |
      | test1  | azul         |
      | test1  | celeste      |
      | test1  | verde oscuro |
      | test1  | verde claro  |
      | test1  | naranja      |
      | test1  | marron       |

  @crear @exitoso @color
  Scenario Outline: Crear Proyecto - Crear proyecto exitoso con color custom.
    Given el usuario se encuentra en la seccion Projects de clockify
    And no tiene ningun proyecto con el nombre <nombre>
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And selecciona el color <color>
    And el campo Hex se completa con <hex>
    And hace clic en cualquier lugar de la pagina
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre | color  | hex     |
      | test1  | custom | #ff0000 |
      | test1  | custom | #000000 |
      | test1  | custom | #ffffff |


  @crear @exitoso @publico
  Scenario Outline: Crear Proyecto - Crear proyecto exitoso no publico.
    Given el usuario se encuentra en la seccion Projects de clockify
    And no tiene ningun proyecto con el nombre <nombre>
    When hace clic en el boton "Create new project"
    And el campo project name se completa con <nombre>
    And desmarca el checkbox "Public"
    And hace clic en el boton "Create"
    Then se visualiza el mensaje "The project <nombre> has been created" en pantalla
    And se valida que <nombre> se encuentra en el listado de proyectos

    Examples:
      | nombre |
      | test2  |
      | test3  |

  @crear @publico @elementosVisuales
  Scenario: Crear Proyecto - Tooltip del checkbox Public.
    Given el usuario se encuentra en la seccion Projects de clockify
    When hace clic en el boton "Create new project"
    And pasa el mouse por encima del icono de informacion
    Then se visualiza el mensaje "Visible to all workspace members" en pantalla


  @crear @template
  Scenario: Crear Proyecto - Crear proyecto con template con cuenta gratuita.
    Given el usuario se encuentra en la seccion Projects de clockify
    When hace clic en el boton "Create new project"
    And hace clic en el selector de template
    Then se visualiza el mensaje "Upgrade to use templates." en pantalla


  @crear @template @redireccion
  Scenario: Crear Proyecto - Crear proyecto redirecciona correctamente al enlace en template con cuenta gratuita.
    Given el usuario se encuentra en la seccion Projects de clockify
    When hace clic en el boton "Create new project"
    And hace clic en el selector de template
    And hace clic en el enlace "Upgrade"
    Then se visualiza el mensaje "You´re currently using the FREE version." en pantalla
    And se valida que la url es: https://app.clockify.me/upgrade?plan=basic


  @crear @cancelar
  Scenario: Crear Proyecto - Boton de cancelar.
    Given el usuario se encuentra en la seccion Projects de clockify
    When hace clic en el boton "Create new project"
    And hace clic en el boton "Cancel"
    Then se visualiza la seccion Projects de clockify

  @crear @cerrar
  Scenario: Crear Proyecto - Cerrar Ventana.
    Given el usuario se encuentra en la seccion Projects de clockify
    When hace clic en el boton "Create new project"
    And hace clic en el icono "cerrar"
    Then se visualiza la seccion Projects de clockify