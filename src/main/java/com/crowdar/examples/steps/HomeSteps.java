package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.validator.HomeValidator;
import com.crowdar.examples.validator.LoginValidator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeSteps extends PageSteps {
    @Given("El usuario se encuetra logueado")
    public void elUsuarioSeEncuetraLogueado() {
        LoginService.doLogin(PropertyManager.getProperty("email"), PropertyManager.getProperty("password"));
    }

    @When("El usuario clickea en el boton +")
    public void elUsuarioClickeaEnElBoton() {
        HomeService.clickEntry();
    }






    @And("El usuario clickea en el boton End")
    public void elUsuarioClickeaEnElBotonEnd() {
        HomeService.clickEntryEnd();
    }

    @And("El usuario guarda el End")
    public void elUsuarioGuardaElEnd() {
        HomeService.clickEndSave();
    }

    @And("El usuario guarda el escenario creado")
    public void elUsuarioGuardaElEscenarioCreado() {
        HomeService.clickEntrySave();
    }

    @Then("Se creo un nuevo escenario")
    public void seCreoUnNuevoEscenario() {
        HomeValidator.checkEntryCreated();
    }
    @Then("Se creo un escenario con la fecha")
    public void seCreoUnEscenarioConLaFecha() {
        HomeValidator.checkEntryDateCreated();
    }

    @And("El usuario no guarda el escenario creado")
    public void elUsuarioNoGuardaElEscenarioCreado() {
        HomeService.clickEntryCancel();
    }

    @Then("No se crea el nuevo escenario")
    public void noSeCreaElNuevoEscenario() {
        HomeValidator.checkEntryNoCreated();
    }

    @When("El usuario clickea en el boton del Menu")
    public void elUsuarioClickeaEnElBotonDelMenu() {
        HomeService.clickMenuHambur();
    }

    @And("El usuario clickea en el boton Logout")
    public void elUsuarioClickeaEnElBotonLogout() {
        HomeService.clickLogout();
    }

    @And("El usuario clickea en el boton de confirmacion de Logout")
    public void elUsuarioClickeaEnElBotonDeConfirmacionDeLogout() {
        HomeService.clickLogoutConfirm();
    }

    @Then("El usuario se desloguea")
    public void elUsuarioSeDesloguea() {
        LoginValidator.isViewLoaded();
    }

    @And("El usuario clickea en el boton Fecha del Entry")
    public void elUsuarioClickeaEnElBotonFechaDelEntry() {
        HomeService.clickEntryStart();
    }

    @And("El usuario ingresa la (.*) del Start")
    public void elUsuarioIngresaLaHoraDelStart(String startHour) {
        HomeService.inputStartHour(startHour);
    }

    @And("El usuario ingresa la (.*) del End")
    public void elUsuarioIngresaLaHoraDelEnd(String endHour) {
        HomeService.inputEndHour(endHour);
    }

    @And("El usuario selecciona (.*) del Start")
    public void elUsuarioIngresaFechaDelStart(String fechaStart) {
        HomeService.inputStartDay(fechaStart);
    }

    @And("El usuario selecciona (.*) del End")
    public void elUsuarioIngresaFechaDelEnd(String fechaEnd) {
        HomeService.inputEndDay(fechaEnd);
    }
}
