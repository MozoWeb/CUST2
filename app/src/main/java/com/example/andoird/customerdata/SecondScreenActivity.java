package com.example.andoird.customerdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

import static com.example.andoird.customerdata.R.id.btnClose;
import static com.example.andoird.customerdata.R.id.postCode;

public class SecondScreenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView txtName = (TextView) findViewById(R.id.txtName);
        //TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
        TextView txtPostCode = (TextView) findViewById(R.id.txtPostCode);
        TextView txtCode = (TextView) findViewById(R.id.postCode);
        //TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
        //Button btnClose = (Button) findViewById(R.id.btnClose);

        Intent i = getIntent();
        // Receiving the Data
        String name = i.getStringExtra("name");
        String post = i.getStringExtra("email");
        Log.e("Second Screen", name + "." + post);

        // Displaying Received data
        txtName.setText(name);
        txtPostCode.setText(post);

       // txtCode.setText(Post);

        // checking post code location
        int IntPostCode = Integer.parseInt(post);
        if (IntPostCode >= 3000 && IntPostCode <= 3999) {

            txtPostCode.setText(post + '\n' + '\n' + name + " lives in Victoria");
        } else {
            txtPostCode.setText(post + '\n' + '\n' + name + " does not live in Victoria");
        }


        // Binding Click event to Button
        //btnClose.setOnClickListener(new View.OnClickListener() {
        //Button close = (Button) findViewById(btnClose);
       // close.setOnClickListener(new View.OnClickListener()) {

        //   public void onClick(View arg0) {
        //Closing SecondScreen Activity
        // }
       // finish();
    }

    public void onBackButtonClick(View view)
    {
        finish();
    }


}

