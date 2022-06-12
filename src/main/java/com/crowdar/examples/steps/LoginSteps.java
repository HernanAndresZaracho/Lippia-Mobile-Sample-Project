package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginSteps extends PageSteps {

    @Given("La aplicacion se abre correctamente")
    public void laAplicacionSeAbreCorrectamente() {
        LoginService.isViewLoaded();
    }

    @When("El usuario ingresa su (.*)")
    public void elUsuarioIngresaSuMailYSuPassword(String datos) {
        LoginService.inputMail(datos);
    }

    @Then("El menu de la aplicacion se muestra")
    public void elMenuDeLaAplicacionSeMuestra() {
        HomeService.isViewLoaded();
    }

    @And("El usuario clickea en el boton Login")
    public void elUsuarioClickeaEnElBotonLogin() {
        LoginService.clickLogin();
    }
}
