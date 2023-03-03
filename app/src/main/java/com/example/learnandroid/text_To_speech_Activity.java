package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Locale;
import java.util.Objects;


public class text_To_speech_Activity extends AppCompatActivity {

    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;


    TextToSpeech t1;
    EditText write;
    Button speakbtn;

    FloatingActionButton show_code_button;
    String Javacode = "import ...\n" +
            "\n" +
            "public class TextSpeech extends AppCompatActivity {\n" +
            "\n" +
            "    TextToSpeech t1;\n" +
            "    EditText write;\n" +
            "    Button speakbtn;\n" +
            "\n" +
            "    private TextView speechinput;\n" +
            "    private ImageButton imagebt;\n" +
            "    private final int REQ_CODE = 100;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_textspeech);\n" +
            "\n" +
            "        speechinput = (TextView)findViewById(R.id.speechinput);\n" +
            "        write=(EditText)findViewById(R.id.editText);\n" +
            "        speakbtn=(Button)findViewById(R.id.button);\n" +
            "        imagebt=(ImageButton)findViewById(R.id.imagebt);\n" +
            "\n" +
            "        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {\n" +
            "            @Override\n" +
            "            public void onInit(int status) {\n" +
            "                if(status != TextToSpeech.ERROR) {\n" +
            "                    t1.setLanguage(Locale.UK);\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        speakbtn.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                String toSpeak = write.getText().toString();\n" +
            "                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();\n" +
            "                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        imagebt.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);\n" +
            "                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);\n" +
            "                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());\n" +
            "                intent.putExtra(RecognizerIntent.EXTRA_PROMPT,\"Say something\");\n" +
            "                try{\n" +
            "                    startActivityForResult(intent, REQ_CODE);\n" +
            "                } catch (ActivityNotFoundException a){\n" +
            "                    Toast.makeText(getApplicationContext(),\"Sorry! Your device doesn't support sppech input\",Toast.LENGTH_LONG).show();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onActivityResult(int requestCode, int resultCode, Intent data) {\n" +
            "        super.onActivityResult(requestCode, resultCode, data);\n" +
            "        switch (requestCode){\n" +
            "            case REQ_CODE:{\n" +
            "                if (requestCode == RESULT_OK && null != data){\n" +
            "                    ArrayList result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);\n" +
            "                    String speechText = speechinput.getText().toString()+\"\\n\"+ result.get(0);\n" +
            "                    speechinput.setText(speechText);\n" +
            "                }\n" +
            "                break;\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public void onDestroy(){\n" +
            "        if(t1 !=null){\n" +
            "            t1.stop();\n" +
            "            t1.shutdown();\n" +
            "        }\n" +
            "        super.onDestroy();\n" +
            "    }\n" +
            "}\n";
    String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<RelativeLayout \n" +
            "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "   xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "   xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "   android:id=\"@+id/container\"\n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"match_parent\"\n" +
            "   tools:context=\".TextSpeech\">\n" +
            "\n" +
            "\n" +
            "    <EditText\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:id=\"@+id/editText\"\n" +
            "        android:layout_below=\"@+id/imageView\"\n" +
            "        android:layout_marginTop=\"46dp\"\n" +
            "        android:hint=\"Enter Text\"\n" +
            "        android:layout_alignParentRight=\"true\"\n" +
            "        android:layout_alignParentEnd=\"true\"\n" +
            "        android:layout_alignParentLeft=\"true\"\n" +
            "        android:layout_alignParentStart=\"true\"\n" +
            "        android:layout_marginRight=\"30dp\"\n" +
            "        android:layout_marginLeft=\"30dp\"\n" +
            "        android:textColor=\"#ff7aff10\"\n" +
            "        android:textColorHint=\"#ffff23d1\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Text to Speech\"\n" +
            "        android:id=\"@+id/button\"\n" +
            "        android:layout_below=\"@+id/editText\"\n" +
            "        android:layout_centerHorizontal=\"true\"\n" +
            "        android:layout_marginTop=\"46dp\" />\n" +
            "\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/speechinput\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_below=\"@+id/button\"\n" +
            "        android:layout_marginTop=\"30dp\"\n" +
            "        android:textSize=\"16dp\"\n" +
            "        android:text=\"Please Click on Mic\"\n" +
            "        android:textStyle=\"bold\"\n" +
            "        android:layout_centerHorizontal=\"true\"/>\n" +
            "\n" +
            "\n" +
            "    <ImageButton\n" +
            "        android:id=\"@+id/imagebt\"\n" +
            "        android:layout_width=\"100dp\"\n" +
            "        android:layout_height=\"100dp\"\n" +
            "        android:layout_below=\"@+id/speechinput\"\n" +
            "        android:layout_centerHorizontal=\"true\"\n" +
            "        android:layout_marginTop=\"30dp\"\n" +
            "        android:scaleType=\"fitCenter\"\n" +
            "        android:src=\"@drawable/ic_mic_black_24dp\"/>\n" +
            "\n" +
            "</RelativeLayout>";

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
//    private TextView speechinput;
    private final int REQ_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);


        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView vie= new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        vie.load();
        banner.addView(vie);

        show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(view -> {
            Intent inte = new Intent(text_To_speech_Activity.this, source_CODE_Activity.class);
            inte.putExtra("javacode", Javacode);
            inte.putExtra("xmlcode",xmlcode);
            inte.putExtra("other", other);
            inte.putExtra("other_heading", other_heading);
            startActivity(inte);
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Text to Speech");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


//        speechinput = (TextView) findViewById(R.id.speechinput);
        write = (EditText) findViewById(R.id.editText);
        speakbtn = (Button) findViewById(R.id.button);
        ImageButton imagebt = (ImageButton) findViewById(R.id.imagebt);

        t1 = new TextToSpeech(getApplicationContext(), status -> {
            if (status != TextToSpeech.ERROR) {
                t1.setLanguage(Locale.UK);
            }
        });

        speakbtn.setOnClickListener(v -> {
            String toSpeak = write.getText().toString();
            Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
            t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
        });

        imagebt.setOnClickListener(v -> {

                Toast.makeText(getApplicationContext(), "Sorry! Your device doesn't support sppech input", Toast.LENGTH_LONG).show();

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

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == REQ_CODE) {
//
//                ArrayList result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
//                String speechText = speechinput.getText().toString() + "\n" + result.get(0);
//                speechinput.setText(speechText);
//
//        }
//    }

    public void onDestroy(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onDestroy();
    }
}