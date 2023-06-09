package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        String usernameStr = username.getText().toString();
        String emailStr = email.getText().toString();
        sqLiteDatabase.execSQL("INSERT OR IGNORE INTO USER VALUES(?,?)",new String[] {usernameStr,emailStr});
        Toast.makeText(this, "User Added", Toast.LENGTH_SHORT).show();
    }
    public void select(View view){
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM USER",null);
        StringBuilder stringBuilder = new StringBuilder();
        while(cursor.moveToNext()){
            stringBuilder.append("Fullname: ").append(cursor.getString(0)).append("\n");
            stringBuilder.append("Email: ").append(cursor.getString(1)).append("\n\n");
        }
        showMessage("Users", stringBuilder.toString());
    }

    private void showMessage(String title, String msg){
        new AlertDialog.Builder(this)
                .setCancelable(true)
                .setTitle(title)
                .setMessage(msg)
                .show();
    }
}