package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import java.util.Random;

import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceService extends ActionManager {

    public static void opcionesWorkspaces() {
        waitClickable(BUTTON_WORKSPACE).click();
    }

    public static void opcionManageWorkspaces() {
        waitClickable(TEXT_MANAGE).click();
    }


    public static void clicBotonCrearWorkspace() {
        waitClickable(TEXT_BUTTON_CREATE_WORKSPACE).click();
    }


    public static String generateRandomName() {
        int length = new Random().nextInt(10) + 4;
        return new Random().ints(length, 'a', 'z' + 4)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void completarNombreWorkspace() {
        String randomName = "Workspace: " + generateRandomName();
        waitClickable(INPUT_NAME_WORKSPACE).click();
        setInput(INPUT_NAME_WORKSPACE, randomName, true, true);

    }

    public static void clicBotonCreate() {
        waitClickable(BUTTON_CREATE).click();
    }
}