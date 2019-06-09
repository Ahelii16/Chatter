package com.example.aheli.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        String[] friends = {"Archie", "Betty", "Jug", "JB", "Veronica", "Brinda",
                "Aheli", "Shawn", "Camila", "Sophie", "Arya", "Levi",
                "Erwin", "Varun", "Leonhard"};
        //drag autocomplete textview in main.xml

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friends);
        autoCompleteTextView.setAdapter(arrayAdapter);
        //set after how many char typed, you want autocomplete to kick in
        autoCompleteTextView.setThreshold(1);

        //note autocomplete hint in xml
    }
}
