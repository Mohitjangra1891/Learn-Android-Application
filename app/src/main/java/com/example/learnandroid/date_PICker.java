package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;
import java.util.Objects;

public class
date_PICker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        String Javacode="\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import java.util.Calendar;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private DatePicker datePickerCalendar;\n" +
                "    private DatePicker datePickerSpinner;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        datePickerCalendar = findViewById(R.id.date_picker);\n" +
                "        datePickerSpinner = findViewById(R.id.date_picker2);\n" +
                "\n" +
                "        Calendar calendar = Calendar.getInstance();\n" +
                "        datePickerCalendar.init(calendar.get(Calendar.YEAR),\n" +
                "                calendar.get(Calendar.MONTH),\n" +
                "                calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {\n" +
                "                    @Override\n" +
                "                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {\n" +
                "\n" +
                "                        monthOfYear += 1;\n" +
                "                        String date = dayOfMonth + \"/\" + monthOfYear + \"/\" + year;\n" +
                "\n" +
                "                        Toast.makeText(getApplicationContext(), date, Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                    }\n" +
                "                });\n" +
                "\n" +
                "        datePickerSpinner.init(calendar.get(Calendar.YEAR),\n" +
                "                calendar.get(Calendar.MONTH),\n" +
                "                calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {\n" +
                "                    @Override\n" +
                "                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {\n" +
                "\n" +
                "                        monthOfYear += 1;\n" +
                "                        String date = dayOfMonth + \"/\" + monthOfYear + \"/\" + year;\n" +
                "\n" +
                "                        Toast.makeText(getApplicationContext(), date, Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                    }\n" +
                "                });\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}";

        String xmlcode ="<androidx.constraintlayout.widget.ConstraintLayout\n" +
                "       xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/textView\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"16dp\"\n" +
                "            android:layout_marginTop=\"16dp\"\n" +
                "            android:layout_marginEnd=\"16dp\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:text=\"DatePicker - Calendar Mode\"\n" +
                "            android:textColor=\"#0091EA\"\n" +
                "            android:textSize=\"24sp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toTopOf=\"parent\"></TextView>\n" +
                "\n" +
                "        <DatePicker\n" +
                "            android:id=\"@+id/date_picker\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginTop=\"24dp\"\n" +
                "            android:datePickerMode=\"calendar\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toBottomOf=\"@+id/textView\"></DatePicker>\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/textView1\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"16dp\"\n" +
                "            android:layout_marginTop=\"24dp\"\n" +
                "            android:layout_marginEnd=\"16dp\"\n" +
                "            android:gravity=\"center\"\n" +
                "            android:text=\"DatePicker - Spinner Mode\"\n" +
                "            android:textColor=\"#0091EA\"\n" +
                "            android:textSize=\"24sp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toBottomOf=\"@+id/date_picker\"></TextView>\n" +
                "\n" +
                "        <DatePicker\n" +
                "            android:id=\"@+id/date_picker2\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"8dp\"\n" +
                "            android:layout_marginTop=\"24dp\"\n" +
                "            android:layout_marginEnd=\"8dp\"\n" +
                "            android:calendarViewShown=\"false\"\n" +
                "            android:datePickerMode=\"spinner\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toBottomOf=\"@id/textView1\"></DatePicker>\n" +
                "\n" +
                "    </androidx.constraintlayout.widget.ConstraintLayout>";

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
        Objects.requireNonNull(getSupportActionBar()).setTitle("DatePicker");
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

        DatePicker simpleDatePicker;

            simpleDatePicker=(DatePicker)findViewById(R.id.simpleDatePicker);
            Calendar cal=Calendar.getInstance();
            simpleDatePicker.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                    Toast.makeText(date_PICker.this,"Date:-"+simpleDatePicker.getDayOfMonth()+"\n"+
                            "Month:-"+(simpleDatePicker.getMonth()+1)+"\n"+"Year:-"+simpleDatePicker.getYear(),Toast.LENGTH_SHORT).show();
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