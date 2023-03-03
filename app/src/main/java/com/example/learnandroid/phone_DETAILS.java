package com.example.learnandroid;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class phone_DETAILS extends AppCompatActivity {
    private TextView textViewSetInformation;
    private Button buttonGetInformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_details);

        String Javacode="import ...\n" +
                "\n" +
                "public class PhoneDetails extends AppCompatActivity {\n" +
                "\n" +
                "    private TextView textViewSetInformation;\n" +
                "    private Button buttonGetInformation;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_phone_details);\n" +
                "\n" +
                "        initViews();\n" +
                "        initListeners();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    private void initViews() {\n" +
                "\n" +
                "        textViewSetInformation = (TextView) findViewById(R.id.textViewSetInformation);\n" +
                "        buttonGetInformation = (Button) findViewById(R.id.buttonGetInformation);\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    private void initListeners() {\n" +
                "\n" +
                "        buttonGetInformation.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                \n" +
                "                String information = getHardwareAndSoftwareInfo();\n" +
                "                textViewSetInformation.setText(information);\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    private String getHardwareAndSoftwareInfo() {\n" +
                "\n" +
                "        return getString(R.string.serial) + \" \" +Build.SERIAL + \"\\n\" +\n" +
                "                getString(R.string.model) + \" \" + Build.MODEL + \"\\n\" +\n" +
                "                getString(R.string.id) + \" \" + Build.ID + \"\\n\" +\n" +
                "                getString(R.string.manufacturer) + \" \" + Build.MANUFACTURER + \"\\n\" +\n" +
                "                getString(R.string.brand) + \" \" + Build.BRAND + \"\\n\" +\n" +
                "                getString(R.string.type) + \" \" + Build.TYPE + \"\\n\" +\n" +
                "                getString(R.string.user) + \" \" + Build.USER + \"\\n\" +\n" +
                "                getString(R.string.base) + \" \" + Build.VERSION_CODES.BASE + \"\\n\" +\n" +
                "                getString(R.string.incremental) + \" \" + Build.VERSION.INCREMENTAL + \"\\n\" +\n" +
                "                getString(R.string.sdk) + \" \" + Build.VERSION.SDK + \"\\n\" +\n" +
                "                getString(R.string.board) + \" \" + Build.BOARD + \"\\n\" +\n" +
                "                getString(R.string.host) + \" \" + Build.HOST + \"\\n\" +\n" +
                "                getString(R.string.fingerprint) + \" \" + Build.FINGERPRINT + \"\\n\" +\n" +
                "                getString(R.string.versioncode) + \" \" + Build.VERSION.RELEASE;\n" +
                "    }\n" +
                "\n" +
                "}\n";
        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".phone_DETAILS\">\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:orientation=\"vertical\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Hardware and software Information\"\n" +
                "            android:textSize=\"20sp\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:layout_marginTop=\"20dp\"\n" +
                "            android:textStyle=\"bold\" />\n" +
                "\n" +
                "        <Button\n" +
                "            android:layout_marginTop=\"10sp\"\n" +
                "            android:id=\"@+id/buttonGetInformation\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"get Information\"\n" +
                "            android:backgroundTint=\"@color/btn_color\"\n" +
                "            android:textColor=\"@android:color/white\" />\n" +
                "\n" +
                "        <ScrollView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"0dp\"\n" +
                "            android:layout_marginBottom=\"16dp\"\n" +
                "            android:layout_marginTop=\"16dp\"\n" +
                "            android:layout_weight=\"1\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:id=\"@+id/textViewSetInformation\"\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginLeft=\"30dp\"\n" +
                "                android:textStyle=\"bold\"\n" +
                "                android:textSize=\"16dp\"/>\n" +
                "        </ScrollView>\n" +
                "\n" +
                "    </LinearLayout>\n"+
                "\n" +
                "</RelativeLayout>";
        String other = "-- Add permission to manifests --\n" +"    <uses-permission android:name=\"android.permission.READ_PHONE_STATE\" />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Phone Details");
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





        initViews();
        initListeners();

    }

    private void initViews() {

        textViewSetInformation = (TextView) findViewById(R.id.textViewSetInformation);
        buttonGetInformation = (Button) findViewById(R.id.buttonGetInformation);

    }

    private void initListeners() {

        buttonGetInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String information = getHardwareAndSoftwareInfo();
                textViewSetInformation.setText(information);

            }
        });

    }

    private String getHardwareAndSoftwareInfo() {

        return "SERIAL:" + " " + Build.SERIAL + "\n" +
                "MODEL" + " " + Build.MODEL + "\n" +
                "ID:" + " " + Build.ID + "\n" +
                "MANUFACTURER:" + " " + Build.MANUFACTURER + "\n" +
                "BRAND:" + " " + Build.BRAND + "\n" +
                "TYPE:" + " " + Build.TYPE + "\n" +
                "USER:" + " " + Build.USER + "\n" +
                "BASE:" + " " + Build.VERSION_CODES.BASE + "\n" +
                "INCREMENTAL:" + " " + Build.VERSION.INCREMENTAL + "\n" +
                "SDK:"+ " " + Build.VERSION.SDK + "\n" +
                "BOARD:" + " " + Build.BOARD + "\n" +
                "HOST:"+ " " + Build.HOST + "\n" +
                "FINGERPRINT:" + " " + Build.FINGERPRINT + "\n" +
                "VERSION CODE:" + " " + Build.VERSION.RELEASE;
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