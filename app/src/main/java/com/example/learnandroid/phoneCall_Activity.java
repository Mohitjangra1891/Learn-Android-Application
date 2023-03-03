package com.example.learnandroid;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class phoneCall_Activity extends AppCompatActivity {
    EditText et;
    String number;
    Button callButton;

    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;

    String Javacode = "import android.Manifest;\n" +
            "import android.content.Intent;\n" +
            "import android.content.pm.PackageManager;\n" +
            "import android.net.Uri;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "EditText edtphncall;\n" +
            "String telNum;\n" +
            "Button btnphncall;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        edtphncall=(EditText)findViewById(R.id.edtphncall);\n" +
            "        btnphncall=(Button)findViewById(R.id.btnphncall);\n" +
            "        btnphncall.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                Intent intentCall=new Intent(Intent.ACTION_CALL);\n" +
            "                telNum=edtphncall.getText().toString();\n" +
            "                 if(telNum.trim().isEmpty()){\n" +
            "                    intentCall.setData(Uri.parse(\"tel:567788\"));\n" +
            "                    //Toast.makeText(getApplicationContext(),\"Please Enter Num\",Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "\t\t\t\telse{\n" +
            "                    intentCall.setData(Uri.parse(\"tel:\"+telNum));\n" +
            "                }\n" +
            "                if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){\n" +
            "\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Please grant permission\",Toast.LENGTH_SHORT).show();\n" +
            "\t\t\t\t\t\t\trequestPermission();\n" +
            "                }else {\n" +
            "\t\t\t\t\t\t\tstartActivity(intentCall);\n" +
            "                }\n" +
            "            \n" +
            "        });\n" +
            "    }\n" +
            "\t\n" +
            "\t\t\tprivate  void requestPermission(){\n" +
            "\t\t\t\tActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);\n" +
            "\t\t\t}\n" +
            "    \n" +
            "}";
        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t<EditText\n" +
                "\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\tandroid:hint=\"Enter Telephone NUM\"\n" +
                "\t\t\t\tandroid:inputType=\"number\"\n" +
                "\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\tandroid:id=\"@+id/edtphncall\"/>\n" +
                "\t\t\t\t\n" +
                "\t\t\t<Button\n" +
                "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:id=\"@+id/btnphncall\"\n" +
                "\t\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\t\tandroid:textColor=\"@color/White\"\n" +
                "\t\t\t\t\tandroid:text=\"Call\"\n" +
                "\t\t\t\t\tandroid:padding=\"20dp\"\n" +
                "\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\t\tandroid:layout_gravity=\"center\"/>\n" +
                "</LinearLayout>";

    String other = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    package=\".androidexample\">\n" +
            "\t\n" +
            "\t<uses-permission android:name=\"android.permission.CALL_PHONE\" />\n" +
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
    FloatingActionButton show_code_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_call);

        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);

       show_code_button=findViewById(R.id.code_button);
        callButton = findViewById(R.id.btn);
        et=findViewById(R.id.PhoneNo);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Phone Call");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_CALL);
                number = et.getText().toString();
                i.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(), "Permission Not Granted", Toast.LENGTH_SHORT).show();
                    ActivityCompat.requestPermissions(phoneCall_Activity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    startActivity(i);
                }
            }
        });
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(phoneCall_Activity.this,source_CODE_Activity.class);
                inte.putExtra("javacode",Javacode);
                inte.putExtra("xmlcode",xmlcode);
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

        return true;
    }
}