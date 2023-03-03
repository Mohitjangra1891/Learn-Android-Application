package com.example.learnandroid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class mediaPlayer_Activity extends AppCompatActivity {
    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;


    FloatingActionButton show_code_button;

    String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.media.MediaPlayer;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.ImageButton;\n" +
            "import android.widget.ImageView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "ImageView btnplay,btnstop,btnpause;\n" +
            "boolean playing= false;\n" +
            "\t\t\t\t@Override\n" +
            "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
            "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
            "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
            "\t\t\t\t\tbtnplay=(ImageView) findViewById(R.id.btnplay);\n" +
            "\t\t\t\t\tbtnpause=(ImageView)findViewById(R.id.btnpause);\n" +
            "\t\t\t\t\tbtnstop=(ImageView) findViewById(R.id.btnstop);\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\t//creating media player\n" +
            "\t\t\t\t\tfinal MediaPlayer mp=MediaPlayer.create(AudioActivity.this,R.raw.audio);\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\tbtnplay.setOnClickListener(new View.OnClickListener() {\n" +
            "\t\t\t\t\t\t\t\t@Override\n" +
            "\t\t\t\t\t\t\t\tpublic void onClick(View v) {\n" +
            "\t\t\t\t\t\t\t\t\t\t\tif(!playing) {\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tmp.start();\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tplaying = true;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t});\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\tbtnpause.setOnClickListener(new View.OnClickListener() {\n" +
            "\t\t\t\t\t\t\t\t@Override\n" +
            "\t\t\t\t\t\t\t\tpublic void onClick(View v) {\n" +
            "\t\t\t\t\t\t\t\t\t\t\tif(playing) {\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tmp.pause();\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tplaying = false;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t});\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t\tbtnstop.setOnClickListener(new View.OnClickListener() {\n" +
            "\t\t\t\t\t\t\t\t@Override\n" +
            "\t\t\t\t\t\t\t\tpublic void onClick(View v) {\n" +
            "\t\t\t\t\t\t\t\t\t\t\tif(playing) {\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tmp.stop();\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\tplaying = false;\n" +
            "\t\t\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t});\n" +
            "\t\t\t\t}\n" +
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
            "\t\t\t\t<ImageView\n" +
            "\t\t\t\t\tandroid:id=\"@+id/textView1\"\n" +
            "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
            "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
            "\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
            "\t\t\t\t\tandroid:src=\"@drawable/speakers\"\n" +
            "\t\t\t\t\tandroid:text=\"Audio Controller\" />\n" +
            "\t\t\t\t\t\n" +
            "\t\t\t\t<LinearLayout\n" +
            "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
            "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
            "\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
            "\t\t\t\t\tandroid:orientation=\"horizontal\">\n" +
            "\n" +
            "\t\t\t\t\t\t\t<ImageView\n" +
            "\t\t\t\t\t\t\t\tandroid:id=\"@+id/btnplay\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
            "\t\t\t\t\t\t\t\tandroid:src=\"@drawable/play\"\n" +
            "\t\t\t\t\t\t\t\t/>\n" +
            "\t\t\t\t\t\t\t<ImageView\n" +
            "\t\t\t\t\t\t\t\tandroid:id=\"@+id/btnpause\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
            "\t\t\t\t\t\t\t\tandroid:src=\"@drawable/pause\"\n" +
            "\t\t\t\t\t\t\t\t/>\n" +
            "\n" +
            "\t\t\t\t\t\t\t<ImageView\n" +
            "\t\t\t\t\t\t\t\tandroid:id=\"@+id/btnstop\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
            "\t\t\t\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
            "\t\t\t\t\t\t\t\tandroid:src=\"@drawable/stop\"\n" +
            "\t\t\t\t\t\t\t\tandroid:text=\"stop\" />\n" +
            "\t\t\t\t\t\t\t\t\n" +
            "\t\t\t</LinearLayout>\n" +
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
    String other_heading = "Manifest";
    ImageView btnplay,btnstop,btnpause;
    boolean playing= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);


        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView vie = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        vie.load();
        banner.addView(vie);

        show_code_button=findViewById(R.id.code_button);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Music Player");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(mediaPlayer_Activity.this,source_CODE_Activity.class);
                inte.putExtra("javacode",Javacode);
                inte.putExtra("xmlcode",xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });


        btnplay=(ImageView) findViewById(R.id.btnplay);
        btnpause=(ImageView)findViewById(R.id.btnpause);
        btnstop=(ImageView) findViewById(R.id.btnstop);

        //creating media player
        final MediaPlayer mp=MediaPlayer.create(mediaPlayer_Activity.this,R.raw.audio);

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!playing) {
                    mp.start();
                    playing = true;
                }
            }
        });

        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playing) {
                    mp.pause();
                    playing = false;
                }
            }
        });

        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playing) {
                    mp.stop();
                    playing = false;
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
//        // add event for back button pressed
//        Intent intent = new Intent(this, MainActivity.class);
//        finish();
//        startActivity(intent);
        return true;
    }
}