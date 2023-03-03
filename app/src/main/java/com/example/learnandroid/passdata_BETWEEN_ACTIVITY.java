package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class passdata_BETWEEN_ACTIVITY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passdata_between);
        String Javacode="import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private EditText editText;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Button button = findViewById(R.id.button);\n" +
                "        editText = findViewById(R.id.message);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                // get Text from editText\n" +
                "                String message = mEditText.getText().toString();\n" +
                "\n" +
                "                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);\n" +
                "                intent.putExtra(\"Message\", message);\n" +
                "                startActivity(intent);\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "}";


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
                        "        android:layout_marginTop=\"24dp\"\n" +
                        "        android:padding=\"20dp\"\n" +
                        "        android:text=\"Second Activity\"\n" +
                        "        android:textSize=\"18sp\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toBottomOf=\"@+id/message\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/textView\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"32dp\"\n" +
                        "        android:text=\"This Is A First Activity\"\n" +
                        "        android:textColor=\"#FF6565\"\n" +
                        "        android:textSize=\"30sp\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                        "\n" +
                        "    <EditText\n" +
                        "        android:id=\"@+id/message\"\n" +
                        "        android:layout_width=\"0dp\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginStart=\"16dp\"\n" +
                        "        android:layout_marginTop=\"32dp\"\n" +
                        "        android:layout_marginEnd=\"16dp\"\n" +
                        "        android:layout_marginBottom=\"32dp\"\n" +
                        "        android:hint=\"Enter Message Here\"\n" +
                        "        android:inputType=\"textPersonName\"\n" +
                        "        app:layout_constraintBottom_toTopOf=\"@+id/button\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toBottomOf=\"@+id/textView\" />\n" +
                        "\n" +
                        "\n" +
                        "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n" +
                        "second_activity.xml\n\n\n" +
                        "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"#A7DDFF\"\n" +
                        "    tools:context=\".SecondActivity\">\n" +
                        "\n" +
                        "<TextView\n" +
                        "        android:id=\"@+id/textView\"\n" +
                        "        android:layout_width=\"0dp\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginStart=\"24dp\"\n" +
                        "        android:layout_marginTop=\"16dp\"\n" +
                        "        android:layout_marginEnd=\"24dp\"\n" +
                        "        android:textColor=\"#000000\"\n" +
                        "        android:textSize=\"30sp\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/button\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:text=\"Back\"\n" +
                        "        android:textSize=\"18sp\"\n" +
                        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toBottomOf=\"@+id/textView\"\n" +
                        "        app:layout_constraintVertical_bias=\"0.3\" />\n" +
                        "</androidx.constraintlayout.widget.ConstraintLayout>";

        String other = "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class SecondActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_second);\n" +
                "\n" +
                "        Button button = findViewById(R.id.button);\n" +
                "        Textview textView = findViewById(R.id.textView);\n" +
                "\n" +
                "        textView.setText(getIntent().getExtras().getString(\"Message\"));\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Intent intent = new Intent(getApplicationContext(), MainActivity.class);\n" +
                "                startActivity(intent);\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}";
        String other_heading = "second_activity.java";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("PassData b/w Activity");
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
        EditText text=findViewById(R.id.edittexttt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String code =text.getText().toString();
                Intent intent = new Intent(getApplicationContext(), second_ACTIVITY.class);
                intent.putExtra("code",code);
                intent.putExtra("mode",2);
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