package com.example.neurophproject;

import android.app.ActionBar;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BJActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_job);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setBackgroundTintList(ColorStateList.valueOf(Color
                .parseColor("#FFDEAD")));
        EditText input = findViewById(R.id.input);
        LinearLayout forMessage = findViewById(R.id.for_message);

        fab.setOnClickListener(view->{
            String text = input.getText().toString();
            if (!text.isEmpty()) {
                TextView tv = new TextView(this.getApplicationContext());
                tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                tv.setText(text);
                tv.setBackgroundResource(R.drawable.back_ground_message);
                forMessage.addView(tv);
                input.setText(null);
            }
        });



    }
}
