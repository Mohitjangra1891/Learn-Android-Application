package com.example.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class snackbar_MATERIAL_DESIGN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_material_design);
        String Javacode="import android.graphics.Color;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.constraintlayout.widget.ConstraintLayout;\n" +
                "\n" +
                "import com.google.android.material.snackbar.Snackbar;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private ConstraintLayout constraintLayout;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Button buttonOne = findViewById(R.id.button);\n" +
                "        Button buttonTwo = findViewById(R.id.button2);\n" +
                "\n" +
                "        constraintLayout = findViewById(R.id.main_layout);\n" +
                "\n" +
                "        buttonOne.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                // Example Snackbar\n" +
                "                Snackbar.make(constraintLayout, \"This is SnackBar\", Snackbar.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonTwo.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                // SnackBar with Action\n" +
                "\n" +
                "                constraintLayout.setBackgroundColor(Color.parseColor(\"#C8F7FE\"));\n" +
                "\n" +
                "                Snackbar snackbar = Snackbar\n" +
                "                        .make(constraintLayout, \" Background colour changed\", Snackbar.LENGTH_INDEFINITE)\n" +
                "                        .setAction(\" UNDO\", new View.OnClickListener() {\n" +
                "                            @Override\n" +
                "                            public void onClick(View v) {\n" +
                "\n" +
                "                                // set Action\n" +
                "                                constraintLayout.setBackgroundColor(Color.parseColor(\"#FFFFFF\"));\n" +
                "                            }\n" +
                "                        })\n" +
                "                        // set Action color\n" +
                "                        .setActionTextColor(Color.parseColor(\"#DD2C00\"))\n" +
                "                        // set text color\n" +
                "                        .setTextColor(Color.parseColor(\"#FFFFFF\"));\n" +
                "\n" +
                "\n" +
                "                snackbar.show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/main_layout\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"SnackBar example\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/button2\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"SnackBar With Action\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/button\" />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Snackbar");
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

        Button buttonOne = findViewById(R.id.button);
        Button buttonTwo = findViewById(R.id.button2);

        RelativeLayout layout = findViewById(R.id.layout_____);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Example Snackbar
                Snackbar.make(layout, "This is SnackBar", Snackbar.LENGTH_SHORT).show();
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // SnackBar with Action

                layout.setBackgroundColor(Color.parseColor("#C8F7FE"));

                Snackbar snackbar = Snackbar
                        .make(layout, " Background colour changed", Snackbar.LENGTH_INDEFINITE)
                        .setAction(" UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                // set Action
                                layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            }
                        })
                        // set Action color
                        .setActionTextColor(Color.parseColor("#DD2C00"))
                        // set text color
                        .setTextColor(Color.parseColor("#FFFFFF"));


                snackbar.show();
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