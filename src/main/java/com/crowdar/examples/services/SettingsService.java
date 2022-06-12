package com.crowdar.examples.services;

import com.crowdar.examples.constants.SettingsConstants;

import static com.crowdar.core.actions.ActionManager.click;


public class SettingsService {
    public static void clickSettings() {
        click(SettingsConstants.BTN_SETTINGS_XPATH);
    }
    public static void clickSettingsOffline() {
        click(SettingsConstants.BTN_SETTINGS_OFFLINE_XPATH);
    }
    public static void checkOffline() {
        click(SettingsConstants.TXT_OFFLINE_ACT_XPATH);
    }


}
