package com.crowdar.examples.steps;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddTimeEntryConstants;
import com.crowdar.examples.services.AddTimeEntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTimeEntrySteps {

    @When("The user goes to Add Entry")
    public void goToAddEntry() {
        ActionManager.click(AddTimeEntryConstants.ADD_BUTTON);
    }

    @And("The user selects the date by month (.*) and day (.*)")
    public void selectDate(String month, String day) {
        ActionManager.click(AddTimeEntryConstants.START_DATE_BUTTON);
        AddTimeEntryService.enterDate(month, day);
    }

    @And("The user picks the starting time by hour (.*) and minutes (.*)")
    public void pickStartingTime(String hour, String minutes) {
        AddTimeEntryService.pickStartingTime(hour, minutes);
    }

    @And("The user picks the ending time by hour (.*) and minutes (.*)")
    public void pickEndingTime(String hour, String minutes) {
        AddTimeEntryService.pickEndingTime(hour, minutes);
        ActionManager.click(AddTimeEntryConstants.SAVE_BUTTON);
    }

    @And("The user enters the description (.*)")
    public void enterDescription(String description) {
        MobileActionManager.setInput(AddTimeEntryConstants.ENTER_DESCRIPTION, description);
    }

    @And("The user chooses the Project (.*)")
    public void chooseProject(String project) {
        MobileActionManager.click(AddTimeEntryConstants.SET_PROJECT_BUTTON);
        AddTimeEntryService.chooseProject(project);
    }

    @And("The user selects the Task (.*)")
    public void selectTask(String task) {
        MobileActionManager.click(AddTimeEntryConstants.SET_TASK_BUTTON);
        AddTimeEntryService.selectTask(task);
    }

    @And("The user saves the changes on the new entry")
    public void saveChanges() {
        ActionManager.click(AddTimeEntryConstants.SAVE_BUTTON);
    }

    @Then("The new Time entry '(.*)' can be seen in the User Home Page")
    public void isEntrySaved(String entryReference) {
        AddTimeEntryService.isEntrySaved(entryReference);
    }
}