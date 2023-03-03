package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class navigation_Drawer_MATERIAL_DESIGN extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer_material_design);
        String Javacode="import android.os.Bundle;\n" +
                "import android.view.MenuItem;\n" +
                "import android.view.View;\n" +
                "import android.widget.ImageView;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "import androidx.appcompat.app.ActionBarDrawerToggle;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.appcompat.widget.Toolbar;\n" +
                "import androidx.core.view.GravityCompat;\n" +
                "import androidx.drawerlayout.widget.DrawerLayout;\n" +
                "\n" +
                "import com.google.android.material.navigation.NavigationView;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private NavigationView navigationView;\n" +
                "    private DrawerLayout drawerLayout;\n" +
                "    private Toolbar toolbar;\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "\n" +
                "        navigationView = findViewById(R.id.navigation_drawer);\n" +
                "\n" +
                "        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {\n" +
                "            @Override\n" +
                "            public boolean onNavigationItemSelected(MenuItem item) {\n" +
                "\n" +
                "                // Navigation drawer item click listener\n" +
                "                switch (item.getItemId()) {\n" +
                "                    case R.id.android:\n" +
                "\n" +
                "                        //Replace your own action here\n" +
                "                        Toast.makeText(MainActivity.this, \"Android\", Toast.LENGTH_SHORT).show();\n" +
                "                        break;\n" +
                "                    case R.id.mail:\n" +
                "\n" +
                "                        //Replace your own action here\n" +
                "                        Toast.makeText(MainActivity.this, \"Mail\", Toast.LENGTH_SHORT).show();\n" +
                "                        break;\n" +
                "                    case R.id.share:\n" +
                "\n" +
                "                        //Replace your own action here\n" +
                "                        Toast.makeText(MainActivity.this, \"Share\", Toast.LENGTH_SHORT).show();\n" +
                "                        break;\n" +
                "                    case R.id.rate:\n" +
                "\n" +
                "                        //Replace your own action here\n" +
                "                        Toast.makeText(MainActivity.this, \"Rate\", Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "                drawerLayout.closeDrawer(GravityCompat.START);\n" +
                "                return true;\n" +
                "            }\n" +
                "        });\n" +
                "        toolbar = findViewById(R.id.toolBar);\n" +
                "        drawerLayout = findViewById(R.id.drawer_layout);\n" +
                "        toolbar.setTitle(\"Navigation Drawer Example\");\n" +
                "\n" +
                "        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);\n" +
                "        drawerLayout.addDrawerListener(toggle);\n" +
                "        toggle.syncState();\n" +
                "\n" +
                "        // If you need to set image to navigation header image or setText for header textView follow the  code below\n" +
                "\n" +
                "        View headerView = navigationView.getHeaderView(0);\n" +
                "\n" +
                "        TextView textView = headerView.findViewById(R.id.header_textView);\n" +
                "        ImageView imageView = headerView.findViewById(R.id.header_imageView);\n" +
                "\n" +
                "        // Set navigation header text\n" +
                "        textView.setText(\"Android Studio Tutorials\");\n" +
                "\n" +
                "        // Set navigation header image\n" +
                "        imageView.setImageResource(R.mipmap.app_icon_foreground);\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}";
        String xmlcode ="<androidx.drawerlayout.widget.DrawerLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/drawer_layout\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\"\n" +
                "    tools:openDrawer=\"start\">\n" +
                "    <!--  tools:openDrawer=\"end\" for open drawer from the right side-->\n" +
                "\n" +
                "    <androidx.coordinatorlayout.widget.CoordinatorLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\">\n" +
                "\n" +
                "        <com.google.android.material.appbar.AppBarLayout\n" +
                "            style=\"@style/AppTheme.AppBarOverlay\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\">\n" +
                "\n" +
                "            <androidx.appcompat.widget.Toolbar\n" +
                "                android:id=\"@+id/toolBar\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"?attr/actionBarSize\"\n" +
                "                android:background=\"#0091EA\"\n" +
                "                app:popupTheme=\"@style/AppTheme.PopupOverlay\" />\n" +
                "\n" +
                "        </com.google.android.material.appbar.AppBarLayout>\n" +
                "    </androidx.coordinatorlayout.widget.CoordinatorLayout>\n" +
                "\n" +
                "    <com.google.android.material.navigation.NavigationView\n" +
                "        android:id=\"@+id/navigation_drawer\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_gravity=\"start\"\n" +
                "        android:fitsSystemWindows=\"true\"\n" +
                "        app:headerLayout=\"@layout/drawer_header\"\n" +
                "        app:menu=\"@menu/menu_drawer\" />\n" +
                "\n" +
                "</androidx.drawerlayout.widget.DrawerLayout>";

        String other = "//You have to add these values in your strings.xml file\n\n" +
                "<string name=\"navigation_drawer_open\">Open navigation drawer</string>\n" +
                "<string name=\"navigation_drawer_close\">Close navigation drawer</string>" +
                "\n\n\n" +
                "//This is your layout file for navigation drawer header\n" +
                "//drawer_header.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"170dp\"\n" +
                "    android:background=\"#F4E38F\"\n" +
                "    android:gravity=\"bottom\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:padding=\"16dp\">\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/header_imageView\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:paddingTop=\"8dp\"\n" +
                "        app:srcCompat=\"@mipmap/app_icon_foreground\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/header_textView\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:paddingTop=\"8dp\"\n" +
                "        android:text=\"Android Studio Tutorials\" />\n" +
                "\n" +
                "</LinearLayout>"+
        "\n\n\n" +
                "//This is your menu file for Navigation Drawer menu items.\n" +
                "//menu_drawer.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "\n" +
                "    <group android:checkableBehavior=\"single\">\n" +
                "        <item\n" +
                "            android:id=\"@+id/android\"\n" +
                "            android:icon=\"@drawable/ic_baseline_android_24\"\n" +
                "            android:title=\"Android\" />\n" +
                "\n" +
                "        <item\n" +
                "            android:id=\"@+id/mail\"\n" +
                "            android:icon=\"@drawable/ic_baseline_email_\"\n" +
                "            android:title=\"Mail\" />\n" +
                "\n" +
                "    </group>\n" +
                "\n" +
                "    <item android:title=\"Communicate\">\n" +
                "        <menu>\n" +
                "            <item\n" +
                "                android:id=\"@+id/share\"\n" +
                "                android:icon=\"@drawable/ic_baseline_share_24\"\n" +
                "                android:title=\"Share\" />\n" +
                "\n" +
                "            <item\n" +
                "                android:id=\"@+id/rate\"\n" +
                "                android:icon=\"@drawable/ic_baseline_rate_review_24\"\n" +
                "                android:title=\"Rate\" />\n" +
                "        </menu>\n" +
                "\n" +
                "    </item>\n" +
                "</menu>"
                ;
        String other_heading = "items.xml && drawer_header.xml";


        drawerLayout = findViewById(R.id.drawerLayout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Navigation Drawer");
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

        Toolbar nav_toolbar = findViewById(R.id.toolbar_navigation);
        NavigationView navigationView = findViewById(R.id.navigation_drawer);

        navigationView.setNavigationItemSelectedListener(item -> {

            // Navigation drawer item click listener
            switch (item.getItemId()) {
                case R.id.android:

                    //Replace your own action here
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.mail:

                    //Replace your own action here
                    Toast.makeText(getApplicationContext(), "Mail", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.share:

                    //Replace your own action here
                    Toast.makeText(getApplicationContext(), "Share", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rate:

                    //Replace your own action here
                    Toast.makeText(getApplicationContext(), "Rate", Toast.LENGTH_SHORT).show();

            }

            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });



        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, nav_toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }
    @Override
    public void onBackPressed() {

        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();

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