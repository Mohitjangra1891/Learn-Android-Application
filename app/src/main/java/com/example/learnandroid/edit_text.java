package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class edit_text extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        EditText editText=findViewById(R.id.edittext);
       Button button=findViewById(R.id.button);
        TextView textView=findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText.getText().toString();
                textView.setText(text);
                textView.setVisibility(View.VISIBLE);
            }
        });

        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.text.Editable;\n" +
                "import android.text.TextWatcher;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    EditText edttxt;\n" +
                "    TextView txtedt;\n" +
                "                @Override\n" +
                "                protected void onCreate(Bundle savedInstanceState) {\n" +
                "                                super.onCreate(savedInstanceState);\n" +
                "                                setContentView(R.layout.activity_main);\n" +
                "                                edttxt=(EditText)findViewById(R.id.edtdemo);\n" +
                "                                txtedt=(TextView)findViewById(R.id.txtedt);\n" +
                "                                edttxt.addTextChangedListener(new TextWatcher() {\n" +
                "                                    @Override\n" +
                "                                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {\n" +
                "                                    }\n" +
                "\n" +
                "                                    @Override\n" +
                "                                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {\n" +
                "                                        String str=edttxt.getText().toString();\n" +
                "                                        txtedt.setText(str);\n" +
                "                                    }\n" +
                "\n" +
                "                                    @Override\n" +
                "                                    public void afterTextChanged(Editable editable) {\n" +
                "                                    }\n" +
                "                                });\n" +
                "                            }\n" +
                "}";

        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <EditText\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_margin=\"30dp\"\n" +
                "\t\t    android:id=\"@+id/edtdemo\"\n" +
                "        />\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:textColor=\"@color/Black\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "\t\t    android:textSize=\"30dp\"\n" +
                "        android:id=\"@+id/txtedt\"/>\n" +
                "\n" +
                "</LinearLayout>";
        String other="<activity\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("EditText");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button=findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(edit_text.this, source_CODE_Activity.class);
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