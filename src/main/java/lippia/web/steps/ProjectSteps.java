package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.ProjectResultService.validarConfirmacionWorkspace;
import static lippia.web.services.ProjectService.*;

public class ProjectSteps extends PageSteps {

    @And("hace clic en el enlace \"Proyecto\"")
    public void enlaceProyectos(){
        clicProyectos();
    }

    @And("hace clic en la opcion \"Create new project\"")
    public void crearProyecto() {
        opcionCrearProyecto();
    }

    @When("el campo project name se completa con nombre valido")
    public void completaCampoName() {
        completarNombreProyecto();
    }

    @Then("se visualiza el mensaje de confirmacion de proyecto")
    public void modalConfirmacionProyecto() {
        validarConfirmacionWorkspace();
        borrarProyectos();
    }

    @When("click on the create button")
    public void clickOnTheCreateButton() {
        clickButtonCreate();
    }

}
