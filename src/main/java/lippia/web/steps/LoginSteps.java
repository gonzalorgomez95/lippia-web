package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.LoginResultsService.*;
import static lippia.web.services.LoginService.*;


public class LoginSteps extends PageSteps {

    @Given("^el usuario se encuentra en la pagina de login de clockify$")
    public void home() {
        navegarURL();
    }

    @When("hace clic en el enlace \"Log in manually\"")
    public void clicLoginManually() {
        clicLoginManual();
    }

    @And("el campo email se completa con un email valido")
    public void completarEmail() {
        completarLoginEmail();
    }

    @And("el campo password se completa con la contraseña correcta")
    public void completarPassword() {
        completarLoginPassword();
    }

    @And("hace clic en el boton \"Log in\"")
    public void clicLogin() {
        clicBotonLogin();
    }

    @And("se visualiza la pantalla de carga horaria de clockify")
    public void validaLogin() {
        validarLogin();
    }

    @And("se valida que la url es: (.*)")
    public void validaURL(String url) {
        validarURL(url);
    }

    @And("hace clic el logo de perfil")
    public void clicPerfil() {
        clicLogoPerfil();
    }

    @And("hace clic en la opcion \"Log out\"")
    public void clicLogout() {
        clicOpcionLogout();
    }

    @Then("se valida que el usuario cerro sesion")
    public void validaLogout() {
        validarCierreSesion();
    }

    @Given("el usuario se encuentra logueado")
    public void loguearUsuario() {
        navegarURL();
        clicLoginManual();
        completarLoginEmail();
        completarLoginPassword();
        clicBotonLogin();
    }
}
