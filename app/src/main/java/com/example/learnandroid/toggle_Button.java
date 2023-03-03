package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class toggle_Button extends AppCompatActivity {
    TextView textView;
    ToggleButton toggleButton;
    RelativeLayout layout;
    LinearLayout layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Toast;\n" +
                "import android.widget.ToggleButton;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\t\tToggleButton ToggleButtonDemo;\n" +
                "\n" +
                "\t\t\t\t\t@Override\n" +
                "\t\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\t\tsetContentView(R.layout.activity_toggle_button);\n" +
                "\t\t\t\t\t\t\t\tToggleButtonDemo = (ToggleButton) findViewById(R.id.ToggleButtonDemo);\n" +
                "\t\t\t\t\t\t\t\tToggleButtonDemo.setOnClickListener(new View.OnClickListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tpublic void onClick(View view) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tif(ToggleButtonDemo.isChecked()){\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"ToggleButton:-\"+ToggleButtonDemo.getText().toString(), Toast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\telse {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"ToggleButton:-\"+ToggleButtonDemo.getText().toString(), Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t});\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\n" +
                "}";
        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "    \n" +
                "\n" +
                "        <ToggleButton\n" +
                "            android:id=\"@+id/ToggleButtonDemo\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "\t\t\t    android:layout_height=\"wrap_content\"\n" +
                "            android:layout_margin=\"30dp\"\n" +
                "            android:layout_gravity=\"center_horizontal\"\n" +
                "            android:checked=\"false\"\n" +
                "            android:drawablePadding=\"20dp\"\n" +
                "            android:drawableRight=\"@drawable/ic_android_black_24dp\"\n" +
                "            android:textColor=\"#000\" />\n" +
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
        textView = findViewById(R.id.textView);
        toggleButton = findViewById(R.id.togglebutton);
        layout = findViewById(R.id.layout);
        layout2 = findViewById(R.id.layout2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("ToggleButton");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(toggle_Button.this, source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode", xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!toggleButton.isChecked()) {
                    textView.setText("The light is OFF");
                    textView.setTextColor(-1);

                    layout.setBackgroundColor(-16777216);
                } else {
                    textView.setText("The light is ON");
                    textView.setTextColor(-16777216);
                    layout.setBackgroundColor(-1);
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