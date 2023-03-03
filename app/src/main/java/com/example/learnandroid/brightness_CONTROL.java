package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class brightness_CONTROL extends AppCompatActivity {
    float BackLightValue = 0.5f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brightness_control);

        String Javacode = "import ...\n" +
                "\n" +
                "public class Bright extends AppCompatActivity {\n" +
                "\n" +
                "    float BackLightValue = 0.5f;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_bright);\n" +
                "        BottomNavigationView navView = findViewById(R.id.navigation);\n" +
                "        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);\n" +
                "\n" +
                "        SeekBar sb=(SeekBar)findViewById(R.id.sb);\n" +
                "        final TextView tv = (TextView)findViewById(R.id.tv);\n" +
                "\n" +
                "        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
                "            @Override\n" +
                "            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
                "                BackLightValue = (float)progress/100;\n" +
                "                tv.setText(String.valueOf(BackLightValue));\n" +
                "                WindowManager.LayoutParams layoutParams = getWindow().getAttributes();\n" +
                "                layoutParams.screenBrightness = BackLightValue;\n" +
                "                getWindow().setAttributes(layoutParams);\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void onStartTrackingTouch(SeekBar seekBar) {\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void onStopTrackingTouch(SeekBar seekBar) {\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "}\n";
        String xmlcode = "?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout \n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "   android:id=\"@+id/container\"\n" +
                "   android:layout_width=\"match_parent\"\n" +
                "   android:layout_height=\"match_parent\"\n" +
                "   tools:context=\".Bright\">\n" +
                "\n" +
                "    <SeekBar\n" +
                "        android:id=\"@+id/sb\"\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"50sp\"\n" +
                "        android:layout_marginLeft=\"20sp\"\n" +
                "        android:layout_marginRight=\"20sp\"\n" +
                "        android:max=\"100\"\n" +
                "        android:progress=\"50\"/>\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/tv\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@+id/sb\"\n" +
                "        android:text=\"0.5\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginTop=\"20sp\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        android:textSize=\"24sp\"/>\n" +
                "\n" +
                "</RelativeLayout>";
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("BrightNess Control");
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


        SeekBar sb=(SeekBar)findViewById(R.id.sb);
        final TextView tv = (TextView)findViewById(R.id.tv);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                BackLightValue = (float)progress/100;
                tv.setText(String.valueOf(BackLightValue));
                WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
                layoutParams.screenBrightness = BackLightValue;
                getWindow().setAttributes(layoutParams);
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