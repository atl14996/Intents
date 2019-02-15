package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {
    TextView firstName;
    TextView lastName;
    TextView address;
    TextView city;
    TextView state;
    TextView postalCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
    }

    Intent intentFromMain = getIntent();

    String firstNamefromMain = intentFromMain.getStringExtra("name");
    String lastNamefromMain = intentFromMain.getStringExtra("last_name");
    String addressfromMain = intentFromMain.getStringExtra("address");
    String cityfromMain = intentFromMain.getStringExtra("city");
    String statefromMain = intentFromMain.getStringExtra("state");
    String postalCodefromMAin = intentFromMain.getStringExtra("postal_code");


    public void Views(View b) {
        firstName = findViewById(R.id.tvFirstNameDisplay);
        lastName = findViewById(R.id.tvLastNameDisplay);
        address = findViewById(R.id.tvAddressDisplay);
        city = findViewById(R.id.tvCityDisplay);
        state = findViewById(R.id.tvSTateDisplay);
        postalCode = findViewById(R.id.tvPostalCodeDisplay);
    }
}