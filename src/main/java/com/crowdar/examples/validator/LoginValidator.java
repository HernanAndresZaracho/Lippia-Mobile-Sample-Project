package com.crowdar.examples.validator;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.getText;
import static com.crowdar.core.actions.ActionManager.isVisible;

public class LoginValidator {
    static SoftAssert softAssert = new SoftAssert();
    public static void checkAddEntry(){
        MobileActionManager.waitVisibility(HomeConstants.BTN_ADD_ENTRY_XPATH);
        softAssert.assertTrue(isVisible(HomeConstants.BTN_ADD_ENTRY_XPATH));
    }
    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.BTN_SING_UP_XPATH);
        softAssert.assertTrue(isVisible(LoginConstants.INPUT_MAIL_XPATH), "No se cargo la app correctamente");
    }
}
