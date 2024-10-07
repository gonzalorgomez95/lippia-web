package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static lippia.web.constants.ClockifyConstants.*;
import static lippia.web.services.WorkspaceService.generateRandomName;

public class ProjectService extends ActionManager {


    protected static String nameProject = "";

    public static void clicProyectos() {
        click(ENLACE_PROYECTOS);
    }

    public static void opcionCrearProyecto() {
        click(OPCION_CREAR_PROYECTO);
    }

    public static void completarNombreProyecto() {
        String randomName = "New Project: " + generateRandomName();
        nameProject = randomName;
        waitClickable(CAMPO_NAME_PROYECTO);
        setInput(CAMPO_NAME_PROYECTO, randomName);
    }

    public static void clickiconProject() {
        click(ICONO_SECCION_PROJECTS);
    }

    public static void closeAlert() {
        getFluentWait();
        waitClickable(CERRAR_MENSAJE_PANTALLA).click();
    }

    public static void clickIconMenuDrawer() {
        waitClickable(ICON_MENU_HAMBURGUER).click();
    }

    public static void clickArchiveProject() {
        click(OPCION_ARCHIVAR);
        waitVisibility(BOTON_MODAL_ARCHIVAR);
        click(BOTON_MODAL_ARCHIVAR);
        closeAlert();
    }

    public static void scrollToElement(WebElement element) {
        WebDriver driver = DriverManager.getDriverInstance();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void clickOptionDelete() {
        waitPresence(OPCION_BORRAR);

        WebElement element = getElement(OPCION_BORRAR);
        scrollToElement(element);
        waitClickable(OPCION_BORRAR).click();

        waitClickable(CONFIRMAR_BOTON_BORRAR).click();

    }

    public static void borrarProyectos() {
        clickiconProject();
        clickIconMenuDrawer();
        clickArchiveProject();
        clickIconMenuDrawer();
        clickOptionDelete();
    }

    public static void clickButtonCreate() {
        waitClickable(BOTON_CREATE).click();
    }
}
