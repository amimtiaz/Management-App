package com.imtiaz_acedamy.practiceproject_4.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.imtiaz_acedamy.practiceproject_4.R;

public class ProfileActivity extends AppCompatActivity {

    ConstraintLayout backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        
        backBtn = (ConstraintLayout) findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ProfileActivity.this, "Main Activity", Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(ProfileActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}