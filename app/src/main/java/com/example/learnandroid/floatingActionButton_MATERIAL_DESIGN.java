package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class floatingActionButton_MATERIAL_DESIGN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button_material_design);
        String Javacode="import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.TabHost;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import com.google.android.material.floatingactionbutton.FloatingActionButton;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton);\n" +
                "\n" +
                "        floatingActionButton.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Toast.makeText(MainActivity.this, \"You Clicked On FAB\", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <com.google.android.material.floatingactionbutton.FloatingActionButton\n" +
                "        android:id=\"@+id/floatingActionButton\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginEnd=\"16dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:clickable=\"true\"\n" +
                "        android:src=\"@drawable/ic_baseline_create_24\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
                "\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>";

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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Floating Action Button");
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