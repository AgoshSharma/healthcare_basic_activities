package com.example.agosh.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CallStartActivity(View view) {
        Intent i = new Intent(getApplicationContext(), StartActivity.class);
        i.putExtra("Value1", "Starting App");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
}