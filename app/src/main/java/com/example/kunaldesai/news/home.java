package com.example.kunaldesai.news;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.gesture.Gesture;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kunaldesai.news.data.TaskDbHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class home extends Activity {
    final ArrayList<String> toDoInfo = new ArrayList<String>();
    final ArrayList<String> toDoDate = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todohome);
        toDoInfo.add("hi");
        toDoInfo.add("hoal");
        //final AlertDialog.Builder builder = new AlertDialog.Builder(this);

       /* Button addNewTask = (Button) findViewById(R.id.add);
        Button edit = (Button) findViewById(R.id.edit);
        Button delete = (Button) findViewById(R.id.delete);*/
        final ArrayAdapter<String> toDoList =
                new ArrayAdapter<String>(
                        this,
                        R.layout.todoitem,
                        R.id.individualItem,
                        toDoInfo);


        final ListView listView = (ListView) findViewById(R.id.itemList);
        listView.setAdapter(toDoList);
       /* addNewTask.bringToFront();
        edit.bringToFront();
        delete.bringToFront();
*/

        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  System.out.println("Hi");
             }
        });
       /* addNewTask.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                AlertDialog.Builder newTask = new AlertDialog.Builder(home.this, 2);
                newTask.setTitle("New Task");
                final EditText taskTitle = new EditText(home.this);
                newTask.setView(taskTitle);


                newTask.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        toDoInfo.add(taskTitle.getText().toString());
                        toDoList.notifyDataSetChanged();
                        //TaskDbHelper database = new TaskDbHelper(getApplicationContext(), "taskManager.db", null, 1);


                    }
                });
                newTask.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                newTask.show();


            }
        });

*/



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
