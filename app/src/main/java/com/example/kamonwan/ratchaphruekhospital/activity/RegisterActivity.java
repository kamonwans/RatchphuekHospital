package com.example.kamonwan.ratchaphruekhospital.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.kamonwan.ratchaphruekhospital.R;

public class RegisterActivity extends AppCompatActivity {
ImageView btnBack;
    Button btn_register;
    CheckBox checkOne, checkTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        initInstance();

        Spinner dropdown = (Spinner) findViewById(R.id.btn_dropdown);
        Spinner dropdownDate = (Spinner) findViewById(R.id.btn_dropdownDate);
        Spinner dropdownMount = (Spinner) findViewById(R.id.btn_dropdownMount);
        Spinner dropdownYear = (Spinner) findViewById(R.id.btn_dropdownYear);

        String[] item = new String[]{"นาย", "นาง", "นางสาว"};
        String[] itemDate = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] itemMount = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",};
        String[] itemYear = new String[]{"2560", "2559", "2558", "2557", "2556", "2565", "2554", "2553", "2552", "2551", "2550", "2549", "2548", "2547", "2546", "2545"
                , "2544", "2543", "2542", "2541", "2540", "2539", "2538", "2537", "2536", "2535", "2534", "2533", "2532", "2531", "2530",
                "2529", "2528", "2527", "2526", "2525", "2524", "2523", "2522", "2521", "2520"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, item);
        ArrayAdapter<String> adapterDate = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemDate);
        ArrayAdapter<String> adapterMount = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemMount);
        ArrayAdapter<String> adapterYear = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemYear);
        dropdown.setAdapter(adapter);
        dropdownDate.setAdapter(adapterDate);
        dropdownMount.setAdapter(adapterMount);
        dropdownYear.setAdapter(adapterYear);
    }

    private void initInstance() {
        CheckBox();
        btn_register = (Button) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnBack = (ImageView) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    public void CheckBox() {
        checkOne = (CheckBox) findViewById(R.id.checkOne);
        checkTwo = (CheckBox) findViewById(R.id.checkTwo);
        checkOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    checkTwo.setChecked(false);
                }
            }
        });
        checkTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    checkOne.setChecked(false);
                }

            }
        });
    }
}
