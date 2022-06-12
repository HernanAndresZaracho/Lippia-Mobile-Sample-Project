package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.SettingsService;
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

    @And("El usuario clickea en el boton Start")
    public void elUsuarioClickeaEnElBotonStart() {
        HomeService.clickEntryStart();
    }

    @And("El usuario ingresa la (.*), el (.*) y el (.*) del Start")
    public void elUsuarioIngresaLaHoraElMinutoYElDiaDelStart(int startHour, int startMinutes, int startDay) {
        HomeService.inputStartHour(startHour);
        HomeService.inputStartMinutes(startMinutes);
        HomeService.inputStartDay(startDay);
    }

    @And("El usuario guarda el Start")
    public void elUsuarioGuardaElStart() {
        HomeService.clickStartSave();
    }

    @And("El usuario clickea en el boton End")
    public void elUsuarioClickeaEnElBotonEnd() {
        HomeService.clickEntryEnd();
    }

    @And("El usuario ingresa la (.*), el (.*) y el (.*) del End")
    public void elUsuarioIngresaLaHoraElMinutoYElDiaDelEnd(int endHour, int endMinutes, int endDay) {
        HomeService.inputEndHour(endHour);
        HomeService.inputEndMinutes(endMinutes);
        HomeService.inputEndDay(endDay);
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
        HomeService.checkEntryCreated();
    }


    @And("El usuario no guarda el escenario creado")
    public void elUsuarioNoGuardaElEscenarioCreado() {
        HomeService.clickEntryCancel();
    }

    @Then("No se crea el nuevo escenario")
    public void noSeCreaElNuevoEscenario() {
        HomeService.checkEntryNoCreated();
    }

    @When("El usuario clickea en el boton del Menu")
    public void elUsuarioClickeaEnElBotonDelMenu() {
        HomeService.clickMenuHambur();
    }

    @And("El usuario clickea en el boton settings")
    public void elUsuarioClickeaEnElBotonSettings() {
        SettingsService.clickSettings();
    }

    @And("El usuario habilita el modo offline")
    public void elUsuarioHabilitaElModoOffline() {
        SettingsService.clickSettingsOffline();
    }

    @Then("El usuario cambia la aplicacion a offline")
    public void elUsuarioCambiaLaAplicacionAOffline() {
        SettingsService.checkOffline();
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
        LoginService.isViewLoaded();
    }
}
