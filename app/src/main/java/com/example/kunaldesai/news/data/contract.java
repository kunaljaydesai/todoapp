package com.example.kunaldesai.news.data;

import android.provider.BaseColumns;

/**
 * Created by KunalDesai on 8/1/14.
 */
public class contract {
    public static final class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "taskList";
        public static final String TASK_NAME = "task";
        public static final String TASK_DATE = "never";

    }
}
