package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class popUP_MENU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_menu);
        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.PopupMenu;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "Button btnPopup;\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "        btnPopup=(Button)findViewById(R.id.btndemo);\n" +
                "        btnPopup.setOnClickListener(new View.OnClickListener() {\n" +
                "\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\tpublic void onClick(View view) {\n" +
                "\t\t\t\t\t\t\t\t\t\tPopupMenu popup = new PopupMenu(MainActivity.this, btnPopup);\n" +
                "\t\t\t\t\t\t\t\t\t\t//Inflating the Popup using xml file\n" +
                "\t\t\t\t\t\t\t\t\t\tpopup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t//registering popup with OnMenuItemClickListener\n" +
                "\t\t\t\t\t\t\t\t\t\t\tpopup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tpublic boolean onMenuItemClick(MenuItem item) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(MainActivity.this,\"You Clicked : \" + item.getTitle(),Toast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn true;\n" +
                "\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t});\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\tpopup.show();//showing popup menu\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t});\n" +
                "    }\n" +
                "    \n" +
                "}";
        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "    <Button\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:id=\"@+id/btndemo\"\n" +
                "        android:layout_margin=\"30dp\"\n" +
                "        android:text=\"Click here\"\n" +
                "        android:textColor=\"#FFFFFF\"\n" +
                "        android:textSize=\"30sp\"\n" +
                "       \n" +
                "        />\n" +
                "\n" +
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
        String other_heading = "pop_menu.xml";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("PopUp Menu");
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

       Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(popUP_MENU.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.menu_drawer, popupMenu.getMenu());

                // PopUp Menu click listener
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

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

                        return true;
                    }
                });
                popupMenu.show();

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