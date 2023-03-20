package com.pam.myapplication;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int READ_WRITE_EXTERNAL_STORAGE = 1 ;
    private GridView gallery GridView;
    private ActivityResultLauncher<Intent>activityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        galleryGridView = findViewById(R.id.galleryGridView);

                activityResultLauncher = registerForActivityResult{
                        new ActivityResultContract.StartAcitvityForResult(),
                        result -> {
                            if(Build.VERSION.SDK_INT>=BUILD> Build.VERSION_CODES.R) {
                                if (Environment.isExternalStorageManager()) {
                                    //TODO: Permission Granted;
                                } else {
                                    Toast.makeText(context:this,
                                            text:
                                    "Allow permission to storage access", Toast.LENGTH_SHORT).
                                    show();
                                }
                            }
                            };
                        }
                )
    }
}