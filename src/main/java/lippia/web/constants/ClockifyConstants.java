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

//LOCATORS DE WORKSPACES
    public static final String BUTTON_WORKSPACE = "xpath://img[@alt='Workspace dropdown options']";
    public static final String TEXT_MANAGE = "xpath://a[@routerlink='/workspaces']";
    public static final String TEXT_BUTTON_CREATE_WORKSPACE = "xpath://button[@type='button'][contains(.,'Create new workspace')]";
    public static final String INPUT_NAME_WORKSPACE = "xpath://input[@formcontrolname='name']";
    public static final String BUTTON_CREATE = "xpath://button[@class='cl-btn cl-btn-primary']";
    public static final String ALERT_TEXT_CONFIRM = "xpath:(//div[contains(.,'has been created')])[4]";

}
