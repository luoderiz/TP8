package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddTimeEntryConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AddTimeEntryService {
    public static void enterDate(){
        MobileActionManager.click(AddTimeEntryConstants.START_DATE_BUTTON);
        while(MobileActionManager.isVisible(AddTimeEntryConstants.MONTH_NOVEMBER)) {
            MobileActionManager.click(AddTimeEntryConstants.NEXT_MONTH_BUTTON);
        }
        MobileActionManager.click(AddTimeEntryConstants.DAY_12_BUTTON);
        MobileActionManager.click(AddTimeEntryConstants.SAVE_BUTTON);
    }

    public static void pickStartingTime(String hour, String minutes) {
        MobileActionManager.clickOptionSpinner(AddTimeEntryConstants.SET_HOUR, hour);
        MobileActionManager.clickOptionSpinner(AddTimeEntryConstants.SET_MINUTE, minutes);
    }

    public static void pickEndingTime(String hour, String minutes) {
        MobileActionManager.clickOptionSpinner(AddTimeEntryConstants.SET_HOUR, hour);
        MobileActionManager.clickOptionSpinner(AddTimeEntryConstants.SET_MINUTE, minutes);
    }

    public static void isEntrySaved() {
        MobileActionManager.waitVisibility(LoginConstants.TOOLBAR);
        Assert.assertTrue(MobileActionManager.isVisible(AddTimeEntryConstants.LISTED_PROYECTO_UNO), "Failed to display the new entry");
    }
}
