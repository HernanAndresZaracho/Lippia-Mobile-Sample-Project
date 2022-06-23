package com.crowdar.examples.validator;

import com.crowdar.examples.constants.HomeConstants;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.getText;

public class HomeValidator {
    static SoftAssert softAssert = new SoftAssert();
    public static void checkEntryCreated() {
        String Today = getText(HomeConstants.ENTRY_CREATED_XPATH);
        softAssert.assertEquals(Today, "Today", "No se ha creado el entry");
    }
    public static void checkEntryDateCreated() {
        String Day = getText(HomeConstants.ENTRY_CREATED_XPATH);
        softAssert.assertEquals(Day, "dom., 26 jun.", "No se ha creado el entry");
    }
    public static void checkEntryNoCreated(){
        softAssert.assertNotEquals("Today",getText(HomeConstants.ENTRY_CREATED_XPATH));
    }

}
