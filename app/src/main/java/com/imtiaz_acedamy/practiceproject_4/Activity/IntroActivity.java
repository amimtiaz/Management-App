package com.imtiaz_acedamy.practiceproject_4.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.imtiaz_acedamy.practiceproject_4.R;

public class IntroActivity extends AppCompatActivity {
    
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(IntroActivity.this, MainActivity.class));

            }
        });
        
    }

}