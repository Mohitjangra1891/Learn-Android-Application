package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class option_MENU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t   \n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t\n" +
                "\t\t\t\tpublic boolean onCreateOptionsMenu(Menu menu) {\n" +
                "\t\t\t\t\t// Inflate the menu,add items to the action bar if it is present.\n" +
                "\t\t\t\t\tgetMenuInflater().inflate(R.menu.option_menu, menu);//Menu ResourceFile\n" +
                "\t\t\t\t\treturn true;\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tpublic boolean onOptionsItemSelected(MenuItem item) {\n" +
                "\t\t\t\t\t\tswitch (item.getItemId()) {\n" +
                "\t\t\t\t\t\t\t\t\tcase R.id.item1:\n" +
                "\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Item 1 Selected\",Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn true;\n" +
                "\t\t\t\t\t\t\t\t\tcase R.id.item2:\n" +
                "\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Item 2 Selected\",Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn true;\n" +
                "\t\t\t\t\t\t\t\t\tcase R.id.item3:\n" +
                "\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Item 3 Selected\",Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn true;\n" +
                "\t\t\t\t\t\t\t\t\tdefault:\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn super.onOptionsItemSelected(item);\n" +
                "\t\t\t\t\t}\n" +
                "\n" +
                "\n" +
                "\t}\n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t<TextView\n" +
                "\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\tandroid:text=\"To see the menu CLICK the dots above in ActionBar\"\n" +
                "\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\tandroid:textColor=\"@color/Black\"\n" +
                "\t\t\t\t/>\n" +
                "</LinearLayout>";
        String other = "<!-- this file is inside the   (res/menu/.... )   -->\n" +
                "\n" +
                "\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\">\n" +
                "    \n" +
                "    <item  android:id=\"@+id/item1\"\n" +
                "        android:title=\"Item 1\"/>\n" +
                "    <item  android:id=\"@+id/item2\"\n" +
                "        android:title=\"Item 2\"/>\n" +
                "    <item  android:id=\"@+id/item3\"\n" +
                "        android:title=\"Item 3\"/>\n" +
                "</menu>";
        String other_heading = "option_menu.xml";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Option Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode", xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.android:
                Toast.makeText(this, "You clicked on Android", Toast.LENGTH_LONG).show();

                return true;
            case R.id.mail:
                Toast.makeText(this, "You clicked on Mail", Toast.LENGTH_LONG).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "You clicked on Share", Toast.LENGTH_LONG).show();
                return true;
            case R.id.rate:
                Toast.makeText(this, "You clicked on Rate", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
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