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
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.kamonwan.ratchaphruekhospital.R;

import java.io.IOException;

import static android.provider.MediaStore.Images.Media.getBitmap;

public class EditProfileActivity extends AppCompatActivity {
    private static final int REQUEST_GALLERY = 1;
    ImageView selectImage,editProfile;
    Bitmap bitmap;

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
        String[] itemYear = new String[]{"2555", "2556", "2557", "2558", "2559", "2560", "2561",};

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
