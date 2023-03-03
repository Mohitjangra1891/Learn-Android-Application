package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class sevice_IN_ADVANCE extends AppCompatActivity {
    private boolean state = true;
    private Button button;
    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevice_in_advance);
        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);
        String Javacode="import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    private boolean state = true;\n" +
                "    private Button button;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "\n" +
                "        button = findViewById(R.id.button);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Intent intent = new Intent(getApplicationContext(), MyService.class);\n" +
                "                if (state) {\n" +
                "\n" +
                "                    // Start the service\n" +
                "                    startService(intent);\n" +
                "                    button.setText(\"Stop Service\");\n" +
                "                    state = false;\n" +
                "\n" +
                "                } else {\n" +
                "\n" +
                "                    // stop the Service\n" +
                "                    stopService(intent);\n" +
                "                    button.setText(\"Start Service\");\n" +
                "                    state = true;\n" +
                "\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onPause() {\n" +
                "        super.onPause();\n" +
                "\n" +
                "        // Stop the Service when activity Paused , not service will  run in  until the Destroy\n" +
                "        Intent intent = new Intent(getApplicationContext(), MyService.class);\n" +
                "        stopService(intent);\n" +
                "        state = true;\n" +
                "        button.setText(\"Start Service\");\n" +
                "\n" +
                "    }\n" +
                "}";
        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "\n" +
                "    <Button\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_centerInParent=\"true\"\n" +
                "        android:layout_margin=\"30dp\"\n" +
                "        android:text=\"start service\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        android:backgroundTint=\"@color/btn_color\"\n" +
                "        android:id=\"@+id/button\"/>\n" +
                "\n" +
                "</RelativeLayout>";
        String other = "import android.app.Service;\n" +
                "import android.content.Intent;\n" +
                "import android.media.MediaPlayer;\n" +
                "import android.os.IBinder;\n" +
                "import android.provider.Settings;\n" +
                "\n" +
                "public class MyService extends Service {\n" +
                "\n" +
                "    MediaPlayer mediaPlayer;\n" +
                "\n" +
                "    public MyService() {\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public IBinder onBind(Intent intent) {\n" +
                "\n" +
                "        // TODO: Return the communication channel to the service.\n" +
                "        throw new UnsupportedOperationException(\"Not yet implemented\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onCreate() {\n" +
                "        super.onCreate();\n" +
                "\n" +
                "\n" +
                "        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);\n" +
                "        // You can add Your Audio file instead of  RINGTONE\n" +
                "        // To add your audio file create \"raw\" recourse directory in res\n" +
                "        // Then add your audio file inside it [res/raw/Example.mp3]\n" +
                "        // Now add this code line instead of above line\n" +
                "        // mediaPlayer = MediaPlayer.create(this, R.raw.Example.mp3);\n" +
                "\n" +
                "        mediaPlayer.setLooping(true);\n" +
                "        mediaPlayer.setVolume(1.0f, 1.0f);\n" +
                "        // Volume for leftVolume and rightVolume\n" +
                "\n" +
                "        // Volume , Right side only --> mediaPlayer.setVolume(0.0f , 1.0f); \n" +
                "        // Volume , Left side only --> mediaPlayer.setVolume(1.0f , 0.0f); \n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public int onStartCommand(Intent intent, int flags, int startId) {\n" +
                "\n" +
                "        mediaPlayer.start();\n" +
                "        return START_STICKY;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onDestroy() {\n" +
                "        super.onDestroy();\n" +
                "\n" +
                "        if (mediaPlayer != null && mediaPlayer.isPlaying()) {\n" +
                "            mediaPlayer.stop();\n" +
                "            mediaPlayer.release();\n" +
                "        }\n" +
                "    }";
        String other_heading = "MyService.java";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Services");
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
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MyService.class);
                if (state) {

                    // Start the service
                    startService(intent);
                    button.setText("Stop Service");
                    state = false;

                } else {

                    // stop the Service
                    stopService(intent);
                    button.setText("Start Service");
                    state = true;


                }

            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();

        // Stop the Service when activity Paused , not service will  run in  until the Destroy
        Intent intent = new Intent(getApplicationContext(), MyService.class);
        stopService(intent);
        state = true;
        button.setText("Start Service");

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