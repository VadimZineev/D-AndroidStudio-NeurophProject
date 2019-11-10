package com.example.neurophproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bank_job_button).setOnClickListener(view->{
            Intent intent = new Intent(MainActivity.this, BJActivity.class);
            startActivity(intent);
        });
    }
}
