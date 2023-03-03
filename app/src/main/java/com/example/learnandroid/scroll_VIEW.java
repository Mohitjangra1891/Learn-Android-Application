package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class scroll_VIEW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        String Javacode="import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
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
                "    <TextView\n" +
                "        android:id=\"@+id/textView2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:text=\"Vertical ScrollView\"\n" +
                "        android:textColor=\"#304FFE\"\n" +
                "        android:textSize=\"24sp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <ScrollView\n" +
                "        android:id=\"@+id/scrollView2\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"250dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/textView2\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:orientation=\"vertical\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/This\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/is\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/a\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/vertical\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/scrollview\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/This\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/is\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/a\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/vertical\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginTop=\"10dp\"\n" +
                "                android:background=\"#F4E599\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/scrollview\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "\n" +
                "    </ScrollView>\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView127\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"32dp\"\n" +
                "        android:text=\"Horizontal ScrollView\"\n" +
                "        android:textColor=\"#304FFE\"\n" +
                "        android:textSize=\"24sp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/scrollView2\" />\n" +
                "\n" +
                "    <HorizontalScrollView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/textView127\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:orientation=\"horizontal\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/This\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/is\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/a\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/horizontal\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/scrollview\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/This\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/is\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/a\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/horizontal\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"wrap_content\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:layout_marginStart=\"10dp\"\n" +
                "                android:background=\"#5BBAF5\"\n" +
                "                android:padding=\"10dp\"\n" +
                "                android:text=\"@string/scrollview\"\n" +
                "                android:textSize=\"24sp\" />\n" +
                "\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "\n" +
                "    </HorizontalScrollView>\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("ScrollView");
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