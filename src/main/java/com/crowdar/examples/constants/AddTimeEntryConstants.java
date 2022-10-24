package com.crowdar.examples.constants;

public class AddTimeEntryConstants {

    public static final String ADD_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Add time entry']";

    public static final String START_DATE_BUTTON = "id:timeentry_start_date";

    public static final String NEXT_MONTH_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Next month']";

    public static final String MONTH_VIEW = "xpath://android.widget.CalendarView//android.view.View[contains(@content-desc, '%s')]";

    public static final String DAY_BUTTON = "xpath://android.view.View[@text='%s']";

    public static final String START_TIME_BUTTON = "xpath://android.widget.LinearLayout[@content-desc='START']";

    public static final String END_TIME_BUTTON = "xpath://android.widget.LinearLayout[@content-desc='END']";

    public static final String SET_HOUR_BUTTON = "xpath://android.widget.NumberPicker[1]/android.widget.EditText[@text='%s']";

    public static final String NEXT_HOUR_BUTTON = "xpath://android.widget.NumberPicker[1]/android.widget.Button[2]";

    public static final String SET_MINUTE_BUTTON = "xpath://android.widget.NumberPicker[2]/android.widget.EditText[@text='%s']";

    public static final String NEXT_MINUTE_BUTTON = "xpath://android.widget.NumberPicker[2]/android.widget.Button[2]";

    public static final String ENTER_DESCRIPTION = "id:time_entry_description_input";

    public static final String SET_PROJECT_BUTTON = "id:timeentry_project_section";

    public static final String CHOOSE_PROJECT = "xpath://androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup[@clickable='true']/android.widget.TextView[@text='%s']/..";

    public static final String SET_TASK_BUTTON = "id:timeentry_task_section";

    public static final String CHOOSE_TASK = "xpath://android.widget.TextView[@text='%s']";

    public static final String SAVE_BUTTON = "xpath://android.widget.Button[@text='SAVE']";

    public static final String PUBLISHED_TIME_ENTRY_DATE = "xpath://android.widget.TextView[contains(@text, '%s')]";

    public static final String PUBLISHED_TIME_ENTRY_DESCRIPTION = "xpath://android.widget.TextView[@text='%s']";
}
