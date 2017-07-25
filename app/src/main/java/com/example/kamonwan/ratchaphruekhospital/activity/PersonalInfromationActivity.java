package com.example.kamonwan.ratchaphruekhospital.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.kamonwan.ratchaphruekhospital.R;

public class PersonalInfromationActivity extends AppCompatActivity {
Button btn_editProfile;
    ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_infromation);
        initInstance();

    }

    private void initInstance() {
        btn_editProfile = (Button) findViewById(R.id.btn_editProfile);
        btn_editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalInfromationActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });
        btnBack = (ImageView) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalInfromationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
