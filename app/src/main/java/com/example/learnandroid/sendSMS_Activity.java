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

public class sendSMS_Activity extends AppCompatActivity {
    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;

    TextView editTextTo,editTextSubject,editTextMessage;
    Button sendEmail;
    FloatingActionButton show_code_button;
    String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    EditText editTextTo,editTextSubject,editTextMessage;\n" +
            "    Button sendEmail;\n" +
            "\t\t\t\t@Override\n" +
            "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
            "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
            "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
            "\t\t\t\t\teditTextTo=(EditText)findViewById(R.id.edtemailto);\n" +
            "\t\t\t\t\teditTextSubject=(EditText)findViewById(R.id.edtemailsub);\n" +
            "\t\t\t\t\teditTextMessage=(EditText)findViewById(R.id.edtemailmsg);\n" +
            "\t\t\t\t\tsendEmail=(Button)findViewById(R.id.btnemail);\n" +
            "\t\t\t\t\t\tsendEmail.setOnClickListener(new View.OnClickListener(){\n" +
            "\t\t\t\t\t\t\t\t\t@Override\n" +
            "\t\t\t\t\t\t\t\t\tpublic void onClick(View arg0) {\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tString to=editTextTo.getText().toString();\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tString subject=editTextSubject.getText().toString();\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tString message=editTextMessage.getText().toString();\n" +
            "\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tIntent email = new Intent(Intent.ACTION_SEND);\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\temail.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\temail.putExtra(Intent.EXTRA_SUBJECT, subject);\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\temail.putExtra(Intent.EXTRA_TEXT, message);\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\temail.setType(\"message/rfc822\");\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\tstartActivity(Intent.createChooser(email, \"Choose an Email client :\"));\n" +
            "\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t});\n" +
            "\t\t\t\t\t}\n" +
            "}";

            String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                    "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                    "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                    "    android:layout_width=\"match_parent\"\n" +
                    "    android:layout_height=\"match_parent\"\n" +
                    "    android:orientation=\"vertical\"\n" +
                    "    android:gravity=\"center\"\n" +
                    "    tools:context=\".MainActivity\">\n" +
                    "\t\n" +
                    "\t\t\t\t<EditText\n" +
                    "\t\t\t\t\tandroid:id=\"@+id/edtemailto\"\n" +
                    "\t\t\t\t\tandroid:hint=\"Reciepient\"\n" +
                    "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                    "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                    "\t\t\t\t\tandroid:layout_margin=\"10dp\"\n" +
                    "\t\t\t\t\tandroid:ems=\"10\" />\n" +
                    "\n" +
                    "\t\t\t\t<EditText\n" +
                    "\t\t\t\t\tandroid:id=\"@+id/edtemailsub\"\n" +
                    "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                    "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                    "\t\t\t\t\tandroid:layout_margin=\"10dp\"\n" +
                    "\t\t\t\t\tandroid:hint=\"Subject\"\n" +
                    "\t\t\t\t\tandroid:ems=\"10\" >\n" +
                    "\t\t\t\t</EditText>\n" +
                    "\n" +
                    "\t\t\t\t<EditText\n" +
                    "\t\t\t\t\tandroid:id=\"@+id/edtemailmsg\"\n" +
                    "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                    "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                    "\t\t\t\t\tandroid:ems=\"10\"\n" +
                    "\t\t\t\t\tandroid:layout_margin=\"10dp\"\n" +
                    "\t\t\t\t\tandroid:hint=\"Message Body\"\n" +
                    "\t\t\t\t\tandroid:inputType=\"textMultiLine\" />\n" +
                    "\t\t\t\t\t\n" +
                    "\t\t\t\t<Button\n" +
                    "\t\t\t\t\tandroid:id=\"@+id/btnemail\"\n" +
                    "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                    "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                    "\t\t\t\t\tandroid:padding=\"20dp\"\n" +
                    "\t\t\t\t\tandroid:layout_marginTop=\"20dp\"\n" +
                    "\t\t\t\t\tandroid:textColor=\"@color/White\"\n" +
                    "\t\t\t\t\tandroid:textSize=\"20dp\"\n" +
                    "\t\t\t\t\tandroid:text=\"Compose Email\" />\n" +
                    "\n" +
                    "</LinearLayout>";

    String other = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    package=\".androidexample\">\n" +
            "\t\n" +
            "\t<uses-permission android:name=\"android.permission.INTERNET\" />\n" +
            "\t\n" +
            "\t<activity\n" +
            "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
            "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
            "\t\t\t\t\t\t<intent-filter>\n" +
            "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
            "\n" +
            "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
            "\t\t\t\t\t\t</intent-filter>\n" +
            "     </activity>\n" +
            "</manifest>";
    String other_heading = "Manifest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_sms);

        show_code_button=findViewById(R.id.code_button);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Send SMS and Email");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        editTextTo=(EditText)findViewById(R.id.edtemailto);
        editTextSubject=(EditText)findViewById(R.id.edtemailsub);
        editTextMessage=(EditText)findViewById(R.id.edtemailmsg);
        sendEmail=(Button)findViewById(R.id.btnemail);
        sendEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                String to=editTextTo.getText().toString();
                String subject=editTextSubject.getText().toString();
                String message=editTextMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
            }
        });
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(sendSMS_Activity.this,source_CODE_Activity.class);
                inte.putExtra("javacode",Javacode);         inte.putExtra("xmlcode",xmlcode);
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
//        // add event for back button pressed
//        Intent intent = new Intent(this, MainActivity.class);
//        finish();
//        startActivity(intent);
        return true;
    }
}