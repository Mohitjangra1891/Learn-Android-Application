package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class time_PICKER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        String Javacode="import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.TimePicker;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import com.google.android.material.snackbar.Snackbar;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        TimePickerClock timePickerClock = findViewById(R.id.time_picker);\n" +
                "        TimePickerSpinner timePickerSpinner = findViewById(R.id.time_picker2);\n" +
                "\n" +
                "        timePickerClock.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {\n" +
                "            @Override\n" +
                "            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {\n" +
                "\n" +
                "                Snackbar.make(findViewById(R.id.timePicker), hourOfDay + \":\" + minute, Snackbar.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        timePickerSpinner.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {\n" +
                "            @Override\n" +
                "            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {\n" +
                "\n" +
                "                Snackbar.make(findViewById(R.id.timePicker), hourOfDay + \":\" + minute, Snackbar.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<ScrollView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/timePicker\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/textView\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"16dp\"\n" +
                "            android:layout_marginTop=\"16dp\"\n" +
                "            android:layout_marginEnd=\"16dp\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:text=\"TimePicker - Clock Mode\"\n" +
                "            android:textColor=\"#0091EA\"\n" +
                "            android:textSize=\"24sp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "        <TimePicker\n" +
                "            android:id=\"@+id/time_picker\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"16dp\"\n" +
                "            android:layout_marginTop=\"24dp\"\n" +
                "            android:layout_marginEnd=\"16dp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toBottomOf=\"@+id/textView\"></TimePicker>\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/textView1\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"16dp\"\n" +
                "            android:layout_marginTop=\"24dp\"\n" +
                "            android:layout_marginEnd=\"16dp\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:text=\"TimePicker - Spinner Mode\"\n" +
                "            android:textColor=\"#0091EA\"\n" +
                "            android:textSize=\"24sp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toBottomOf=\"@+id/time_picker\"></TextView>\n" +
                "\n" +
                "        <TimePicker\n" +
                "            android:id=\"@+id/time_picker2\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"8dp\"\n" +
                "            android:layout_marginTop=\"24dp\"\n" +
                "            android:layout_marginEnd=\"8dp\"\n" +
                "            android:calendarViewShown=\"false\"\n" +
                "            android:timePickerMode=\"spinner\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toBottomOf=\"@id/textView1\"></TimePicker>\n" +
                "\n" +
                "    </androidx.constraintlayout.widget.ConstraintLayout>\n" +
                "\n" +
                "</ScrollView>";
//        String xmlcode ="";

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
        Objects.requireNonNull(getSupportActionBar()).setTitle("TimePicker");
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