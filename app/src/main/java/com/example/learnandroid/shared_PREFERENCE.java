package com.example.learnandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class shared_PREFERENCE extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        String Javacode="import android.content.Context;\n" +
                "import android.content.DialogInterface;\n" +
                "import android.content.SharedPreferences;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.AlertDialog;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    boolean booleanValue;\n" +
                "    int intValue;\n" +
                "    String stringValue;\n" +
                "\n" +
                "\n" +
                "    // Default string Value\n" +
                "    String defaultString = \"No Data\";\n" +
                "    \n" +
                "    // Default int Value\n" +
                "    int intDefault = 0;\n" +
                "    \n" +
                "    // Default boolean value\n" +
                "    boolean booleanDefault = false;\n" +
                "    \n" +
                "    private EditText editText;\n" +
                "    private EditText editText1;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(final Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        editText = findViewById(R.id.editTextTextMultiLine);\n" +
                "        editText1 = findViewById(R.id.editTextNumberSigned);\n" +
                "\n" +
                "\n" +
                "        Button buttonSave = findViewById(R.id.button);\n" +
                "        Button buttonRead = findViewById(R.id.button2);\n" +
                "\n" +
                "\n" +
                "        buttonSave.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                stringValue = editText.getText().toString();\n" +
                "                String val = editText1.getText().toString().trim();\n" +
                "\n" +
                "                if (!val.equals(\"\")) {\n" +
                "\n" +
                "                    intValue = Integer.parseInt(val);\n" +
                "\n" +
                "                    // get boolean value\n" +
                "                    booleanValue = intValue >= 5;\n" +
                "\n" +
                "                    // Call to the method\n" +
                "                    saveData();\n" +
                "                } else {\n" +
                "\n" +
                "                    Toast.makeText(MainActivity.this, \"Cannot Submit Empty Field\", Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonRead.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                // Call to the method\n" +
                "                readData();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    private void saveData() {\n" +
                "\n" +
                "        \n" +
                "        SharedPreferences sharedPreferences = getSharedPreferences(\"Example\", Context.MODE_PRIVATE);\n" +
                "        SharedPreferences.Editor editor = sharedPreferences.edit();\n" +
                "        editor.putString(\"Text\", StringValue); // Save String Data\n" +
                "        editor.putInt(\"Number\", intValue);   // Save int Data\n" +
                "        editor.putBoolean(\"State\", booleanValue); // Save boolean Data\n" +
                "        editor.apply();\n" +
                "\n" +
                "\n" +
                "        Toast.makeText(this, \"Data Saved Successfully\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    private void readData() {\n" +
                "\n" +
                "        SharedPreferences sharedPreferences = getSharedPreferences(\"Example\", Context.MODE_PRIVATE);\n" +
                "        String text = sharedPreferences.getString(\"Text\", defaultString);     // read saved String data\n" +
                "        int number = sharedPreferences.getInt(\"Number\", intDefault);       // read saved int data\n" +
                "        boolean value = sharedPreferences.getBoolean(\"State\", booleanDefault); // read saved boolean data\n" +
                "\n" +
                "\n" +
                "        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_SharedPreferences.this);\n" +
                "        builder.setCancelable(true);\n" +
                "        builder.setIcon(R.mipmap.app_icon_foreground);\n" +
                "        builder.setTitle(\"Saved data\");\n" +
                "        builder.setMessage(\"String Value :- \" + text + \"\\n\" +\n" +
                "                \"int value :- \" + number + \"\\n\" +\n" +
                "                \"boolean value :- \" + value);\n" +
                "\n" +
                "        builder.setPositiveButton(\"OK\", new DialogInterface.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(DialogInterface dialog, int which) {\n" +
                "\n" +
                "                dialog.cancel();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        AlertDialog dialog = builder.create();\n" +
                "        dialog.show();\n" +
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
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editTextTextMultiLine\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:layout_marginBottom=\"24dp\"\n" +
                "        android:gravity=\"start|top\"\n" +
                "        android:hint=\"Enter Some Text\"\n" +
                "        android:inputType=\"textMultiLine\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/editTextNumberSigned\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editTextNumberSigned\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:maxLength=\"10\"\n" +
                "        android:hint=\"Enter number\"\n" +
                "        android:inputType=\"number\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"@+id/editTextTextMultiLine\"\n" +
                "        app:layout_constraintStart_toStartOf=\"@+id/editTextTextMultiLine\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"32dp\"\n" +
                "        android:layout_marginEnd=\"8dp\"\n" +
                "        android:text=\"Save\"\n" +
                "        app:layout_constraintEnd_toStartOf=\"@+id/button2\"\n" +
                "        app:layout_constraintStart_toStartOf=\"@+id/editTextNumberSigned\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editTextNumberSigned\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"8dp\"\n" +
                "        android:layout_marginTop=\"32dp\"\n" +
                "        android:text=\"Read\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"@+id/editTextNumberSigned\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/button\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editTextNumberSigned\" />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Shared Preferences");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button=findViewById(R.id.code_button);
        show_code_button.setOnClickListener(view -> {
            Intent inte= new Intent(getApplicationContext(), source_CODE_Activity.class);
            inte.putExtra("javacode",Javacode);
            inte.putExtra("xmlcode",xmlcode);
            inte.putExtra("other", other);
            inte.putExtra("other_heading", other_heading);
            startActivity(inte);
        });
        Button storeinformation =  findViewById(R.id.storeinformation);
        Button showinformation =  findViewById(R.id.showinformation);
        textView =  findViewById(R.id.txtPrefs);
        textView.setMovementMethod(new ScrollingMovementMethod());
        @SuppressLint("NonConstantResourceId") View.OnClickListener listener = v -> {
            switch (v.getId()) {
                case R.id.storeinformation:
                    Intent intent = new Intent(shared_PREFERENCE.this,preXmlActivity.class);
                    startActivity(intent);
                    break;
                case R.id.showinformation:
                    displaySharedPreferences();
                    break;
                default:
                    break;
            }
        };
        storeinformation.setOnClickListener(listener);
        showinformation.setOnClickListener(listener);
    }

    private void displaySharedPreferences() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(shared_PREFERENCE.this);
        String username = prefs.getString("username", "Default NickName");
        String passw = prefs.getString("password", "Default Password");
        boolean checkBox = prefs.getBoolean("checkBox", false);
        String listPrefs = prefs.getString("listpref", "Default list prefs");
        String builder = "Username: " + username + "\n" +
                "Password: " + passw + "\n" +
                "Keep me logged in: " + checkBox + "\n" +
                "Language preference: " + listPrefs;
        textView.setText(builder);
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