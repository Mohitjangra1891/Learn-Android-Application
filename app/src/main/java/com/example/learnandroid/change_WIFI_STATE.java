package com.example.learnandroid;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class change_WIFI_STATE extends AppCompatActivity {
    Button on, off;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_wifi_state);

        String Javacode="\n" +
                "import ...\n" +
                "\n" +
                "public class Wifimngr extends AppCompatActivity {\n" +
                "\n" +
                "    Button on, off;\n" +
                "    TextView tv;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_wifimngr);\n" +
                "\n" +
                "        on=findViewById(R.id.btnon);\n" +
                "        off=findViewById(R.id.btnoff);\n" +
                "        tv=findViewById(R.id.tv);\n" +
                "\n" +
                "        on.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);\n" +
                "                wifi.setWifiEnabled(true);\n" +
                "                Toast.makeText(getApplicationContext(),\"WiFi is ON\",Toast.LENGTH_LONG).show();\n" +
                "                tv.setText(\"Please check, WiFi is ON\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        off.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);\n" +
                "                wifi.setWifiEnabled(false);\n" +
                "                Toast.makeText(getApplicationContext(),\"WiFi is OFF\",Toast.LENGTH_LONG).show();\n" +
                "                tv.setText(\"Please check, WiFi is OFF\");\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "}";
        String xmlcode="?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:id=\"@+id/container\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   tools:context=\".Wifimngr\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/tv\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"WiFi Status\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        android:textSize=\"20dp\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"50dp\"/>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btnon\"\n" +
                "        android:layout_below=\"@+id/tv\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textAllCaps=\"false\"\n" +
                "        android:textSize=\"18dp\"\n" +
                "        android:layout_marginTop=\"80dp\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:text=\"WiFi on\"/>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btnoff\"\n" +
                "        android:layout_below=\"@+id/tv\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textAllCaps=\"false\"\n" +
                "        android:textSize=\"18dp\"\n" +
                "        android:layout_marginTop=\"150dp\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:text=\"WiFi off\"/>\n" +
                "\n" +
                "</RelativeLayout>\n";
        String other = "-- Add permission to manifests --\n" +
                "    \n" +
                "<uses-permission android:name=\"android.permission.CHANGE_WIFI_STATE\" />\n" +
                "<uses-permission android:name=\"android.permission.ACCESS_WIFI_STATE\"/>\n" +
                "\n<activity\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Change WIFI State");
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





        on=findViewById(R.id.btnon);
        off=findViewById(R.id.btnoff);
        tv=findViewById(R.id.tv);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(),"WiFi is ON",Toast.LENGTH_LONG).show();
                tv.setText("Please check, WiFi is ON");
            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(),"WiFi is OFF",Toast.LENGTH_LONG).show();
                tv.setText("Please check, WiFi is OFF");
            }
        });

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