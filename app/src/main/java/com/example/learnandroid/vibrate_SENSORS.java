package com.example.learnandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class vibrate_SENSORS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate_sensors);

        String Javacode="import android.content.Context;\n" +
                "import android.os.Build;\n" +
                "import android.os.Bundle;\n" +
                "import android.os.VibrationEffect;\n" +
                "import android.os.Vibrator;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
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
                "        Button button = findViewById(R.id.button);\n" +
                "        Button button1 = findViewById(R.id.button2);\n" +
                "\n" +
                "        // Get instance of Vibrator from current Context\n" +
                "        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);\n" +
                "\n" +
                "        if (vibrator.hasVibrator()) {\n" +
                "\n" +
                "            // Your device has Vibrator , Then You can Vibrate\n" +
                "            Toast.makeText(this, \"You can Vibrate your Device\", Toast.LENGTH_SHORT).show();\n" +
                "        } else {\n" +
                "            // Your device hasn't Vibrator\n" +
                "            Toast.makeText(this, \"You cannot Vibrate your Device\", Toast.LENGTH_SHORT).show();\n" +
                "            button.setEnabled(false);\n" +
                "            button1.setEnabled(false);\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "\n" +
                "                // Get instance of Vibrator from current Context\n" +
                "                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);\n" +
                "\n" +
                "                // Vibrate for 500 milliseconds --> 0.5 seconds\n" +
                "                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {\n" +
                "\n" +
                "                    // According to docs A VibrationEffect describes a haptic effect to be performed by a Vibrator\n" +
                "                    v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));\n" +
                "                } else {\n" +
                "                    v.vibrate(500);\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        button1.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "\n" +
                "                // Get instance of Vibrator from current Context\n" +
                "                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);\n" +
                "\n" +
                "                // Start vibrate without delay\n" +
                "                // Vibrate foe 200 milliseconds\n" +
                "                // sleep for 300 milliseconds\n" +
                "                // vibrate , sleep , vibrate , sleep ..\n" +
                "                long[] pattern = {0, 200, 300, 200, 300, 200, 300};\n" +
                "\n" +
                "                // 2nd parameter --> According to docs the index into pattern at which to repeat, or -1 if you don't want to repeat\n" +
                "                // If you use 0 instead of -1 , it will vibrate  indefinitely\n" +
                "                // Then just call the v.cancel(); to cancel vibrate\n" +
                "                v.vibrate(pattern, -1);\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "}";
        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".vibrate_SENSORS\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_margin=\"30dp\"\n" +
                "        android:paddingHorizontal=\"40dp\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:text=\"vibrate for given time\"\n" +
                "        android:backgroundTint=\"@color/btn_color\"\n" +
                "        android:id=\"@+id/button\"/>\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_below=\"@id/button\"\n" +
                "        android:paddingHorizontal=\"40dp\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginStart=\"30dp\"\n" +
                "        android:layout_marginTop=\"30dp\"\n" +
                "        android:layout_marginEnd=\"30dp\"\n" +
                "        android:layout_marginBottom=\"30dp\"\n" +
                "        android:backgroundTint=\"@color/btn_color\"\n" +
                "        android:text=\"vibrate patterns\" />\n" +
                "\n" +
                "</RelativeLayout>";
        String other = "-- Add permission to manifests --\n" +
                " <uses-permission android:name=\"android.permission.VIBRATE\" />\n" +
                "\n<activity\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Vibrate");
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




        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);

        // Get instance of Vibrator from current Context
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        if (vibrator.hasVibrator()) {

            // Your device has Vibrator , Then You can Vibrate
            Toast.makeText(this, "You can Vibrate your Device", Toast.LENGTH_SHORT).show();
        } else {
            // Your device hasn't Vibrator
            Toast.makeText(this, "You cannot Vibrate your Device", Toast.LENGTH_SHORT).show();
            button.setEnabled(false);
            button1.setEnabled(false);

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get instance of Vibrator from current Context
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                // Vibrate for 500 milliseconds --> 0.5 seconds
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                    // According to docs A VibrationEffect describes a haptic effect to be performed by a Vibrator
                    v.vibrate(VibrationEffect.createOneShot(500, VibrationEffect.DEFAULT_AMPLITUDE));
                } else {
                    v.vibrate(500);
                }


            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get instance of Vibrator from current Context
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                // Start vibrate without delay
                // Vibrate foe 200 milliseconds
                // sleep for 300 milliseconds
                // vibrate , sleep , vibrate , sleep ..
                long[] pattern = {0, 200, 300, 200, 300, 200, 300};

                // 2nd parameter --> According to docs the index into pattern at which to repeat, or -1 if you don't want to repeat
                // If you use 0 instead of -1 , it will vibrate  indefinitely
                // Then just call the v.cancel(); to cancel vibrate
                v.vibrate(pattern, -1);

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