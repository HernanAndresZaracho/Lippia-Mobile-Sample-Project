package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;

public class LoginService {

    public static void inputMail(String email){
        setInput(LoginConstants.INPUT_MAIL_XPATH, email);
    }
    public static void inputPassword(String password){
        setInput(LoginConstants.INPUT_PASSWORD_XPATH, password);
    }
    public static void clickLogin() {
        click(LoginConstants.BTN_LOGIN_XPATH);
    }
    public static void clickSingUp() {
        click(LoginConstants.BTN_SING_UP_XPATH);
    }
    public static void doLogin(String email, String password){
        inputMail(email);
        inputPassword(password);
        clickLogin();
    }
    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.BTN_SING_UP_XPATH);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.INPUT_MAIL_XPATH), "No se cargo la app correctamente");
    }
}
