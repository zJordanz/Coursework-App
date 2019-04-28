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
import android.widget.Toast;

import java.util.ArrayList;

public class mobile_reminder extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {


//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mobile_reminder);
//        Button button1 = (Button) findViewById(R.id.Rem1);
//        Button button2 = (Button) findViewById(R.id.Rem2);
//        Button button3 = (Button) findViewById(R.id.Rem3);
//        Button button4 = (Button) findViewById(R.id.Rem4);
//        Button button5 = (Button) findViewById(R.id.Rem5);
//        Button button6 = (Button) findViewById(R.id.Rem6);
//        Button button7 = (Button) findViewById(R.id.Rem7);
//
//
//
//        button1.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                Intent myintent2 = new Intent(mobile_reminder.this, pop_up.class);
//                startActivity(myintent2);
//
//            }
//        });


        private EditText itemET;
        private Button btn;
        private ListView itemsList;

        private ArrayList<String> items;
        private ArrayAdapter<String> adapter;


        @Override
        protected void onCreate(Bundle savedInstaneState) {
            super.onCreate(savedInstaneState);
            setContentView(R.layout.activity_mobile_reminder);

            itemET = findViewById(R.id.item_edit_text);
            btn= findViewById(R.id.add_btn);
            itemsList =findViewById(R.id.items_list);

            items = Filehelper2.readData(this);

            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items);
            itemsList.setAdapter(adapter);


            btn.setOnClickListener(this);
            itemsList.setOnItemClickListener(this);
        }
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.add_btn:
                    String itemEntered = itemET.getText().toString();
                    adapter.add(itemEntered);
                    itemET.setText("");
                    Filehelper2.writeData(items, this);
                    Toast.makeText(this, "Item added", Toast.LENGTH_SHORT).show();

                    break;
            }
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            items.remove(position);
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Deleted",Toast.LENGTH_SHORT).show();
        }
    }
//        button2.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                Intent myintent2 = new Intent(Computer_science.this, Web.class);
//                startActivity(myintent2);
//
//            }
//        });
//        button3.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                Intent myintent2 = new Intent(Computer_science.this, Object_Orientated_Programming.class);
//                startActivity(myintent2);
//            }
//        });
//
//        button4.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v) {
//                Intent myintent2 = new Intent(Computer_science.this, Reminders.class);
//                startActivity(myintent2);
//            }
//        });
