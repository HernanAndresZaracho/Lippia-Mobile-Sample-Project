package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.SettingsConstants;

import java.util.Objects;

import static com.crowdar.core.actions.ActionManager.*;

public class HomeService {
    public static void clickMenuHambur(){
        click(HomeConstants.BTN_MENU_HAMBUR_XPATH);
    }
    public static void clickEntry() {
        click(HomeConstants.BTN_ADD_ENTRY_XPATH);
    }
    public static void clickEntryStart() {
        click(HomeConstants.BTN_FECHA_ID);
    }
    public static void inputStartHour(String S_hour) {
        String Hour = getText(HomeConstants.INPUT_START_HOUR_XPATH);
        while(!Objects.equals(Hour, S_hour)){
            click(HomeConstants.INPUT_START_NEXT_XPATH);
            Hour = getText(HomeConstants.INPUT_START_HOUR_XPATH);
        }
    }

    public static void inputStartDay(String S_day) {
        MobileActionManager.click(HomeConstants.INPUT_START_DAY_XPATH, S_day);
    }
    public static void clickStartSave() {
        click(HomeConstants.BTN_START_SAVE_XPATH);
    }
    public static void clickEntryEnd() {
        click(HomeConstants.BTN_ADD_ENTRY_END_XPATH);
    }
    public static void inputEndHour(String E_hour) {
        String Hour = getText(HomeConstants.INPUT_END_HOUR_XPATH);
        while(!Objects.equals(Hour, E_hour)){
            click(HomeConstants.INPUT_END_NEXT_XPATH);
            Hour = getText(HomeConstants.INPUT_END_HOUR_XPATH);
        }
    }
    public static void inputEndDay(String E_day) {
        MobileActionManager.click(HomeConstants.INPUT_END_DAY_XPATH, E_day);
    }
    public static void clickEndSave() {
        click(HomeConstants.BTN_END_SAVE_XPATH);
    }
    public static void clickEntrySave() {
        click(HomeConstants.BTN_ADD_ENTRY_SAVE_XPATH);
    }
    public static void clickEntryCancel() {
        click(HomeConstants.BTN_ADD_ENTRY_CANCEL_XPATH);
        click(HomeConstants.BTN_ADD_ENTRY_CANCEL_CONFIRM_XPATH);
    }
    public static void clickLogout() {
        click(SettingsConstants.BTN_LOGOUT_XPATH);
    }
    public static void clickLogoutConfirm() {
        click(SettingsConstants.BTN_LOGOUT_CONFIRM_XPATH);
    }
}
