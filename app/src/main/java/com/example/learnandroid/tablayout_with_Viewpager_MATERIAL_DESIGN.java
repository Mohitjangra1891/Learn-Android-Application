package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class tablayout_with_Viewpager_MATERIAL_DESIGN extends AppCompatActivity {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout_with_viewpager_material_design);
        String Javacode = "import androidx.annotation.NonNull;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "import androidx.fragment.app.FragmentManager;\n" +
                "import androidx.fragment.app.FragmentStatePagerAdapter;\n" +
                "import androidx.viewpager.widget.ViewPager;\n" +
                "\n" +
                "import com.google.android.material.tabs.TabLayout;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "\n" +
                "        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());\n" +
                "        ViewPager viewPager = findViewById(R.id.ViewPager);\n" +
                "        viewPager.setAdapter(adapter);\n" +
                "\n" +
                "        TabLayout tabLayout = findViewById(R.id.TabLayout);\n" +
                "        tabLayout.setupWithViewPager(viewPager);\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    class MyAdapter extends FragmentStatePagerAdapter {\n" +
                "\n" +
                "\n" +
                "        public MyAdapter(FragmentManager fm) {\n" +
                "            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        // Return Fragment to display for that page\n" +
                "        @NonNull\n" +
                "        @Override\n" +
                "        public Fragment getItem(int position) {\n" +
                "\n" +
                "            switch (position) {\n" +
                "                case 0:\n" +
                "                    return new TabHome();\n" +
                "                case 1:\n" +
                "                    return new TabStore();\n" +
                "                case 2:\n" +
                "                    return new TabSetting();\n" +
                "                default:\n" +
                "                    return null;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "\n" +
                "        // will be displayed as the tab's label\n" +
                "        @Override\n" +
                "        public CharSequence getPageTitle(int position) {\n" +
                "\n" +
                "            switch (position) {\n" +
                "                case 0:\n" +
                "                    return \"HOME\";\n" +
                "                case 1:\n" +
                "                    return \"STORE\";\n" +
                "                case 2:\n" +
                "                    return \"SETTING\";\n" +
                "                default:\n" +
                "                    return null;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        @Override\n" +
                "        public int getCount() {\n" +
                "            return 3;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <com.google.android.material.tabs.TabLayout\n" +
                "        android:id=\"@+id/TabLayout\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentTop=\"true\"\n" +
                "        android:background=\"#41B7FF\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <androidx.viewpager.widget.ViewPager\n" +
                "        android:id=\"@+id/viewPager\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"0dp\"\n" +
                "        android:layout_below=\"@id/TabLayout\"\n" +
                "        android:layout_centerInParent=\"true\"\n" +
                "        android:layout_weight=\"1\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/TabLayout\" />\n" +
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


        ;

        String other = "//you have to create three Fragments(1>Fragment_Home 2>Fragment_Store 3>Fragment_Setting)\n" +
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
        String other_heading = " Fragments";


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("TabLayout with ViewPager");
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

        tablayout_with_Viewpager_MATERIAL_DESIGN.MyAdapter adapter = new tablayout_with_Viewpager_MATERIAL_DESIGN.MyAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.TabLayout);
        tabLayout.setupWithViewPager(viewPager);
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

    class MyAdapter extends FragmentStatePagerAdapter {


        public MyAdapter(FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }


        // Return Fragment to display for that page
        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new tab_HOME();
                case 1:
                    return new tab_STORE();
                case 2:
                    return new tab_SETTING();
                default:
                    return null;
            }
        }

        // will be displayed as the tab's label
        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "HOME ";
                case 1:
                    return "STORE";
                case 2:
                    return "SETTING";
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

    }
}