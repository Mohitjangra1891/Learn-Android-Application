package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class multi_auto_complete_textview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_complete_textview);

        String Javacode="import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.MultiAutoCompleteTextView;\n" +
                "import android.widget.TextView;\n" +
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
                "        String[] text = {\"Java \", \"Kotlin\", \"Python\", \"Javascript\", \"C#\", \"C/C++\", \"Swift\",\n" +
                "                \"PHP\", \"Objective-C\", \"Ruby\", \"Html\", \"CSS\", \"SQL\"};\n" +
                "\n" +
                "        MultiAutoCompleteTextView multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);\n" +
                "        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, text);\n" +
                "        multiAutoCompleteTextView.setAdapter(arrayAdapter);\n" +
                "        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());\n" +
                "\n" +
                "   }\n" +
                "\n" +
                "}";
        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <MultiAutoCompleteTextView\n" +
                "        android:id=\"@+id/multiAutoCompleteTextView\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:completionThreshold=\"1\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.3\" />\n" +
                "        android:hint=\"enter text\"\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"24dp\"\n" +
                "        android:text=\"Text input \\n Java , Kotlin , Python , Javascript  , C# , C/C++ , Swift  , PHP , Objective-C , Ruby , Html , CSS , SQL \"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"@+id/multiAutoCompleteTextView\"\n" +
                "        app:layout_constraintStart_toStartOf=\"@+id/multiAutoCompleteTextView\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/multiAutoCompleteTextView\" />\n" +
                "\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Multi AutoComplete");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode",xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });



        String[] text = {"Java ", "Kotlin", "Python", "Javascript", "C#", "C/C++", "Swift",
                "PHP", "Objective-C", "Ruby", "Html", "CSS", "SQL"};

        MultiAutoCompleteTextView multiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, text);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
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