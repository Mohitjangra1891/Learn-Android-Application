package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class change_ACTIVITY_BY_INTENT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_by_intent);
        String Javacode="import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Button button = findViewById(R.id.button);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);\n" +
                "                startActivity(intent);\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}"
             ;


                String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"#FFE872\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/button\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:text=\"Second Activity\"\n" +
                        "        android:textSize=\"18sp\"\n" +
                        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/textView\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"16dp\"\n" +
                        "        android:text=\"This Is A First Activity\"\n" +
                        "        android:textColor=\"#FF6565\"\n" +
                        "        android:textSize=\"30sp\"\n" +
                        "        app:layout_constraintBottom_toTopOf=\"@+id/button\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                        "\n" +
                        "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n"
                       ;

        String other = "import android.content.Intent;\\n\" +\n" +
                "                \"import android.os.Bundle;\\n\" +\n" +
                "                \"import android.view.View;\\n\" +\n" +
                "                \"import android.widget.Button;\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"import androidx.appcompat.app.AppCompatActivity;\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"public class SecondActivity extends AppCompatActivity {\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"    @Override\\n\" +\n" +
                "                \"    protected void onCreate(Bundle savedInstanceState) {\\n\" +\n" +
                "                \"        super.onCreate(savedInstanceState);\\n\" +\n" +
                "                \"        setContentView(R.layout.activity_second);\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"        Button button = findViewById(R.id.button);\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"        button.setOnClickListener(new View.OnClickListener() {\\n\" +\n" +
                "                \"            @Override\\n\" +\n" +
                "                \"            public void onClick(View v) {\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"                Intent intent = new Intent(getApplicationContext(), MainActivity.class);\\n\" +\n" +
                "                \"                startActivity(intent);\\n\" +\n" +
                "                \"            }\\n\" +\n" +
                "                \"        });\\n\" +\n" +
                "                \"    }\\n\" +\n" +
                "                \"}";
        String other_heading = "second_activity.java";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Change Activity by Intent");
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

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), second_ACTIVITY.class);
                intent.putExtra("mode",1);
                startActivity(intent);

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