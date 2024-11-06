package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static lippia.web.constants.ClockifyConstants.*;

public class TimeTrackerService extends ActionManager {

    public static void clicIconoCarga() {
        waitVisibility(ICONO_CARGA);
        waitClickable(ICONO_CARGA).click();
    }

    public static void completarHoraInicio(String horaInicial) {
    waitClickable(CAMPO_HORA_INICIAL_NUEVO).click();
    setInput(CAMPO_HORA_INICIAL_NUEVO, horaInicial);
        WebActionManager.getElement(CAMPO_HORA_INICIAL_NUEVO).sendKeys(Keys.ENTER);
}

    public static void completarHoraFin(String horaFinal) {
        waitClickable(CAMPO_HORA_FINAL_NUEVO).click();
        setInput(CAMPO_HORA_FINAL_NUEVO, horaFinal);
        WebActionManager.getElement(CAMPO_HORA_FINAL_NUEVO).sendKeys(Keys.ENTER);
    }

    public static void completarFecha(String date) {
        click(CAMPO_FECHA);
        setInput(CAMPO_FECHA, date);
    }

    public static void clicBotonAdd() {
        waitClickable(BOTON_ADD_HORA).click();
    }

    public static void validarCreacion() {
        waitPresence(MENSAJE_CREACION_CARGA);
        Assert.assertTrue(getText(MENSAJE_CREACION_CARGA).contains("has been created"));
    }

    public static void clicIconoTemporizador() {
        waitVisibility(ICONO_TEMPORIZADOR);
        waitClickable(ICONO_TEMPORIZADOR).click();
    }

    public static void clicBotonStart() {
        isPresent(BOTON_START);
        waitClickable(BOTON_START).click();
    }

    public static void clicIconoOpciones() {
        waitClickable(MENU_OPCIONES_CARGA).click();
    }

    public static void clicOpcionDiscard() {
        waitClickable(OPCION_DISCARD).click();

    }

    public static void clicOpcionDelete() {
        waitClickable(OPCION_DELETE).click();

    }

    public static void clicBotonDiscard() {
        waitClickable(BOTON_DISCARD_CONFIRMACION).click();
    }

    public static void clicBotonDelete() {
        waitClickable(BOTON_DELETE_CONFIRMACION).click();
    }

    public static void validateHoursNotLogged() {
        waitVisibility(MENSAJE_CARGA_HORA_CANCELADA);
        Assert.assertTrue(getText(MENSAJE_CARGA_HORA_CANCELADA).contains("Timer cancelled"));
    }

    public static void cambiarDescripcion() {
        waitClickable(CAMPO_DESCRIPCION).click();
        setInput(CAMPO_DESCRIPCION, "Modificado por Lippia Web", true, true);
        WebActionManager.getElement(CAMPO_HORA_INICIAL_EXISTENTE).sendKeys(Keys.ENTER);

    }

    public static void cambiarHoraInicial(String horaInicio) {
        waitClickable(CAMPO_HORA_INICIAL_EXISTENTE).click();
        setInput(CAMPO_HORA_INICIAL_EXISTENTE, horaInicio);
        WebActionManager.getElement(CAMPO_HORA_INICIAL_EXISTENTE).sendKeys(Keys.ENTER);
    }

    public static void cambiaHoraFinal(String horaFinal) {
        waitClickable(CAMPO_HORA_FINAL_EXISTENTE).click();
        setInput(CAMPO_HORA_FINAL_EXISTENTE, horaFinal);
        WebActionManager.getElement(CAMPO_HORA_FINAL_EXISTENTE).sendKeys(Keys.ENTER);
    }

    public static void clicBotonProject() {
        waitClickable(ICONO_AGREGAR_PROYECTO).click();
    }

    public static void modificarNombreProyecto() {
        waitClickable(LISTADO_NOMBRE_PROYECTO).click();
    }

    public static void clicIconoTag() { waitClickable(ICONO_TAG).click();}

    public static void modificarTag() { waitClickable(LISTADO_TAG).click();}

    public static void clicIconoPesos() { waitClickable(ICONO_PESOS).click();}

    public static void validarModificacionDescripcion() {
        waitVisibility(MENSAJE_ACTUALIZA_DESCRIPCION);
        Assert.assertTrue(getText(MENSAJE_ACTUALIZA_DESCRIPCION).contains("Successfully updated description"));
    }

    public static void validarModificacionProyecto() {
        waitVisibility(MENSAJE_ACTUALIZA_PROYECTO);
        Assert.assertTrue(getText(MENSAJE_ACTUALIZA_PROYECTO).contains("Project has been updated"));
    }

    public static void validarModificacionTag() {
        waitVisibility(MENSAJE_ACTUALIZA_TAG);
        Assert.assertTrue(getText(MENSAJE_ACTUALIZA_TAG).contains("Successfully updated tags"));
    }

    public static void validarModificacionCobro() {
        waitVisibility(MENSAJE_ACTUALIZA_COBRO);
        Assert.assertTrue(getText(MENSAJE_ACTUALIZA_COBRO).contains("Time entry successfully marked as billable"));
    }

    public static void validarModificacionHoraInicial() {
        waitVisibility(MENSAJE_ACTUALIZA_HORA_INICIAL);
        Assert.assertTrue(getText(MENSAJE_ACTUALIZA_HORA_INICIAL).contains("Start time has been updated"));
    }

    public static void validarModificacionHoraFinal() {
        waitVisibility(MENSAJE_ACTUALIZA_HORA_FINAL);
        Assert.assertTrue(getText(MENSAJE_ACTUALIZA_HORA_FINAL).contains("End time has been updated"));
    }

    public static void validarEliminacion() {
        waitVisibility(MENSAJE_ELIMINAR_CARGA);
        Assert.assertTrue(getText(MENSAJE_ELIMINAR_CARGA).contains("Time entry has been deleted"));
    }

}
