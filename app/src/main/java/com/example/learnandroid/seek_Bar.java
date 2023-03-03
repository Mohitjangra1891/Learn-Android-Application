package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class seek_Bar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.widget.SeekBar;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "SeekBar seekbarDemo;\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\tseekbarDemo=(SeekBar)findViewById(R.id.seekbarDemo);\n" +
                "\t\t\t\t\t\t\tseekbarDemo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
                "\t\t\t\t\t\t\t\tint seekbarProgreesValue = 0;\n" +
                "\n" +
                "\t\t\t\t\t\t\t\tpublic void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tseekbarProgreesValue = progress;\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t\t\tpublic void onStartTrackingTouch(SeekBar seekBar) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t// TODO Auto-generated method stub\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t\t\tpublic void onStopTrackingTouch(SeekBar seekBar) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(MainActivity.this, \"Seekbar progress :\" +  seekbarProgreesValue,\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t});\n" +
                "\t\t\t\t}\n" +
                "    \n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\n" +
                "\t\t\t\t<SeekBar\n" +
                "\t\t\t\t\tandroid:id=\"@+id/seekbarDemo\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\t\tandroid:max=\"100\"\n" +
                "\t\t\t\t   />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("SeekBar");
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

        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.textView);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String text = "Seekbar value :- "+ progress;
                textView.setText(text);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

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