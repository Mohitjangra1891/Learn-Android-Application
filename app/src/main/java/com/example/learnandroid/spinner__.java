package com.example.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class spinner__ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.widget.AdapterView;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.Spinner;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {\n" +
                "\n" +
                "Spinner spinnercity;\n" +
                "String[] cityname={\"BANGLORE\",\"PUNE\",\"MUMBAI\",\"KOLKATA\",\"RANCHI\"};\n" +
                "\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\t\t\t\tspinnercity=(Spinner)findViewById(R.id.spinnercity);\n" +
                "\t\t\t\t\t\t\t\tspinnercity.setOnItemSelectedListener(this);\n" +
                "\t\t\t\t\t\t\t\tArrayAdapter adapterspinner=new ArrayAdapter(this,android.R.layout.simple_spinner_item,cityname);\n" +
                "\t\t\t\t\t\t\t\tadapterspinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
                "\t\t\t\t\t\t\t\tspinnercity.setAdapter(adapterspinner);\n" +
                "\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\tpublic void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {\n" +
                "\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(), cityname[position], Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\tpublic void onNothingSelected(AdapterView<?> arg0) {\n" +
                "\t\t\t\t\t\t\t\t// TODO Auto-generated method stub\n" +
                "\n" +
                "\t\t\t\t\t\t\t}\n" +
                "   \n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"horizontal\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t\t<TextView\n" +
                "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_margin=\"30dp\"\n" +
                "\t\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\t\tandroid:textColor=\"@color/Black\"\n" +
                "\t\t\t\t\tandroid:text=\"Select City:-\"/>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t<Spinner\n" +
                "\t\t\t\t\tandroid:id=\"@+id/spinnercity\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t   android:layout_marginTop=\"30dp\"\n" +
                "\t\t\t\t\t/>\n" +
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
        String other_heading = "Manifest";        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Spinner");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button=findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode",Javacode);
                inte.putExtra("xmlcode",xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });

        Spinner spinner = findViewById(R.id.spinner_);

        RelativeLayout constraintLayout = findViewById(R.id.layout);

        String[] colors = {"White", "Green", "Yellow", "Red", "Blue"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, colors);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        constraintLayout.setBackgroundColor(Color.WHITE);
                        break;
                    case 1:
                        constraintLayout.setBackgroundColor(Color.GREEN);
                        break;
                    case 2:
                        constraintLayout.setBackgroundColor(Color.YELLOW);
                        break;
                    case 3:
                        constraintLayout.setBackgroundColor(Color.RED);
                        break;
                    case 4:
                        constraintLayout.setBackgroundColor(Color.BLUE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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