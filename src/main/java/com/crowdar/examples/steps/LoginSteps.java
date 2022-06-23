package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.validator.LoginValidator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginSteps extends PageSteps {

    @Given("La aplicacion se abre correctamente")
    public void laAplicacionSeAbreCorrectamente() {
        LoginValidator.isViewLoaded();
    }

    @When("El usuario ingresa su (.*) y su (.*)")
    public void elUsuarioIngresaSuMailYSuPassword(String mail, String password) {
        LoginService.doLogin(mail, password);
    }

    @Then("El menu de la aplicacion se muestra")
    public void elMenuDeLaAplicacionSeMuestra() {
        LoginValidator.checkAddEntry();
    }

    @And("El usuario clickea en el boton Login")
    public void elUsuarioClickeaEnElBotonLogin() {
        LoginService.clickLogin();
    }
}
