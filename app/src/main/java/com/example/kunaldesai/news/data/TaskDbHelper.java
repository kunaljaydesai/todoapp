package com.example.kunaldesai.news.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by KunalDesai on 8/1/14.
 */
public class TaskDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "taskManager.db";
    public String SQL_CREATE_TASK_TABLE;
    public TaskDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        SQL_CREATE_TASK_TABLE = "CREATE TABLE " + contract.TaskEntry.TABLE_NAME + " (" +
                contract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                contract.TaskEntry.TASK_NAME + " TEXT NOT NULL, " +
                contract.TaskEntry.TASK_DATE + " TEXT NOT NULL, ";
        db.execSQL(SQL_CREATE_TASK_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    /*public long insertRow(String taskName, String date) {

        // TODO: Update data in the row with new fields.
        // TODO: Also change the function's arguments to be what you need!
        // Create row's data:
        ContentValues initialValues = new ContentValues();
        initialValues.put(TASK_NAME, taskName);
        initialValues.put(TASK_DATE, date);


        // Insert it into the database.
        return db.insert(SQL_CREATE_TASK_TABLE, null, initialValues);
    } */
}
