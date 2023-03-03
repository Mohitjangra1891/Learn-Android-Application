package com.example.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class radio_Button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.RadioButton;\n" +
                "import android.widget.RadioGroup;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "RadioButton radioyes,radiomaybe,radiono;\n" +
                "\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\t\t\t\tradiono=(RadioButton)findViewById(R.id.radiono);\n" +
                "\t\t\t\t\t\t\t\tradioyes=(RadioButton)findViewById(R.id.radioyes);\n" +
                "\t\t\t\t\t\t\t\tradiomaybe=(RadioButton)findViewById(R.id.radiomaybe);\n" +
                "\t\t\t\t\t\t\t\tRadioGroup radioattend=(RadioGroup)findViewById(R.id.radioattendgroup);\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tradioattend.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tpublic void onCheckedChanged(RadioGroup radioGroup, int i) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tswitch (i){\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcase R.id.radioyes:\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Select:-\"+radioyes.getText().toString(),Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcase R.id.radiomaybe:\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Select:-\"+radiomaybe.getText().toString(),Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcase R.id.radiono:\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Select:-\"+radiono.getText().toString(),Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdefault:\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tbreak;\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t});\n" +
                "\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t\n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\t\t<TextView\n" +
                "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\t\tandroid:text=\"Attending ?\"\n" +
                "\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\t\tandroid:textColor=\"#000\"\n" +
                "\t\t\t\t\tandroid:textSize=\"20sp\"\n" +
                "\t\t\t\t\tandroid:textStyle=\"bold\" />\n" +
                "\n" +
                "\t\t\t\t<RadioGroup\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:id=\"@+id/radioattendgroup\">\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<RadioButton\n" +
                "\t\t\t\t\t\t\t\t\tandroid:id=\"@+id/radioyes\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_marginTop=\"10dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_marginLeft=\"20dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:text=\"Yes\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textColor=\"#154\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textSize=\"20sp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textStyle=\"bold\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<RadioButton\n" +
                "\t\t\t\t\t\t\t\t\tandroid:id=\"@+id/radiomaybe\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_marginTop=\"10dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_marginLeft=\"20dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:text=\"Maybe\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textColor=\"#154\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textSize=\"20sp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textStyle=\"bold\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<RadioButton\n" +
                "\t\t\t\t\t\t\t\t\tandroid:id=\"@+id/radiono\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_marginLeft=\"20dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_marginTop=\"10dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:text=\"No\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textColor=\"#154\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textSize=\"20sp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textStyle=\"bold\" />\n" +
                "\n" +
                "\t\t\t\t</RadioGroup>\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("RadioButton");
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

        RadioGroup radioGroup = findViewById(R.id.radio_group);

        RadioButton radioButtonBlue = findViewById(R.id.radioButton);
        RadioButton radioButtonGreen = findViewById(R.id.radioButton2);
        RadioButton radioButtonRed = findViewById(R.id.radioButton3);

        RelativeLayout constraintLayout = findViewById(R.id.radio);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.radioButton:
                        constraintLayout.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.radioButton2:
                        constraintLayout.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.radioButton3:
                        constraintLayout.setBackgroundColor(Color.RED);
                }
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