package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Objects;

public class bottom_Navigaton_MATERIAL_DESIGN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigaton_material_design);
        String Javacode="import android.os.Bundle;\n" +
                "import android.view.MenuItem;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import com.google.android.material.bottomnavigation.BottomNavigationView;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);\n" +
                "\n" +
                "        // set default \n" +
                "        setFragment(new TabHome());\n" +
                "\n" +
                "        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {\n" +
                "            @Override\n" +
                "            public boolean onNavigationItemSelected(@NonNull MenuItem item) {\n" +
                "\n" +
                "                int id = item.getItemId();\n" +
                "\n" +
                "                if (id == R.id.home) {\n" +
                "                    setFragment(new TabHome());\n" +
                "\n" +
                "                } else if (id == R.id.store) {\n" +
                "                    setFragment(new TabStore));\n" +
                "\n" +
                "                } else if (id == R.id.setting) {\n" +
                "                    setFragment(new TabSetting());\n" +
                "\n" +
                "                }\n" +
                "                \n" +
                "                return true;\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "    private void setFragment(Fragment fragment) {\n" +
                "\n" +
                "            getSupportFragmentManager()\n" +
                "                    .beginTransaction()\n" +
                "                    .replace(R.id.frame_layout, fragment)\n" +
                "                    .commit();\n" +
                "    }}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "\n" +
                "    <com.google.android.material.bottomnavigation.BottomNavigationView\n" +
                "        android:id=\"@+id/bottomNavigationView\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:background=\"?android:attr/windowBackground\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
                "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
                "        app:menu=\"@menu/button_navigation_items\">\n" +
                "\n" +
                "\n" +
                "    </com.google.android.material.bottomnavigation.BottomNavigationView>\n" +
                "\n" +
                "    <FrameLayout\n" +
                "        android:id=\"@+id/Frame_layout\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"0dp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/bottomNavigationView\"\n" +
                "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
                "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n" +
                "////tab_home.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#FFED8D\"\n" +
                "    tools:context=\".TabHome\">\n" +
                "\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:text=\"Click here\"\n" +
                "        android:textSize=\"24sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n" +
                "////tab_store.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#BF98F6\"\n" +
                "    tools:context=\".TabStore\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:text=\"Click here\"\n" +
                "        android:textSize=\"24sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n" +
                "////tab_setting.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/output_file\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#FFA5A5\"\n" +
                "    tools:context=\".TabSetting\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:text=\"Click here\"\n" +
                "        android:textSize=\"24sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>"
                ;

        String other = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "\n" +
                "    <item\n" +
                "        android:id=\"@+id/home\"\n" +
                "        android:icon=\"@drawable/ic_baseline_home_24\"\n" +
                "        android:title=\"Home\" />\n" +
                "    <item\n" +
                "        android:id=\"@+id/store\"\n" +
                "        android:icon=\"@drawable/ic_baseline_store_24\"\n" +
                "        android:title=\"Store\" />\n" +
                "\n" +
                "    <item\n" +
                "        android:id=\"@+id/setting\"\n" +
                "        android:icon=\"@drawable/ic_baseline_settings_24\"\n" +
                "        android:title=\"Setting\" />\n" +
                "\n" +
                "\n" +
                "</menu>\n\n\n" +
                "//you have to create three Fragments(1>Fragment_Home 2>Fragment_Store 3>Fragment_Setting)\n" +
                "\n" +
                "//1)Fragment_Home\n" +
                "//for this fragment you have to create layout file(fragment_home.xml)\n" +
                "\n\n\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Toast;\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "\n" +
                "public class TabHome extends Fragment {\n" +
                "\n" +
                "    public TabHome() {\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public View onCreateView(LayoutInflater inflater,\n" +
                "                             ViewGroup container,\n" +
                "                             Bundle savedInstanceState) {\n" +
                "\n" +
                "        View view = LayoutInflater.from(getContext()).inflate(R.layout.tab_home, container, false);\n" +
                "\n" +
                "        Button button = view.findViewById(R.id.button);\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Toast.makeText(getActivity(), \"This is Home \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        return view;\n" +
                "    }\n" +
                "}\n\n\n" +
                "//2)Fragment_Store\n" +
                "//for this fragment you have to create layout file(fragment_store.xml)\n" +
                "//inside XML file there is one TextView only" +
                "\n\n" +
                "\n" +

                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Toast;\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "\n" +
                "public class TabStore extends Fragment {\n" +
                "\n" +
                "    public TabStore() {\n" +
                "\n" +
                "    }\n" +
                "    \n" +
                "    @Override\n" +
                "    public View onCreateView(LayoutInflater inflater,\n" +
                "                             ViewGroup container, Bundle savedInstanceState) {\n" +
                "        View view = LayoutInflater.from(getContext()).inflate(R.layout.tab_store, container, false);\n" +
                "\n" +
                "        Button button = view.findViewById(R.id.button);\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Toast.makeText(getActivity(), \"This is Store \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        return view;\n" +
                "    }\n" +
        "}\n\n\n" +
                "//2)Fragment_Setting\n" +
                "//for this fragment you have to create layout file(fragment_setting.xml)\n" +
                "//inside XML file there is one TextView only" +
                "\n\n" +
                "\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.Toast;\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "\n" +
                "public class TabSetting extends Fragment {\n" +
                "\n" +
                "\n" +
                "    public TabSetting() {\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public View onCreateView(LayoutInflater inflater,\n" +
                "                             ViewGroup container,\n" +
                "                             Bundle savedInstanceState) {\n" +
                "        View view = LayoutInflater.from(getContext()).inflate(R.layout.tab_setting, container, false);\n" +
                "\n" +
                "        Button button = view.findViewById(R.id.button);\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Toast.makeText(getActivity(), \"This is Setting \", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        return view;\n" +
                "    }\n" +
                "}";
        String other_heading = "items.xml && Fragments";

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Bottom Navigaton");
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
        BottomNavigationView bottomNav = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        setfragmet(new tab_HOME());
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id =item.getItemId();
                if (id ==R.id.home)
                {
                    setfragmet(new tab_HOME());
                }
                else if (id ==R.id.store)
                {
                    setfragmet(new tab_STORE());
                }
                else if (id ==R.id.setting)
                {
                    setfragmet(new tab_SETTING());
                }
                return true;
            }
        });
    }
    public void setfragmet(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,fragment)
                .commit();
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