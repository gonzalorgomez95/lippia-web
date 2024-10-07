package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import java.util.Random;

import static lippia.web.constants.ClockifyConstants.*;

public class WorkspaceService extends ActionManager {

    public static void opcionesWorkspaces() {
        waitClickable(BOTON_WORKSPACE).click();
    }

    public static void opcionManageWorkspaces() {
        waitClickable(OPCION_MANAGE).click();
    }


    public static void clicBotonCrearWorkspace() {
        waitClickable(BOTON_CREATE_WORKSPACE).click();
    }


    public static String generateRandomName() {
        int length = new Random().nextInt(10) + 4;
        return new Random().ints(length, 'a', 'z' + 4)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void completarNombreWorkspace() {
        String randomName = "Workspace: " + generateRandomName();
        waitClickable(CAMPO_NAME_WORKSPACE).click();
        setInput(CAMPO_NAME_WORKSPACE, randomName, true, true);

    }

    public static void workspaceClicBotonCreate() {
        waitClickable(BOTON_CREATE).click();
    }

    public static void workspaceClicBotonSettings(){
        waitClickable(BOTON_SETTINGS).click();
    }

    public static void ingresaCaracteres(){
        String randomName = generateRandomName();
        waitClickable(CAMPO_NOMBRE_SETTINGS).click();
        setInput(CAMPO_NOMBRE_SETTINGS, randomName, true, true);
    }

    public static void clicPantallaSettings(){
        waitClickable(CLIC_PAGINA).click();
    }

}