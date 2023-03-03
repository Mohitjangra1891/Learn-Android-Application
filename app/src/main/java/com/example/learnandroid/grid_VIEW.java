package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class grid_VIEW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.AdapterView;\n" +
                "import android.widget.GridView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    GridView containerGridView;\n" +
                "    ArrayAdapter<String> adapter;\n" +
                "\tString[] items={\"TextView\",\"EditText\",\"Button\",\"Toggle\",\"Switch\",\"Image\",\"CheckBox\",\t\t\t\t\"Custom\",\"Radio\",\"Spinner\",\"RatingBar\",\"SeekBar\",\"Progres\", \n" +
                "\t\t\t\t\t\"TextView\",\"Image\",\"Text\",\"ScrollView\",\"AlertDialog\"};\n" +
                "\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\t\t\tcontainerGridView = (GridView) findViewById(R.id.containerGridView); \n" +
                "\t\t\t\t\t\t\t adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);\n" +
                "\t\t\t\t\t\t\t\tcontainerGridView.setAdapter(adapter);\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t// implement setOnItemClickListener event on GridView\n" +
                "\t\t\t\t\t\t\t\tcontainerGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\t\t\tpublic void onItemClick(AdapterView<?> parent, View view, int position, long id) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t String value=adapter.getItem(position);\n" +
                "                Toast.makeText(getApplicationContext(),\"Clicked item:-\"+value,Toast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t});\n" +
                "    }\n" +
                "}";


        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t<GridView\n" +
                "\t\t\tandroid:id=\"@+id/containerGridView\"\n" +
                "\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\tandroid:footerDividersEnabled=\"false\"\n" +
                "\t\t\tandroid:padding=\"1dp\"\n" +
                "\t\t\tandroid:numColumns=\"2\" />\n" +
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

        GridView gridView = (GridView) findViewById(R.id.gridView);
        ArrayAdapter<String> adapter;
        String[] items = {"TextView", "EditText", "Button", "Toggle", "Switch", "Image", "CheckBox", "Custom", "Radio", "Spinner", "RatingBar", "SeekBar", "Progres",
                "TextView", "Image", "Text", "ScrollView", "AlertDialog"};

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("GridView");
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
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        gridView.setAdapter(adapter);


        // implement setOnItemClickListener event on GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "Clicked item:-" + value, Toast.LENGTH_SHORT).show();
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