package com.example.learnandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class alert_Dailog extends AppCompatActivity {
    private AlertDialog alertDialog;
    private AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dailog);

        String Javacode = "import android.support.v7.app.AlertDialog;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "Button btnalrt;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        btnalrt=(Button)findViewById(R.id.btnalrt);\n" +
                "        btnalrt.setOnClickListener(new View.OnClickListener() {\n" +
                "                        @Override\n" +
                "                        public void onClick(View view) {\n" +
                "                            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);\n" +
                "                            // Setting Alert Dialog Title\n" +
                "                            alertDialogBuilder.setTitle(\"Confirm Exit..!!!\");\n" +
                "                            // Icon Of Alert Dialog\n" +
                "                            alertDialogBuilder.setIcon(R.drawable.alertdialog);\n" +
                "                            // Setting Alert Dialog Message\n" +
                "                            alertDialogBuilder.setMessage(\"Are you sure,You want to exit\");\n" +
                "                            alertDialogBuilder.setCancelable(false);\n" +
                "\n" +
                "                            alertDialogBuilder.setPositiveButton(\"Yes\", new DialogInterface.OnClickListener() {\n" +
                "\n" +
                "                                @Override\n" +
                "                                public void onClick(DialogInterface arg0, int arg1) {\n" +
                "                                    finish();\n" +
                "                                }\n" +
                "                            });\n" +
                "\n" +
                "                            alertDialogBuilder.setNegativeButton(\"No\", new DialogInterface.OnClickListener() {\n" +
                "                                @Override\n" +
                "                                public void onClick(DialogInterface dialog, int which) {\n" +
                "                                    Toast.makeText(getApplicationContext(),\"You clicked on No\",Toast.LENGTH_SHORT).show();\n" +
                "                                }\n" +
                "                            });\n" +
                "                            alertDialogBuilder.setNeutralButton(\"Cancel\", new DialogInterface.OnClickListener() {\n" +
                "                                @Override\n" +
                "                                public void onClick(DialogInterface dialog, int which) {\n" +
                "                                    Toast.makeText(getApplicationContext(),\"You clicked on Cancel\",Toast.LENGTH_SHORT).show();\n" +
                "                                }\n" +
                "                            });\n" +
                "\n" +
                "                            AlertDialog alertDialog = alertDialogBuilder.create();\n" +
                "                            alertDialog.show();\n" +
                "                        }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "    \n" +
                "}";
        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t\t<Button\n" +
                "\t\t\t\t\tandroid:text=\"Click Here\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:padding=\"20dp\"\n" +
                "\t\t\t\t\tandroid:id=\"@+id/btnalrt\"\n" +
                "\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\t\tandroid:textStyle=\"normal|bold\"\n" +
                "\t\t\t\t\tandroid:textColor=\"@color/White\"\n" +
                "\t\t\t\t\tandroid:layout_margin=\"30dp\"/>\n" +
                "\n" +
                "\t\t\t\t<TextView\n" +
                "\t\t\t\t\tandroid:text=\"Click Button to show dialogbox\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:textSize=\"18sp\"\n" +
                "\t\t\t\t\tandroid:textStyle=\"normal|bold\"\n" +
                "\t\t\t\t\tandroid:gravity=\"center\" />\n" +
                "</LinearLayout>";


        String other = "<activity\n" +
                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
                "\t\t\t\t\t\t<intent-filter>\n" +
                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "\t\t\t\t\t\t</intent-filter>\n" +
                "        </activity>";
        String other_heading = "Manifest";        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("AlertDialog");
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


                builder = new AlertDialog.Builder(alert_Dailog.this);
                builder.setTitle("Simple Alert Dialog"); // set Title
                builder.setMessage("Do you need to back to Menu");  // set message
                builder.setCancelable(true); //  Sets whether the dialog is cancelable or not
                builder.setIcon(R.drawable.alertdialog);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Replace your Own Action

                                // Cancel the AlertDialog
                                alertDialog.cancel();
                                finish();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                // Replace your Own Action

                                // Cancel the AlertDialog
                                alertDialog.cancel();

                            }
                        });


                alertDialog = builder.create();
                alertDialog.show();


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