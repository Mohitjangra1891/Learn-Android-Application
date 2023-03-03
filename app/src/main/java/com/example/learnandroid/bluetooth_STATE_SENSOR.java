package com.example.learnandroid;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class bluetooth_STATE_SENSOR extends AppCompatActivity {
//    BluetoothAdapter bt;
//    final static int i = 1;
//    private static final int REQUEST_ENABLE_BT = 1;
//
//    TextView textview;
//    SwitchCompat sw;

    int PERMISSION_REQUEST_CODE = 100;

    private static final int REQUEST_ENABLE_BT = 1;
    private BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_state_sensor);

        String Javacode = "import ...\n" +
                "\n" +
                "public class Bluethoothmngr extends AppCompatActivity {\n" +
                "\n" +
                "int PERMISSION_REQUEST_CODE = 100;\n" +
                "\n" +
                "    private static final int REQUEST_ENABLE_BT = 1;\n" +
                "    private BluetoothAdapter bluetoothAdapter;\n"+
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_bluethoothmngr);\n" +
                "\n" +
               " Button buttonOn = findViewById(R.id.button);\n" +
                "        Button buttonOff = findViewById(R.id.button2);\n" +
                "\n" +
                "\n" +
                "        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();\n" +
                "        if (bluetoothAdapter == null) {\n" +
                "\n" +
                "            // Device not support BlueTooth\n" +
                "            Toast.makeText(this, \"Device not support BlueTooth\", Toast.LENGTH_SHORT).show();\n" +
                "            buttonOff.setEnabled(false);\n" +
                "            buttonOn.setEnabled(false);\n" +
                "\n" +
                "        } else {\n" +
                "\n" +
                "            Toast.makeText(this, \"Device support BlueTooth\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        buttonOn.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "\n" +
                "                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();\n" +
                "                if (!bluetoothAdapter.isEnabled()) {\n" +
                "                    Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);\n" +
                "                    if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.BLUETOOTH)\n" +
                "                            != PackageManager.PERMISSION_GRANTED) {\n" +
                "                        // Permission is not granted\n" +
                "                        // Request the permission\n" +
                "                        ActivityCompat.requestPermissions(bluetooth_STATE_SENSOR.this,\n" +
                "                                new String[]{Manifest.permission.BLUETOOTH},\n" +
                "                                PERMISSION_REQUEST_CODE);\n" +
                "                    } else {\n" +
                "                        // Permission is already granted\n" +
                "                        // Perform the action that requires this permission\n" +
                "                        startActivity(intent);\n" +
                "//                        bluetoothAdapter.enable();\n" +
                "                        Toast.makeText(getApplicationContext(), \"Bluetooth enabled\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                    }\n" +
                "//                    // Bluetooth not enabled yet , Request to enable\n" +
                "//                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);\n" +
                "//                    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);\n" +
                "\n" +
                "\n" +
                "                } else {\n" +
                "\n" +
                "                    // Bluetooth already enabled\n" +
                "                    Toast.makeText(getApplicationContext(), \"BlueTooth already enabled\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "        buttonOff.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "\n" +
                "                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();\n" +
                "                if (bluetoothAdapter.isEnabled()) {\n" +
                "\n" +
                "                    if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.BLUETOOTH)\n" +
                "                            != PackageManager.PERMISSION_GRANTED) {\n" +
                "                        // Permission is not granted\n" +
                "                        // Request the permission\n" +
                "                        ActivityCompat.requestPermissions(bluetooth_STATE_SENSOR.this,\n" +
                "                                new String[]{Manifest.permission.BLUETOOTH},\n" +
                "                                PERMISSION_REQUEST_CODE);\n" +
                "                    } else {\n" +
                "                        // Permission is already granted\n" +
                "                        // Perform the action that requires this permission\n" +
                "                        bluetoothAdapter.disable();\n" +
                "                        Toast.makeText(getApplicationContext(), \"Bluetooth disabled\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
                "        super.onRequestPermissionsResult(requestCode, permissions, grantResults);\n" +
                "        if (requestCode == PERMISSION_REQUEST_CODE) {\n" +
                "            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
                "                // The user granted the permission, perform the action that requires the BLUETOOTH permission\n" +
                "            } else {\n" +
                "                // The user denied the permission, handle the situation gracefully\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onActivityResult(int requestCode, int resultCode, Intent data) {\n" +
                "        super.onActivityResult(requestCode, resultCode, data);\n" +
                "\n" +
                "        if (requestCode == REQUEST_ENABLE_BT) {\n" +
                "            if (resultCode == Activity.RESULT_OK) {\n" +
                "\n" +
                "                Toast.makeText(getApplicationContext(), \"Bluetooth enabled\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "            } else {\n" +
                "                Toast.makeText(getApplicationContext(), \"Bluetooth not enabled\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "\n"+
                "}";
        String xmlcode = "?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:id=\"@+id/container\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   tools:context=\".Bluethoothmngr\">\n" +
                "\n" +
                "   <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginTop=\"40dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:layout_marginBottom=\"32dp\"\n" +
                "        android:text=\"Bluetooth On\"\n" +
                "        android:textSize=\"18sp\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@id/button\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginTop=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:text=\"Bluetooth Off\"\n" +
                "        android:textSize=\"18sp\" />\n"+
                "</RelativeLayout>\n";
        String other = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    package=\".androidexample\">\n" +
                "\t\n" +
                "\t<uses-permission android:name=\"android.permission.BLUETOOTH\" />" +
                "\t<uses-permission android:name=\"android.permission.BLUETOOTH_ADMIN\" />" +
                "\t\n" +
                "\t<activity\n" +
                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
                "\t\t\t\t\t\t<intent-filter>\n" +
                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "\t\t\t\t\t\t</intent-filter>\n" +
                "     </activity>\n" +
                "</manifest>";
        String other_heading = "Manifest";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Bluetooth State");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode", xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });
        Button buttonOn = findViewById(R.id.button);
        Button buttonOff = findViewById(R.id.button2);


        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {

            // Device not support BlueTooth
            Toast.makeText(this, "Device not support BlueTooth", Toast.LENGTH_SHORT).show();
            buttonOff.setEnabled(false);
            buttonOn.setEnabled(false);

        } else {

            Toast.makeText(this, "Device support BlueTooth", Toast.LENGTH_SHORT).show();

        }


        buttonOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if (!bluetoothAdapter.isEnabled()) {
                    Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.BLUETOOTH)
                            != PackageManager.PERMISSION_GRANTED) {
                        // Permission is not granted
                        // Request the permission
                        ActivityCompat.requestPermissions(bluetooth_STATE_SENSOR.this,
                                new String[]{Manifest.permission.BLUETOOTH},
                                PERMISSION_REQUEST_CODE);
                    } else {
                        // Permission is already granted
                        // Perform the action that requires this permission
                        startActivity(intent);
//                        bluetoothAdapter.enable();
                        Toast.makeText(getApplicationContext(), "Bluetooth enabled", Toast.LENGTH_SHORT).show();

                    }
