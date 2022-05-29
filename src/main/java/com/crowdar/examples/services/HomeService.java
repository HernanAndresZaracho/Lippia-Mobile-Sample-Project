package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.SettingsConstants;
import org.testng.Assert;
import com.crowdar.core.actions.ActionManager;

import static com.crowdar.core.actions.ActionManager.*;

public class HomeService {
    public static void clickMenuHambur(){
        click(HomeConstants.BTN_MENU_HAMBUR_XPATH);
    }
    public static void clickEntry() {
        click(HomeConstants.BTN_ADD_ENTRY_XPATH);
    }
    public static void clickEntryStart() {
        click(HomeConstants.BTN_ADD_ENTRY_START_XPATH);
    }
    public static void inputStartHour(int S_hour) {
        setInput(HomeConstants.INPUT_START_HOUR_XPATH, String.valueOf(S_hour));
    }
    public static void inputStartMinutes(int S_minutes) {
        setInput(HomeConstants.INPUT_START_MINUTES_XPATH, String.valueOf(S_minutes));
    }
    public static void inputStartDay(int S_day) {
        setInput(HomeConstants.INPUT_START_DAY_XPATH, String.valueOf(S_day));
    }
    public static void clickStartSave() {
        click(HomeConstants.BTN_START_SAVE_XPATH);
    }
    public static void clickEntryEnd() {
        click(HomeConstants.BTN_ADD_ENTRY_END_XPATH);
    }
    public static void inputEndHour(int E_hour) {
        setInput(HomeConstants.INPUT_END_HOUR_XPATH, String.valueOf(E_hour));
    }
    public static void inputEndDay(int E_day) {
        setInput(HomeConstants.INPUT_END_DAY_XPATH, String.valueOf(E_day));
    }
    public static void inputEndMinutes(int E_minutes) {
        setInput(HomeConstants.INPUT_END_MINUTES_XPATH, String.valueOf(E_minutes));
    }
    public static void clickEndSave() {
        click(HomeConstants.BTN_END_SAVE_XPATH);
    }
    public static void clickEntrySave() {
        click(HomeConstants.BTN_ADD_ENTRY_SAVE_XPATH);
    }
    public static void clickEntryCancel() {
        click(HomeConstants.BTN_ADD_ENTRY_CANCEL_XPATH);
    }
    public static void clickCancelConfirm() {
        click(HomeConstants.BTN_ADD_ENTRY_CANCEL_CONFIRM_XPATH);
    }
    public static void checkEntryCreated() {
        Assert.assertTrue(isVisible(HomeConstants.ADD_ENTRY_CREATED_XPATH));
    }
    public static void checkEntryNoCreated(){
        Assert.assertFalse(isVisible(HomeConstants.ADD_ENTRY_CREATED_XPATH));
    }

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(HomeConstants.BTN_MENU_HAMBUR_XPATH);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.BTN_ADD_ENTRY_XPATH), "No se muestra el menu de la aplicacion");
    }

    public static void clickLogout() {
        click(SettingsConstants.BTN_LOGOUT_XPATH);
    }
    public static void clickLogoutConfirm() {
        click(SettingsConstants.BTN_LOGOUT_CONFIRM_XPATH);
    }
}
