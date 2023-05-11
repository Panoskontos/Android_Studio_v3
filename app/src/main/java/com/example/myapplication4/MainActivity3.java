package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        username = findViewById(R.id.editTextTextPersonName3);
        email = findViewById(R.id.editTextTextPersonName4);

    }

    public void insert(View view){

    }
    public void select(View view){

    }
}