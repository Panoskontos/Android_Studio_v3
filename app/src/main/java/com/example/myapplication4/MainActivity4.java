package com.example.myapplication4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements LocationListener {

    TextView location;
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        location = findViewById(R.id.textView);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

    }

    public void gps(View view){
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0,0,this);
    }

    public void maps(View view){
        startActivity(new Intent(this, MapsActivity.class));
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {

    }
}