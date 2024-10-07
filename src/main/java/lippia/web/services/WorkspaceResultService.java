package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceResultService extends ActionManager {

    public static void validarConfirmacionWorkspace() {
        waitPresence(MENSAJE_PANTALLA_WORKSPACE);
        Assert.assertTrue(getText(MENSAJE_PANTALLA_WORKSPACE).contains("has been created"));
    }

}
