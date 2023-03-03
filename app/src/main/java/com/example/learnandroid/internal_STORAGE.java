package com.example.learnandroid;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class internal_STORAGE extends AppCompatActivity {
    private final String fileName = "example.txt";
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_storage);
        String Javacode="import android.content.Context;\n" +
                "import android.content.DialogInterface;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.AlertDialog;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import java.io.BufferedReader;\n" +
                "import java.io.FileInputStream;\n" +
                "import java.io.FileOutputStream;\n" +
                "import java.io.IOException;\n" +
                "import java.io.InputStreamReader;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    private final String fileName = \"example.txt\";\n" +
                "    private EditText editText;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "\n" +
                "        editText = findViewById(R.id.editText);\n" +
                "\n" +
                "        Button buttonSave = findViewById(R.id.button);\n" +
                "        Button buttonRead = findViewById(R.id.button2);\n" +
                "\n" +
                "        buttonSave.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                String text = editText.getText().toString();\n" +
                "\n" +
                "                try {\n" +
                "\n" +
                "                    FileOutputStream outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);\n" +
                "                    outputStream.write(text.getBytes());\n" +
                "\n" +
                "                    Toast.makeText(Activity_Internal.this, \"Data Saved Successfully in\" + getFilesDir() + \"/\" + fileName, Toast.LENGTH_LONG).show();\n" +
                "\n" +
                "                    outputStream.close();\n" +
                "                } catch (IOException e) {\n" +
                "                    e.printStackTrace();\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonRead.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                try {\n" +
                "\n" +
                "                    FileInputStream inputStream = openFileInput(fileName);\n" +
                "                    InputStreamReader streamReader = new InputStreamReader(inputStream);\n" +
                "                    BufferedReader bufferedReader = new BufferedReader(streamReader);\n" +
                "\n" +
                "                    StringBuilder stringBuilder = new StringBuilder();\n" +
                "\n" +
                "                    String Text;\n" +
                "\n" +
                "                    while ((Text = bufferedReader.readLine()) != null) {\n" +
                "                        stringBuilder.append(Text);\n" +
                "                    }\n" +
                "\n" +
                "                    inputStream.close();\n" +
                "\n" +
                "                    // show the data\n" +
                "                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);\n" +
                "                    builder.setCancelable(true);\n" +
                "                    builder.setIcon(R.mipmap.app_icon_foreground);\n" +
                "                    builder.setTitle(\"stringBuilder.toString()\");\n" +
                "                    builder.setMessage(Text);\n" +
                "\n" +
                "                    builder.setPositiveButton(\"OK\", new DialogInterface.OnClickListener() {\n" +
                "                        @Override\n" +
                "                        public void onClick(DialogInterface dialog, int which) {\n" +
                "\n" +
                "                            dialog.cancel();\n" +
                "                        }\n" +
                "                    });\n" +
                "\n" +
                "                    AlertDialog dialog = builder.create();\n" +
                "                    dialog.show();\n" +
                "\n" +
                "                } catch (IOException e) {\n" +
                "                    e.printStackTrace();\n" +
                "                }\n" +
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
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editText\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:ems=\"10\"\n" +
                "        android:hint=\"Enter some Text\"\n" +
                "        android:inputType=\"textMultiLine\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"1.0\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.398\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"32dp\"\n" +
                "        android:layout_marginEnd=\"8dp\"\n" +
                "        android:text=\"Save\"\n" +
                "        app:layout_constraintEnd_toStartOf=\"@+id/button2\"\n" +
                "        app:layout_constraintStart_toStartOf=\"@+id/editText\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editText\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"8dp\"\n" +
                "        android:layout_marginTop=\"32dp\"\n" +
                "        android:text=\"Read\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"@+id/editText\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/button\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editText\" />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Internal Storage");
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

        editText = findViewById(R.id.editText);

        Button buttonSave = findViewById(R.id.button);
        Button buttonRead = findViewById(R.id.button2);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();

                try {

                    FileOutputStream outputStream = openFileOutput(fileName, Context.MODE_PRIVATE);
                    outputStream.write(text.getBytes());

                    Toast.makeText(getApplicationContext(), "Data Saved Successfully in" + getFilesDir() + "/" + fileName, Toast.LENGTH_LONG).show();

                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        buttonRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    FileInputStream inputStream = openFileInput(fileName);
                    InputStreamReader streamReader = new InputStreamReader(inputStream);
                    BufferedReader bufferedReader = new BufferedReader(streamReader);

                    StringBuilder stringBuilder = new StringBuilder();

                    String Text;

                    while ((Text = bufferedReader.readLine()) != null) {
                        stringBuilder.append(Text);
                    }

                    inputStream.close();

                    // show the data
                    AlertDialog.Builder builder = new AlertDialog.Builder(internal_STORAGE.this);
                    builder.setCancelable(true);
                    builder.setIcon(R.drawable.internalstorage);
                    builder.setTitle("Saved data");
                    builder.setMessage(stringBuilder.toString());

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.cancel();
                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();

                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "IO exceeption" , Toast.LENGTH_LONG).show();

                    e.printStackTrace();
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