//                    // Bluetooth not enabled yet , Request to enable
//                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//                    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);


                } else {

                    // Bluetooth already enabled
                    Toast.makeText(getApplicationContext(), "BlueTooth already enabled", Toast.LENGTH_SHORT).show();


                }


            }
        });


        buttonOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if (bluetoothAdapter.isEnabled()) {

                    if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.BLUETOOTH)
                            != PackageManager.PERMISSION_GRANTED) {
                        // Permission is not granted
                        // Request the permission
                        ActivityCompat.requestPermissions(bluetooth_STATE_SENSOR.this,
                                new String[]{Manifest.permission.BLUETOOTH},
                                PERMISSION_REQUEST_CODE);
                    } else {
                        // Permission is already granted
                        // Perform the action that requires this permission
                        bluetoothAdapter.disable();
                        Toast.makeText(getApplicationContext(), "Bluetooth disabled", Toast.LENGTH_SHORT).show();

                    }

                }


            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // The user granted the permission, perform the action that requires the BLUETOOTH permission
            } else {
                // The user denied the permission, handle the situation gracefully
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_ENABLE_BT) {
            if (resultCode == Activity.RESULT_OK) {

                Toast.makeText(getApplicationContext(), "Bluetooth enabled", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(getApplicationContext(), "Bluetooth not enabled", Toast.LENGTH_SHORT).show();

            }

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