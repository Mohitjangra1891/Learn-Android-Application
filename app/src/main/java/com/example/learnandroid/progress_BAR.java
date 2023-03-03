package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class progress_BAR extends AppCompatActivity {
    TextView textView;
    ProgressBar progressBar;
    Button button;
    Handler handler;
    int progresscount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.ProgressBar;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    ProgressBar progressbarDemo;\n" +
                "    Button btnprogressbar;\n" +
                "    private int progressStatus = 0;\n" +
                "    private Handler handler = new Handler();\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        progressbarDemo = (ProgressBar) findViewById(R.id.ProgressBarDemo);\n" +
                "        btnprogressbar= (Button) findViewById(R.id.btnprogressbar);\n" +
                "        // perform click event on button\n" +
                "        btnprogressbar.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "                new Thread(new Runnable() {\n" +
                "                    public void run() {\n" +
                "                        while (progressStatus < 100) {\n" +
                "                            progressStatus += 10;\n" +
                "\n" +
                "                            handler.post(new Runnable() {\n" +
                "                                public void run() {\n" +
                "                                    progressbarDemo.setProgress(progressStatus);\n" +
                "                                    if(progressStatus==100) {\n" +
                "                                        progressbarDemo.setProgress(progressStatus);\n" +
                "                                        Toast.makeText(getApplicationContext(), \"Download Complete\", Toast.LENGTH_SHORT).show();\n" +
                "                                    }\n" +
                "                                }\n" +
                "                            });\n" +
                "                            try {\n" +
                "                                Thread.sleep(1000);\n" +
                "                            } catch (InterruptedException e) {\n" +
                "                                e.printStackTrace();\n" +
                "                            }\n" +
                "                        }\n" +
                "                    }\n" +
                "                }).start();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "   \n" +
                "}";
        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\n" +
                "\t\t\t\t\t<ProgressBar\n" +
                "\t\t\t\t\t\tandroid:id=\"@+id/ProgressBarDemo\"\n" +
                "\t\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\tandroid:layout_margin=\"30dp\"\n" +
                "\t\t\t\t\t\tandroid:indeterminate=\"false\"\n" +
                "\t\t\t\t\t\tandroid:max=\"100\"\n" +
                "\t\t\t\t\t\tstyle=\"@style/Widget.AppCompat.ProgressBar.Horizontal\"\n" +
                "\t\t\t\t\t   />\n" +
                "\t\t\t\t\t<Button\n" +
                "\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\tandroid:textColor=\"@color/White\"\n" +
                "\t\t\t\t\t\tandroid:padding=\"10dp\"\n" +
                "\t\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\t\t\tandroid:id=\"@+id/btnprogressbar\"\n" +
                "\t\t\t\t\t\tandroid:text=\"Start\"/>\n" +
                "\t\t\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("ProgressBar");
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

        textView = (TextView) findViewById(R.id.text);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        button = (Button) findViewById(R.id.start);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (progressBar.getProgress() < 100) {
                            progressBar.setProgress(progresscount);
                            progresscount++;
                            handler.postDelayed(this, 100);
                            textView.setText("Plz wait...");
                        } else {
                            textView.setText("completed...");
                        }
                    }
                }, 100);
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