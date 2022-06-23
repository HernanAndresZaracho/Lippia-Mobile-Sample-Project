package com.crowdar.examples.services;

import com.crowdar.examples.constants.SettingsConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.*;


public class SettingsService {
    public static void clickSettings() {
        click(SettingsConstants.BTN_SETTINGS_XPATH);
    }
    public static void clickSettingsDarkmode() {
        click(SettingsConstants.BTN_SETTINGS_DARKMODE_ID);
    }
    public static String getTextDarkmode() {
        String textDarkmode = getText(SettingsConstants.BTN_SETTINGS_DARKMODE_ID);
        return textDarkmode;
    }


}
