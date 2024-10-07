package lippia.web.constants;

public class ClockifyConstants {

//LOCATORS DE LOGIN
    public static final String ENLACE_LOGIN_MANUAL = "xpath://a[contains(.,'Log in manually')]";
    public static final String CAMPO_EMAIL = "xpath://input[@id='email']";
    public static final String CAMPO_PASSWORD = "xpath://input[@name='password']";
    public static final String BOTON_LOGIN = "xpath://button[@type='submit']";
    public static final String BOTON_ADD = "xpath://*[@data-cy=\"add-btn\"]";
    public static final String LOGO_PERFIL = "xpath://a[.='TU']";
    public static final String OPCION_LOGOUT = "xpath://a[@data-cy='logout']";
    public static final String ICON_MENU_HAMBURGUER = "xpath:(//img[@alt='Edit menu dark theme'][1])" ;

//LOCATORS DE WORKSPACES
    public static final String BOTON_WORKSPACE = "xpath://img[@alt='Workspace dropdown options']";
    public static final String OPCION_MANAGE = "xpath://a[@routerlink='/workspaces']";
    public static final String BOTON_CREATE_WORKSPACE = "xpath://button[@type='button'][contains(.,'Create new workspace')]";
    public static final String CAMPO_NAME_WORKSPACE = "xpath://input[@formcontrolname='name']";
    public static final String BOTON_CREATE = "xpath://button[@class='cl-btn cl-btn-primary']";
    public static final String MENSAJE_PANTALLA_WORKSPACE = "xpath:(//div[contains(.,'has been created')])[4]";

//LOCATORS DE PROYECTOS
    public static final String ENLACE_PROYECTOS = "xpath:(//img[@src='assets/ui-icons/plus-blue.svg'])[1]";
    public static final String OPCION_CREAR_PROYECTO = "xpath://span[contains(.,'Create new project')]";
    public static final String CAMPO_NAME_PROYECTO = "xpath://input[@data-cy='project-name']\n";
    public static final String MENSAJE_PANTALLA_PROYECTO = "xpath://*[@id=\"toast-container\"]";
    public static final String CERRAR_MENSAJE_PANTALLA = "xpath://span[contains(.,'×')]";
    public static final String ICONO_SECCION_PROJECTS = "xpath://img[@alt='View Projects']";
    public static final String OPCION_ARCHIVAR = "xpath://a[contains(.,'Archive')]";
    public static final String BOTON_MODAL_ARCHIVAR = "xpath://button[contains(.,'Archive')]";
    public static final String OPCION_BORRAR = "xpath://a[contains(.,'Delete')]";
    public static final String CONFIRMAR_BOTON_BORRAR = "xpath://button[contains(.,'Delete')]";


}
