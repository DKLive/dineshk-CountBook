package com.example.dk.myapplication1;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.view.View.OnClickListener;
import android.widget.EditText;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainActivity extends Activity {
    private String name;
     private Date date;
    private int c_value;
    private int i_value;
    private String comment;
    ListView listview;
   // private ArrayAdapter<String> adapter;
    //private ArrayList<String> arrayList;



    public MainActivity(){
        this.name = " ";
         this.date = date;
        this.c_value = 0;
        this.i_value = 0;
        this.comment = " ";
    }

    public MainActivity(String name, Date date, int c_value, int i_value, String comment){
        this.name = name;
         this.date = date;
        this.c_value = c_value;
        this.i_value = i_value;
        this.comment = comment;
    }

    public void setName ( String name ) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public void setCvalue ( int c_value ) {
        this.c_value = c_value;
    }
    public int getCvalue() {
        return c_value;
    }

    public void setIvalue ( int i_value ) {
        this.i_value = i_value;
    }
    public int getIvalue() {
        return i_value;
    }

    public void setComment ( String comment ) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listView);
       final EditText text1 = (EditText) findViewById(R.id.editText);
        //final EditText text2 = (EditText) findViewById(R.id.editText2);
        final EditText text3 = (EditText) findViewById(R.id.editText3);
       final EditText text4 = (EditText) findViewById(R.id.editText4);
        final EditText text5 = (EditText) findViewById(R.id.editText5);
        final ArrayList<String> arrayList = new ArrayList<String>();

        //final List<String> ListElementsArrayList = new ArrayList<String>(Arrays.asList(ListElements));


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);
        listview.setAdapter(adapter);
        Button button_p = (Button) findViewById(R.id.button);
        button_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = text1.getText().toString();
               // date = text2.getText().toDate();
                c_value = Integer.parseInt(text3.getText().toString());
                i_value = Integer.parseInt(text4.getText().toString());
                comment = text5.getText().toString();
                arrayList.add(name);
                adapter.notifyDataSetChanged();
               Intent myIntent = new Intent(MainActivity.this, NewActivity.class);
                myIntent.putExtra("mylist", arrayList);
                startActivity(myIntent);

                // Do something in response to button click

            }
        });
        Button button_q = (Button) findViewById(R.id.button2);
        button_q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                text1.setText("");
                //text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
                name = " ";
                // this.date = date;
                c_value = 0;
                i_value = 0;
                comment = " ";
                // Do something in response to button click

            }
        });
    }


}
