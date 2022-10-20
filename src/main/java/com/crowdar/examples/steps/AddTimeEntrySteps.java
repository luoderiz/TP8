package com.crowdar.examples.steps;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddTimeEntryConstants;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.AddTimeEntryService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTimeEntrySteps {

    @When("The user goes to Add Entry")
    public void goToAddEntry() {
        MobileActionManager.click(AddTimeEntryConstants.ADD_BUTTON);
    }

    @And("The user selects the date by month (.*) and day (.*)")
    public void selectDate(String month, String day) {
        AddTimeEntryService.enterDate();
    }

    @And("The user picks the starting time by hour (.*) and minutes (.*)")
    public void pickStartingTime(String hour, String minutes) {
        AddTimeEntryService.pickStartingTime(hour, minutes);
    }

    @And("The user picks the ending time by hour (.*) and minutes (.*)")
    public void pickEndingTime(String hour, String minutes) {
        AddTimeEntryService.pickEndingTime(hour, minutes);
        MobileActionManager.click(AddTimeEntryConstants.SAVE_BUTTON);
    }

    @And("The user enters the description (.*)")
    public void enterDescription(String description) {
        MobileActionManager.setInput(AddTimeEntryConstants.ENTER_DESCRIPTION, description);
    }

    @And("The user chooses the Project (.*)")
    public void chooseProject(String project) {
        MobileActionManager.click(AddTimeEntryConstants.SELECT_PROJECT);
        MobileActionManager.click(AddTimeEntryConstants.CHOOSE_PROYECTO_UNO);
    }

    @And("The user selects the Task (.*)")
    public void selectTask(String task) {
        MobileActionManager.click(AddTimeEntryConstants.SELECT_TASK);
        MobileActionManager.click(AddTimeEntryConstants.CHOOSE_AUTOMATIZAR_NOTIFICACIONES);
    }

    @And("The user saves the changes on the new entry")
    public void saveChanges() {
        MobileActionManager.click(AddTimeEntryConstants.SAVE_BUTTON);
    }

    @Then("The new Time entry can be seen in the User Home Page")
    public void isEntrySaved() {
        AddTimeEntryService.isEntrySaved();
    }
}
