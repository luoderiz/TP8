package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddTimeEntryConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class AddTimeEntryService {
    public static void enterDate(String month, String day){
        String selectedMonth = AddTimeEntryService.formatLocatorWithValue(AddTimeEntryConstants.MONTH_VIEW, month);
        String selectedDay = AddTimeEntryService.formatLocatorWithValue(AddTimeEntryConstants.DAY_BUTTON, day);
        while(!MobileActionManager.isPresent(selectedMonth)) {
            MobileActionManager.click(AddTimeEntryConstants.NEXT_MONTH_BUTTON);
        }
        MobileActionManager.click(selectedDay);
    }

    public static void setTime(String hour, String minutes) {
        String setMinute = String.format(AddTimeEntryConstants.SET_MINUTE_BUTTON, minutes);
        while(!MobileActionManager.isPresent(setMinute)){
            MobileActionManager.click(AddTimeEntryConstants.NEXT_MINUTE_BUTTON);
        }
        String setHour = String.format(AddTimeEntryConstants.SET_HOUR_BUTTON, hour);
        while(!MobileActionManager.isPresent(setHour)) {
            MobileActionManager.click(AddTimeEntryConstants.NEXT_HOUR_BUTTON);
        }
    }

    public static void pickStartingTime(String hour, String minutes) {
        MobileActionManager.click(AddTimeEntryConstants.START_TIME_BUTTON);
        setTime(hour, minutes);
    }

    public static void pickEndingTime(String hour, String minutes) {
        MobileActionManager.click(AddTimeEntryConstants.END_TIME_BUTTON);
        setTime(hour, minutes);
        MobileActionManager.click(AddTimeEntryConstants.SAVE_BUTTON);
    }

    public static String formatLocatorWithValue(String locator, String value){
        return String.format(locator, value);
    }

    public static void isEntrySaved() {
        MobileActionManager.waitVisibility(LoginConstants.TOOLBAR);
        Assert.assertTrue(MobileActionManager.isVisible(AddTimeEntryConstants.LISTED_SPECIFIC_PROJECT), "Failed to display the new entry");
    }

}
