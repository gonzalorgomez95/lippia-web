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

//LOCATORS DE TIME TRACKER
    public static final String CAMPO_HORA_INICIAL_NUEVO = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[2]/div/single-date-picker2/div[1]/input-time-ampm[1]/input";
    public static final String CAMPO_HORA_FINAL_NUEVO = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[2]/div/single-date-picker2/div[1]/input-time-ampm[2]/input";
    public static final String CAMPO_FECHA = "xpath:(//input[@type='text'])[4]";
    public static final String BOTON_ADD_HORA = "xpath:(//button[contains(.,'Add')])[1]";
    public static final String ICONO_CARGA = "xpath://*[@id='manual-mode']";;
    public static final String ICONO_TEMPORIZADOR = "xpath://img[contains(@alt,'Track time using timer selected')]";
    public static final String BOTON_START = "xpath:(//button[contains(.,'Start')])[1]";
    public static final String MENU_OPCIONES_CARGA = "xpath://img[@class='cl-px-2']";
    public static final String OPCION_DISCARD = "xpath://a[contains(.,'Discard')]";
    public static final String BOTON_DISCARD_CONFIRMACION = "xpath://button[@type='button'][contains(.,'Discard')]";
    public static final String CAMPO_DESCRIPCION = "xpath://input[contains(@container,'body')]";
    public static final String ICONO_AGREGAR_PROYECTO = "xpath:(//img[@src='assets/ui-icons/plus-blue.svg'])[2]";
    public static final String LISTADO_NOMBRE_PROYECTO = "xpath://button[contains(.,'Project Testt by api low 20')]";
    public static final String ICONO_TAG = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry/div/div[3]/div/tag-names/div[1]";
    public static final String LISTADO_TAG = "xpath://label[@class='cl-custom-control-label']";
    public static final String ICONO_PESOS = "xpath:/html/body/app-root/default-layout/div[1]/main/div/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry/div/div[4]/div/billable-icon/div/span";
    public static final String CAMPO_HORA_INICIAL_EXISTENTE = "xpath://single-date-picker2[@class='cl-d-flex cl-w-100 cl-single-date-picker-tracker']//input[@class='cl-form-control cl-input-time-picker cl-input-time-picker--time-format-24 ng-untouched ng-pristine ng-valid']";
    public static final String CAMPO_HORA_FINAL_EXISTENTE = "xpath:/html[1]/body[1]/app-root[1]/default-layout[1]/div[1]/main[1]/div[1]/tracker2[1]/div[1]/div[1]/div[1]/div[1]/entry-group[1]/div[1]/time-tracker-entry[1]/div[1]/div[4]/div[1]/single-date-picker2[1]/div[1]/input-time-ampm[2]/input[1]";
    public static final String OPCION_DELETE = "xpath://a[contains(.,'Delete')]";
    public static final String BOTON_DELETE_CONFIRMACION = "xpath://button[@class='cl-btn cl-btn-danger']";

//LOCATORS DE VALIDACION
    public static final String MENSAJE_CREACION_CARGA = "xpath:(//div[contains(.,'has been created')])[4]";
    public static final String MENSAJE_CARGA_HORA_CANCELADA = "xpath://div[@aria-label='Timer cancelled']";
    public static final String MENSAJE_ACTUALIZA_DESCRIPCION = "xpath:(//div[contains(.,'Successfully updated description')])[4]";
    public static final String MENSAJE_ACTUALIZA_PROYECTO = "xpath:(//div[contains(.,'Project has been updated')])[4]";
    public static final String MENSAJE_ACTUALIZA_TAG = "xpath:(//div[contains(.,'Successfully updated tags')])[4]";
    public static final String MENSAJE_ACTUALIZA_COBRO = "xpath:(//div[contains(.,'Time entry successfully marked as billable')])[4]";
    public static final String MENSAJE_ACTUALIZA_HORA_INICIAL = "xpath:(//div[contains(.,'Start time has been updated')])[4]";
    public static final String MENSAJE_ACTUALIZA_HORA_FINAL = "xpath:(//div[contains(.,'End time has been updated')])[4]";
    public static final String MENSAJE_ELIMINAR_CARGA = "xpath:(//div[contains(.,'Time entry has been deleted')])[4]";



}
