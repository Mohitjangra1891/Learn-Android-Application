package com.example.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class text_SWITCHER extends AppCompatActivity {
    private TextSwitcher mTextSwitcher;
    private int position = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_switcher);

        String Javacode="import android.content.Intent;\n" +
                "import android.graphics.Color;\n" +
                "import android.graphics.Typeface;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.Gravity;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.TextSwitcher;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.ViewSwitcher;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.core.content.res.ResourcesCompat;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private TextSwitcher mTextSwitcher;\n" +
                "    private int position = -1;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        mTextSwitcher = findViewById(R.id.textSwitcher);\n" +
                "        Button previous = findViewById(R.id.button3);\n" +
                "        Button next = findViewById(R.id.button);\n" +
                "\n" +
                "        final String[] text = {\"Develop your First app\", \"Open  android studio\", \"Create new project \",\n" +
                "                \"Setup empty activity\", \"Give project name and finish\", \"Set up AVD\", \"press Shift + F10\",\n" +
                "                \"Congrats ! You built your first app\"};\n" +
                "\n" +
                "\n" +
                "        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {\n" +
                "            @Override\n" +
                "            public View makeView() {\n" +
                "\n" +
                "                // create textView\n" +
                "                TextView textView = new TextView(getApplicationContext());\n" +
                "                textView.setTextSize(24);\n" +
                "                textView.setGravity(Gravity.CENTER);\n" +
                "                textView.setTextColor(Color.parseColor(\"#000000\"));\n" +
                "\n" +
                "                Typeface typeface = ResourcesCompat.getFont(getApplicationContext(), R.font.);\n" +
                "                textView.setTypeface(typeface);\n" +
                "\n" +
                "\n" +
                "                return textView;\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        next.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                if (position < text.length - 1) {\n" +
                "                    position += 1; //position = position + 1;\n" +
                "                    mTextSwitcher.setText(text[position]);\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        previous.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                if (position > 0) {\n" +
                "                    position -= 1; // position = position - 1;\n" +
                "                    mTextSwitcher.setText(text[position]);\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
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
                "\n" +
                "    <TextSwitcher\n" +
                "        android:id=\"@+id/textSwitcher\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginTop=\"24dp\"\n" +
                "        android:layout_marginEnd=\"16dp\"\n" +
                "        android:background=\"#C5E4FF\"\n" +
                "        android:padding=\"26dp\"\n" +
                "        android:scrollbars=\"vertical\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/button3\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"></TextSwitcher>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"8dp\"\n" +
                "        android:layout_marginEnd=\"16dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:text=\"Next\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/button3\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button3\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginEnd=\"8dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:text=\"Previous\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toStartOf=\"@+id/button\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Text Switcher");
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


        mTextSwitcher = findViewById(R.id.textSwitcher);
        Button previous = findViewById(R.id.button3);
        Button next = findViewById(R.id.button);

        final String[] text = {"Develop your First app", "Open  android studio", "Create new project ",
                "Setup empty activity", "Give project name and finish", "Set up AVD", "press Shift + F10",
                "Congrats ! You built your first app"};


        mTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                // create textView
                TextView textView = new TextView(getApplicationContext());
                textView.setTextSize(24);
                textView.setGravity(Gravity.CENTER);
                textView.setTextColor(Color.parseColor("#000000"));

                Typeface typeface = ResourcesCompat.getFont(getApplicationContext(), R.font.alata);
                textView.setTypeface(typeface);


                return textView;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position < text.length - 1) {
                    position += 1; //position = position + 1;
                    mTextSwitcher.setText(text[position]);
                }


            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position > 0) {
                    position -= 1; // position = position - 1;
                    mTextSwitcher.setText(text[position]);
                }


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