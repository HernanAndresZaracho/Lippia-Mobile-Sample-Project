package com.crowdar.examples.validator;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.SettingsService;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SettingsValidator {
    static SoftAssert softAssert = new SoftAssert();
    public static void checkDarkModeEnabled() {
        Assert.assertEquals(SettingsService.getTextDarkmode(), "ACTIVAR");
    }
}
