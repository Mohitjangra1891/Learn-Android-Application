package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class chronoMETER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrono_meter);
        String Javacode="import android.os.Bundle;\n" +
                "import android.os.SystemClock;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Chronometer;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private Chronometer chronometer;\n" +
                "    private Button buttonStart, stop, buttonReset;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        chronometer = findViewById(R.id.chronometer);\n" +
                "\n" +
                "        buttonStart = findViewById(R.id.buttonStart);\n" +
                "        stop = findViewById(R.id.stop);\n" +
                "        buttonReset = findViewById(R.id.buttonReset);\n" +
                "\n" +
                "        buttonStart.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                chronometer.buttonStart();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        stop.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                // stop counting up.This does not effect thr best as set fromBase(long) , just view display\n" +
                "                chronometer.stop();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonReset.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                chronometer.setBase(SystemClock.elapsedRealtime());\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <Chronometer\n" +
                "        android:id=\"@+id/chronometer\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"24dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:layout_marginEnd=\"24dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:drawableStart=\"@drawable/ic_baseline_timer_24\"\n" +
                "        android:drawablePadding=\"20dp\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:padding=\"20dp\"\n" +
                "        android:text=\"00:00\"\n" +
                "        android:textColor=\"#000000\"\n" +
                "        android:textSize=\"36sp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/buttonStart\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"></Chronometer>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/buttonStart\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:text=\"Start\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/stop\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"></Button>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/stop\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:text=\"Stop\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/buttonReset\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"></Button>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/buttonReset\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:layout_marginBottom=\"24dp\"\n" +
                "        android:text=\"Reset\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"></Button>\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Chronometer");
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

         Chronometer chronometer;
         Button buttonStart, stop, buttonReset;


            chronometer = findViewById(R.id.chronometer);

            buttonStart = findViewById(R.id.buttonStart);
            stop = findViewById(R.id.stop);
            buttonReset = findViewById(R.id.buttonReset);

            buttonStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    chronometer.start();
                }
            });

            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // stop counting up.This does not effect thr best as set fromBase(long) , just view display
                    chronometer.stop();
                }
            });

            buttonReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    chronometer.setBase(SystemClock.elapsedRealtime());
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