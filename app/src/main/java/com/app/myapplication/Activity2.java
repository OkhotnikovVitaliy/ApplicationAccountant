package com.app.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    EditText activity2_field_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        activity2_field_1 = (EditText) findViewById(R.id.activity2_field_1);

        Intent intent = getIntent();
        if (intent.hasExtra("message1")) {
            String message = intent.getStringExtra("message1");
            int message_in_int = Integer.parseInt(message);
            double result = message_in_int - (message_in_int * 0.1) - 650;
            String result_in_String = Double.toString(result);
            activity2_field_1.setText(result_in_String);
        }

    }
}