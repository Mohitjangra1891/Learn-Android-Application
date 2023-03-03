package com.example.learnandroid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class camera_SENSORS extends AppCompatActivity {
    Button btntakephoto;
    ImageView imgdispphoto;
    private static final int CAMERA_REQUEST = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_sensors);

        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.graphics.Bitmap;\n" +
                "import android.provider.MediaStore;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.ImageView;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    Button btntakephoto;\n" +
                "    ImageView imgdispphoto;\n" +
                "    private static final int CAMERA_REQUEST = 500;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        imgdispphoto = (ImageView) this.findViewById(R.id.imgdispphoto);\n" +
                "        btntakephoto = (Button) this.findViewById(R.id.btntakephoto);\n" +
                "\n" +
                "        btntakephoto.setOnClickListener(new View.OnClickListener() {\n" +
                "\t\t\t\t\t@Override\n" +
                "\t\t\t\t\tpublic void onClick(View v) {\n" +
                "\t\t\t\t\t\t\t\tIntent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);\n" +
                "\t\t\t\t\t\t\t\tstartActivityForResult(cameraIntent, CAMERA_REQUEST);\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t});\n" +
                "    }\n" +
                "\t\n" +
                "    protected void onActivityResult(int requestCode, int resultCode, Intent data) {\n" +
                "                if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {\n" +
                "                           Bitmap photo = (Bitmap) data.getExtras().get(\"data\");\n" +
                "                            imgdispphoto.setImageBitmap(photo);\n" +
                "                }\n" +
                "    }\n" +
                "    \n" +
                "  }";
        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t\t<Button\n" +
                "\t\t\t\t\tandroid:id=\"@+id/btntakephoto\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\t\tandroid:padding=\"20dp\"\n" +
                "\t\t\t\t\tandroid:textColor=\"@color/White\"\n" +
                "\t\t\t\t\tandroid:textSize=\"20sp\"\n" +
                "\t\t\t\t\tandroid:text=\"Capture a Photo\" >\n" +
                "\t\t\t\t</Button>\n" +
                "\n" +
                "\t\t\t\t<ImageView\n" +
                "\t\t\t\t\tandroid:id=\"@+id/imgdispphoto\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"match_parent\"\n" +
                "\t\t\t\t   android:layout_margin=\"20dp\"\n" +
                "\t\t\t\t\tandroid:background=\"@color/Gray\"\n" +
                "\t\t\t\t   >\n" +
                "\t\t\t\t</ImageView>\n" +
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
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Camera");
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




        imgdispphoto = (ImageView) this.findViewById(R.id.imgdispphoto);
        btntakephoto = (Button) this.findViewById(R.id.btntakephoto);

        btntakephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imgdispphoto.setImageBitmap(photo);
        }
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