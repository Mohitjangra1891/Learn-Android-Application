package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class list_VIEW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.AdapterView;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.ListView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    ListView listViewDemo;\n" +
                "    String[] listItemDemo={\"Java\",\"Kotlin\",\"C++\",\"COBOL\",\"AppleScript\",\"FoxPro\",\"G-Code\",\"C Language\",\"Java\",\"Kotlin\",\"C++\"};\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\tlistViewDemo=(ListView)findViewById(R.id.listViewdemo);\n" +
                "\t\t\t\t\tfinal ArrayAdapter<String> adapterDemo = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItemDemo);\n" +
                "\t\t\t\t\tlistViewDemo.setAdapter(adapterDemo);\n" +
                "\n" +
                "\t\t\t\t\tlistViewDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                "\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\tpublic void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {\n" +
                "\t\t\t\t\t\t\t\t// TODO Auto-generated method stub\n" +
                "\t\t\t\t\t\t\t\t\t\tString value=adapterDemo.getItem(position);\n" +
                "\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "\t\t\t\t}\n" +
                "\t\t\t});\n" +
                "\t\t}\n" +
                "   \n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\n" +
                "    <ListView\n" +
                "        android:id=\"@+id/listViewdemo\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_margin=\"10dp\"\n" +
                "        />\n" +
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
        String other_heading = "Manifest";

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("ListView");
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

        ListView listViewDemo;
        String[] listItemDemo={"Java","Kotlin","C++","COBOL","AppleScript","FoxPro","G-Code","C Language","Java","Kotlin","C++"};

            listViewDemo=(ListView)findViewById(R.id.listViewdemo);
            final ArrayAdapter<String> adapterDemo = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItemDemo);
            listViewDemo.setAdapter(adapterDemo);

            listViewDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    // TODO Auto-generated method stub
                    String value=adapterDemo.getItem(position);
                    Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

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