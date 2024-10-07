package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceResultService extends ActionManager {

    public static void validarCreacionWorkspace() {
        waitPresence(MENSAJE_CREA_WORKSPACE);
        Assert.assertTrue(getText(MENSAJE_CREA_WORKSPACE).contains("has been created"));
    }
    public static void validarActualizarWorkspace() {
        waitPresence(MENSAJE_ACTULIZA_WORKSPACE);
        Assert.assertTrue(getText(MENSAJE_ACTULIZA_WORKSPACE).contains("have been updated"));
    }

}
