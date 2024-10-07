package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static com.crowdar.driver.DriverManager.getDriverInstance;
import static lippia.web.constants.ClockifyConstants.*;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void navegarURL() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clicLoginManual() {
        waitClickable(ENLACE_LOGIN_MANUAL).click();
    }

    public static void completarLoginEmail() {
        setInput(CAMPO_EMAIL, "test.user.auto01@yopmail.com");
    }

    public static void completarLoginPassword() {
        setInput(CAMPO_PASSWORD, "testing12345");
    }

    public static void clicBotonLogin() {
        waitClickable(BOTON_LOGIN).click();
    }

    public static void validarURL(String url) {
        String actualURL = getDriverInstance().getCurrentUrl();
        Assert.assertEquals(url, actualURL);
    }

    public static void clicLogoPerfil() {
        waitClickable(LOGO_PERFIL).click();
    }

    public static void clicOpcionLogout() {
        waitClickable(OPCION_LOGOUT).click();
    }
}


