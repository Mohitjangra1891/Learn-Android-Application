package com.example.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class switch_ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        RelativeLayout layout =findViewById(R.id.layout_s);
        SwitchCompat switch_ = findViewById(R.id.switch_button);
        switch_.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
           if (switch_.isChecked()) {
               layout.setBackgroundColor(Color.YELLOW);
               Toast.makeText(getApplicationContext(), "Switch : ON", Toast.LENGTH_SHORT).show();
           }
           else {
               layout.setBackgroundColor(Color.WHITE);
               Toast.makeText(getApplicationContext(), "Switch : OFF", Toast.LENGTH_SHORT).show();
           }
            }
        });

        String Javacode="public class MainActivity extends AppCompatActivity {\n" +
                "    Switch SwitchDemo;\n" +
                "    LinearLayout switchLayout;\n" +
                "\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\t\t\t\tswitchLayout=(LinearLayout)findViewById(R.id.switchlayout);\n" +
                "\t\t\t\t\t\t\t\tSwitchDemo = (Switch) findViewById(R.id.SwitchDemo);\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\tSwitchDemo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tpublic void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif(SwitchDemo.isChecked())\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tswitchLayout.setBackgroundColor(Color.YELLOW);\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(), \"SwitchState :\" + SwitchDemo.getTextOn().toString(), Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telse {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tswitchLayout.setBackgroundColor(Color.RED);\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(), \"SwitchState :\" + SwitchDemo.getTextOff().toString(), Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t});\n" +
                "\n" +
                "\n" +
                "\t\t\t\t}\n" +
                "    \n" +
                "}";
        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:id=\"@+id/switchlayout\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t<Switch\n" +
                "\t\t\t\tandroid:id=\"@+id/SwitchDemo\"\n" +
                "\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\tandroid:layout_margin=\"30dp\"\n" +
                "\t\t\t\tandroid:drawableLeft=\"@drawable/ic_android_black_24dp\"\n" +
                "\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\tandroid:checked=\"false\"\n" +
                "\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\tandroid:text=\"switch\"\n" +
                "\t\t\t\tandroid:textOff=\"Off\"\n" +
                "\t\t\t\tandroid:textOn=\"On\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "</LinearLayout>";
        String other = "<activity\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Switch");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button=findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode",Javacode);
                inte.putExtra("xmlcode", xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
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