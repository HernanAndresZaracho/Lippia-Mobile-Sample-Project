package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginSteps extends PageSteps {

    @Given("La aplicacion se abre correctamente")
    public void laAplicacionSeAbreCorrectamente() {
        LoginService.isViewLoaded();
    }

    @When("El usuario ingresa su (.*) y su (.*).")
    public void elUsuarioIngresaSuMailYSuPassword(String mail, String password) {
        LoginService.doLogin(mail, password);
    }

    @Then("El menu de la aplicacion se muestra")
    public void elMenuDeLaAplicacionSeMuestra() {
        HomeService.isViewLoaded();
    }
}
