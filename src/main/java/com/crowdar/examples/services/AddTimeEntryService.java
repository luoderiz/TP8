package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.AddTimeEntryConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class AddTimeEntryService {
    public static void enterDate(String month, String day) {
        String selectedMonth = String.format(AddTimeEntryConstants.MONTH_VIEW, month);
        String selectedDay = String.format(AddTimeEntryConstants.DAY_BUTTON, day);
        while (!ActionManager.isPresent(selectedMonth)) {
            ActionManager.click(AddTimeEntryConstants.NEXT_MONTH_BUTTON);
        }
        ActionManager.click(selectedDay);
    }

    public static void setTime(String hour, String minutes) {
        String setMinute = String.format(AddTimeEntryConstants.SET_MINUTE_BUTTON, minutes);
        while (!ActionManager.isPresent(setMinute)) {
            ActionManager.click(AddTimeEntryConstants.NEXT_MINUTE_BUTTON);
        }
        String setHour = String.format(AddTimeEntryConstants.SET_HOUR_BUTTON, hour);
        while (!ActionManager.isPresent(setHour)) {
            ActionManager.click(AddTimeEntryConstants.NEXT_HOUR_BUTTON);
        }
    }

    public static void pickStartingTime(String hour, String minutes) {
        ActionManager.click(AddTimeEntryConstants.START_TIME_BUTTON);
        setTime(hour, minutes);
    }

    public static void pickEndingTime(String hour, String minutes) {
        ActionManager.click(AddTimeEntryConstants.END_TIME_BUTTON);
        setTime(hour, minutes);
    }

    public static void chooseProject(String project) {
        String selectedProject = String.format(AddTimeEntryConstants.CHOOSE_PROJECT, project);
        ActionManager.click(selectedProject);
    }

    public static void selectTask(String task) {
        String chosenTask = String.format(AddTimeEntryConstants.CHOOSE_TASK, task);
        ActionManager.click(chosenTask);
    }

    public static void isEntrySaved(String month, String day, String description) {
        ActionManager.waitVisibility(LoginConstants.TOOLBAR);
        String addedDate = day + ' ' + month;
        String addedTimeEntryByDate = String.format(AddTimeEntryConstants.PUBLISHED_TIME_ENTRY_DATE, addedDate);
        String addedTimeEntryByDescription = String.format(AddTimeEntryConstants.PUBLISHED_TIME_ENTRY_DESCRIPTION, description);
        Assert.assertTrue(ActionManager.isVisible(addedTimeEntryByDate), "Failed to locate the new entry's date");
        Assert.assertTrue(ActionManager.isVisible(addedTimeEntryByDescription), "Failed to locate the new entry's description");
    }
}