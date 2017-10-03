package com.example.dk.myapplication1;

/**
 * Created by deepu on 10/2/2017.
 */
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static android.R.id.list;

public class NewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.new_activity);
    }
    ArrayList<String> arrayList = (ArrayList<String>) getIntent().getSerializableExtra("mylist");


    /*ticketOne.getCvalue();
    ticketOne.getIvalue();
    ticketOne.getComment();
    ArrayList<MainActivity> firstList = new ArrayList<>();
    firstList.add(newContact);*/





}
