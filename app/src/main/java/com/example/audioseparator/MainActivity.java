package com.example.audioseparator;

import android.Manifest;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.single.PermissionListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void runtimePermission(){
        Dexter.withContext(this).withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener(){
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse){

                    }
                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse){

                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(com.karumi.dexter.listener.PermissionRequest permissionRequest, PermissionToken permissionToken) {

                    }
                }).check();
    }

}