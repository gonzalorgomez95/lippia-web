package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.LoginService.*;
import static lippia.web.services.WorkspaceService.*;
import static lippia.web.services.WorkspaceResultService.*;

public class WorkspaceSteps extends PageSteps {

    @Given("el usuario se encuentra logueado")
    public void loguearUsuario() {
        navegarURL();
        clicLoginManual();
        completarLoginEmail();
        completarLoginPassword();
        clicBotonLogin();
    }

    @And("se encuentra en la pagina Workspaces de clockify")
    public void clicWorkspace() {
        opcionesWorkspaces();
        opcionManageWorkspaces();
    }

    @And("hace clic en el enlace \"Create new workspace\"")
    public void crearWorkspace() {
        clicBotonCrearWorkspace();
    }

    @And("el campo workspace name se completa con nombre valido")
    public void completarCampoName() {
        completarNombreWorkspace();
    }

    @When("hace clic en el boton \"Create\"")
    public void clickOnTheCreateButton() {
        clicBotonCreate();
    }

    @Then("se visualiza el mensaje de confirmacion en pantalla")
    public void modalConfirmacion() {
        validarConfirmacion();
    }
}