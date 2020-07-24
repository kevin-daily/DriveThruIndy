package com.example.imagepick_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;
    Button mChooseBtn;

    private static final int IMAG_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //VIEWS
        mImageView = findViewById(R.id.image_view);
        mChooseBtn = findViewById(R.id.choose_image_btn);

        //handle button click
        mChooseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(view v) {

                //check runtime permission
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                        //permission not granted, request it

                        string[] permission = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        //show popup for runtime permission
                        requestPermissions(permissions, PERMISSION_CODE)
                    } else {
                        //permission already granted
                        pickImageFromGallery();
                    }
                } else {
                    //System os is less than marshmallow
                    pickImageFromGallery();
                }
            }


        });
    }

    private void pickImageFromGallery() {
        //intent to pick image
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, IMAG_PICK_CODE);

    }

    //handle result of runtime permission

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int) {

        //handle result of picked image

        @Override

        protected void onActivityResult ( int requestCode, int resultCode, Intent data){
            if (resultCode == RESULT_OK && requestCode == IMAG_PICK_CODE) {
                //set image to image view
                mImageView.setImageURI(data.getData());
            }
        }
    }
        switch (requestCode) {
        case PERMISSION_CODE: {
            if (grantResults.length >0 && grantResults[0] ==
                    PackageManager.PERMISSION_GRANTED) {
                //pickImageFromGallery();
            }
            else {
                //permission was denied
                Toast.makeText(context this, text "permission denied....!", Toast.LENGTH_SHORT).show();
            }
        }
    }

}