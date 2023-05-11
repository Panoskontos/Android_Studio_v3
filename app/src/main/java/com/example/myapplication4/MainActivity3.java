package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText username, email;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        username = findViewById(R.id.editTextTextPersonName3);
        email = findViewById(R.id.editTextTextPersonName4);

//        create or open database
        sqLiteDatabase = openOrCreateDatabase("DB1.db", MODE_PRIVATE, null);
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + "USER" + "(" +
                "username" + " TEXT," +
                "email" + " TEXT PRIMARY KEY)");
        sqLiteDatabase.execSQL("INSERT OR IGNORE INTO USER VALUES('panos','ppp@gmail.com')");

    }

    public void insert(View view){

    }
    public void select(View view){

    }
}