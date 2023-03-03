package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class activity_LIFECYCLE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        String Javacode="import android.os.Bundle;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        TextView textView = findViewById(R.id.textView);\n" +
                "        textView.setMovementMethod(LinkMovementMethod.getInstance());\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"onCreate was Called\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onStart() {\n" +
                "        super.onStart();\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"onStart was Called\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onResume() {\n" +
                "        super.onResume();\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"onResume was Called\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onPause() {\n" +
                "        super.onPause();\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"onPause was Called\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onStop() {\n" +
                "        super.onStop();\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"onStop was Called\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onRestart() {\n" +
                "        super.onRestart();\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"onRestart was Called\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onDestroy() {\n" +
                "        super.onDestroy();\n" +
                "\n" +
                "        Toast.makeText(getApplicationContext(), \"onDestroy was Called\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
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
                        "    <!--                    <string name=\"Documentation\"><a href=\"https://developer.android.com/guide/components/activities/activity-lifecycle\">Android Activity Lifecycle Documentation</a></string>-->\n" +
                        "\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/textView\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:gravity=\"center\"\n" +
                        "        android:text=\"@string/Documentation\"\n" +
                        "        android:textSize=\"24sp\"\n" +
                        "        android:textStyle=\"bold\"\n" +
                        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
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
        TextView textView =  findViewById(R.id.textviewh);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Activity Lifecycle");
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
        Toast.makeText(getApplicationContext(),"onCreate was Called",Toast.LENGTH_LONG).show();
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

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart was Called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume was Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause was Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop was Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart was Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy was Called",Toast.LENGTH_SHORT).show();

    }
}