package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {


    EditText etFirstName;
    EditText etLastName;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etPostalCode;

    Button NextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        etFirstName = findViewById(R.id.etFirstNameInput);

        etLastName = findViewById(R.id.etLastNameInput);
        etAddress = findViewById(R.id.etAddressInput);
        etCity = findViewById(R.id.etCityNameInput);
        etState = findViewById(R.id.etStateInput);
        etPostalCode = findViewById(R.id.etPostalCodeInput);




    }

public void onClickButtonHandler(View a){

        String firstName = etFirstName.getText() != null ? etFirstName.getText().toString():"";
        String lastName =  etLastName.getText() != null ? etLastName.getText().toString():"";
        String address = etAddress.getText() != null ? etAddress.getText().toString(): "";
        String city = etCity.getText() != null ? etCity.getText().toString():"";
        String state = etState.getText() != null ? etState.getText().toString():"";
        String postalCode = etPostalCode.getText() != null? etPostalCode.getText().toString():"";
    Intent secondActivityIntent = new Intent(this, Secondactivity.class);
    startActivity(secondActivityIntent);
    secondActivityIntent.putExtra("first_name", firstName);
    secondActivityIntent.putExtra("last_name", lastName);
    secondActivityIntent.putExtra("address", address);
    secondActivityIntent.putExtra("city", city);
    secondActivityIntent.putExtra("state", state);
    secondActivityIntent.putExtra("postal_code", postalCode);

}


}
