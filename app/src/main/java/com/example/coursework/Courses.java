package com.example.coursework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import static android.widget.Toast.LENGTH_SHORT;

public class Courses extends AppCompatActivity {


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_courses);

            final Button button = findViewById(R.id.Computer_Sci);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(Courses.this, Computer_science.class
                    ));
//            }
                }
            });
        }
    }
//    protected void onCreate (Bundle savedInstanceState){
//
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_courses);
//
//        Spinner spinner = findViewById(R.id.spinner1);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener(this);
//    }
//
//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//String Numbers = Integer.toString(R.array.numbers);
//        String text = parent.getItemAtPosition(position).toString();
//        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show();
//        {
//
//
//            if (Numbers.equalsIgnoreCase("Computer Science"));{
//                Intent intent = new Intent( Courses.this,Reminders.class);
//                startActivity(intent);
//            }
//        }
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }


