package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class context_MENU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.ContextMenu;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.ListView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    ListView listViewContextMenu;\n" +
                "    String language[]={\"Java\",\"Kotlin\",\"C++\",\"COBOL\",\"AppleScript\",\"FoxPro\",\"G-Code\"};\n" +
                "\n" +
                "\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\t\t\tlistViewContextMenu=(ListView)findViewById(R.id.listViewContextMenu);\n" +
                "\t\t\t\t\t\t\tArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language);\n" +
                "\t\t\t\t\t\t\tlistViewContextMenu.setAdapter(adapter);\n" +
                "\n" +
                "\t\t\t\t\t\t\t// Register the ListView  for Context menu\n" +
                "\t\t\t\t\t\t\tregisterForContextMenu(listViewContextMenu);\n" +
                "\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\tpublic void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\t\t\tsuper.onCreateContextMenu(menu, v, menuInfo);\n" +
                "\t\t\t\t\t\t\t\t\t\tmenu.setHeaderTitle(\"Select The Action\");\n" +
                "\t\t\t\t\t\t\t\t\t\tmenu.add(0, v.getId(), 0, \"Code\");//groupId, itemId, order, title\n" +
                "\t\t\t\t\t\t\t\t\t\tmenu.add(0, v.getId(), 0, \"Example\");\n" +
                "\t\t\t\t\t\t\t\t\t\tmenu.add(0, v.getId(), 0, \"Tutorial\");\n" +
                "\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\tpublic boolean onContextItemSelected(MenuItem item){\n" +
                "\t\t\t\t\t\t\t\t\t\t\tif(item.getTitle()==\"Code\"){\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Selected Code\",Toast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\telse if(item.getTitle()==\"Example\"){\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Selected Example\",Toast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t} else if(item.getTitle()==\"Tutorial\") {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(), \"Selected Tutorial\", Toast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t}else{\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\treturn false;\n" +
                "\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn true;\n" +
                "\t\t\t\t\t\t}\n" +
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
                "\t\t\t<TextView\n" +
                "\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\tandroid:textColor=\"@color/Black\"\n" +
                "\t\t\t\tandroid:textAlignment=\"center\"\n" +
                "\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\tandroid:text=\"Long press on any Language\"/>\n" +
                "\t\t\t<ListView\n" +
                "\t\t\t\tandroid:id=\"@+id/listViewContextMenu\"\n" +
                "\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\tandroid:layout_margin=\"20dp\" >\n" +
                "    </ListView>\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Context Menu");
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
        TextView textView = findViewById(R.id.button);

        //Registers a context menu to be shown for the given view
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //Set title
        menu.setHeaderTitle("Select the option");

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_drawer, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.android:
                Toast.makeText(getApplicationContext(), "Item 1 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mail:
                Toast.makeText(getApplicationContext(), "Item 2 Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(getApplicationContext(), "Item 3 Selected", Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
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