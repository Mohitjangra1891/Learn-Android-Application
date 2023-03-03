package com.example.learnandroid;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class clipboard_MANAGER extends AppCompatActivity {
    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipboard_manager);
        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);
        String Javacode = "import android.content.ClipData;\n" +
                "import android.content.ClipDescription;\n" +
                "import android.content.ClipboardManager;\n" +
                "import android.content.Context;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.EditText;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "\n" +
                "        Button buttonCopy = findViewById(R.id.button);\n" +
                "        Button buttonPaste = findViewById(R.id.button2);\n" +
                "\n" +
                "        final EditText editText = findViewById(R.id.editText);\n" +
                "\n" +
                "\n" +
                "        buttonCopy.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                String text = editText.getText().toString();\n" +
                "\n" +
                "                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);\n" +
                "                ClipData clip = ClipData.newPlainText(\"simple text\", text);\n" +
                "                clipboard.setPrimaryClip(clip); // Set the ClipBoard's primary clip\n" +
                "\n" +
                "                // Clear the editText \n" +
                "                editText.getText().clear();\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonPaste.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);\n" +
                "                String pasteData;\n" +
                "\n" +
                "\n" +
                "                if (!(clipboard.hasPrimaryClip())) {\n" +
                "\n" +
                "                    // if clipboard  doesn't contain any data\n" +
                "                    Toast.makeText(MainActivity.this, \"No Data to buttonPaste\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                } else if (!(clipboard.getPrimaryClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN))) {\n" +
                "\n" +
                "                    // Clipboard has data but it is not plain text\n" +
                "                    Toast.makeText(MainActivity.this, \"Data is not a Plain text\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                } else {\n" +
                "\n" +
                "                    // Clipboard has plain text\n" +
                "                    ClipData.Item item = clipboard.getPrimaryClip().getItemAt(0);\n" +
                "                    pasteData = item.getText().toString();\n" +
                "\n" +
                "                    // setText the clipboard data\n" +
                "                    editText.setText(pasteData);\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
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
                "        android:layout_marginStart=\"8dp\"\n" +
                "        android:gravity=\"start|top\"\n" +
                "        android:hint=\"Enter text\"\n" +
                "        android:inputType=\"textMultiLine\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.4\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"8dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:layout_marginEnd=\"8dp\"\n" +
                "        android:text=\"Copy\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintEnd_toStartOf=\"@+id/button2\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editText\"\n" +
                "        app:layout_constraintVertical_chainStyle=\"packed\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"8dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:layout_marginEnd=\"8dp\"\n" +
                "        android:text=\"Paste\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/button\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editText\"\n" +
                "        app:layout_constraintVertical_chainStyle=\"packed\" />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Clipboard Manager");
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





        Button buttonCopy = findViewById(R.id.button);
        Button buttonPaste = findViewById(R.id.button2);

        final EditText editText = findViewById(R.id.editText);


        buttonCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("simple text", text);
                clipboard.setPrimaryClip(clip); // Set the ClipBoard's primary clip

                // Clear the editText
                editText.getText().clear();

            }
        });

        buttonPaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                String pasteData;


                if (!(clipboard.hasPrimaryClip())) {

                    // if clipboard  doesn't contain any data
                    Toast.makeText(clipboard_MANAGER.this, "No Data to buttonPaste", Toast.LENGTH_SHORT).show();

                } else if (!(clipboard.getPrimaryClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN))) {

                    // Clipboard has data but it is not plain text
                    Toast.makeText(clipboard_MANAGER.this, "Data is not a Plain text", Toast.LENGTH_SHORT).show();

                } else {

                    // Clipboard has plain text
                    ClipData.Item item = clipboard.getPrimaryClip().getItemAt(0);
                    pasteData = item.getText().toString();

                    // setText the clipboard data
                    editText.setText(pasteData);
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