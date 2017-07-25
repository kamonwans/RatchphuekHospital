package com.example.kamonwan.ratchaphruekhospital.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
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

import java.io.IOException;

import static android.provider.MediaStore.Images.Media.getBitmap;

public class EditProfileActivity extends AppCompatActivity {
    private static final int REQUEST_GALLERY = 1;
    ImageView selectImage,editProfile,btnBack;
    Bitmap bitmap;
    CheckBox checkOne,checkTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        initInstance();
        FragmentSpinner();

    }

    private void FragmentSpinner() {

        Spinner dropdownEdit = (Spinner) findViewById(R.id.btn_dropdownEdit);
        Spinner dropdownEditDate = (Spinner) findViewById(R.id.btn_dropdownEditDate);
        Spinner dropdownEditMount = (Spinner) findViewById(R.id.btn_dropdownEditMount);
        Spinner dropdownEditYear = (Spinner) findViewById(R.id.btn_dropdownEditYear);

        String[] item = new String[]{"นาย", "นาง", "นางสาว"};
        String[] itemDate = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] itemMount = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",};
        String[] itemYear = new String[]{"2560", "2559", "2558", "2557", "2556", "2565", "2554","2553", "2552", "2551", "2550", "2549", "2548", "2547", "2546", "2545"
                , "2544", "2543", "2542", "2541", "2540", "2539", "2538", "2537", "2536", "2535", "2534", "2533", "2532", "2531", "2530",
                "2529", "2528", "2527", "2526", "2525", "2524", "2523", "2522", "2521", "2520", "2519", "2518", "2517", "2516", "2515", "2514", "2513", "2512", "2511", "2510",
                "2509", "2508", "2507", "2506", "2505", "2504", "2503", "2502", "2501", "2500", "2499", "2498", "2497", "2596", "2495", "2494", "2493", "2492", "2491", "2490",
                "2489", "2488", "24887", "2486", "2485", "2484", "2483", "2482", "2481", "2480","2479","2478","2476","2475","2474","2473","2472","2471","2470"};

        ArrayAdapter<String> adapterEdit = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, item);
        ArrayAdapter<String> adapterEditDate = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemDate);
        ArrayAdapter<String> adapterEditMount = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemMount);
        ArrayAdapter<String> adapterEditYear = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, itemYear);
        dropdownEdit.setAdapter(adapterEdit);
        dropdownEditDate.setAdapter(adapterEditDate);
        dropdownEditMount.setAdapter(adapterEditMount);
        dropdownEditYear.setAdapter(adapterEditYear);
    }

    private void initInstance() {
        CheckBox();
        selectImage = (ImageView) findViewById(R.id.selectImage);
        selectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(Intent.createChooser(intent, "Select photo from"), REQUEST_GALLERY);
            }
        });

        editProfile = (ImageView) findViewById(R.id.editProfile);
        btnBack = (ImageView) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfileActivity.this, PersonalInfromationActivity.class);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        final Uri uri = data.getData();
            editProfile.setImageURI(uri);
        if (requestCode == RESULT_OK) {
            try {
                bitmap = getBitmap(this.getContentResolver(), uri);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (data != null) {
                editProfile.setImageBitmap(bitmap);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}
