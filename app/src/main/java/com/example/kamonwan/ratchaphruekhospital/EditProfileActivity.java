package com.example.kamonwan.ratchaphruekhospital;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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
