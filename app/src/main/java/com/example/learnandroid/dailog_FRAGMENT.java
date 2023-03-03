package com.example.learnandroid;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class dailog_FRAGMENT extends AppCompatActivity {
    private AlertDialog alertDialog;
    private AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailog_fragment);
        String Javacode="import android.os.Bundle;\n" +
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
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                // Create an instance of the dialog fragment and show it\n" +
                "                FragmentDialog dialog = new FragmentDialog();\n" +
                "                dialog.show(getSupportFragmentManager(), \"FragmentDialog\");\n" +
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
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/button\"\n" +
                        "        android:layout_width=\"0dp\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginStart=\"32dp\"\n" +
                        "        android:layout_marginEnd=\"32dp\"\n" +
                        "        android:text=\"Click Here\"\n" +
                        "        android:textSize=\"18sp\"\n" +
                        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                        "\n" +
                        "\n" +
                        "</androidx.constraintlayout.widget.ConstraintLayout>";

        String other = "import android.app.AlertDialog;\n" +
                "import android.app.Dialog;\n" +
                "import android.content.Context;\n" +
                "import android.content.DialogInterface;\n" +
                "import android.os.Build;\n" +
                "import android.os.Bundle;\n" +
                "import android.os.VibrationEffect;\n" +
                "import android.os.Vibrator;\n" +
                "\n" +
                "import androidx.fragment.app.DialogFragment;\n" +
                "\n" +
                "public class FragmentDialog extends DialogFragment {\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    public Dialog onCreateDialog(Bundle savedInstanceState) {\n" +
                "\n" +
                "        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());\n" +
                "        builder.setTitle(\"Dialog Fragment\");\n" +
                "        builder.setMessage(\"Do you need to Vibrate Your Device ?\");\n" +
                "        builder.setIcon(R.mipmap.app_icon_foreground);\n" +
                "\n" +
                "        builder.setPositiveButton(\"Yes\", new DialogInterface.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(DialogInterface dialog, int which) {\n" +
                "\n" +
                "                // Replace your action here\n" +
                "\n" +
                "                // Refer to Vibrate Part to more..\n" +
                "                Vibrator v = (Vibrator) getActivity().getSystemService(Context.VIBRATOR_SERVICE);\n" +
                "\n" +
                "                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {\n" +
                "                    v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));\n" +
                "                } else {\n" +
                "                    v.vibrate(500);\n" +
                "                }\n" +
                "\n" +
                "                dialog.cancel();\n" +
                "            }\n" +
                "        });\n" +
                "        builder.setNegativeButton(\"No\", new DialogInterface.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(DialogInterface dialog, int which) {\n" +
                "\n" +
                "                //cancel the dialog\n" +
                "                dialog.cancel();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        AlertDialog alertDialog = builder.create();\n" +
                "        return alertDialog;\n" +
                "    }\n" +
                "}";
        String other_heading = "DailogFragment.java";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Dailog Fragment");
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


                builder = new AlertDialog.Builder(dailog_FRAGMENT.this);
                builder.setTitle("Dialog Fragment"); // set Title
                builder.setMessage("Do you need to Vibrate your Device");  // set message
                builder.setCancelable(true); //  Sets whether the dialog is cancelable or not
                builder.setIcon(R.drawable.alertdialog);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Replace your Own Action

                                // Cancel the AlertDialog
                                Vibrator v=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                                    v.vibrate(VibrationEffect.createOneShot(500,VibrationEffect.DEFAULT_AMPLITUDE));

                                }
                                else {
                                    v.vibrate(500);
                                }
                                alertDialog.cancel();


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