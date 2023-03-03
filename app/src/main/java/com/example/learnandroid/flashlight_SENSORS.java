package com.example.learnandroid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class flashlight_SENSORS extends AppCompatActivity {
    Button btnFlashLight;
    private static final int CAMERA_REQUEST = 123;
    boolean hasCameraFlash = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashlight_sensors);

        String Javacode="import ...\n" +
                "\n" +
                "public class Flashl extends AppCompatActivity {\n" +
                "\n" +
                "    Button btnFlashLight;\n" +
                "    private static final int CAMERA_REQUEST = 123;\n" +
                "    boolean hasCameraFlash = false;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_flashl);\n" +
                "\n" +
                "        ActivityCompat.requestPermissions(Flashl.this,\n" +
                "                new String[]{Manifest.permission.CAMERA}, CAMERA_REQUEST);\n" +
                "\n" +
                "        hasCameraFlash = getPackageManager().\n" +
                "                hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);\n" +
                "\n" +
                "        btnFlashLight = findViewById(R.id.onoff);\n" +
                "\n" +
                "\n" +
                "        btnFlashLight.setOnClickListener(new View.OnClickListener() {\n" +
                "            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                if (hasCameraFlash) {\n" +
                "                    if (btnFlashLight.getText().toString().contains(\"ON\")) {\n" +
                "                        btnFlashLight.setText(\"FLASHLIGHT OFF\");\n" +
                "\n" +
                "                        flashLightOn();\n" +

                "                    } else {\n" +
                "\n" +
                "                        btnFlashLight.setText(\"FLASHLIGHT ON\");\n" +
                "                        flashLightOff();\n" +

                "                    }\n" +
                "                } else {\n" +
                "                    android.widget.Toast.makeText(Flashl.this, \"No flash available on your device\",\n" +
                "                            android.widget.Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)\n" +
                "    private void flashLightOn() {\n" +
                "        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);\n" +
                "\n" +
                "        try {\n" +
                "            String cameraId = cameraManager.getCameraIdList()[0];\n" +
                "            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
                "                cameraManager.setTorchMode(cameraId, true);\n" +
                "            }\n" +
                "        } catch (CameraAccessException e) {\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)\n" +
                "    private void flashLightOff() {\n" +
                "        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);\n" +
                "        try {\n" +
                "            String cameraId = cameraManager.getCameraIdList()[0];\n" +
                "            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {\n" +
                "                cameraManager.setTorchMode(cameraId, false);\n" +
                "            }\n" +
                "        } catch (CameraAccessException e) {\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
                "        switch (requestCode) {\n" +
                "            case CAMERA_REQUEST:\n" +
                "                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
                "                    hasCameraFlash = getPackageManager().\n" +
                "                            hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);\n" +
                "                } else {\n" +
                "                    btnFlashLight.setEnabled(false);\n" +
                "\n" +
                "                    android.widget.Toast.makeText(Flashl.this, \"Permission Denied for the Camera\", Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "                break;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}\n";
        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<android.support.constraint.ConstraintLayout \n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/container\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".Flashl\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/onoff\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"192dp\"\n" +
                "        android:layout_marginBottom=\"435dp\"\n" +
                "        android:text=\"Flashlight ON\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/nav_view\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "</android.support.constraint.ConstraintLayout>";
        String other = "// add following permission in AndroidManifest.xml\n" +
                "  <uses-feature android:name=\"android.hardware.camera.flash\" />\n" +
                " <uses-permission android:name=\"android.permission.CAMERA\" />\n" +
                "<activity\n" +
                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
                "\t\t\t\t\t\t<intent-filter>\n" +
                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "\t\t\t\t\t\t</intent-filter>\n" +
                "        </activity>";
        String other_heading = "Manifest";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("FlashLight");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode",xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });



        ActivityCompat.requestPermissions(flashlight_SENSORS.this,
                new String[]{Manifest.permission.CAMERA}, CAMERA_REQUEST);

        hasCameraFlash = getPackageManager().
                hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        btnFlashLight = findViewById(R.id.onoff);


        btnFlashLight.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                if (hasCameraFlash) {
                    if (btnFlashLight.getText().toString().contains("ON")) {
                        btnFlashLight.setText("FLASHLIGHT OFF");
                        flashLightOn();
                    } else {
                        btnFlashLight.setText("FLASHLIGHT ON");

                        flashLightOff();

                    }
                } else {
                    android.widget.Toast.makeText(flashlight_SENSORS.this, "No flash available on your device",
                            android.widget.Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void flashLightOn() {
        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            String cameraId = cameraManager.getCameraIdList()[0];
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                cameraManager.setTorchMode(cameraId, true);
            }
        } catch (CameraAccessException e) {
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void flashLightOff() {
        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            String cameraId = cameraManager.getCameraIdList()[0];
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                cameraManager.setTorchMode(cameraId, false);
            }
        } catch (CameraAccessException e) {
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case CAMERA_REQUEST:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    hasCameraFlash = getPackageManager().
                            hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
                } else {
                    btnFlashLight.setEnabled(false);

                    Toast.makeText(flashlight_SENSORS.this, "Permission Denied for the Camera", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
        return true;
    }
}