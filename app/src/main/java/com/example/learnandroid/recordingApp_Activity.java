package com.example.learnandroid;

import static android.Manifest.permission.RECORD_AUDIO;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class recordingApp_Activity extends AppCompatActivity {

    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;


    String Javacode ="\n" +
            "import ...\n" +
            "\n" +
            "public class RecodingApp extends AppCompatActivity {\n" +
            "\n" +
            "    Button buttonStart, buttonStop, buttonPlayLastRecordAudio,\n" +
            "            buttonStopPlayingRecording ;\n" +
            "    String AudioSavePathInDevice = null;\n" +
            "    MediaRecorder mediaRecorder ;\n" +
            "    Random random ;\n" +
            "    String RandomAudioFileName = \"Android\";\n" +
            "    public static final int RequestPermissionCode = 1;\n" +
            "    MediaPlayer mediaPlayer ;\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.recodingapp);\n" +
            "      \n" +
            "        buttonStart = (Button) findViewById(R.id.btn1);\n" +
            "        buttonStop = (Button) findViewById(R.id.btn2);\n" +
            "        buttonPlayLastRecordAudio = (Button) findViewById(R.id.btn3);\n" +
            "        buttonStopPlayingRecording = (Button)findViewById(R.id.btn4);\n" +
            "        buttonStop.setEnabled(false);\n" +
            "        buttonPlayLastRecordAudio.setEnabled(false);\n" +
            "        buttonStopPlayingRecording.setEnabled(false);\n" +
            "        random = new Random();\n" +
            "        buttonStart.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                if(checkPermission()) {\n" +
            "                    AudioSavePathInDevice =\n" +
            "                            Environment.getExternalStorageDirectory().getAbsolutePath() + \"/\" +\n" +
            "                                    CreateRandomAudioFileName(5) + \"AudioRecording.3gp\";\n" +
            "                    MediaRecorderReady();\n" +
            "                    try {\n" +
            "                        mediaRecorder.prepare();\n" +
            "                        mediaRecorder.start();\n" +
            "                    } catch (IllegalStateException e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    } catch (IOException e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "                    buttonStart.setEnabled(false);\n" +
            "                    buttonStop.setEnabled(true);\n" +
            "                    Toast.makeText(RecodingApp.this, \"Recording started\", Toast.LENGTH_LONG).show();\n" +
            "                } else {\n" +
            "                    requestPermission();\n" +
            "                }\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "        buttonStop.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                mediaRecorder.stop();\n" +
            "                buttonStop.setEnabled(false);\n" +
            "                buttonPlayLastRecordAudio.setEnabled(true);\n" +
            "                buttonStart.setEnabled(true);\n" +
            "                buttonStopPlayingRecording.setEnabled(false);\n" +
            "                Toast.makeText(RecodingApp.this, \"Recording Completed\",\n" +
            "                        Toast.LENGTH_LONG).show();\n" +
            "            }\n" +
            "        });\n" +
            "        buttonPlayLastRecordAudio.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) throws IllegalArgumentException,\n" +
            "                    SecurityException, IllegalStateException {\n" +
            "                buttonStop.setEnabled(false);\n" +
            "                buttonStart.setEnabled(false);\n" +
            "                buttonStopPlayingRecording.setEnabled(true);\n" +
            "                mediaPlayer = new MediaPlayer();\n" +
            "                try {\n" +
            "                    mediaPlayer.setDataSource(AudioSavePathInDevice);\n" +
            "                    mediaPlayer.prepare();\n" +
            "                } catch (IOException e) {\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "                mediaPlayer.start();\n" +
            "                Toast.makeText(RecodingApp.this, \"Recording Playing\",\n" +
            "                        Toast.LENGTH_LONG).show();\n" +
            "            }\n" +
            "        });\n" +
            "        buttonStopPlayingRecording.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                buttonStop.setEnabled(false);\n" +
            "                buttonStart.setEnabled(true);\n" +
            "                buttonStopPlayingRecording.setEnabled(false);\n" +
            "                buttonPlayLastRecordAudio.setEnabled(true);\n" +
            "                if(mediaPlayer != null){\n" +
            "                    mediaPlayer.stop();\n" +
            "                    mediaPlayer.release();\n" +
            "                    MediaRecorderReady();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n" +
            "    public void MediaRecorderReady(){\n" +
            "        mediaRecorder=new MediaRecorder();\n" +
            "        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);\n" +
            "        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);\n" +
            "        mediaRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);\n" +
            "        mediaRecorder.setOutputFile(AudioSavePathInDevice);\n" +
            "    }\n" +
            "    public String CreateRandomAudioFileName(int string){\n" +
            "        StringBuilder stringBuilder = new StringBuilder( string );\n" +
            "        int i = 0 ;\n" +
            "        while(i < string ) {\n" +
            "            stringBuilder.append(RandomAudioFileName.\n" +
            "                    charAt(random.nextInt(RandomAudioFileName.length())));\n" +
            "            i++ ;\n" +
            "        }\n" +
            "        return stringBuilder.toString();\n" +
            "    }\n" +
            "    private void requestPermission() {\n" +
            "        ActivityCompat.requestPermissions(RecodingApp.this, new\n" +
            "                String[]{WRITE_EXTERNAL_STORAGE, RECORD_AUDIO}, RequestPermissionCode);\n" +
            "    }\n" +
            "    @Override\n" +
            "    public void onRequestPermissionsResult(int requestCode,\n" +
            "                                           String permissions[], int[] grantResults) {\n" +
            "        switch (requestCode) {\n" +
            "            case RequestPermissionCode:\n" +
            "                if (grantResults.length> 0) {\n" +
            "                    boolean StoragePermission = grantResults[0] == PackageManager.PERMISSION_GRANTED;\n" +
            "                    boolean RecordPermission = grantResults[1] == PackageManager.PERMISSION_GRANTED;\n" +
            "                }\n" +
            "                break;\n" +
            "        }\n" +
            "    }\n" +
            "    public boolean checkPermission() {\n" +
            "        int result = ContextCompat.checkSelfPermission(getApplicationContext(),\n" +
            "                WRITE_EXTERNAL_STORAGE);\n" +
            "        int result1 = ContextCompat.checkSelfPermission(getApplicationContext(),\n" +
            "                RECORD_AUDIO);\n" +
            "        return result == PackageManager.PERMISSION_GRANTED &&\n" +
            "                result1 == PackageManager.PERMISSION_GRANTED;\n" +
            "    }\n" +
            "}";


    String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<RelativeLayout \n" +
            "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "   android:id=\"@+id/container\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"match_parent\"\n" +
            "   tools:context=\".RecordingApp\">\n" +
            "\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:gravity=\"center\"\n" +
            "        android:orientation=\"vertical\">\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/btn1\"\n" +
            "            android:layout_marginTop=\"15dp\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Start Recording\"/>\n" +
            "        <Button\n" +
            "            android:id=\"id/btn2\"\n" +
            "            android:layout_marginTop=\"15dp\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Stop Recording\"/>\n" +
            "        <Button\n" +
            "            android:id=\"@+id/btn3\"\n" +
            "            android:layout_marginTop=\"15dp\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Play Record\"/>\n" +
            "        <Button\n" +
            "            android:id=\"@+id/btn4\"\n" +
            "            android:layout_marginTop=\"15dp\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Stop Playing Record\"/>\n" +
            "\n" +
            "    </LinearLayout>\n" +
            "\n" +
            "</RelativeLayout>";

    String other = "// add following permission in AndroidManifest.xml\n" +
            "1    <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"/>\n" +
            "2    <uses-permission android:name=\"android.permission.RECORD_AUDIO\" />\n" +
            "3    <uses-permission android:name=\"android.permission.STORAGE\" />";
    String other_heading = "Manifest";
    Button buttonStart, buttonStop, buttonPlayLastRecordAudio, buttonStopPlayingRecording;
    String AudioSavePathInDevice = null;
    MediaRecorder mediaRecorder;
    Random random;
    String RandomAudioFileName = "Android";
    public static final int RequestPermissionCode = 1;
    MediaPlayer mediaPlayer;

    FloatingActionButton show_code_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording_app);

        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);

        show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(recordingApp_Activity.this, source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode",xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Recording App");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        buttonStart = (Button) findViewById(R.id.btn1);
        buttonStop = (Button) findViewById(R.id.btn2);
        buttonPlayLastRecordAudio = (Button) findViewById(R.id.btn3);
        buttonStopPlayingRecording = (Button) findViewById(R.id.btn4);
        buttonStop.setEnabled(false);
        buttonPlayLastRecordAudio.setEnabled(false);
        buttonStopPlayingRecording.setEnabled(false);
        random = new Random();
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkPermission()) {
                    AudioSavePathInDevice = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + CreateRandomAudioFileName(5) + "AudioRecording.3gp";
                    MediaRecorderReady();
                    try {
                        mediaRecorder.prepare();
                        mediaRecorder.start();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    buttonStart.setEnabled(false);
                    buttonStop.setEnabled(true);
                    Toast.makeText(recordingApp_Activity.this, "Recording started", Toast.LENGTH_LONG).show();
                } else {
                    requestPermission();
                }

            }
        });
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaRecorder.stop();
                buttonStop.setEnabled(false);
                buttonPlayLastRecordAudio.setEnabled(true);
                buttonStart.setEnabled(true);
                buttonStopPlayingRecording.setEnabled(false);
                Toast.makeText(recordingApp_Activity.this, "Recording Completed", Toast.LENGTH_LONG).show();
            }
        });
        buttonPlayLastRecordAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) throws IllegalArgumentException, SecurityException, IllegalStateException {
                buttonStop.setEnabled(false);
                buttonStart.setEnabled(false);
                buttonStopPlayingRecording.setEnabled(true);
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource(AudioSavePathInDevice);
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mediaPlayer.start();
                Toast.makeText(recordingApp_Activity.this, "Recording Playing", Toast.LENGTH_LONG).show();
            }
        });
        buttonStopPlayingRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonStop.setEnabled(false);
                buttonStart.setEnabled(true);
                buttonStopPlayingRecording.setEnabled(false);
                buttonPlayLastRecordAudio.setEnabled(true);
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    MediaRecorderReady();
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

    public void MediaRecorderReady() {
        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        mediaRecorder.setOutputFile(AudioSavePathInDevice);
    }

    public String CreateRandomAudioFileName(int string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int i = 0;
        while (i < string) {
            stringBuilder.append(RandomAudioFileName.charAt(random.nextInt(RandomAudioFileName.length())));
            i++;
        }
        return stringBuilder.toString();
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(recordingApp_Activity.this, new String[]{WRITE_EXTERNAL_STORAGE, RECORD_AUDIO}, RequestPermissionCode);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case RequestPermissionCode:
                if (grantResults.length > 0) {
                    boolean StoragePermission = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                    boolean RecordPermission = grantResults[1] == PackageManager.PERMISSION_GRANTED;
                    if (StoragePermission && RecordPermission) {
                        Toast.makeText(recordingApp_Activity.this, "Permission Granted", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(recordingApp_Activity.this, "Permission Denied", Toast.LENGTH_LONG).show();
                    }
                }
                break;
        }
    }

    public boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(getApplicationContext(), WRITE_EXTERNAL_STORAGE);
        int result1 = ContextCompat.checkSelfPermission(getApplicationContext(), RECORD_AUDIO);
        return result == PackageManager.PERMISSION_GRANTED && result1 == PackageManager.PERMISSION_GRANTED;
    }
}
//if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
//        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, MY_PERMISSIONS_RECORD_AUDIO);
//        }