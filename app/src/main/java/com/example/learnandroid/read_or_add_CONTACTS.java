package com.example.learnandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Objects;

public class read_or_add_CONTACTS extends AppCompatActivity {
    EditText et;
    String number;
    Button save,show;

    ListView lv_sms;
    ArrayList<String> smsList;
    Cursor c;
    private static final int READ_CONTACTS=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_or_add_contacts);


        String Javacode="package com.example.learnandroid;\n" +
                "import android.Manifest;\n" +
                "import android.database.Cursor;\n" +
                "import android.net.Uri;\n" +
                "import android.provider.ContactsContract;\n" +
                "import android.view.View;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.ListView;\n" +
                "\n" +
                "public class read_or_add_CONTACTS extends AppCompatActivity {\n" +
                "    EditText et;\n" +
                "    String number;\n" +
                "    Button save,show;\n" +
                "\n" +
                "    ListView lv_sms;\n" +
                "    ArrayList<String> smsList;\n" +
                "    Cursor c;\n" +
                "    private static final int READ_CONTACTS=1;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_read_or_add_contacts);\n" +
                "\n" +
                " et=(EditText)findViewById(R.id.PhoneNo);\n" +
                "        save=findViewById(R.id.btn);\n" +
                "        show=findViewById(R.id.button);\n" +
                "\n" +
                "        save.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                Intent i = new Intent (Intent.ACTION_DIAL);\n" +
                "                number=et.getText().toString();\n" +
                "                i.setData(Uri.parse(\"tel:\"+number));\n" +
                "                startActivity(i);\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        lv_sms=(ListView)findViewById(R.id.list);\n" +
                "        show.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "                int permissioncheck = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_CONTACTS);\n" +
                "                if (permissioncheck == PackageManager.PERMISSION_GRANTED) {\n" +
                "                    readContacts();\n" +
                "                } else {\n" +
                "                    ActivityCompat.requestPermissions(read_or_add_CONTACTS.this, new String[]{Manifest.permission.READ_CONTACTS}, READ_CONTACTS);\n" +
                "                }\n" +
                "                ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,smsList);\n" +
                "                lv_sms.setAdapter(adapter);\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {\n" +
                "        super.onRequestPermissionsResult(requestCode, permissions, grantResults);\n" +
                "\n" +
                "        if (requestCode == READ_CONTACTS){\n" +
                "            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){\n" +
                "                readContacts();\n" +
                "            }else {\n" +
                "                Toast.makeText(this,\"Permission Required\",Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    private void readContacts(){\n" +
                "        c=getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,ContactsContract.Contacts.DISPLAY_NAME+\" ASC \");\n" +
                "        smsList=new ArrayList<String>();\n" +
                "\n" +
                "        while (c.moveToNext()){\n" +
                "            @SuppressLint(\"Range\") String Number=c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));\n" +
                "            @SuppressLint(\"Range\") String Body=c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));\n" +
                "            smsList.add(\"Name:-\"+Number+\"\\n\"+\"Number:-\"+Body);\n" +
                "        }\n" +
                "        c.close();\n" +
                "    }\n" +
                "}";



        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".read_or_add_CONTACTS\">\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/PhoneNo\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginLeft=\"30dp\"\n" +
                "        android:layout_marginTop=\"30dp\"\n" +
                "        android:layout_marginRight=\"30dp\"\n" +
                "        android:hint=\"Enter Mobile No\"\n" +
                "        android:inputType=\"number\"\n" +
                "        android:minHeight=\"48dp\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/btn\"\n" +
                "        android:layout_below=\"@id/PhoneNo\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginHorizontal=\"30dp\"\n" +
                "        android:layout_marginTop=\"10dp\"\n" +
                "        android:text=\"Save\"\n" +
                "        android:layout_marginBottom=\"10dp\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\" />\n" +
                "    <Button\n" +
                "        android:layout_below=\"@id/btn\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"show contacts\"\n" +
                "        android:layout_centerHorizontal=\"true\"\n" +
                "        android:layout_marginHorizontal=\"30dp\"\n" +
                "        android:id=\"@+id/button\"/>\n" +
                "    <ListView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/list\"\n" +
                "        android:layout_below=\"@id/button\"\n" +
                "        android:layout_marginHorizontal=\"30dp\"\n" +
                "        android:layout_marginVertical=\"10dp\"/>\n" +
                "\n" +
                "\n" +
                "</RelativeLayout>";
        String other = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    package=\".androidexample\">\n" +
                "\t\n" +
                "\t<uses-permission android:name=\"android.permission.INTERNET\" />\n" +
                "\t<uses-permission android:name=\"android.permission.CALL_PHONE\" />\n" +
                "    <uses-permission android:name=\"android.permission.SEND_SMS\" />\n" +
                "    <uses-permission android:name=\"android.permission.READ_CONTACTS\" />\n" +
                "\t<uses-permission android:name=\"android.permission.READ_SMS\" />\n" +
                "    <uses-permission android:name=\"android.permission.READ_EXTERNAL_STORAGE\" />\n" +
                "\t<uses-permission android:name=\"android.permission.READ_PHONE_STATE\" />\n" +
                "\t\n" +
                "\t<activity\n" +
                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
                "\t\t\t\t\t\t<intent-filter>\n" +
                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "\t\t\t\t\t\t</intent-filter>\n" +
                "     </activity>\n" +
                "</manifest>";
        String other_heading = "Manifest";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Read & Add Contact");
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
        et=(EditText)findViewById(R.id.PhoneNo);
        save=findViewById(R.id.btn);
        show=findViewById(R.id.button);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (Intent.ACTION_DIAL);
                number=et.getText().toString();
                i.setData(Uri.parse("tel:"+number));
                startActivity(i);
            }
        });

        lv_sms=(ListView)findViewById(R.id.list);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int permissioncheck = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_CONTACTS);
                if (permissioncheck == PackageManager.PERMISSION_GRANTED) {
                    readContacts();
                } else {
                    ActivityCompat.requestPermissions(read_or_add_CONTACTS.this, new String[]{Manifest.permission.READ_CONTACTS}, READ_CONTACTS);
                }
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,smsList);
                lv_sms.setAdapter(adapter);
            }
        });


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == READ_CONTACTS){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                readContacts();
            }else {
                Toast.makeText(this,"Permission Required",Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void readContacts(){
        c=getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,ContactsContract.Contacts.DISPLAY_NAME+" ASC ");
        smsList=new ArrayList<String>();

        while (c.moveToNext()){
            @SuppressLint("Range") String Number=c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
            @SuppressLint("Range") String Body=c.getString(c.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            smsList.add("Name:-"+Number+"\n"+"Number:-"+Body);
        }
        c.close();
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