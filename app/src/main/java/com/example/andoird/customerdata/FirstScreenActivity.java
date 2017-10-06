package com.example.andoird.customerdata;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;

public class FirstScreenActivity extends Activity {
    // Initializing variables
    EditText inputName;
    EditText inputEmail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);


        inputName = (EditText) findViewById(R.id.name);
        inputEmail = (EditText) findViewById(R.id.postCode);
        Button btnNextScreen = (Button) findViewById(R.id.btnNextScreen);
        // Button gMaps = (Button) findViewById(R.id.gMaps);


        //Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), SecondScreenActivity.class);

                //Sending data to another Activity
                nextScreen.putExtra("name", inputName.getText().toString());
                nextScreen.putExtra("email", inputEmail.getText().toString());

                Log.e("n", "$(inputName.text) .$(inputPostcode.text)");

                // starting new activity
                startActivity(nextScreen);
            }
        });

    }

            public void gMaps(View view) {
                Uri geoLocation = Uri.parse("https://www.google.com.au/maps/place/Eiffel+Tower/@48.8583701,2.2922926,17z/data=!3m1!4b1!4m5!3m4!1s0x47e66e2964e34e2d:0x8ddca9ee380ef7e0!8m2!3d48.8583701!4d2.2944813");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);


                }
            }
        }



