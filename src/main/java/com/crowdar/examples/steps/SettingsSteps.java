package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.SettingsService;
import com.crowdar.examples.validator.SettingsValidator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class SettingsSteps extends PageSteps {

    @And("El usuario clickea en el boton settings")
    public void elUsuarioClickeaEnElBotonSettings() {
        SettingsService.clickSettings();
    }

    @And("El usuario habilita el modo darkmode")
    public void elUsuarioHabilitaElModoDarkmode() {
        SettingsService.clickSettingsDarkmode();
    }

    @Then("El usuario cambia la aplicacion a modo darkmode")
    public void elUsuarioCambiaLaAplicacionAModoDarkmode() {
        SettingsValidator.checkDarkModeEnabled();
    }
}

