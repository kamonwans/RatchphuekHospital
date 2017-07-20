package com.example.kamonwan.ratchaphruekhospital.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.kamonwan.ratchaphruekhospital.R;

public class RegisterActivity extends AppCompatActivity {

    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_register = (Button) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        Spinner dropdown = (Spinner) findViewById(R.id.btn_dropdown);
        Spinner dropdownDate = (Spinner) findViewById(R.id.btn_dropdownDate);
        Spinner dropdownMount = (Spinner) findViewById(R.id.btn_dropdownMount);
        Spinner dropdownYear = (Spinner) findViewById(R.id.btn_dropdownYear);

        String[] item = new String[]{"นาย", "นาง", "นางสาว"};
        String[] itemDate = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] itemMount = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",};
        String[] itemYear = new String[]{"2555", "2556", "2557", "2558", "2559", "2560", "2561",};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, item);
        ArrayAdapter<String> adapterDate = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemDate);
        ArrayAdapter<String> adapterMount = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemMount);
        ArrayAdapter<String> adapterYear = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemYear);
        dropdown.setAdapter(adapter);
        dropdownDate.setAdapter(adapterDate);
        dropdownMount.setAdapter(adapterMount);
        dropdownYear.setAdapter(adapterYear);
    }
}
