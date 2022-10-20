package com.crowdar.examples.constants;

public class AddTimeEntryConstants {

    public static final String ADD_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Add time entry']";

    public static final String START_DATE_BUTTON = "id:timeentry_start_date";

    public static final String NEXT_MONTH_BUTTON = "id:next";

    public static final String MONTH_NOVEMBER = "xpath://android.widget.CalendarView//android.view.View[contains(@content-desc, 'November')]";

    public static final String DAY_12_BUTTON = "xpath://android.view.View[@text='12']";

    public static final String SET_HOUR = "xpath://android.widget.NumberPicker[1]/android.widget.EditText";

    public static final String SET_MINUTE = "xpath://android.widget.NumberPicker[2]/android.widget.EditText";

    public static final String ENTER_DESCRIPTION = "id:time_entry_description_input";

    public static final String SELECT_PROJECT = "id:timeentry_project_section";

    //todo parametrizar
    public static final String CHOOSE_PROYECTO_UNO = "xpath://android.widget.TextView[@text='Proyecto Uno']//following-sibling::android.widget.ImageView";

    public static final String SELECT_TASK = "id:timeentry_task_section";

    public static final String CHOOSE_AUTOMATIZAR_NOTIFICACIONES = "xpath://android.widget.TextView[@text='Automatizar notificaciones']";

    public static final String SAVE_BUTTON = "xpath://android.widget.Button[@text='SAVE']";

    public static final String NAVIGATE_BACK_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";

    public static final String LISTED_PROYECTO_UNO = "xpath://android.widget.FrameLayout[@enabled='true']//android.widget.TextView[@text='Proyecto Uno']";
}
