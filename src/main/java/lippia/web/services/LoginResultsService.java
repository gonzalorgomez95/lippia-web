package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import static lippia.web.constants.ClockifyConstants.*;

import org.testng.Assert;


public class LoginResultsService extends ActionManager {
    public static void validarLogin() {
        waitVisibility(BOTON_ADD);
        Assert.assertTrue(isVisible(BOTON_ADD));
    }

    public static void validarCierreSesion(){
        waitPresence(ENLACE_LOGIN_MANUAL);
        Assert.assertTrue(isVisible(ENLACE_LOGIN_MANUAL));
    }

}
