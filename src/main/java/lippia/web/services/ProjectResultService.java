package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;
import static lippia.web.constants.ClockifyConstants.*;

public class ProjectResultService {

    public static void validarConfirmacionWorkspace(){
        waitVisibility(MENSAJE_PANTALLA_PROYECTO);
        String popUp = WebActionManager.getAttribute(MENSAJE_PANTALLA_PROYECTO, "textContent");
        Assert.assertTrue(popUp != null && popUp.contains("has been created"));
    }
}
