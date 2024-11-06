package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.TimeTrackerService.*;


public class TimeTrackerSteps extends PageSteps {

    @When("hace clic en el icono de carga manual")
    public void clicIconoManual() {
        clicIconoCarga();
    }

    @When("el campo hora de inicio se completa con (.*)")
    public void completaHoraInicio(String horaInicial) {
        completarHoraInicio(horaInicial);
    }

    @And("el campo hora de fin se completa con (.*)")
    public void completaHoraFinal(String horaFinal) {
        completarHoraFin(horaFinal);
    }

    @And("el campo fecha se completa con (.*)")
    public void completaFecha(String fecha) {
        completarFecha(fecha);
    }

    @And("hace clic en el boton \"ADD\"")
    public void clicAdd() {
        clicBotonAdd();
    }

    @Then("se visualiza el mensaje de creacion exitosa")
    public void creacionExitosaHora() {
        validarCreacion();
    }

    @When("hace clic en el icono del temporizador")
    public void clicIconoReloj() {
        clicIconoTemporizador();
    }

    @And("hace clic en el boton \"START\"")
    public void clicStart() {
        clicBotonStart();
    }

    @And("hace clic en las opciones")
    public void clicOpciones() {
        clicIconoOpciones();
    }

    @And("hace clic en la opcion \"Discard\"")
    public void clicDiscard() {
        clicOpcionDiscard();
    }

    @And("hace clic en el boton \"DISCARD\"")
    public void clickDiscardConfirmacion() {
        clicBotonDiscard();
    }

    @Then("se visualiza el mensaje de cancelacion exitosa")
    public void timeIsNotAddToList() {
        validateHoursNotLogged();
    }

    @When("el campo descripcion se actualiza")
    public void actualizarDescripcion() {
        cambiarDescripcion();
    }

    @When("el campo hora de inicio se actualiza a (.*)")
    public void actualizarHoraInicio(String horaInicio) {
        cambiarHoraInicial(horaInicio);
    }

    @When("el campo hora de fin se actualiza a (.*)")
    public void actualizarHoraFin(String horaFin) {
        cambiaHoraFinal(horaFin);
    }

    @When("hace clic en el boton \"Project\"")
    public void clicProject() {
        clicBotonProject();
    }

    @When("hace clic en el icono del tag")
    public void clicTag() {
        clicIconoTag();
    }

    @When("hace clic en el icono pesos")
    public void clicPesos() {
        clicIconoPesos();
    }

    @And("selecciona un proyecto del listado")
    public void actualizarProyecto() {
        modificarNombreProyecto();
    }

    @And("selecciona un tag del listado")
    public void actualizarTag() {
        modificarTag();
    }

    @And("hace clic en la opcion \"Delete\"")
    public void clicDelete() {
        clicOpcionDelete();
    }

    @And("hace clic en el boton \"DELETE\"")
    public void clickDeleteConfirmacion() {
        clicBotonDelete();
    }

    @Then("se visualiza el mensaje de modificacion de descripcion")
    public void modalModificacionDescripcion() {
        validarModificacionDescripcion();
    }

    @Then("se visualiza el mensaje de modificacion de tag")
    public void modalModificacionTag() {
        validarModificacionTag();
    }

    @Then("se visualiza el mensaje de modificacion de cobro")
    public void modalModificacionCobro() {
        validarModificacionCobro();
    }

    @Then("se visualiza el mensaje de modificacion de proyecto")
    public void modalModificacionProyecto() {
        validarModificacionProyecto();
    }

    @Then("se visualiza el mensaje de modificacion de hora de inicio")
    public void modalModificacionHoraInicial() {
        validarModificacionHoraInicial();
    }

    @Then("se visualiza el mensaje de modificacion de hora de fin")
    public void modalModificacionHoraFinal() {
        validarModificacionHoraFinal();
    }

    @Then("se visualiza el mensaje de eliminacion exitosa")
    public void modalEliminacion() {
        validarEliminacion();
    }

}
